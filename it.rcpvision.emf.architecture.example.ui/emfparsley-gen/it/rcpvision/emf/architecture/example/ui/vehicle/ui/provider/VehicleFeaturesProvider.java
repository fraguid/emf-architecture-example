package it.rcpvision.emf.architecture.example.ui.vehicle.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class VehicleFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("it.rcpvision.emf.architecture.example.model.carsharing.Vehicle",
      "brand", "model", "type", "plate");
  }
}
