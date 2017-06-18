package it.rcpvision.ecf2017.example.ui.presenter.impl;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;
import it.rcpvision.ecf2017.example.service.VehicleService;
import it.rcpvision.ecf2017.example.ui.presenter.IVehiclePresenter;

public class VehiclePresenterImpl extends AbstractViewerPresenter<Vehicle, VehicleService> implements IVehiclePresenter {

	@Override
	public void reservationButtonPressed(Reservation reservation) {
		try {
			service.createReservation(reservation);
			service.getAll();
		} catch (RepositoryException e) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Reservation Error", e.getMessage());
		}
	}

}
