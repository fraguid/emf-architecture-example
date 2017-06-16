package it.rcpvision.ecf2017.example.service;

import java.util.List;
import com.google.inject.Inject;
import it.rcpvision.ecf2017.example.ServiceActivator;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import it.rcpvision.ecf2017.example.repository.api.IUserRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;
import it.rcpvision.ecf2017.example.util.EmfUtil;

public class UserService implements IViewerService<User> {
	
	@Inject
	EmfUtil emfUtil;

	IUserRepository userRepository= ServiceActivator.getSingleton().getUserService();
	
	public List<User> getAll() {
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
