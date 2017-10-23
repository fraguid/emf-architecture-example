package it.rcpvision.emf.architecture.example.ui.vehicle.config;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.views.SaveableTableFormView;

@SuppressWarnings("all")
public class VehicleConfigurator extends Configurator {
  public EClass eClass(final SaveableTableFormView it) {
    return CarsharingPackage.Literals.VEHICLE;
  }
}
