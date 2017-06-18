package it.rcpvision.ecf2017.example.ui.view;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;

public class ReservationDialog extends Dialog{

	protected ReservationDialog(Vehicle vehicle) {
		super(Display.getCurrent().getActiveShell());
		
	}

}
