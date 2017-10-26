package it.rcpvision.emf.architecture.example.repository.mybatis;


import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import it.rcpvision.emf.architecture.example.model.carsharing.CarType;
import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingFactory;
import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;
import it.rcpvision.emf.architecture.example.model.carsharing.ReservationState;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;
import it.rcpvision.emf.architecture.example.repository.api.IReservationRepository;
import it.rcpvision.emf.architecture.example.repository.api.IUserRepository;
import it.rcpvision.emf.architecture.example.repository.api.IVehicleRepository;
import it.rcpvision.emf.architecture.example.repository.api.RepositoryApiActivator;
import it.rcpvision.emf.architecture.example.repository.api.exception.RepositoryException;
import it.rcpvision.emf.architecture.example.repository.mybatis.mapper.ReservationMapper;
import it.rcpvision.emf.architecture.example.repository.mybatis.model.ReservationExample;

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
		it.rcpvision.emf.architecture.example.repository.mybatis.model.Reservation record= createDbReservationFromReservation(reservation);
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
		for (it.rcpvision.emf.architecture.example.repository.mybatis.model.Reservation dbReservation: reservationMapper.selectByExample(new ReservationExample())) {
			ret.add(createReservationFromDbReservation(dbReservation));
		}
		return ret;
	}
	
	private Reservation createReservationFromDbReservation(it.rcpvision.emf.architecture.example.repository.mybatis.model.Reservation dbRes) {
		Reservation reservation= CarsharingFactory.eINSTANCE.createReservation();
		reservation.setVehicle(vehicleRepository.getByKey(dbRes.getCar()));
		reservation.setUser(userRepository.getByKey(dbRes.getPeople()));
		return reservation;
	}

	private it.rcpvision.emf.architecture.example.repository.mybatis.model.Reservation createDbReservationFromReservation(Reservation reservation) {
		it.rcpvision.emf.architecture.example.repository.mybatis.model.Reservation dbReservation=new it.rcpvision.emf.architecture.example.repository.mybatis.model.Reservation();
		dbReservation.setPeople(Short.parseShort(reservation.getUser().getId()));
		dbReservation.setCar(Short.parseShort(reservation.getVehicle().getId()));
		dbReservation.setState(Short.parseShort(""+ReservationState.RESERVED_VALUE));
		return dbReservation;
	}


	@Override
	public Reservation getActiveByVehicle(Vehicle vehicle) {
		List<it.rcpvision.emf.architecture.example.repository.mybatis.model.Reservation> result = reservationMapper.selectByVehicle(Short.parseShort(vehicle.getId()));
		if(result.size()>0) {
			return createReservationFromDbReservation(result.get(0));
		}
		return null;
	}
}
