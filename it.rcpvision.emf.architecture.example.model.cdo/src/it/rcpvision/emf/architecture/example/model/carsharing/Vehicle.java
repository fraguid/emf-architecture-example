/**
 */
package it.rcpvision.emf.architecture.example.model.carsharing;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getId <em>Id</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getBrand <em>Brand</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getModel <em>Model</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getType <em>Type</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getPlate <em>Plate</em>}</li>
 *   <li>{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getReservationState <em>Reservation State</em>}</li>
 * </ul>
 *
 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage#getVehicle()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Vehicle extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage#getVehicle_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage#getVehicle_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage#getVehicle_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.rcpvision.emf.architecture.example.model.carsharing.CarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarType
	 * @see #setType(CarType)
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage#getVehicle_Type()
	 * @model
	 * @generated
	 */
	CarType getType();

	/**
	 * Sets the value of the '{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarType
	 * @see #getType()
	 * @generated
	 */
	void setType(CarType value);

	/**
	 * Returns the value of the '<em><b>Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plate</em>' attribute.
	 * @see #setPlate(String)
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage#getVehicle_Plate()
	 * @model
	 * @generated
	 */
	String getPlate();

	/**
	 * Sets the value of the '{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getPlate <em>Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plate</em>' attribute.
	 * @see #getPlate()
	 * @generated
	 */
	void setPlate(String value);

	/**
	 * Returns the value of the '<em><b>Reservation State</b></em>' attribute.
	 * The literals are from the enumeration {@link it.rcpvision.emf.architecture.example.model.carsharing.ReservationState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation State</em>' attribute.
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.ReservationState
	 * @see #setReservationState(ReservationState)
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.CarsharingPackage#getVehicle_ReservationState()
	 * @model
	 * @generated
	 */
	ReservationState getReservationState();

	/**
	 * Sets the value of the '{@link it.rcpvision.emf.architecture.example.model.carsharing.Vehicle#getReservationState <em>Reservation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation State</em>' attribute.
	 * @see it.rcpvision.emf.architecture.example.model.carsharing.ReservationState
	 * @see #getReservationState()
	 * @generated
	 */
	void setReservationState(ReservationState value);

} // Vehicle
