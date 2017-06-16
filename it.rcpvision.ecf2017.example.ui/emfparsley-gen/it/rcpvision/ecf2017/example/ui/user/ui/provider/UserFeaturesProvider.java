package it.rcpvision.ecf2017.example.ui.user.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class UserFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("it.rcpvision.ecf2017.example.model.carsharing.User",
      "name", "surname");
  }
}
