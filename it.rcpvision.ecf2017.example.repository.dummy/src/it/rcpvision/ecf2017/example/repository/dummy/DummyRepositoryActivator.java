package it.rcpvision.ecf2017.example.repository.dummy;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.EmfParsleyJavaGuiceModule;
import org.eclipse.emf.parsley.edit.domain.GlobalAdapterFactoryEditingDomainProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import it.rcpvision.ecf2017.example.ui.UiActivator;


public class DummyRepositoryActivator implements  BundleActivator {

	
	private static DummyRepositoryActivator singleton;
	ResourceSet rs;

	@Override
	public void start(BundleContext context) throws Exception {
//		AdapterFactory adapterFactory = new
//				ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
//		AdapterFactoryEditingDomain domain= new AdapterFactoryEditingDomain(adapterFactory, new BasicCommandStack());
//		rs=domain.getResourceSet();
		
		Injector injector = Guice.createInjector(new EmfParsleyGuiceModule(UiActivator.getDefault()));
		GlobalAdapterFactoryEditingDomainProvider provider = injector
				.getInstance(GlobalAdapterFactoryEditingDomainProvider.class);
		rs = provider.get().getResourceSet();
		
		singleton= this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

	public static DummyRepositoryActivator getSingleton() {
		return singleton;
	}
	
	public Resource createResosurce() {
		Resource resource= new ResourceImpl(URI.createURI("dummy:/dummy"));
		rs.getResources().add(resource);
		return resource;
	}

}
