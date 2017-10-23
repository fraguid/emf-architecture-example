package it.rcpvision.emf.architecture.example.ui.vehicle;

import com.google.inject.Injector;
import it.rcpvision.emf.architecture.example.ui.vehicle.VehicleInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class VehicleExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return VehicleInjectorProvider.getInjector();
  }
}
