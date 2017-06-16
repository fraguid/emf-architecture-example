package it.rcpvision.ecf2017.example.ui.presenter;

public interface IViewerPresenter {
	
	Object getViewerInput();
	
	void newButtonPressed();

	void saveButtonPressed();
	
	void cancelButtonPressed();
}
