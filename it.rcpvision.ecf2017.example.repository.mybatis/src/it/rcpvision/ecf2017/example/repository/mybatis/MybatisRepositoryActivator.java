package it.rcpvision.ecf2017.example.repository.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class MybatisRepositoryActivator implements BundleActivator {

	
	private static MybatisRepositoryActivator singleton;
	ResourceSet rs= new ResourceSetImpl();
	private SqlSession session;

	@Override
	public void start(BundleContext context) throws Exception {
		singleton= this;
		session = DatabaseUtil.getSqlSessionFactory().openSession();
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

}
