/**
 */
package modeloagencia.modeloagencia.impl;

import java.util.Collection;

import modeloagencia.modeloagencia.Alojamiento;
import modeloagencia.modeloagencia.Desplazamiento;
import modeloagencia.modeloagencia.Excursion;
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
 * An implementation of the model object '<em><b>Viaje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.impl.ViajeImpl#getViaje_tiene_alojamientos <em>Viaje tiene alojamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ViajeImpl#getViaje_tiene_desplazamientos <em>Viaje tiene desplazamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ViajeImpl#getViaje_tiene_excursiones <em>Viaje tiene excursiones</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ViajeImpl#getFactura <em>Factura</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ViajeImpl#getPrecio <em>Precio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViajeImpl extends MinimalEObjectImpl.Container implements Viaje {
	/**
	 * The cached value of the '{@link #getViaje_tiene_alojamientos() <em>Viaje tiene alojamientos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaje_tiene_alojamientos()
	 * @generated
	 * @ordered
	 */
	protected EList<Alojamiento> viaje_tiene_alojamientos;

	/**
	 * The cached value of the '{@link #getViaje_tiene_desplazamientos() <em>Viaje tiene desplazamientos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaje_tiene_desplazamientos()
	 * @generated
	 * @ordered
	 */
	protected EList<Desplazamiento> viaje_tiene_desplazamientos;

	/**
	 * The cached value of the '{@link #getViaje_tiene_excursiones() <em>Viaje tiene excursiones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaje_tiene_excursiones()
	 * @generated
	 * @ordered
	 */
	protected EList<Excursion> viaje_tiene_excursiones;

	/**
	 * The default value of the '{@link #getFactura() <em>Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactura()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTURA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactura() <em>Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactura()
	 * @generated
	 * @ordered
	 */
	protected String factura = FACTURA_EDEFAULT;

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
	protected ViajeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloagenciaPackage.Literals.VIAJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alojamiento> getViaje_tiene_alojamientos() {
		if (viaje_tiene_alojamientos == null) {
			viaje_tiene_alojamientos = new EObjectContainmentEList<Alojamiento>(Alojamiento.class, this, ModeloagenciaPackage.VIAJE__VIAJE_TIENE_ALOJAMIENTOS);
		}
		return viaje_tiene_alojamientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Desplazamiento> getViaje_tiene_desplazamientos() {
		if (viaje_tiene_desplazamientos == null) {
			viaje_tiene_desplazamientos = new EObjectContainmentEList<Desplazamiento>(Desplazamiento.class, this, ModeloagenciaPackage.VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS);
		}
		return viaje_tiene_desplazamientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Excursion> getViaje_tiene_excursiones() {
		if (viaje_tiene_excursiones == null) {
			viaje_tiene_excursiones = new EObjectContainmentEList<Excursion>(Excursion.class, this, ModeloagenciaPackage.VIAJE__VIAJE_TIENE_EXCURSIONES);
		}
		return viaje_tiene_excursiones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFactura() {
		return factura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactura(String newFactura) {
		String oldFactura = factura;
		factura = newFactura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.VIAJE__FACTURA, oldFactura, factura));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.VIAJE__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_ALOJAMIENTOS:
				return ((InternalEList<?>)getViaje_tiene_alojamientos()).basicRemove(otherEnd, msgs);
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS:
				return ((InternalEList<?>)getViaje_tiene_desplazamientos()).basicRemove(otherEnd, msgs);
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_EXCURSIONES:
				return ((InternalEList<?>)getViaje_tiene_excursiones()).basicRemove(otherEnd, msgs);
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
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_ALOJAMIENTOS:
				return getViaje_tiene_alojamientos();
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS:
				return getViaje_tiene_desplazamientos();
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_EXCURSIONES:
				return getViaje_tiene_excursiones();
			case ModeloagenciaPackage.VIAJE__FACTURA:
				return getFactura();
			case ModeloagenciaPackage.VIAJE__PRECIO:
				return getPrecio();
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
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_ALOJAMIENTOS:
				getViaje_tiene_alojamientos().clear();
				getViaje_tiene_alojamientos().addAll((Collection<? extends Alojamiento>)newValue);
				return;
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS:
				getViaje_tiene_desplazamientos().clear();
				getViaje_tiene_desplazamientos().addAll((Collection<? extends Desplazamiento>)newValue);
				return;
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_EXCURSIONES:
				getViaje_tiene_excursiones().clear();
				getViaje_tiene_excursiones().addAll((Collection<? extends Excursion>)newValue);
				return;
			case ModeloagenciaPackage.VIAJE__FACTURA:
				setFactura((String)newValue);
				return;
			case ModeloagenciaPackage.VIAJE__PRECIO:
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
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_ALOJAMIENTOS:
				getViaje_tiene_alojamientos().clear();
				return;
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS:
				getViaje_tiene_desplazamientos().clear();
				return;
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_EXCURSIONES:
				getViaje_tiene_excursiones().clear();
				return;
			case ModeloagenciaPackage.VIAJE__FACTURA:
				setFactura(FACTURA_EDEFAULT);
				return;
			case ModeloagenciaPackage.VIAJE__PRECIO:
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
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_ALOJAMIENTOS:
				return viaje_tiene_alojamientos != null && !viaje_tiene_alojamientos.isEmpty();
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS:
				return viaje_tiene_desplazamientos != null && !viaje_tiene_desplazamientos.isEmpty();
			case ModeloagenciaPackage.VIAJE__VIAJE_TIENE_EXCURSIONES:
				return viaje_tiene_excursiones != null && !viaje_tiene_excursiones.isEmpty();
			case ModeloagenciaPackage.VIAJE__FACTURA:
				return FACTURA_EDEFAULT == null ? factura != null : !FACTURA_EDEFAULT.equals(factura);
			case ModeloagenciaPackage.VIAJE__PRECIO:
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
		result.append(" (Factura: ");
		result.append(factura);
		result.append(", Precio: ");
		result.append(precio);
		result.append(')');
		return result.toString();
	}

} //ViajeImpl
