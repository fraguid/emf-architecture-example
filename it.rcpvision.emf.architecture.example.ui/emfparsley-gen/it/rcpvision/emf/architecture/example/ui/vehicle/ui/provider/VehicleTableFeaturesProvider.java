package it.rcpvision.emf.architecture.example.ui.vehicle.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;

@SuppressWarnings("all")
public class VehicleTableFeaturesProvider extends TableFeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("it.rcpvision.emf.architecture.example.model.carsharing.Vehicle",
      "id", "brand", "model", "type", "plate", "reservationState");
  }
}
