package it.rcpvision.emf.architecture.example.ui.presenter;

public interface IViewerPresenter {
	
	void init();
	
	Object getViewerInput();
	
	Object newButtonPressed();

	void saveButtonPressed();
	
	void cancelButtonPressed();
}
