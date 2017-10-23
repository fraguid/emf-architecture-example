package it.rcpvision.emf.architecture.example.repository.api;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;

public interface IRepository<T extends EObject> {
	
	void insert(T obj) throws RepositoryException;
	void update(T obj) throws RepositoryException;
	void delete(T obj) throws RepositoryException;
	T getByKey(Object key);
	List queryAll();
}
