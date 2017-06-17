/**
 */
package it.rcpvision.ecf2017.example.model.carsharing.impl;

import it.rcpvision.ecf2017.example.model.carsharing.CarType;
import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;
import it.rcpvision.ecf2017.example.model.carsharing.Vehicle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getModel <em>Model</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getPlate <em>Plate</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl#getSeats <em>Seats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final short ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected short id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected String brand = BRAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CarType TYPE_EDEFAULT = CarType.CAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CarType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlate() <em>Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlate()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlate() <em>Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlate()
	 * @generated
	 * @ordered
	 */
	protected String plate = PLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeats() <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeats() <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected int seats = SEATS_EDEFAULT;

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
	public short getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(short newId) {
		short oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarsharingPackage.VEHICLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(String newBrand) {
		String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarsharingPackage.VEHICLE__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarsharingPackage.VEHICLE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CarType newType) {
		CarType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarsharingPackage.VEHICLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlate(String newPlate) {
		String oldPlate = plate;
		plate = newPlate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarsharingPackage.VEHICLE__PLATE, oldPlate, plate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeats(int newSeats) {
		int oldSeats = seats;
		seats = newSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarsharingPackage.VEHICLE__SEATS, oldSeats, seats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CarsharingPackage.VEHICLE__ID:
				return getId();
			case CarsharingPackage.VEHICLE__BRAND:
				return getBrand();
			case CarsharingPackage.VEHICLE__MODEL:
				return getModel();
			case CarsharingPackage.VEHICLE__TYPE:
				return getType();
			case CarsharingPackage.VEHICLE__PLATE:
				return getPlate();
			case CarsharingPackage.VEHICLE__SEATS:
				return getSeats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CarsharingPackage.VEHICLE__ID:
				setId((Short)newValue);
				return;
			case CarsharingPackage.VEHICLE__BRAND:
				setBrand((String)newValue);
				return;
			case CarsharingPackage.VEHICLE__MODEL:
				setModel((String)newValue);
				return;
			case CarsharingPackage.VEHICLE__TYPE:
				setType((CarType)newValue);
				return;
			case CarsharingPackage.VEHICLE__PLATE:
				setPlate((String)newValue);
				return;
			case CarsharingPackage.VEHICLE__SEATS:
				setSeats((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CarsharingPackage.VEHICLE__ID:
				setId(ID_EDEFAULT);
				return;
			case CarsharingPackage.VEHICLE__BRAND:
				setBrand(BRAND_EDEFAULT);
				return;
			case CarsharingPackage.VEHICLE__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case CarsharingPackage.VEHICLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CarsharingPackage.VEHICLE__PLATE:
				setPlate(PLATE_EDEFAULT);
				return;
			case CarsharingPackage.VEHICLE__SEATS:
				setSeats(SEATS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CarsharingPackage.VEHICLE__ID:
				return id != ID_EDEFAULT;
			case CarsharingPackage.VEHICLE__BRAND:
				return BRAND_EDEFAULT == null ? brand != null : !BRAND_EDEFAULT.equals(brand);
			case CarsharingPackage.VEHICLE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case CarsharingPackage.VEHICLE__TYPE:
				return type != TYPE_EDEFAULT;
			case CarsharingPackage.VEHICLE__PLATE:
				return PLATE_EDEFAULT == null ? plate != null : !PLATE_EDEFAULT.equals(plate);
			case CarsharingPackage.VEHICLE__SEATS:
				return seats != SEATS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", brand: ");
		result.append(brand);
		result.append(", model: ");
		result.append(model);
		result.append(", type: ");
		result.append(type);
		result.append(", plate: ");
		result.append(plate);
		result.append(", seats: ");
		result.append(seats);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
