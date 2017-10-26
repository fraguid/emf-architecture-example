package it.rcpvision.emf.architecture.example.ui.custom;

import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import it.rcpvision.emf.architecture.example.util.EmfUtil;

public class DirtyRowsTableLabelProvider extends TableColumnLabelProvider {
	
	@Inject
	EmfUtil emfUtil;

	Color GREEN= new Color(Display.getCurrent(),new RGB(0, 200, 0));
	
	@Override
	public Color getForeground(Object element) {
		if (emfUtil.isDirty(element)) {
			return GREEN;
		} else {
			return super.getForeground(element);
		}
	}
	
	@Override
	public Font getFont(Object element) {
		if (emfUtil.isDirty(element)) {
			return JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT);
		} else {
			return JFaceResources.getFontRegistry().get(JFaceResources.DEFAULT_FONT);
		}
	}
	
}
