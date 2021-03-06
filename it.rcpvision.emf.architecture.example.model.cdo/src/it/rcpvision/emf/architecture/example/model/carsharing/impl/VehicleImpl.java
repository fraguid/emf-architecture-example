/**
 */
package it.rcpvision.emf.architecture.example.model.carsharing.impl;

import it.rcpvision.emf.architecture.example.model.carsharing.CarType;
import it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage;
import it.rcpvision.emf.architecture.example.model.carsharing.ReservationState;
import it.rcpvision.emf.architecture.example.model.carsharing.Vehicle;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.VehicleImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.VehicleImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.VehicleImpl#getModel <em>Model</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.VehicleImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.VehicleImpl#getPlate <em>Plate</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.impl.VehicleImpl#getReservationState <em>Reservation State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends CDOObjectImpl implements Vehicle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarsharingPackage.Literals.VEHICLE;
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
	public String getId() {
		return (String)eGet(CarsharingPackage.Literals.VEHICLE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(CarsharingPackage.Literals.VEHICLE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrand() {
		return (String)eGet(CarsharingPackage.Literals.VEHICLE__BRAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(String newBrand) {
		eSet(CarsharingPackage.Literals.VEHICLE__BRAND, newBrand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return (String)eGet(CarsharingPackage.Literals.VEHICLE__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		eSet(CarsharingPackage.Literals.VEHICLE__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarType getType() {
		return (CarType)eGet(CarsharingPackage.Literals.VEHICLE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CarType newType) {
		eSet(CarsharingPackage.Literals.VEHICLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlate() {
		return (String)eGet(CarsharingPackage.Literals.VEHICLE__PLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlate(String newPlate) {
		eSet(CarsharingPackage.Literals.VEHICLE__PLATE, newPlate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationState getReservationState() {
		return (ReservationState)eGet(CarsharingPackage.Literals.VEHICLE__RESERVATION_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationState(ReservationState newReservationState) {
		eSet(CarsharingPackage.Literals.VEHICLE__RESERVATION_STATE, newReservationState);
	}

} //VehicleImpl
