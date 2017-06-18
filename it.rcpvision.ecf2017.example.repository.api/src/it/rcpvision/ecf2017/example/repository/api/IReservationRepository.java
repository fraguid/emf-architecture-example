package it.rcpvision.ecf2017.example.repository.api;

import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;

public interface IReservationRepository extends IRepository<Reservation> {

	Reservation getActiveByVehicle(Vehicle vehicle);

}
