package it.rcpvision.emf.architecture.example.repository.dummy;

import java.util.List;
import java.util.stream.Collectors;

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
import it.rcpvision.emf.architecture.example.repository.api.IUserRepository;
import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;

@Component
public class UserRepositoryDummy implements IUserRepository{
	
	Resource resource= DummyRepositoryActivator.getSingleton().createResosurce();
	short counter=1;
	
	public UserRepositoryDummy() {
		User firstUser = CarsharingFactory.eINSTANCE.createUser();
		firstUser.setName("Francesco");
		firstUser.setSurname("Guidieri");
		resource.getContents().add(firstUser);
	}
	 

	@Override
	public void insert(User obj)  throws RepositoryException {
		resource.getContents().add(obj);
		checkForId(obj);
	}

	@Override
	public void update(User obj) throws RepositoryException {
	}

	@Override
	public void delete(User obj) throws RepositoryException {
		resource.getContents().remove(obj);
	}

	@Override
	public User getByKey(Object key) {
		for (EObject eobject : resource.getContents()) {
			if(key.equals(((User)eobject).getId())) {
				return (User)eobject;
			}
		}
		return null;
	}

	@Override
	public List queryAll() {
		return prepare(resource.getContents());
	}
	
	private List prepare(EList<EObject> contents) {
		resource.getContents().stream().map(User.class::cast).forEach(u->prepareObject(u));
		return resource.getContents();
	}

	private User prepareObject(User user) {
		checkForId(user);
		return user;
	}
	
	private void checkForId(User user) {
		if(user.getId()==null) {
			user.setId(Integer.toString(counter++));
		}
	}

}
