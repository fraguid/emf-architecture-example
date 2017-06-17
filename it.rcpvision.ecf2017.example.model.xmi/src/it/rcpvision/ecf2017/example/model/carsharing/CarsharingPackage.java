/**
 */
package it.rcpvision.ecf2017.example.model.carsharing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingFactory
 * @model kind="package"
 * @generated
 */
public interface CarsharingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "carsharing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ecf2017/carsharing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "carsharing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CarsharingPackage eINSTANCE = it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.rcpvision.ecf2017.example.model.carsharing.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.UserImpl
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SURNAME = 2;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__RESERVATION = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__BRAND = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__MODEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__PLATE = 4;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__SEATS = 5;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.rcpvision.ecf2017.example.model.carsharing.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.ReservationImpl
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__END = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__STATE = 2;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__VEHICLE = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__USER = 4;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.rcpvision.ecf2017.example.model.carsharing.CarType <em>Car Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarType
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getCarType()
	 * @generated
	 */
	int CAR_TYPE = 3;

	/**
	 * The meta object id for the '{@link it.rcpvision.ecf2017.example.model.carsharing.ReservationState <em>Reservation State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.rcpvision.ecf2017.example.model.carsharing.ReservationState
	 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getReservationState()
	 * @generated
	 */
	int RESERVATION_STATE = 4;


	/**
	 * Returns the meta object for class '{@link it.rcpvision.ecf2017.example.model.carsharing.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the reference list '{@link it.rcpvision.ecf2017.example.model.carsharing.User#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.User#getReservation()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Reservation();

	/**
	 * Returns the meta object for class '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getId()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getBrand()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Brand();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getModel()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Model();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getType()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getPlate <em>Plate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plate</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getPlate()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Plate();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getSeats()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Seats();

	/**
	 * Returns the meta object for class '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Reservation#getStart()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Start();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Reservation#getEnd()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_End();

	/**
	 * Returns the meta object for the attribute '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Reservation#getState()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_State();

	/**
	 * Returns the meta object for the reference '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Reservation#getVehicle()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Vehicle();

	/**
	 * Returns the meta object for the reference '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.Reservation#getUser()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_User();

	/**
	 * Returns the meta object for enum '{@link it.rcpvision.ecf2017.example.model.carsharing.CarType <em>Car Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Car Type</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarType
	 * @generated
	 */
	EEnum getCarType();

	/**
	 * Returns the meta object for enum '{@link it.rcpvision.ecf2017.example.model.carsharing.ReservationState <em>Reservation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation State</em>'.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.ReservationState
	 * @generated
	 */
	EEnum getReservationState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CarsharingFactory getCarsharingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.rcpvision.ecf2017.example.model.carsharing.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.UserImpl
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SURNAME = eINSTANCE.getUser_Surname();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__RESERVATION = eINSTANCE.getUser_Reservation();

		/**
		 * The meta object literal for the '{@link it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.VehicleImpl
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__ID = eINSTANCE.getVehicle_Id();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__BRAND = eINSTANCE.getVehicle_Brand();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__MODEL = eINSTANCE.getVehicle_Model();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__TYPE = eINSTANCE.getVehicle_Type();

		/**
		 * The meta object literal for the '<em><b>Plate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__PLATE = eINSTANCE.getVehicle_Plate();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__SEATS = eINSTANCE.getVehicle_Seats();

		/**
		 * The meta object literal for the '{@link it.rcpvision.ecf2017.example.model.carsharing.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.ReservationImpl
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__START = eINSTANCE.getReservation_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__END = eINSTANCE.getReservation_End();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__STATE = eINSTANCE.getReservation_State();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__VEHICLE = eINSTANCE.getReservation_Vehicle();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__USER = eINSTANCE.getReservation_User();

		/**
		 * The meta object literal for the '{@link it.rcpvision.ecf2017.example.model.carsharing.CarType <em>Car Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.rcpvision.ecf2017.example.model.carsharing.CarType
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getCarType()
		 * @generated
		 */
		EEnum CAR_TYPE = eINSTANCE.getCarType();

		/**
		 * The meta object literal for the '{@link it.rcpvision.ecf2017.example.model.carsharing.ReservationState <em>Reservation State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.rcpvision.ecf2017.example.model.carsharing.ReservationState
		 * @see it.rcpvision.ecf2017.example.model.carsharing.impl.CarsharingPackageImpl#getReservationState()
		 * @generated
		 */
		EEnum RESERVATION_STATE = eINSTANCE.getReservationState();

	}

} //CarsharingPackage
