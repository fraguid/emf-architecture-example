package it.rcpvision.ecf2017.example.ui.vehicle.config;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.views.SaveableTableFormView;

@SuppressWarnings("all")
public class VehicleConfigurator extends Configurator {
  public EClass eClass(final SaveableTableFormView it) {
    return CarsharingPackage.Literals.VEHICLE;
  }
}
