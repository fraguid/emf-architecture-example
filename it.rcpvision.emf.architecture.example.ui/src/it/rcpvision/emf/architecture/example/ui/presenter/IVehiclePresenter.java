package it.rcpvision.emf.architecture.example.ui.presenter;

import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;

public interface IVehiclePresenter extends IViewerPresenter {

	public void reservationButtonPressed(Reservation reservation);

}
