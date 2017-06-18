package it.rcpvision.ecf2017.example.repository.cdo;


import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

@Component
public class VehicleRepositoryCdoImpl implements IVehicleRepository{
	
	private static final String VEHICLE_RESOURCE_NAME = "VEHICLE";
	private CDOResource resource;
	private CDOTransaction transaction;
	
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
				return (Vehicle)eobject;
			}
		}
		return null;
	}

	@Override
	public List queryAll() {
		return resource.getContents();
	}

}
