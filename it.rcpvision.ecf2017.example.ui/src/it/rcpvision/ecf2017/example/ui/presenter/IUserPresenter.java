package it.rcpvision.ecf2017.example.ui.presenter;

import java.util.List;

import org.eclipse.core.databinding.observable.list.WritableList;

import it.rcpvision.ecf2017.example.model.carsharing.User;

public interface IUserPresenter extends IViewerPresenter{

	void cancelButtonPressed();

	void saveButtonPressed();

	Object getViewerInput();

}
