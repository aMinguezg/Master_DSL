/**
 */
package modeloagencia.modeloagencia.impl;

import modeloagencia.modeloagencia.Guia;
import modeloagencia.modeloagencia.ModeloagenciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.impl.GuiaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.GuiaImpl#getIdioma <em>Idioma</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.GuiaImpl#getTarifa <em>Tarifa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuiaImpl extends MinimalEObjectImpl.Container implements Guia {
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
	 * The default value of the '{@link #getIdioma() <em>Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdioma()
	 * @generated
	 * @ordered
	 */
	protected static final String IDIOMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdioma() <em>Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdioma()
	 * @generated
	 * @ordered
	 */
	protected String idioma = IDIOMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarifa() <em>Tarifa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifa()
	 * @generated
	 * @ordered
	 */
	protected static final double TARIFA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTarifa() <em>Tarifa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifa()
	 * @generated
	 * @ordered
	 */
	protected double tarifa = TARIFA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloagenciaPackage.Literals.GUIA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.GUIA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdioma() {
		return idioma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdioma(String newIdioma) {
		String oldIdioma = idioma;
		idioma = newIdioma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.GUIA__IDIOMA, oldIdioma, idioma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTarifa() {
		return tarifa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarifa(double newTarifa) {
		double oldTarifa = tarifa;
		tarifa = newTarifa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.GUIA__TARIFA, oldTarifa, tarifa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloagenciaPackage.GUIA__NOMBRE:
				return getNombre();
			case ModeloagenciaPackage.GUIA__IDIOMA:
				return getIdioma();
			case ModeloagenciaPackage.GUIA__TARIFA:
				return getTarifa();
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
			case ModeloagenciaPackage.GUIA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModeloagenciaPackage.GUIA__IDIOMA:
				setIdioma((String)newValue);
				return;
			case ModeloagenciaPackage.GUIA__TARIFA:
				setTarifa((Double)newValue);
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
			case ModeloagenciaPackage.GUIA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModeloagenciaPackage.GUIA__IDIOMA:
				setIdioma(IDIOMA_EDEFAULT);
				return;
			case ModeloagenciaPackage.GUIA__TARIFA:
				setTarifa(TARIFA_EDEFAULT);
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
			case ModeloagenciaPackage.GUIA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModeloagenciaPackage.GUIA__IDIOMA:
				return IDIOMA_EDEFAULT == null ? idioma != null : !IDIOMA_EDEFAULT.equals(idioma);
			case ModeloagenciaPackage.GUIA__TARIFA:
				return tarifa != TARIFA_EDEFAULT;
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
		result.append(", Idioma: ");
		result.append(idioma);
		result.append(", Tarifa: ");
		result.append(tarifa);
		result.append(')');
		return result.toString();
	}

} //GuiaImpl
