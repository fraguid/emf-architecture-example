package it.rcpvision.ecf2017.example.repository.mybatis;


import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarType;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;
import it.rcpvision.ecf2017.example.repository.mybatis.mapper.CarMapper;
import it.rcpvision.ecf2017.example.repository.mybatis.mapper.PeopleMapper;
import it.rcpvision.ecf2017.example.repository.mybatis.model.Car;
import it.rcpvision.ecf2017.example.repository.mybatis.model.CarExample;
import it.rcpvision.ecf2017.example.repository.mybatis.model.People;
import it.rcpvision.ecf2017.example.repository.mybatis.model.PeopleExample;

@Component
public class VehicleRepositoryMyBatisImpl implements IVehicleRepository{


	private CarMapper carMapper;

	public VehicleRepositoryMyBatisImpl() {
		carMapper= MybatisRepositoryActivator.getSingleton().getSqlSession().getMapper(CarMapper.class);
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
		return createVehicleFromDbCar(dbCar);
	}

	@Override
	public List queryAll() {
		List<Vehicle> ret= new ArrayList<Vehicle>();
		for (Car dbCar : carMapper.selectByExample(new CarExample())) {
			ret.add(createVehicleFromDbCar(dbCar));
		}
		return ret;
	}
	
	private Vehicle createVehicleFromDbCar(Car dbCar) {
		Vehicle vehicle= CarsharingFactory.eINSTANCE.createVehicle();
		vehicle.setModel(dbCar.getModel());
		vehicle.setBrand(dbCar.getBrand());
		vehicle.setModel(dbCar.getModel());
		vehicle.setSeats(dbCar.getSeats());
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
		return vehicle;
	}

	private Car createDbCarFromVehicle(Vehicle vehicle) {
		Car car=new Car();
		car.setId(vehicle.getId());
		car.setBrand(vehicle.getBrand());
		car.setModel(vehicle.getModel());
		car.setPlate(vehicle.getPlate());
		car.setSeats((short)vehicle.getSeats());
		car.setType((short)vehicle.getType().getValue());
		return car;
	}
}
