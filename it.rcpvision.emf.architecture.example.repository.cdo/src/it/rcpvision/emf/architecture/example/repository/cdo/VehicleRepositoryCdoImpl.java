package it.rcpvision.emf.architecture.example.repository.cdo;


import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingFactory;
import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;
import it.rcpvision.emf.architecture.example.model.carsharing.ReservationState;
import it.rcpvision.emf.architecture.example.model.carsharing.User;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;
import it.rcpvision.emf.architecture.example.repository.api.IReservationRepository;
import it.rcpvision.emf.architecture.example.repository.api.IVehicleRepository;
import it.rcpvision.emf.architecture.example.repository.api.RepositoryApiActivator;
import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;

@Component
public class VehicleRepositoryCdoImpl implements IVehicleRepository{
	
	private static final String VEHICLE_RESOURCE_NAME = "VEHICLE";
	private CDOResource resource;
	private CDOTransaction transaction;
	
	IReservationRepository reservationRepository= RepositoryApiActivator.getSingleton().getReservationRepository();
	
	public VehicleRepositoryCdoImpl() {
		transaction= CDORepositoryActivator.getSingleton().openTransaction();
		resource =transaction.getOrCreateResource(VEHICLE_RESOURCE_NAME);
		if(resource.getContents().isEmpty()) {
			Vehicle firstVehicle = CarsharingFactory.eINSTANCE.createVehicle();
			firstVehicle.setBrand("TOYOTA");
			firstVehicle.setModel("YARIS");
			resource.getContents().add(firstVehicle);
			try {
				transaction.commit();
			} catch (ConcurrentAccessException e) {
				e.printStackTrace();
			} catch (CommitException e) {
				e.printStackTrace();
			}
		}
	}
	 
	 

	@Override
	public void insert(Vehicle obj)  throws RepositoryException {
		resource.getContents().add(obj);
		commit();
		checkForId(obj);
	}

	@Override
	public void update(Vehicle obj) throws RepositoryException {
		commit();
	}

	@Override
	public void delete(Vehicle obj) throws RepositoryException {
		resource.getContents().remove(obj);
		commit();
	}

	@Override
	public Vehicle getByKey(Object key) {
		for (EObject eobject : resource.getContents()) {
			if(key.equals(((Vehicle)eobject).getId())) {
				return (Vehicle)eobject;
			}
		}
		return null;
	}

	@Override
	public List queryAll() {
		return prepare(resource.getContents());
	}
	
	private void commit() throws RepositoryException {
		try {
			transaction.commit();
		} catch (CommitException e) {
			throw new RepositoryException(e); 
		}
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
		if(vehicle.getId()==null) {
			vehicle.setId(vehicle.cdoID().toString());
		}
	}

}
