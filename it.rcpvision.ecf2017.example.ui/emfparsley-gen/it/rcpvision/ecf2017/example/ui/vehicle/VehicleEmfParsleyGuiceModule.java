package it.rcpvision.ecf2017.example.ui.vehicle;

import com.google.inject.Provider;
import it.rcpvision.ecf2017.example.ui.custom.ArrayTableViewerContentProvider;
import it.rcpvision.ecf2017.example.ui.custom.DirtyRowsTableLabelProvider;
import it.rcpvision.ecf2017.example.ui.custom.ListUndoableEditingStrategy;
import it.rcpvision.ecf2017.example.ui.custom.ReservationProposalCreator;
import it.rcpvision.ecf2017.example.ui.presenter.IVehiclePresenter;
import it.rcpvision.ecf2017.example.ui.presenter.impl.VehiclePresenterImpl;
import it.rcpvision.ecf2017.example.ui.vehicle.config.VehicleConfigurator;
import it.rcpvision.ecf2017.example.ui.vehicle.ui.provider.VehicleFeaturesProvider;
import it.rcpvision.ecf2017.example.ui.vehicle.ui.provider.VehicleTableFeaturesProvider;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.domain.GlobalAdapterFactoryEditingDomainProvider;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class VehicleEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public VehicleEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  public Class<? extends IVehiclePresenter> bindIVehiclePresenter() {
    return VehiclePresenterImpl.class;
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
  public Class<? extends Provider<AdapterFactoryEditingDomain>> provideAdapterFactoryEditingDomain() {
    return GlobalAdapterFactoryEditingDomainProvider.class;
  }
  
  @Override
  public Class<? extends ProposalCreator> bindProposalCreator() {
    return ReservationProposalCreator.class;
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return VehicleFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends TableFeaturesProvider> bindTableFeaturesProvider() {
    return VehicleTableFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return VehicleConfigurator.class;
  }
}
