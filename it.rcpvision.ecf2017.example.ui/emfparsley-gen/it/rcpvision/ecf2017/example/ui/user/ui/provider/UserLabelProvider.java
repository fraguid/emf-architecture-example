package it.rcpvision.ecf2017.example.ui.user.ui.provider;

import com.google.inject.Inject;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class UserLabelProvider extends ViewerLabelProvider {
  @Inject
  public UserLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final User it) {
    String _name = it.getName();
    String _plus = (_name + " ");
    String _surname = it.getSurname();
    String _plus_1 = (_plus + _surname);
    return _plus_1;
  }
}