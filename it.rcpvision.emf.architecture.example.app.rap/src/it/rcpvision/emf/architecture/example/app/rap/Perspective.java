package it.rcpvision.emf.architecture.example.app.rap;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IViewLayout;
import org.eclipse.ui.PlatformUI;

public class Perspective implements IPerspectiveFactory {

    public static final String USER_VIEW = "it.rcpvision.emf.architecture.example.ui.view.user";
    public static final String VEHICLE_VIEW = "it.rcpvision.emf.architecture.example.ui.view.vehicle";

    private static final Logger LOGGER = LogManager.getLogger(Perspective.class);

    public void createInitialLayout(IPageLayout layout) {
        IFolderLayout main = layout.createFolder("wrapper", IPageLayout.LEFT, 1f, "org.eclipse.ui.editorss");

        addView(layout, main, USER_VIEW);
        addView(layout, main, VEHICLE_VIEW);

        main.setProperty("swt-minimize-visible", "false");
        main.setProperty("swt-maximize-visible", "false");

        layout.setEditorAreaVisible(false);
        layout.setFixed(true);

        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideActionSet("org.eclipse.search.searchActionSet");
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideActionSet("org.eclipse.ui.externaltools.ExternalToolsSet");
            }
        });

    }

    private void addView(IPageLayout layout, IFolderLayout main, String id) {
        try {
            main.addView(id);
            IViewLayout viewLayout = layout.getViewLayout(id);
            viewLayout.setCloseable(false);
            viewLayout.setMoveable(false);
        } catch (RuntimeException e) {
            LOGGER.error("View not found:  " + id, e);
        }
    }
}
