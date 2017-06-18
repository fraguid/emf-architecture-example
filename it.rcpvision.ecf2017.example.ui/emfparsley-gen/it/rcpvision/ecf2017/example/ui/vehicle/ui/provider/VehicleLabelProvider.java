package it.rcpvision.ecf2017.example.ui.vehicle.ui.provider;

import com.google.inject.Inject;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class VehicleLabelProvider extends ViewerLabelProvider {
  @Inject
  public VehicleLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final User it) {
    String _name = it.getName();
    String _plus = (_name + " ");
    String _surname = it.getSurname();
    String _plus_1 = (_plus + _surname);
    return _plus_1;
  }
  
  public String text(final Vehicle it) {
    String _brand = it.getBrand();
    String _plus = (_brand + " ");
    String _model = it.getModel();
    String _plus_1 = (_plus + _model);
    String _plus_2 = (_plus_1 + " (");
    String _plate = it.getPlate();
    String _plus_3 = (_plus_2 + _plate);
    String _plus_4 = (_plus_3 + ")");
    return _plus_4;
  }
}
