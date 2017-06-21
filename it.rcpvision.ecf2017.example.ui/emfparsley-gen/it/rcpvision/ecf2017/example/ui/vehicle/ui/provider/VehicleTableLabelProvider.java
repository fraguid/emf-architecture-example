package it.rcpvision.ecf2017.example.ui.vehicle.ui.provider;

import it.rcpvision.ecf2017.example.model.carsharing.ReservationState;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.ui.custom.DirtyRowsTableLabelProvider;

@SuppressWarnings("all")
public class VehicleTableLabelProvider extends DirtyRowsTableLabelProvider {
  public Object image_Vehicle_reservationState(final Vehicle it) {
    boolean _equals = it.getReservationState().equals(ReservationState.FREE);
    boolean _not = (!_equals);
    if (_not) {
      return "reservation.png";
    }
    return "shop.png";
  }
}
