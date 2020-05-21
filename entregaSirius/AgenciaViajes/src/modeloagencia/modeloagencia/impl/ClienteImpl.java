/**
 */
package modeloagencia.modeloagencia.impl;

import java.util.Collection;

import modeloagencia.modeloagencia.Cliente;
import modeloagencia.modeloagencia.ModeloagenciaPackage;
import modeloagencia.modeloagencia.Viaje;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.impl.ClienteImpl#getCliente_tiene_viajes <em>Cliente tiene viajes</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ClienteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ClienteImpl#getDni <em>Dni</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ClienteImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ClienteImpl#getTelefono <em>Telefono</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteImpl extends MinimalEObjectImpl.Container implements Cliente {
	/**
	 * The cached value of the '{@link #getCliente_tiene_viajes() <em>Cliente tiene viajes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente_tiene_viajes()
	 * @generated
	 * @ordered
	 */
	protected EList<Viaje> cliente_tiene_viajes;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDni() <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDni()
	 * @generated
	 * @ordered
	 */
	protected static final String DNI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDni() <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDni()
	 * @generated
	 * @ordered
	 */
	protected String dni = DNI_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected static final int EDAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected int edad = EDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final int TELEFONO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected int telefono = TELEFONO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloagenciaPackage.Literals.CLIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Viaje> getCliente_tiene_viajes() {
		if (cliente_tiene_viajes == null) {
			cliente_tiene_viajes = new EObjectContainmentEList<Viaje>(Viaje.class, this, ModeloagenciaPackage.CLIENTE__CLIENTE_TIENE_VIAJES);
		}
		return cliente_tiene_viajes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.CLIENTE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDni() {
		return dni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDni(String newDni) {
		String oldDni = dni;
		dni = newDni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.CLIENTE__DNI, oldDni, dni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEdad() {
		return edad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdad(int newEdad) {
		int oldEdad = edad;
		edad = newEdad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.CLIENTE__EDAD, oldEdad, edad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefono(int newTelefono) {
		int oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.CLIENTE__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloagenciaPackage.CLIENTE__CLIENTE_TIENE_VIAJES:
				return ((InternalEList<?>)getCliente_tiene_viajes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloagenciaPackage.CLIENTE__CLIENTE_TIENE_VIAJES:
				return getCliente_tiene_viajes();
			case ModeloagenciaPackage.CLIENTE__NOMBRE:
				return getNombre();
			case ModeloagenciaPackage.CLIENTE__DNI:
				return getDni();
			case ModeloagenciaPackage.CLIENTE__EDAD:
				return getEdad();
			case ModeloagenciaPackage.CLIENTE__TELEFONO:
				return getTelefono();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModeloagenciaPackage.CLIENTE__CLIENTE_TIENE_VIAJES:
				getCliente_tiene_viajes().clear();
				getCliente_tiene_viajes().addAll((Collection<? extends Viaje>)newValue);
				return;
			case ModeloagenciaPackage.CLIENTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModeloagenciaPackage.CLIENTE__DNI:
				setDni((String)newValue);
				return;
			case ModeloagenciaPackage.CLIENTE__EDAD:
				setEdad((Integer)newValue);
				return;
			case ModeloagenciaPackage.CLIENTE__TELEFONO:
				setTelefono((Integer)newValue);
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
			case ModeloagenciaPackage.CLIENTE__CLIENTE_TIENE_VIAJES:
				getCliente_tiene_viajes().clear();
				return;
			case ModeloagenciaPackage.CLIENTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModeloagenciaPackage.CLIENTE__DNI:
				setDni(DNI_EDEFAULT);
				return;
			case ModeloagenciaPackage.CLIENTE__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case ModeloagenciaPackage.CLIENTE__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
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
			case ModeloagenciaPackage.CLIENTE__CLIENTE_TIENE_VIAJES:
				return cliente_tiene_viajes != null && !cliente_tiene_viajes.isEmpty();
			case ModeloagenciaPackage.CLIENTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModeloagenciaPackage.CLIENTE__DNI:
				return DNI_EDEFAULT == null ? dni != null : !DNI_EDEFAULT.equals(dni);
			case ModeloagenciaPackage.CLIENTE__EDAD:
				return edad != EDAD_EDEFAULT;
			case ModeloagenciaPackage.CLIENTE__TELEFONO:
				return telefono != TELEFONO_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(", Dni: ");
		result.append(dni);
		result.append(", Edad: ");
		result.append(edad);
		result.append(", Telefono: ");
		result.append(telefono);
		result.append(')');
		return result.toString();
	}

} //ClienteImpl
