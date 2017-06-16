package it.rcpvision.ecf2017.example.repository.cdo;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.mem.MEMStoreUtil;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.acceptor.IAcceptor;
import org.eclipse.net4j.jvm.JVMUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.PrintLogHandler;


public class CDOMemServer {
	static final Integer SERVER_PORT = 2036;
    static final String SERVER_TRANSPORT_TYPE = "tcp";

    private IAcceptor serverAcceptor;
    private IManagedContainer container;
    private EPackage[] packages;
    private String repo;

    public CDOMemServer(String repo, EPackage... packages) {
        super();
        this.packages = packages;
        this.repo = repo;
    }

    public void start() {
        start(SERVER_PORT);
    }

    public void start(int port) {
        initContainer();
        createServer(packages);
        serverAcceptor = (IAcceptor) container.getElement("org.eclipse.net4j.acceptors", SERVER_TRANSPORT_TYPE, "0.0.0.0:" + port);
    }

    private void initContainer() {
//        container = ContainerUtil.createContainer();

    	OMPlatform.INSTANCE.setDebugging(true); 
    	OMPlatform.INSTANCE	.addLogHandler(org.eclipse.net4j.util.om.log.PrintLogHandler.CONSOLE); 
    	OMPlatform.INSTANCE	.addTraceHandler(org.eclipse.net4j.util.om.trace.PrintTraceHandler.CONSOLE); 

    	container = ContainerUtil.createContainer(); 
    	
        Net4jUtil.prepareContainer(container);
        TCPUtil.prepareContainer(container);
        JVMUtil.prepareContainer(container);
        CDONet4jUtil.prepareContainer(container);
        CDONet4jServerUtil.prepareContainer(container);
        OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
        OMPlatform.INSTANCE.setDebugging(true);

        container.activate();
    }

    private IRepository createServer(EPackage... initialPackages) {

        IStore store = MEMStoreUtil.createMEMStore();

        Map<String, String> props = new HashMap<String, String>();
        props.put(IRepository.Props.OVERRIDE_UUID, repo);
        props.put(IRepository.Props.SUPPORTING_AUDITS, "true");
        props.put(IRepository.Props.SUPPORTING_BRANCHES, "true");
        // props.put(IRepository.Props.ID_GENERATION_LOCATION, "CLIENT");

        final IRepository repository = CDOServerUtil.createRepository(repo, store, props);
        for (EPackage ePackage : initialPackages) {
            repository.setInitialPackages(ePackage);
        }

        CDOServerUtil.addRepository(container, repository);

        return repository;
    }

    public void stop() {
        LifecycleUtil.deactivate(serverAcceptor);
    }

}
