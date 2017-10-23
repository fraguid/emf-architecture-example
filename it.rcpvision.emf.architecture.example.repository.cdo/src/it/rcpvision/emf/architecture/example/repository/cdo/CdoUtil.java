package it.rcpvision.emf.architecture.example.repository.cdo;

import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage;

public class CdoUtil {

	private static final String CDO_REPONAME = "data";
    private static final String CDO_SERVER = "localhost";
	private static final String SERVER_TRANSPORT_TYPE = "tcp";
	private static final String SERVER_PORT = "2036";
	
	static CDOSession sessionSingleton;
	
	public static CDOSession getOreCreateSession() {
		if(sessionSingleton==null) {
			CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
			sessionConfiguration.setRepositoryName(CDO_REPONAME);
			IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, SERVER_TRANSPORT_TYPE, CDO_SERVER + ":" + SERVER_PORT);
			sessionConfiguration.setConnector(connector);
			sessionSingleton=sessionConfiguration.openNet4jSession();
		}
	    return sessionSingleton;
	}
}
