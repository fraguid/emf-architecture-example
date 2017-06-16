/**
 */
package it.rcpvision.ecf2017.example.model.carsharing;

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
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getType <em>Type</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getPlate <em>Plate</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getSeats <em>Seats</em>}</li>
 * </ul>
 *
 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getVehicle()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Vehicle extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getVehicle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.rcpvision.ecf2017.example.model.carsharing.CarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarType
	 * @see #setType(CarType)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getVehicle_Type()
	 * @model
	 * @generated
	 */
	CarType getType();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarType
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
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getVehicle_Plate()
	 * @model
	 * @generated
	 */
	String getPlate();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getPlate <em>Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plate</em>' attribute.
	 * @see #getPlate()
	 * @generated
	 */
	void setPlate(String value);

	/**
	 * Returns the value of the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats</em>' attribute.
	 * @see #setSeats(int)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getVehicle_Seats()
	 * @model
	 * @generated
	 */
	int getSeats();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Vehicle#getSeats <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats</em>' attribute.
	 * @see #getSeats()
	 * @generated
	 */
	void setSeats(int value);

} // Vehicle
