package it.rcpvision.emf.architecture.example.service;

import java.util.List;

import com.google.inject.Inject;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingFactory;
import it.rcpvision.emf.architecture.example.model.carsharing.User;
import it.rcpvision.emf.architecture.example.repository.api.IUserRepository;
import it.rcpvision.emf.architecture.example.repository.api.RepositoryApiActivator;
import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;
import it.rcpvision.emf.architecture.example.util.EmfUtil;

public class UserService implements IViewerService<User> {
	
	@Inject
	EmfUtil emfUtil;

	IUserRepository userRepository= RepositoryApiActivator.getSingleton().getUserService();
	
	public List getAll() {
		return userRepository.queryAll();
	}
	
	public void save(User user) throws RepositoryException {
		if(emfUtil.isNewObject(user)) {
			userRepository.insert(user);
		}else {
			userRepository.update(user);
		}
		
	}

	@Override
	public User createNewObject() {
		return CarsharingFactory.eINSTANCE.createUser();
	}

}
