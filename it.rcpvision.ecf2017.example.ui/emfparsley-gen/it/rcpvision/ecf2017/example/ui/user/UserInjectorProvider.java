package it.rcpvision.ecf2017.example.ui.user;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.rcpvision.ecf2017.example.ui.user.UserEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class UserInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new UserEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(UserInjectorProvider.class))));
    }
    return injector;
  }
}
