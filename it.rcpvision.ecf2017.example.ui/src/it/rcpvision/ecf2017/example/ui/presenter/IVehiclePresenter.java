package it.rcpvision.ecf2017.example.ui.presenter;

import it.rcpvision.ecf2017.example.model.carsharing.Reservation;

public interface IVehiclePresenter extends IViewerPresenter {

	public void reservationButtonPressed(Reservation reservation);

}
