package it.rcpvision.ecf2017.example.repository.dummy;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import it.rcpvision.ecf2017.example.repository.api.IUserRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

@Component
public class UserRepositoryDummy implements IUserRepository{
	
	Resource resource= new ResourceImpl();
	public UserRepositoryDummy() {
		User firstUser = CarsharingFactory.eINSTANCE.createUser();
		firstUser.setName("pippo");
		resource.getContents().add(firstUser);
	}
	 

	@Override
	public void insert(User obj)  throws RepositoryException {
		resource.getContents().add(obj);
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
			if(key.equals(((User)eobject).getName())) {
				return (User)eobject;
			}
		}
		return null;
	}

	@Override
	public List queryAll() {
		return resource.getContents();
	}

}
