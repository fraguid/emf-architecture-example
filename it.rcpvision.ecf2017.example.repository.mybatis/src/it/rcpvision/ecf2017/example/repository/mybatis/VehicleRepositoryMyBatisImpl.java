package it.rcpvision.ecf2017.example.repository.mybatis;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.edit.NotificationBuffer;
import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarType;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.ReservationState;
import it.rcpvision.ecf2017.example.model.carsharing.User;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;
import it.rcpvision.ecf2017.example.repository.mybatis.mapper.CarMapper;
import it.rcpvision.ecf2017.example.repository.mybatis.mapper.ReservationMapper;
import it.rcpvision.ecf2017.example.repository.mybatis.model.Car;
import it.rcpvision.ecf2017.example.repository.mybatis.model.CarExample;
import it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation;

@Component
public class VehicleRepositoryMyBatisImpl implements IVehicleRepository{


	private CarMapper carMapper;
	private ReservationMapper reservationMapper;
	Map<Short, Vehicle> loadedObject= new HashMap<Short, Vehicle>();
	private Resource resource;
	
	public VehicleRepositoryMyBatisImpl() {
		carMapper= MybatisRepositoryActivator.getSingleton().getSqlSession().getMapper(CarMapper.class);
		reservationMapper=MybatisRepositoryActivator.getSingleton().getSqlSession().getMapper(ReservationMapper.class);
		resource=MybatisRepositoryActivator.getSingleton().createResource("Vehicle");
	}
	 

	@Override
	public void insert(Vehicle vehicle)  throws RepositoryException {
		Car record= createDbCarFromVehicle(vehicle);
		carMapper.insert(record);
	}

	@Override
	public void update(Vehicle vehicle) throws RepositoryException {
		Car record= createDbCarFromVehicle(vehicle);
		carMapper.updateByPrimaryKey(record);
	}

	@Override
	public void delete(Vehicle vehicle) throws RepositoryException {
		carMapper.deleteByPrimaryKey(vehicle.getId());
	}

	@Override
	public Vehicle getByKey(Object key) {
		Car dbCar = carMapper.selectByPrimaryKey((Short)key);
		return checkForResource(createVehicleFromDbCar(dbCar));
	}

	@Override
	public List queryAll() {
		List<Vehicle> ret= new ArrayList<Vehicle>();
		for (Car dbCar : carMapper.selectByExample(new CarExample())) {
			ret.add(checkForResource(createVehicleFromDbCar(dbCar)));
		}
		return ret;
	}
	
	
	private Vehicle createVehicleFromDbCar(Car dbCar) {
		boolean newObject=true;
		if(!loadedObject.containsKey(dbCar.getId())) {
			loadedObject.put(dbCar.getId(), CarsharingFactory.eINSTANCE.createVehicle());
		}else {
			newObject=false;
		}
		Vehicle vehicle= loadedObject.get(dbCar.getId());
		NotificationBuffer notificationBuffer=null;
		List<Notification> notifications=null;
		if(!newObject) {
			notificationBuffer= extractNotificationBuffer(vehicle);
			notifications = notificationBuffer.getNotifications();
			notificationBuffer.stopBuffering();
		}
		vehicle.setModel(dbCar.getModel());
		vehicle.setBrand(dbCar.getBrand());
		vehicle.setModel(dbCar.getModel());
		vehicle.setPlate(dbCar.getPlate());
		vehicle.setId(dbCar.getId());
		switch (dbCar.getType()) {
		case CarType.VAN_VALUE:
			vehicle.setType(CarType.VAN);
			break;
		default:
			vehicle.setType(CarType.CAR);
			break;
		}
		List<Reservation> reservationsByVehicle = reservationMapper.selectByVehicle(dbCar.getId());
		if(reservationsByVehicle.size()>0) {
			vehicle.setReservationState(ReservationState.RESERVED);
		}
		if(!newObject) {
			notificationBuffer.getNotifications().clear();
			notificationBuffer.getNotifications().addAll(notifications);
			notificationBuffer.startBuffering();
		}
		return vehicle;
	}

	private Vehicle checkForResource(Vehicle vehicle) {
		if(vehicle.eResource()==null) {
			resource.getContents().add(vehicle);
		}
		return vehicle;
	}

	private Car createDbCarFromVehicle(Vehicle vehicle) {
		Car car=new Car();
		car.setId(vehicle.getId());
		car.setBrand(vehicle.getBrand());
		car.setModel(vehicle.getModel());
		car.setPlate(vehicle.getPlate());
		car.setType((short)vehicle.getType().getValue());
		return car;
	}

	private NotificationBuffer extractNotificationBuffer(Vehicle vehicle) {
		EList<Adapter> eAdapters = vehicle.eAdapters();
		Optional<Adapter> optional = eAdapters.stream().filter(adapter -> adapter instanceof NotificationBuffer)
				.findFirst();
		if (optional.isPresent()){
			return (NotificationBuffer) optional.get();
		}
		return null;
	}
}
