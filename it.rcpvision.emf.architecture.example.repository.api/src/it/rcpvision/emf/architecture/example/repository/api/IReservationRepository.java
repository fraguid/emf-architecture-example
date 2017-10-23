package it.rcpvision.emf.architecture.example.repository.api;

import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;

public interface IReservationRepository extends IRepository<Reservation> {

	Reservation getActiveByVehicle(Vehicle vehicle);

}
