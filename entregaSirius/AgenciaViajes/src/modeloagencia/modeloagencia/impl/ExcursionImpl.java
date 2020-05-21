/**
 */
package modeloagencia.modeloagencia.impl;

import java.util.Collection;

import modeloagencia.modeloagencia.Excursion;
import modeloagencia.modeloagencia.Guia;
import modeloagencia.modeloagencia.ModeloagenciaPackage;

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
 * An implementation of the model object '<em><b>Excursion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.impl.ExcursionImpl#getExcursion_tiene_guias <em>Excursion tiene guias</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ExcursionImpl#getLugar <em>Lugar</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.ExcursionImpl#getPrecio <em>Precio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcursionImpl extends MinimalEObjectImpl.Container implements Excursion {
	/**
	 * The cached value of the '{@link #getExcursion_tiene_guias() <em>Excursion tiene guias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcursion_tiene_guias()
	 * @generated
	 * @ordered
	 */
	protected EList<Guia> excursion_tiene_guias;

	/**
	 * The default value of the '{@link #getLugar() <em>Lugar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugar()
	 * @generated
	 * @ordered
	 */
	protected static final String LUGAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLugar() <em>Lugar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugar()
	 * @generated
	 * @ordered
	 */
	protected String lugar = LUGAR_EDEFAULT;

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
	protected ExcursionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloagenciaPackage.Literals.EXCURSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Guia> getExcursion_tiene_guias() {
		if (excursion_tiene_guias == null) {
			excursion_tiene_guias = new EObjectContainmentEList<Guia>(Guia.class, this, ModeloagenciaPackage.EXCURSION__EXCURSION_TIENE_GUIAS);
		}
		return excursion_tiene_guias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLugar() {
		return lugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLugar(String newLugar) {
		String oldLugar = lugar;
		lugar = newLugar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.EXCURSION__LUGAR, oldLugar, lugar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.EXCURSION__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloagenciaPackage.EXCURSION__EXCURSION_TIENE_GUIAS:
				return ((InternalEList<?>)getExcursion_tiene_guias()).basicRemove(otherEnd, msgs);
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
			case ModeloagenciaPackage.EXCURSION__EXCURSION_TIENE_GUIAS:
				return getExcursion_tiene_guias();
			case ModeloagenciaPackage.EXCURSION__LUGAR:
				return getLugar();
			case ModeloagenciaPackage.EXCURSION__PRECIO:
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
			case ModeloagenciaPackage.EXCURSION__EXCURSION_TIENE_GUIAS:
				getExcursion_tiene_guias().clear();
				getExcursion_tiene_guias().addAll((Collection<? extends Guia>)newValue);
				return;
			case ModeloagenciaPackage.EXCURSION__LUGAR:
				setLugar((String)newValue);
				return;
			case ModeloagenciaPackage.EXCURSION__PRECIO:
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
			case ModeloagenciaPackage.EXCURSION__EXCURSION_TIENE_GUIAS:
				getExcursion_tiene_guias().clear();
				return;
			case ModeloagenciaPackage.EXCURSION__LUGAR:
				setLugar(LUGAR_EDEFAULT);
				return;
			case ModeloagenciaPackage.EXCURSION__PRECIO:
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
			case ModeloagenciaPackage.EXCURSION__EXCURSION_TIENE_GUIAS:
				return excursion_tiene_guias != null && !excursion_tiene_guias.isEmpty();
			case ModeloagenciaPackage.EXCURSION__LUGAR:
				return LUGAR_EDEFAULT == null ? lugar != null : !LUGAR_EDEFAULT.equals(lugar);
			case ModeloagenciaPackage.EXCURSION__PRECIO:
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
		result.append(" (Lugar: ");
		result.append(lugar);
		result.append(", Precio: ");
		result.append(precio);
		result.append(')');
		return result.toString();
	}

} //ExcursionImpl
