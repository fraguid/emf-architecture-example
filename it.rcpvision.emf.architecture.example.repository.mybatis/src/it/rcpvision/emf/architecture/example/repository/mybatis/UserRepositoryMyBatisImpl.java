package it.rcpvision.emf.architecture.example.repository.mybatis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.ibatis.session.SqlSession;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingFactory;
import it.rcpvision.emf.architecture.example.model.carsharing.User;
import it.rcpvision.emf.architecture.example.repository.api.IUserRepository;
import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;
import it.rcpvision.emf.architecture.example.repository.mybatis.mapper.PeopleMapper;
import it.rcpvision.emf.architecture.example.repository.mybatis.model.People;
import it.rcpvision.emf.architecture.example.repository.mybatis.model.PeopleExample;

@Component
public class UserRepositoryMyBatisImpl implements IUserRepository{
	
	
	private PeopleMapper peopleMapper;
	private Resource resource;

	public UserRepositoryMyBatisImpl() {
		peopleMapper= MybatisRepositoryActivator.getSingleton().getSqlSession().getMapper(PeopleMapper.class);
		resource= MybatisRepositoryActivator.getSingleton().createResource("User");
	}
	 

	@Override
	public void insert(User user)  throws RepositoryException {
		People record= createDbPeopleFromUser(user);
		peopleMapper.insert(record);
		user.setId(Long.toString(peopleMapper.getLastId()));
		checkForResource(user);
	}

	@Override
	public void update(User user) throws RepositoryException {
		People record= createDbPeopleFromUser(user);
		peopleMapper.updateByPrimaryKey(record);
	}

	@Override
	public void delete(User user) throws RepositoryException {
		peopleMapper.deleteByPrimaryKey(Short.parseShort(user.getId()));
	}

	@Override
	public User getByKey(Object key) {
		People dbPeople = peopleMapper.selectByPrimaryKey((Short)key);
		return checkForResource(createUserFromDbPeople(dbPeople));
	}

	@Override
	public List queryAll() {
		List<User> ret= new ArrayList<User>();
		for (People dbPeople : peopleMapper.selectByExample(new PeopleExample())) {
			ret.add(checkForResource(createUserFromDbPeople(dbPeople)));
		}
		return ret;
	}
	
	private User checkForResource(User user) {
		if(user.eResource()==null) {
			resource.getContents().add(user);
		}
		return user;
	}


	private User createUserFromDbPeople(People dbPeople) {
		User user= CarsharingFactory.eINSTANCE.createUser();
		user.setName(dbPeople.getName());
		user.setSurname(dbPeople.getSurname());
		user.setId(Integer.toString(dbPeople.getId()));
		return user;
	}

	private People createDbPeopleFromUser(User user) {
		People people=new People();
		if(user.getId()!=null) {
			people.setId(Short.parseShort(user.getId()));
		}
		people.setName(user.getName());
		people.setSurname(user.getSurname());
		return people;
	}
}
