package it.rcpvision.ecf2017.example.repository.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import it.rcpvision.ecf2017.example.repository.api.IRepository;
import it.rcpvision.ecf2017.example.repository.api.IUserRepository;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;

public class RepositoryApiActivator implements BundleActivator {

	private IUserRepository userRepository;
	private IVehicleRepository vehicleRepository;
	private IReservationRepository reservationRepository;
	
	private static RepositoryApiActivator singleton; 

	@Override
	public void start(BundleContext context) throws Exception {
		singleton= this;
		try {
			userRepository=retrieveServiceImplementation(context, IUserRepository.class);
			reservationRepository=retrieveServiceImplementation(context, IReservationRepository.class);
			vehicleRepository=retrieveServiceImplementation(context, IVehicleRepository.class);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private <T> T retrieveServiceImplementation(BundleContext context, Class<T> clazz) {
		ServiceReference<T> serviceReference = context.getServiceReference(clazz);
		return context.getService(serviceReference);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public static RepositoryApiActivator getSingleton() {
		return singleton;
	}

	public IUserRepository getUserService() {
		return userRepository;
	}
	
	public IVehicleRepository getVehicleRepository() {
		return vehicleRepository;
	}

	public IReservationRepository getReservationRepository() {
		return reservationRepository;
	}

}
