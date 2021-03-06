package it.rcpvision.emf.architecture.example.ui.presenter.impl;

import java.util.List;

import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;
import it.rcpvision.emf.architecture.example.service.IViewerService;
import it.rcpvision.emf.architecture.example.ui.presenter.IViewerPresenter;
import it.rcpvision.emf.architecture.example.util.EmfUtil;

public abstract class AbstractViewerPresenter<T extends EObject, S extends IViewerService<T>> implements IViewerPresenter{

	@Inject
	IEditingStrategy editingStrategy; 
	
	List<T> list = new WritableList<T>();
	
	@Inject
	protected S service;
	
	@Inject
	private EmfUtil emfUtil;
	
	@Override
	public void init() {
		List<T> allUsers = service.getAll();
		allUsers.forEach(editingStrategy::prepare);
		list.addAll(allUsers);
	}
	
	@Override
	public Object getViewerInput() {
		return list;
	}

	@Override
	public T newButtonPressed() {
		T newObj=service.createNewObject();
		list.add(newObj);
		return newObj;
	}

	@Override
	public void saveButtonPressed() {
		list.forEach(obj->{
			if(!emfUtil.isNewObject(obj)) {
				editingStrategy.update(obj);
				save(obj);
				editingStrategy.prepare(obj);
			}else {
				save(obj);
				editingStrategy.prepare(obj);
			}
		});
		list.forEach(arg0 -> {
		});
	}

	private void save(T arg0) {
		try {
			service.save(arg0);
		} catch (RepositoryException e) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Save Error", e.getMessage());
		}
	}

	@Override
	public void cancelButtonPressed() {
		list.removeAll(emfUtil.extractNewObjects(list));
		list.forEach(editingStrategy::rollback);
	}
	
}
