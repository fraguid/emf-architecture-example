/**
 */
package it.rcpvision.ecf2017.example.model.carsharing;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getStart <em>Start</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getEnd <em>End</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getState <em>State</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getReservation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Reservation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getReservation_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getReservation_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link it.rcpvision.ecf2017.example.model.carsharing.ReservationState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.ReservationState
	 * @see #setState(ReservationState)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getReservation_State()
	 * @model
	 * @generated
	 */
	ReservationState getState();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.ReservationState
	 * @see #getState()
	 * @generated
	 */
	void setState(ReservationState value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getReservation_Vehicle()
	 * @model
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getReservation_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.Reservation#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // Reservation
