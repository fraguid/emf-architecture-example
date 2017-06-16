package it.rcpvision.ecf2017.example.repository.cdo;

import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;

public class CdoUtil {

	private static final String CDO_REPONAME = "data";
    private static final String CDO_SERVER = "localhost";
	
	static CDOMemServer serverSingleton;
	static CDOSession sessionSingleton;
	
//	public static CDOMemServer getorCreateServerInstance() {
//		if(serverSingleton==null) {
//			serverSingleton = new CDOMemServer(CDO_REPONAME,CarsharingPackage.eINSTANCE);
//			serverSingleton.start();
//		}
//		return serverSingleton;
//	}
	
	public static CDOSession getOreCreateSession() {
		if(sessionSingleton==null) {
			CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
			sessionConfiguration.setRepositoryName(CDO_REPONAME);
			IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, CDOMemServer.SERVER_TRANSPORT_TYPE, CDO_SERVER + ":" + CDOMemServer.SERVER_PORT);
			sessionConfiguration.setConnector(connector);
			sessionSingleton=sessionConfiguration.openNet4jSession();
		}
	    return sessionSingleton;
	}
}
