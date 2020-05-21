/**
 */
package modeloagencia.modeloagencia.impl;

import java.util.Collection;

import modeloagencia.modeloagencia.Agencia;
import modeloagencia.modeloagencia.Alojamiento;
import modeloagencia.modeloagencia.Cliente;
import modeloagencia.modeloagencia.Desplazamiento;
import modeloagencia.modeloagencia.Excursion;
import modeloagencia.modeloagencia.Guia;
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
 * An implementation of the model object '<em><b>Agencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getTienda_tiene_clientes <em>Tienda tiene clientes</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getTienda_tiene_desplazamientos <em>Tienda tiene desplazamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getTienda_tiene_excursiones <em>Tienda tiene excursiones</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getTienda_tiene_guias <em>Tienda tiene guias</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getTienda_tiene_alojamientos <em>Tienda tiene alojamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getTienda_tiene_viajes <em>Tienda tiene viajes</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getId <em>Id</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AgenciaImpl#getUbicacion <em>Ubicacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenciaImpl extends MinimalEObjectImpl.Container implements Agencia {
	/**
	 * The cached value of the '{@link #getTienda_tiene_clientes() <em>Tienda tiene clientes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_clientes()
	 * @generated
	 * @ordered
	 */
	protected EList<Cliente> tienda_tiene_clientes;

	/**
	 * The cached value of the '{@link #getTienda_tiene_desplazamientos() <em>Tienda tiene desplazamientos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_desplazamientos()
	 * @generated
	 * @ordered
	 */
	protected EList<Desplazamiento> tienda_tiene_desplazamientos;

	/**
	 * The cached value of the '{@link #getTienda_tiene_excursiones() <em>Tienda tiene excursiones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_excursiones()
	 * @generated
	 * @ordered
	 */
	protected EList<Excursion> tienda_tiene_excursiones;

	/**
	 * The cached value of the '{@link #getTienda_tiene_guias() <em>Tienda tiene guias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_guias()
	 * @generated
	 * @ordered
	 */
	protected EList<Guia> tienda_tiene_guias;

	/**
	 * The cached value of the '{@link #getTienda_tiene_alojamientos() <em>Tienda tiene alojamientos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_alojamientos()
	 * @generated
	 * @ordered
	 */
	protected EList<Alojamiento> tienda_tiene_alojamientos;

	/**
	 * The cached value of the '{@link #getTienda_tiene_viajes() <em>Tienda tiene viajes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_viajes()
	 * @generated
	 * @ordered
	 */
	protected EList<Viaje> tienda_tiene_viajes;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUbicacion() <em>Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbicacion()
	 * @generated
	 * @ordered
	 */
	protected static final String UBICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUbicacion() <em>Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbicacion()
	 * @generated
	 * @ordered
	 */
	protected String ubicacion = UBICACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloagenciaPackage.Literals.AGENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cliente> getTienda_tiene_clientes() {
		if (tienda_tiene_clientes == null) {
			tienda_tiene_clientes = new EObjectContainmentEList<Cliente>(Cliente.class, this, ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_CLIENTES);
		}
		return tienda_tiene_clientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Desplazamiento> getTienda_tiene_desplazamientos() {
		if (tienda_tiene_desplazamientos == null) {
			tienda_tiene_desplazamientos = new EObjectContainmentEList<Desplazamiento>(Desplazamiento.class, this, ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS);
		}
		return tienda_tiene_desplazamientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Excursion> getTienda_tiene_excursiones() {
		if (tienda_tiene_excursiones == null) {
			tienda_tiene_excursiones = new EObjectContainmentEList<Excursion>(Excursion.class, this, ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_EXCURSIONES);
		}
		return tienda_tiene_excursiones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Guia> getTienda_tiene_guias() {
		if (tienda_tiene_guias == null) {
			tienda_tiene_guias = new EObjectContainmentEList<Guia>(Guia.class, this, ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_GUIAS);
		}
		return tienda_tiene_guias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alojamiento> getTienda_tiene_alojamientos() {
		if (tienda_tiene_alojamientos == null) {
			tienda_tiene_alojamientos = new EObjectContainmentEList<Alojamiento>(Alojamiento.class, this, ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS);
		}
		return tienda_tiene_alojamientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Viaje> getTienda_tiene_viajes() {
		if (tienda_tiene_viajes == null) {
			tienda_tiene_viajes = new EObjectContainmentEList<Viaje>(Viaje.class, this, ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_VIAJES);
		}
		return tienda_tiene_viajes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.AGENCIA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.AGENCIA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUbicacion(String newUbicacion) {
		String oldUbicacion = ubicacion;
		ubicacion = newUbicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.AGENCIA__UBICACION, oldUbicacion, ubicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_CLIENTES:
				return ((InternalEList<?>)getTienda_tiene_clientes()).basicRemove(otherEnd, msgs);
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS:
				return ((InternalEList<?>)getTienda_tiene_desplazamientos()).basicRemove(otherEnd, msgs);
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_EXCURSIONES:
				return ((InternalEList<?>)getTienda_tiene_excursiones()).basicRemove(otherEnd, msgs);
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_GUIAS:
				return ((InternalEList<?>)getTienda_tiene_guias()).basicRemove(otherEnd, msgs);
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS:
				return ((InternalEList<?>)getTienda_tiene_alojamientos()).basicRemove(otherEnd, msgs);
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_VIAJES:
				return ((InternalEList<?>)getTienda_tiene_viajes()).basicRemove(otherEnd, msgs);
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
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_CLIENTES:
				return getTienda_tiene_clientes();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS:
				return getTienda_tiene_desplazamientos();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_EXCURSIONES:
				return getTienda_tiene_excursiones();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_GUIAS:
				return getTienda_tiene_guias();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS:
				return getTienda_tiene_alojamientos();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_VIAJES:
				return getTienda_tiene_viajes();
			case ModeloagenciaPackage.AGENCIA__NOMBRE:
				return getNombre();
			case ModeloagenciaPackage.AGENCIA__ID:
				return getId();
			case ModeloagenciaPackage.AGENCIA__UBICACION:
				return getUbicacion();
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
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_CLIENTES:
				getTienda_tiene_clientes().clear();
				getTienda_tiene_clientes().addAll((Collection<? extends Cliente>)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS:
				getTienda_tiene_desplazamientos().clear();
				getTienda_tiene_desplazamientos().addAll((Collection<? extends Desplazamiento>)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_EXCURSIONES:
				getTienda_tiene_excursiones().clear();
				getTienda_tiene_excursiones().addAll((Collection<? extends Excursion>)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_GUIAS:
				getTienda_tiene_guias().clear();
				getTienda_tiene_guias().addAll((Collection<? extends Guia>)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS:
				getTienda_tiene_alojamientos().clear();
				getTienda_tiene_alojamientos().addAll((Collection<? extends Alojamiento>)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_VIAJES:
				getTienda_tiene_viajes().clear();
				getTienda_tiene_viajes().addAll((Collection<? extends Viaje>)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__ID:
				setId((Integer)newValue);
				return;
			case ModeloagenciaPackage.AGENCIA__UBICACION:
				setUbicacion((String)newValue);
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
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_CLIENTES:
				getTienda_tiene_clientes().clear();
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS:
				getTienda_tiene_desplazamientos().clear();
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_EXCURSIONES:
				getTienda_tiene_excursiones().clear();
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_GUIAS:
				getTienda_tiene_guias().clear();
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS:
				getTienda_tiene_alojamientos().clear();
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_VIAJES:
				getTienda_tiene_viajes().clear();
				return;
			case ModeloagenciaPackage.AGENCIA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModeloagenciaPackage.AGENCIA__ID:
				setId(ID_EDEFAULT);
				return;
			case ModeloagenciaPackage.AGENCIA__UBICACION:
				setUbicacion(UBICACION_EDEFAULT);
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
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_CLIENTES:
				return tienda_tiene_clientes != null && !tienda_tiene_clientes.isEmpty();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS:
				return tienda_tiene_desplazamientos != null && !tienda_tiene_desplazamientos.isEmpty();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_EXCURSIONES:
				return tienda_tiene_excursiones != null && !tienda_tiene_excursiones.isEmpty();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_GUIAS:
				return tienda_tiene_guias != null && !tienda_tiene_guias.isEmpty();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS:
				return tienda_tiene_alojamientos != null && !tienda_tiene_alojamientos.isEmpty();
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_VIAJES:
				return tienda_tiene_viajes != null && !tienda_tiene_viajes.isEmpty();
			case ModeloagenciaPackage.AGENCIA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModeloagenciaPackage.AGENCIA__ID:
				return id != ID_EDEFAULT;
			case ModeloagenciaPackage.AGENCIA__UBICACION:
				return UBICACION_EDEFAULT == null ? ubicacion != null : !UBICACION_EDEFAULT.equals(ubicacion);
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
		result.append(", Id: ");
		result.append(id);
		result.append(", Ubicacion: ");
		result.append(ubicacion);
		result.append(')');
		return result.toString();
	}

} //AgenciaImpl
