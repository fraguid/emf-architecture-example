package it.rcpvision.emf.architecture.example.ui.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.ProposalCreator;

import com.google.inject.Inject;

import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;
import it.rcpvision.emf.architecture.example.model.carsharing.User;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;
import it.rcpvision.emf.architecture.example.service.UserService;
import it.rcpvision.emf.architecture.example.service.VehicleService;

public class ReservationProposalCreator extends ProposalCreator {

	@Inject
	private VehicleService vehicleService;
	
	@Inject
	private UserService userService;

	@SuppressWarnings("unchecked")
	public List<Vehicle> proposals_Reservation_vehicle(final Reservation it, final EStructuralFeature structuralFeature) {
		return new ArrayList(vehicleService.getAllReservableVehicle());
	}

	@SuppressWarnings("unchecked")
	public List<User> proposals_Reservation_user(final Reservation it, final EStructuralFeature structuralFeature) {
		return new ArrayList(userService.getAll());
	}
}