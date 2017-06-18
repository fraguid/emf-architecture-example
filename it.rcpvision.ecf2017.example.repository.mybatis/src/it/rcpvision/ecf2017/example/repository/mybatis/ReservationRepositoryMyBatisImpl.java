package it.rcpvision.ecf2017.example.repository.mybatis;


import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import it.rcpvision.ecf2017.example.model.carsharing.CarType;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory;
import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;
import it.rcpvision.ecf2017.example.repository.api.IReservationRepository;
import it.rcpvision.ecf2017.example.repository.api.IUserRepository;
import it.rcpvision.ecf2017.example.repository.api.IVehicleRepository;
import it.rcpvision.ecf2017.example.repository.api.RepositoryApiActivator;
import it.rcpvision.ecf2017.example.repository.api.exception.RepositoryException;
import it.rcpvision.ecf2017.example.repository.mybatis.mapper.ReservationMapper;
import it.rcpvision.ecf2017.example.repository.mybatis.model.ReservationExample;

@Component
public class ReservationRepositoryMyBatisImpl implements IReservationRepository{


	private ReservationMapper reservationMapper;
	IVehicleRepository vehicleRepository= RepositoryApiActivator.getSingleton().getVehicleRepository();
	IUserRepository userRepository= RepositoryApiActivator.getSingleton().getUserService();

	public ReservationRepositoryMyBatisImpl() {
		reservationMapper= MybatisRepositoryActivator.getSingleton().getSqlSession().getMapper(ReservationMapper.class);
	}
	 

	@Override
	public void insert(Reservation reservation)  throws RepositoryException {
		it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation record= createDbReservationFromReservation(reservation);
		reservationMapper.insert(record);
	}

	@Override
	public void update(Reservation reservation) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void delete(Reservation reservation) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Reservation getByKey(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List queryAll() {
		List<Reservation> ret= new ArrayList<Reservation>();
		for (it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation dbReservation: reservationMapper.selectByExample(new ReservationExample())) {
			ret.add(createReservationFromDbReservation(dbReservation));
		}
		return ret;
	}
	
	private Reservation createReservationFromDbReservation(it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation dbRes) {
		Reservation reservation= CarsharingFactory.eINSTANCE.createReservation();
		reservation.setVehicle(vehicleRepository.getByKey(dbRes.getCar()));
		reservation.setUser(userRepository.getByKey(dbRes.getPeople()));
		return reservation;
	}

	private it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation createDbReservationFromReservation(Reservation reservation) {
		it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation dbReservation=new it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation();
		dbReservation.setPeople(reservation.getVehicle().getId());
		dbReservation.setCar(reservation.getVehicle().getId());
		return dbReservation;
	}


	@Override
	public Reservation getActiveByVehicle(Vehicle vehicle) {
		List<it.rcpvision.ecf2017.example.repository.mybatis.model.Reservation> result = reservationMapper.selectByVehicle(vehicle.getId());
		if(result.size()>0) {
			return createReservationFromDbReservation(result.get(0));
		}
		return null;
	}
}
