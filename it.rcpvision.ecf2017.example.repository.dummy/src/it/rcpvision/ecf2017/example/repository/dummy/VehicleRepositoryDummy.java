package it.rcpvision.ecf2017.example.repository.dummy;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

@Component
public class VehicleRepositoryDummy implements IVehicleRepository{
	
	Resource resource= new ResourceImpl();
	public VehicleRepositoryDummy() {
		Vehicle firstVehicle = CarsharingFactory.eINSTANCE.createVehicle();
		firstVehicle.setBrand("Toyota");
		firstVehicle.setModel("Yaris");
		resource.getContents().add(firstVehicle);
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
