/**
 */
package it.rcpvision.ecf2017.example.model.carsharing.impl;

import it.rcpvision.ecf2017.example.model.carsharing.CarsharingPackage;
import it.rcpvision.ecf2017.example.model.carsharing.Reservation;
import it.rcpvision.ecf2017.example.model.carsharing.User;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.UserImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link it.rcpvision.ecf2017.example.model.carsharing.impl.UserImpl#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends CDOObjectImpl implements User {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarsharingPackage.Literals.USER;
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
		return (String)eGet(CarsharingPackage.Literals.USER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CarsharingPackage.Literals.USER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return (String)eGet(CarsharingPackage.Literals.USER__SURNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		eSet(CarsharingPackage.Literals.USER__SURNAME, newSurname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reservation> getReservation() {
		return (EList<Reservation>)eGet(CarsharingPackage.Literals.USER__RESERVATION, true);
	}

} //UserImpl
