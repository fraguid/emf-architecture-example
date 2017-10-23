/**
 */
package it.rcpvision.emf.architecture.example.model.carsharing.impl;

import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage;
import it.rcpvision.emf.architecture.example.model.carsharing.Reservation;
import it.rcpvision.emf.architecture.example.model.carsharing.User;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.ReservationImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.ReservationImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends CDOObjectImpl implements Reservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarsharingPackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getVehicle() {
		return (Vehicle)eGet(CarsharingPackage.Literals.RESERVATION__VEHICLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		eSet(CarsharingPackage.Literals.RESERVATION__VEHICLE, newVehicle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		return (User)eGet(CarsharingPackage.Literals.RESERVATION__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		eSet(CarsharingPackage.Literals.RESERVATION__USER, newUser);
	}

} //ReservationImpl
