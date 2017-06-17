package it.rcpvision.ecf2017.example.repository.cdo;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.domain.GlobalAdapterFactoryEditingDomainProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.google.inject.Guice;
import com.google.inject.Injector;

import it.rcpvision.ecf2017.example.ui.UiActivator;


public class CDORepositoryActivator implements BundleActivator {

	
	private static CDORepositoryActivator singleton;
	private CDOSession session;
	ResourceSet rs;
	private CDOTransaction transaction;

	@Override
	public void start(BundleContext context) throws Exception {
		singleton= this;
		Injector injector = Guice.createInjector(new EmfParsleyGuiceModule(UiActivator.getDefault()));
		GlobalAdapterFactoryEditingDomainProvider provider = injector
				.getInstance(GlobalAdapterFactoryEditingDomainProvider.class);
		rs = provider.get().getResourceSet();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

	public static CDORepositoryActivator getSingleton() {
		return singleton;
	}

	public CDOSession getSession() {
		if(session==null) {
			session=CdoUtil.getOreCreateSession();
		}
		return session;
	}

	public CDOTransaction openTransaction() {
		if(transaction==null) {
			transaction=getSession().openTransaction(rs);
		}
		return transaction;
	}

}
