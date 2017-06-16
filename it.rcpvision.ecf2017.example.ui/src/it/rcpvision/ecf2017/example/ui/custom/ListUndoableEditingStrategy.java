package it.rcpvision.ecf2017.example.ui.custom;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.NotificationBuffer;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.resource.ResourceLoader;

import com.google.inject.Inject;
import com.google.inject.MembersInjector;

import it.rcpvision.ecf2017.example.util.EmfUtil;

public class ListUndoableEditingStrategy implements IEditingStrategy {

	@Inject
	protected MembersInjector<UndoableEditingStrategy> undoableEditingStrategyMemberInjector;

	@Inject
	private EditingDomain editingDomain;

	@Inject
	private ResourceLoader resourceLoader;
	
	@Inject
	EmfUtil emfUtil;
	
	public Map<EObject, UndoableEditingStrategy> objectsToEditingStrategies = new HashMap<>();

	@Override
	public void prepare(EObject original) {
		UndoableEditingStrategy undoableEditingStrategy = new UndoableEditingStrategy();
		undoableEditingStrategyMemberInjector.injectMembers(undoableEditingStrategy);
		objectsToEditingStrategies.put(original, undoableEditingStrategy);
		undoableEditingStrategy.prepare(original);
	}

	@Override
	public void update(EObject edited) {
		if (emfUtil.isDirty(edited)) {
			UndoableEditingStrategy undoableEditingStrategy = objectsToEditingStrategies.get(edited);
			undoableEditingStrategy.update(edited);
		}
	}

	@Override
	public void rollback(EObject edited) {
		if (emfUtil.isDirty(edited)) {
			UndoableEditingStrategy undoableEditingStrategy = objectsToEditingStrategies.get(edited);
			undoableEditingStrategy.rollback(edited);
		}
	}

	@Override
	public EditingDomain getEditingDomain(EObject edited) {
		UndoableEditingStrategy undoableEditingStrategy = objectsToEditingStrategies.get(edited);
		EditingDomain editingDomain = undoableEditingStrategy.getEditingDomain(edited);
		return editingDomain;
	}
	
	
}
