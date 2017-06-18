package it.rcpvision.ecf2017.example.ui.view;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.dialogs.DetailFormBasedDialog;
import org.eclipse.emf.parsley.dialogs.DialogFactory;
import org.eclipse.emf.parsley.edit.EditingDomainFinder;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;
import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.ReservationState;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.ui.presenter.IVehiclePresenter;

public class VehicleTableFormView extends TableFormView<IVehiclePresenter> {

	@Inject
	private DialogFactory dialogFactory;
	
	@Inject
	private EditingDomainFinder domainFinder;

	private Button reservationButton;
	
	
	@Override
	protected void addViewerActions() {
		
	}

	@Override
	protected EClass getEClass() {
		return CarsharingPackage.Literals.VEHICLE;
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		getViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Vehicle selectedVehicle=getSelectedVehicle();
				reservationButton.setEnabled(selectedVehicle.getReservationState().equals(ReservationState.FREE));
				
			}
		});
	}
	
	@Override
	protected void addButtons() {
		super.addButtons();
		reservationButton = new Button(buttonContainer,SWT.NONE);
		reservationButton.setLayoutData(GridDataFactory.swtDefaults().create());
		reservationButton.setText("Make a reservation");
		reservationButton.setEnabled(false);
		reservationButton.addSelectionListener(uiUtil.createSelectionAdapter(()->{
					Vehicle selectedVehicle=getSelectedVehicle();
					Reservation reservation=CarsharingFactory.eINSTANCE.createReservation();
					reservation.setVehicle(selectedVehicle);
					Dialog dialog = dialogFactory.createDetailDialog(buttonContainer.getShell(), "Create Reservation", reservation, domainFinder.getEditingDomainFor(selectedVehicle));
					dialog.setBlockOnOpen(true);
					int ret = dialog.open();
					if(ret==Dialog.OK) {
						presenter.reservationButtonPressed(reservation);
						getViewer().setInput(presenter.getViewerInput());
					}
			}));
	} 
	
	private Vehicle getSelectedVehicle() {
		return (Vehicle) ((IStructuredSelection)getViewer().getSelection()).getFirstElement();
	}

	protected int getButtonNumber() {
		return 3;
	}

}
