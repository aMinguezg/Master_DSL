/**
 */
package modeloagencia.modeloagencia.impl;

import modeloagencia.modeloagencia.Alojamiento;
import modeloagencia.modeloagencia.ModeloagenciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alojamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.impl.AlojamientoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AlojamientoImpl#getUbicacion <em>Ubicacion</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AlojamientoImpl#getTiempo <em>Tiempo</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.AlojamientoImpl#getPrecio <em>Precio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlojamientoImpl extends MinimalEObjectImpl.Container implements Alojamiento {
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
	 * The default value of the '{@link #getTiempo() <em>Tiempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiempo()
	 * @generated
	 * @ordered
	 */
	protected static final int TIEMPO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTiempo() <em>Tiempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiempo()
	 * @generated
	 * @ordered
	 */
	protected int tiempo = TIEMPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected double precio = PRECIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlojamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloagenciaPackage.Literals.ALOJAMIENTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.ALOJAMIENTO__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.ALOJAMIENTO__UBICACION, oldUbicacion, ubicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTiempo() {
		return tiempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTiempo(int newTiempo) {
		int oldTiempo = tiempo;
		tiempo = newTiempo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.ALOJAMIENTO__TIEMPO, oldTiempo, tiempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecio(double newPrecio) {
		double oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.ALOJAMIENTO__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloagenciaPackage.ALOJAMIENTO__NOMBRE:
				return getNombre();
			case ModeloagenciaPackage.ALOJAMIENTO__UBICACION:
				return getUbicacion();
			case ModeloagenciaPackage.ALOJAMIENTO__TIEMPO:
				return getTiempo();
			case ModeloagenciaPackage.ALOJAMIENTO__PRECIO:
				return getPrecio();
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
			case ModeloagenciaPackage.ALOJAMIENTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModeloagenciaPackage.ALOJAMIENTO__UBICACION:
				setUbicacion((String)newValue);
				return;
			case ModeloagenciaPackage.ALOJAMIENTO__TIEMPO:
				setTiempo((Integer)newValue);
				return;
			case ModeloagenciaPackage.ALOJAMIENTO__PRECIO:
				setPrecio((Double)newValue);
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
			case ModeloagenciaPackage.ALOJAMIENTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModeloagenciaPackage.ALOJAMIENTO__UBICACION:
				setUbicacion(UBICACION_EDEFAULT);
				return;
			case ModeloagenciaPackage.ALOJAMIENTO__TIEMPO:
				setTiempo(TIEMPO_EDEFAULT);
				return;
			case ModeloagenciaPackage.ALOJAMIENTO__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
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
			case ModeloagenciaPackage.ALOJAMIENTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModeloagenciaPackage.ALOJAMIENTO__UBICACION:
				return UBICACION_EDEFAULT == null ? ubicacion != null : !UBICACION_EDEFAULT.equals(ubicacion);
			case ModeloagenciaPackage.ALOJAMIENTO__TIEMPO:
				return tiempo != TIEMPO_EDEFAULT;
			case ModeloagenciaPackage.ALOJAMIENTO__PRECIO:
				return precio != PRECIO_EDEFAULT;
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
		result.append(", Ubicacion: ");
		result.append(ubicacion);
		result.append(", Tiempo: ");
		result.append(tiempo);
		result.append(", Precio: ");
		result.append(precio);
		result.append(')');
		return result.toString();
	}

} //AlojamientoImpl
