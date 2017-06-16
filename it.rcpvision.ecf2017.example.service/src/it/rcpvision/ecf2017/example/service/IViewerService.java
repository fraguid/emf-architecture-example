package it.rcpvision.ecf2017.example.service;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;

public interface IViewerService<T extends EObject> {

	public List getAll();
	
	public void save(T obj) throws RepositoryException;
	
	public T createNewObject();
}
