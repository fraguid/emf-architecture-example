/**
 */
package it.rcpvision.ecf2017.example.model.carsharing;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.User#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.User#getSurname <em>Surname</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.User#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getUser()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface User extends CDOObject {
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
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getUser_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link it.rcpvision.ecf2017.example.model.carsharing.User#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference list.
	 * The list contents are of type {@link it.rcpvision.ecf2017.example.model.carsharing.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference list.
	 * @see it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage#getUser_Reservation()
	 * @model
	 * @generated
	 */
	EList<Reservation> getReservation();

} // User
