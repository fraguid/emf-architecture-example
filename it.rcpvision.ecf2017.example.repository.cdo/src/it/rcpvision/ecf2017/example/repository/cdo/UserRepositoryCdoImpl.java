package it.rcpvision.ecf2017.example.repository.cdo;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IUserRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

@Component
public class UserRepositoryCdoImpl implements IUserRepository{
	
	private static final String USER_RESOURCE_NAME = "USER";
	private CDOResource resource;
	private CDOTransaction transaction;
	
	public UserRepositoryCdoImpl() {
		transaction= CDORepositoryActivator.getSingleton().openTransaction();
		resource =transaction.getOrCreateResource(USER_RESOURCE_NAME);
		if(resource.getContents().isEmpty()) {
			User firstUser = CarsharingFactory.eINSTANCE.createUser();
			firstUser.setName("pippo");
			resource.getContents().add(firstUser);
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
	public void insert(User obj)  throws RepositoryException {
		resource.getContents().add(obj);
		commit();
		checkForId(obj);
	}


	@Override
	public void update(User obj) throws RepositoryException {
		commit();
	}

	@Override
	public void delete(User obj) throws RepositoryException {
		resource.getContents().remove(obj);
		commit();
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
	
	private void commit() throws RepositoryException {
		try {
			transaction.commit();
		} catch (CommitException e) {
			throw new RepositoryException(e); 
		}
	}
	
	private List prepare(EList<EObject> contents) {
		resource.getContents().stream().map(User.class::cast).forEach(u->prepareObject(u));
		return resource.getContents();
	}

	private User prepareObject(User user) {
		checkForId(user);
		return user;
	}
	
	private User checkForId(User user) {
		if(user.getId()==null) {
			user.setId(user.cdoID().toString());
		}
		return user;
	}

}
