package it.rcpvision.ecf2017.example.repository.dummy;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IReservationRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

@Component
public class ReservationRepositoryDummy implements IReservationRepository{
	
	Resource resource= DummyRepositoryActivator.getSingleton().createResosurce();
	 

	@Override
	public void insert(Reservation obj)  throws RepositoryException {
		resource.getContents().add(obj);
	}

	@Override
	public void update(Reservation obj) throws RepositoryException {
	}

	@Override
	public void delete(Reservation obj) throws RepositoryException {
		resource.getContents().remove(obj);
	}

	@Override
	public Reservation getByKey(Object key) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Reservation getActiveByVehicle(Vehicle vehicle) {
		Optional<Reservation> reservationOptional = resource.getContents().stream().map(Reservation.class::cast)
				.filter(r -> r.getVehicle()!=null && r.getVehicle().getId()==vehicle.getId()).findFirst();
		if(reservationOptional.isPresent()) {
			return reservationOptional.get();
		}
		return null;
	}

	@Override
	public List queryAll() {
		return resource.getContents();
	}

}
