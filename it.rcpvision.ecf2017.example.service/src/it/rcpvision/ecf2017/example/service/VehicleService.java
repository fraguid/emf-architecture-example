package it.rcpvision.ecf2017.example.service;

import java.util.List;

import com.google.inject.Inject;

import it.rcpvision.ecf2017.example.ServiceActivator;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IUserRepository;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;
import it.rcpvision.ecf2017.example.util.EmfUtil;

public class VehicleService implements IViewerService<Vehicle> {
	
	@Inject
	EmfUtil emfUtil;

	IVehicleRepository userRepository= ServiceActivator.getSingleton().getVehicleRepository();
	
	public List<Vehicle> getAll() {
		return userRepository.queryAll();
	}
	
	public void save(Vehicle vehicle) throws RepositoryException {
		if(emfUtil.isNewObject(vehicle)) {
			userRepository.insert(vehicle);
		}else {
			userRepository.update(vehicle);
		}
		
	}

	@Override
	public Vehicle createNewObject() {
		return CarsharingFactory.eINSTANCE.createVehicle();
	}

}
