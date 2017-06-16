package it.rcpvision.ecf2017.example.util;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.edit.NotificationBuffer;

public class EmfUtil {

	public boolean isDirty(Object element) {
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			EList<Adapter> eAdapters = eObject.eAdapters();
			Optional<Adapter> optional = eAdapters.stream().filter(adapter -> adapter instanceof NotificationBuffer)
					.findFirst();
			return optional.isPresent() && !((NotificationBuffer) optional.get()).getNotifications().isEmpty();
		} else {
			return false;
		}
	}

	public boolean isNewObject(EObject eobject) {
		return eobject.eResource()!=null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List extractNewObjects(List source) {
		return (List) source.stream()
				.filter(obj -> obj instanceof EObject && ((EObject)obj).eResource()!=null)
				.collect(Collectors.toList());
	}
}
