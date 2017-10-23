package it.rcpvision.emf.architecture.example.ui.presenter.impl;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;
import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;
import it.rcpvision.emf.architecture.example.service.VehicleService;
import it.rcpvision.emf.architecture.example.ui.presenter.IVehiclePresenter;

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
