package it.rcpvision.ecf2017.example.ui.custom;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class UIUtil {
	
	public SelectionListener createSelectionAdapter(Runnable selectionAction) {
		return new SelectionAdapter() {
			private static final long serialVersionUID = 1L;

			@Override
			public void widgetSelected(SelectionEvent e) {
				selectionAction.run();
			}
		};
	}

}
