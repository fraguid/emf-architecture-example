package it.rcpvision.emf.architecture.example.ui.presenter.impl;

import com.google.inject.Inject;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import it.rcpvision.emf.architecture.example.ui.presenter.IVehiclePresenter;

public class VehiclePresenterProvider implements Provider<IVehiclePresenter> {

	@Inject
	private MembersInjector<IVehiclePresenter> membersInjector;

	@Override @Singleton
	public IVehiclePresenter get() {
		VehiclePresenterImpl presenter = new VehiclePresenterImpl();
		membersInjector.injectMembers(presenter);
		return presenter;
	}

}
