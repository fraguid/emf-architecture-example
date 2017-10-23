package it.rcpvision.emf.architecture.example.ui.view;

import org.eclipse.emf.ecore.EClass;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage;
import it.rcpvision.emf.architecture.example.ui.presenter.IUserPresenter;

public class UserTableFormView extends TableFormView<IUserPresenter> {

	@Override
	protected void addViewerActions() {
		
	}

	@Override
	protected EClass getEClass() {
		return CarsharingPackage.Literals.USER;
	}

}
