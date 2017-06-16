package it.rcpvision.ecf2017.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import it.rcpvision.ecf2017.example.repository.api.IRepository;
import it.rcpvision.ecf2017.example.repository.api.IUserRepository;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;

public class ServiceActivator implements BundleActivator {

	private IUserRepository userService;
	private IVehicleRepository vehicleService;
	
	private static ServiceActivator singleton; 

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println(context.getServiceReference(IUserRepository.class));
		userService=retrieveServiceImplementation(context, IUserRepository.class);
		vehicleService=retrieveServiceImplementation(context, IVehicleRepository.class);
		singleton= this;
	}

	private <T> T retrieveServiceImplementation(BundleContext context, Class<T> clazz) {
		ServiceReference<T> serviceReference = context.getServiceReference(clazz);
		return context.getService(serviceReference);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public static ServiceActivator getSingleton() {
		return singleton;
	}

	public IUserRepository getUserService() {
		return userService;
	}
	
	public IVehicleRepository getVehicleRepository() {
		return vehicleService;
	}

}
