package it.rcpvision.ecf2017.example.ui.presenter;

public interface IViewerPresenter {
	
	void init();
	
	Object getViewerInput();
	
	Object newButtonPressed();

	void saveButtonPressed();
	
	void cancelButtonPressed();
}
