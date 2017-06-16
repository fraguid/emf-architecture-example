package it.rcpvision.ecf2017.example.repository.cdo;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


public class CDORepositoryActivator implements BundleActivator {

	
	private static CDORepositoryActivator singleton;
	private CDOSession session;
//	private CDOMemServer cdoServer; 
	ResourceSet rs= new ResourceSetImpl();

	@Override
	public void start(BundleContext context) throws Exception {
		singleton= this;
//		cdoServer = CdoUtil.getorCreateServerInstance();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
//		cdoServer.stop();
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
		return getSession().openTransaction();
	}

}
