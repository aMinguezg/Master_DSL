/**
 */
package modeloagencia.modeloagencia.impl;

import modeloagencia.modeloagencia.Desplazamiento;
import modeloagencia.modeloagencia.ModeloagenciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desplazamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.impl.DesplazamientoImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.DesplazamientoImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.impl.DesplazamientoImpl#getMedio <em>Medio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesplazamientoImpl extends MinimalEObjectImpl.Container implements Desplazamiento {
	/**
	 * The default value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected String origen = ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestino() <em>Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected String destino = DESTINO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedio() <em>Medio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedio()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedio() <em>Medio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedio()
	 * @generated
	 * @ordered
	 */
	protected String medio = MEDIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesplazamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloagenciaPackage.Literals.DESPLAZAMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigen(String newOrigen) {
		String oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.DESPLAZAMIENTO__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestino(String newDestino) {
		String oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.DESPLAZAMIENTO__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMedio() {
		return medio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedio(String newMedio) {
		String oldMedio = medio;
		medio = newMedio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloagenciaPackage.DESPLAZAMIENTO__MEDIO, oldMedio, medio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloagenciaPackage.DESPLAZAMIENTO__ORIGEN:
				return getOrigen();
			case ModeloagenciaPackage.DESPLAZAMIENTO__DESTINO:
				return getDestino();
			case ModeloagenciaPackage.DESPLAZAMIENTO__MEDIO:
				return getMedio();
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
			case ModeloagenciaPackage.DESPLAZAMIENTO__ORIGEN:
				setOrigen((String)newValue);
				return;
			case ModeloagenciaPackage.DESPLAZAMIENTO__DESTINO:
				setDestino((String)newValue);
				return;
			case ModeloagenciaPackage.DESPLAZAMIENTO__MEDIO:
				setMedio((String)newValue);
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
			case ModeloagenciaPackage.DESPLAZAMIENTO__ORIGEN:
				setOrigen(ORIGEN_EDEFAULT);
				return;
			case ModeloagenciaPackage.DESPLAZAMIENTO__DESTINO:
				setDestino(DESTINO_EDEFAULT);
				return;
			case ModeloagenciaPackage.DESPLAZAMIENTO__MEDIO:
				setMedio(MEDIO_EDEFAULT);
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
			case ModeloagenciaPackage.DESPLAZAMIENTO__ORIGEN:
				return ORIGEN_EDEFAULT == null ? origen != null : !ORIGEN_EDEFAULT.equals(origen);
			case ModeloagenciaPackage.DESPLAZAMIENTO__DESTINO:
				return DESTINO_EDEFAULT == null ? destino != null : !DESTINO_EDEFAULT.equals(destino);
			case ModeloagenciaPackage.DESPLAZAMIENTO__MEDIO:
				return MEDIO_EDEFAULT == null ? medio != null : !MEDIO_EDEFAULT.equals(medio);
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
		result.append(" (Origen: ");
		result.append(origen);
		result.append(", Destino: ");
		result.append(destino);
		result.append(", Medio: ");
		result.append(medio);
		result.append(')');
		return result.toString();
	}

} //DesplazamientoImpl
