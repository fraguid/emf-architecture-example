package it.rcpvision.ecf2017.example.repository.cdo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IReservationRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

@Component
public class ReservationRepositoryCdoImpl implements IReservationRepository{
	
	private static final String RESERVATION_RESOURCE_NAME = "RESERVATION";
	private CDOResource resource;
	private CDOTransaction transaction;
	
	public ReservationRepositoryCdoImpl() {
		transaction= CDORepositoryActivator.getSingleton().openTransaction();
		resource =transaction.getOrCreateResource(RESERVATION_RESOURCE_NAME);
	}
	 

	@Override
	public void insert(Reservation obj)  throws RepositoryException {
		resource.getContents().add(obj);
		commit();
	}


	@Override
	public void update(Reservation obj) throws RepositoryException {
		commit();
	}

	@Override
	public void delete(Reservation obj) throws RepositoryException {
		resource.getContents().remove(obj);
		commit();
	}

	@Override
	public Reservation getByKey(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List queryAll() {
		return resource.getContents();
	}
	
	private void commit() throws RepositoryException {
		try {
			transaction.commit();
		} catch (CommitException e) {
			throw new RepositoryException(e); 
		}
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
	
}
