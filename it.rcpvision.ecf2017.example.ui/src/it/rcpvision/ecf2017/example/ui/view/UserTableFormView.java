package it.rcpvision.ecf2017.example.ui.view;

import org.eclipse.emf.ecore.EClass;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;
import it.rcpvision.ecf2017.example.ui.presenter.IUserPresenter;

public class UserTableFormView extends TableFormView<IUserPresenter> {

	@Override
	protected void addViewerActions() {
		
	}

	@Override
	protected EClass getEClass() {
		return CarsharingPackage.Literals.USER;
	}

}
