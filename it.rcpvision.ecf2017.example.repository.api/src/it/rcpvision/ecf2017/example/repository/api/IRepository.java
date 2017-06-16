package it.rcpvision.ecf2017.example.repository.api;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

public interface IRepository<T extends EObject> {
	
	void insert(T obj) throws RepositoryException;
	void update(T obj) throws RepositoryException;
	void delete(T obj) throws RepositoryException;
	T getByKey(Object key);
	List<T> queryAll();
}
