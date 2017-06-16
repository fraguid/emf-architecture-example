package it.rcpvision.ecf2017.example.ui.user;

import it.rcpvision.ecf2017.example.ui.custom.ArrayTableViewerContentProvider;
import it.rcpvision.ecf2017.example.ui.custom.DirtyRowsTableLabelProvider;
import it.rcpvision.ecf2017.example.ui.custom.ListUndoableEditingStrategy;
import it.rcpvision.ecf2017.example.ui.presenter.IUserPresenter;
import it.rcpvision.ecf2017.example.ui.presenter.impl.UserPresenterImpl;
import it.rcpvision.ecf2017.example.ui.user.ui.provider.UserFeaturesProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class UserEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public UserEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  public Class<? extends IUserPresenter> bindIUserPresenter() {
    return UserPresenterImpl.class;
  }
  
  @Override
  public Class<? extends IEditingStrategy> bindIEditingStrategy() {
    return ListUndoableEditingStrategy.class;
  }
  
  @Override
  public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
    return DirtyRowsTableLabelProvider.class;
  }
  
  @Override
  public Class<? extends TableViewerContentProvider> bindTableViewerContentProvider() {
    return ArrayTableViewerContentProvider.class;
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return UserFeaturesProvider.class;
  }
}
