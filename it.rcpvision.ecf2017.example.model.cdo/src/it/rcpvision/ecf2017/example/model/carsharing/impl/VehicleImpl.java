/**
 */
package it.rcpvision.ecf2017.example.model.carsharing.impl;

import it.rcpvision.ecf2017.example.model.carsharing.CarType;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;

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
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getPlate <em>Plate</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getSeats <em>Seats</em>}</li>
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
	public String getName() {
		return (String)eGet(CarsharingPackage.Literals.VEHICLE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CarsharingPackage.Literals.VEHICLE__NAME, newName);
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
	public int getSeats() {
		return (Integer)eGet(CarsharingPackage.Literals.VEHICLE__SEATS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeats(int newSeats) {
		eSet(CarsharingPackage.Literals.VEHICLE__SEATS, newSeats);
	}

} //VehicleImpl
