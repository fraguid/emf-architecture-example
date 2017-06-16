package it.rcpvision.ecf2017.example.ui.custom;

import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import it.rcpvision.ecf2017.example.util.EmfUtil;

public class DirtyRowsTableLabelProvider extends TableColumnLabelProvider {
	
	@Inject
	EmfUtil emfUtil;

	Color GREEN= new Color(Display.getCurrent(),new RGB(0, 250, 0));
	
	@Override
	public Color getBackground(Object element) {
		if (emfUtil.isDirty(element)) {
			return GREEN;
		} else {
			return super.getBackground(element);
		}
	}
}
