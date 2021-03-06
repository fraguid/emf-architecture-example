package it.rcpvision.emf.architecture.example.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.inject.Inject;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingFactory;
import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;
import it.rcpvision.emf.architecture.example.model.carsharing.ReservationState;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;
import it.rcpvision.emf.architecture.example.repository.api.IReservationRepository;
import it.rcpvision.emf.architecture.example.repository.api.IVehicleRepository;
import it.rcpvision.emf.architecture.example.repository.api.RepositoryApiActivator;
import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;
import it.rcpvision.emf.architecture.example.util.EmfUtil;

public class VehicleService implements IViewerService<Vehicle> {
	
	@Inject
	EmfUtil emfUtil;

	IVehicleRepository veichleRepo= RepositoryApiActivator.getSingleton().getVehicleRepository();
	IReservationRepository reservationRepo= RepositoryApiActivator.getSingleton().getReservationRepository();
	
	public List getAll() {
		return veichleRepo.queryAll();
	}
	
	public void save(Vehicle obj) throws RepositoryException {
		if(emfUtil.isNewObject(obj)) {
			veichleRepo.insert(obj);
		}else {
			veichleRepo.update(obj);
		}
		
	}

	@Override
	public Vehicle createNewObject() {
		return CarsharingFactory.eINSTANCE.createVehicle();
	}

	public void createReservation(Reservation reservation) throws RepositoryException {
		reservationRepo.insert(reservation);
	}

	public Collection getAllReservableVehicle() {
		List ret= new ArrayList();
		for (Object obj:  getAll()) {
			if (obj instanceof Vehicle) {
				Vehicle v = (Vehicle) obj;
				if(v.getReservationState().equals(ReservationState.FREE)) {
					ret.add(v);
				}
				
			}
		}
		return ret;
	}

}
