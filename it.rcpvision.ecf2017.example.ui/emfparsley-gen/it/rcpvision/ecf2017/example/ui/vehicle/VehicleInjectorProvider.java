package it.rcpvision.ecf2017.example.ui.vehicle;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.rcpvision.ecf2017.example.ui.vehicle.VehicleEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class VehicleInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new VehicleEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(VehicleInjectorProvider.class))));
    }
    return injector;
  }
}
