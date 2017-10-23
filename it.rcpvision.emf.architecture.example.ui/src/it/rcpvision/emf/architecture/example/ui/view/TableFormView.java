package it.rcpvision.emf.architecture.example.ui.view;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.composite.TableFormComposite;
import org.eclipse.emf.parsley.composite.TableFormFactory;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

import it.rcpvision.emf.architecture.example.ui.custom.UIUtil;
import it.rcpvision.emf.architecture.example.ui.presenter.IViewerPresenter;

public abstract class TableFormView<V extends IViewerPresenter> extends ViewPart {

	@Inject
	private TableFormFactory tableFormFactory;
	
	@Inject
	V presenter;
	
	@Inject
	UIUtil uiUtil;

	private TableFormComposite tableFormComposite;

	protected Composite buttonContainer;

	@Override
	public void createPartControl(Composite parent) {
		presenter.init();
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		tableFormComposite = tableFormFactory
			.createTableFormMasterDetailComposite(parent, SWT.BORDER, getEClass());
		tableFormComposite.update(presenter.getViewerInput());
		tableFormComposite.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		addViewerActions();

		buttonContainer= new Composite(parent,SWT.NONE);
		buttonContainer.setLayout(new GridLayout(getButtonNumber(),false));
		buttonContainer.setLayoutData(GridDataFactory.fillDefaults().create());
		addButtons();
		
	}


	protected void addButtons() {
		Button newButton = new Button(buttonContainer,SWT.NONE);
        newButton.setLayoutData(GridDataFactory.swtDefaults().grab(true, false).align(SWT.END, SWT.CENTER).create());
        newButton.setText("Insert");
        newButton.addSelectionListener(uiUtil.createSelectionAdapter(()->{
        	Display.getCurrent().asyncExec(new Runnable() {
				@Override
				public void run() {
					Object newObject=presenter.newButtonPressed();
					getViewer().refresh(true);
        			getViewer().setSelection(new StructuredSelection(newObject));
				}
			});
        		}));
    	
		Button saveButton = new Button(buttonContainer,SWT.NONE);
		saveButton.setLayoutData(GridDataFactory.swtDefaults().create());
		saveButton.setText("Save");
		saveButton.addSelectionListener(uiUtil.createSelectionAdapter(()->{
					presenter.saveButtonPressed();
					getViewer().refresh(true);
			}));
	}


	protected abstract void addViewerActions() ;
	
	@Override
	public void setFocus() {
		tableFormComposite.setFocus();
	}

	protected abstract EClass getEClass() ;
	
	public StructuredViewer getViewer() {
		return tableFormComposite.getViewer();
	}

	protected int getButtonNumber() {
		return 2;
	}
}
