package it.rcpvision.ecf2017.example.ui.custom;

import java.util.List;

import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider;

import com.google.inject.Inject;

public class ArrayTableViewerContentProvider extends TableViewerContentProvider {
	
	@Inject
	public ArrayTableViewerContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	
	@Override
	public List<Object> elements(Object o) {
		if(o instanceof WritableList) {
			return (WritableList)o;
		}
		return super.elements(o);
	}
}
