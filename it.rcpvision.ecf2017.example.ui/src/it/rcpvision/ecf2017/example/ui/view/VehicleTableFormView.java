package it.rcpvision.ecf2017.example.ui.view;

import org.eclipse.emf.ecore.EClass;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;
import it.rcpvision.ecf2017.example.ui.presenter.IVehiclePresenter;

public class VehicleTableFormView extends TableFormView<IVehiclePresenter> {

	@Override
	protected void addViewerActions() {
		
	}

	@Override
	protected EClass getEClass() {
		return CarsharingPackage.Literals.VEHICLE;
	}

}
