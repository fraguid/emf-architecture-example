package it.rcpvision.emf.architecture.example.repository.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.domain.GlobalAdapterFactoryEditingDomainProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import it.rcpvision.emf.architecture.example.ui.UiActivator;


public class MybatisRepositoryActivator implements BundleActivator {

	
	private static MybatisRepositoryActivator singleton;
	ResourceSet rs;
	private SqlSession session;

	@Override
	public void start(BundleContext context) throws Exception {
		singleton= this;
		session = DatabaseUtil.getSqlSessionFactory().openSession(true);
		Injector injector = Guice.createInjector(new EmfParsleyGuiceModule(UiActivator.getDefault()));
		GlobalAdapterFactoryEditingDomainProvider provider = injector
				.getInstance(GlobalAdapterFactoryEditingDomainProvider.class);
		rs = provider.get().getResourceSet();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		session.close();
	}

	public SqlSession getSqlSession() {
		return session;
	}

	public static MybatisRepositoryActivator getSingleton() {
		return singleton;
	}

	public Resource createResource(String resourceName) {
		Resource resource= new ResourceImpl(URI.createURI("Dymmy:/dummy/"+resourceName));
		rs.getResources().add(resource);
		return resource;
	}

}
