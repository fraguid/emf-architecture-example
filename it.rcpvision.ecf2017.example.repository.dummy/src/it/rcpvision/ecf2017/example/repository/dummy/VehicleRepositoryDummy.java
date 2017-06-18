package it.rcpvision.ecf2017.example.repository.dummy;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.ReservationState;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IReservationRepository;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;
import it.rcpvision.ecf2017.example.repository.api.RepositoryApiActivator;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

@Component
public class VehicleRepositoryDummy implements IVehicleRepository{
	
	IReservationRepository reservationRepository= RepositoryApiActivator.getSingleton().getReservationRepository();
	
	Resource resource= DummyRepositoryActivator.getSingleton().createResosurce();
	short counter=1;

	public VehicleRepositoryDummy() {
		Vehicle firstVehicle = CarsharingFactory.eINSTANCE.createVehicle();
		firstVehicle.setBrand("Toyota");
		firstVehicle.setModel("Yaris");
		firstVehicle.setPlate("AB000CD");
		resource.getContents().add(firstVehicle);
	}
	 

	@Override
	public void insert(Vehicle obj)  throws RepositoryException {
		resource.getContents().add(obj);
		checkForId(obj);
	}

	@Override
	public void update(Vehicle obj) throws RepositoryException {
	}

	@Override
	public void delete(Vehicle obj) throws RepositoryException {
		resource.getContents().remove(obj);
	}

	@Override
	public Vehicle getByKey(Object key) {
		for (EObject eobject : resource.getContents()) {
			if(key.equals(((Vehicle)eobject).getId())) {
				return prepareObject((Vehicle)eobject);
			}
		}
		return null;
	}

	@Override
	public List queryAll() {
		return prepare(resource.getContents());
	}

	private List prepare(EList<EObject> contents) {
		resource.getContents().stream().map(Vehicle.class::cast).forEach(v->prepareObject(v));
		return resource.getContents();
	}

	private Vehicle prepareObject(Vehicle vehicle) {
		checkForId(vehicle);
		Reservation reservation= reservationRepository.getActiveByVehicle(vehicle);
		if(reservation!=null) {
			vehicle.setReservationState(ReservationState.RESERVED);
		}
		return vehicle;
	}


	private void checkForId(Vehicle vehicle) {
		if(vehicle.getId()==0) {
			vehicle.setId(counter++);
		}
	}
}
