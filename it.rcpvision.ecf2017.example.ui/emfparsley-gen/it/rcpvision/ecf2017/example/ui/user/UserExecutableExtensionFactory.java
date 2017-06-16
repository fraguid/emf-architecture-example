package it.rcpvision.ecf2017.example.ui.user;

import com.google.inject.Injector;
import it.rcpvision.ecf2017.example.ui.user.UserInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class UserExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return UserInjectorProvider.getInjector();
  }
}
