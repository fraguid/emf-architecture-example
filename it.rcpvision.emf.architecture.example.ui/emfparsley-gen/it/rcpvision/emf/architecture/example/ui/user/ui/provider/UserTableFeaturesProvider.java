package it.rcpvision.emf.architecture.example.ui.user.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;

@SuppressWarnings("all")
public class UserTableFeaturesProvider extends TableFeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("it.rcpvision.emf.architecture.example.model.carsharing.User",
      "id", "name", "surname");
  }
}
