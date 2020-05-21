/**
 */
package modeloagencia.modeloagencia.impl;

import modeloagencia.modeloagencia.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloagenciaFactoryImpl extends EFactoryImpl implements ModeloagenciaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeloagenciaFactory init() {
		try {
			ModeloagenciaFactory theModeloagenciaFactory = (ModeloagenciaFactory)EPackage.Registry.INSTANCE.getEFactory(ModeloagenciaPackage.eNS_URI);
			if (theModeloagenciaFactory != null) {
				return theModeloagenciaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeloagenciaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloagenciaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModeloagenciaPackage.AGENCIA: return createAgencia();
			case ModeloagenciaPackage.CLIENTE: return createCliente();
			case ModeloagenciaPackage.VIAJE: return createViaje();
			case ModeloagenciaPackage.DESPLAZAMIENTO: return createDesplazamiento();
			case ModeloagenciaPackage.ALOJAMIENTO: return createAlojamiento();
			case ModeloagenciaPackage.EXCURSION: return createExcursion();
			case ModeloagenciaPackage.GUIA: return createGuia();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agencia createAgencia() {
		AgenciaImpl agencia = new AgenciaImpl();
		return agencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Viaje createViaje() {
		ViajeImpl viaje = new ViajeImpl();
		return viaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Desplazamiento createDesplazamiento() {
		DesplazamientoImpl desplazamiento = new DesplazamientoImpl();
		return desplazamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alojamiento createAlojamiento() {
		AlojamientoImpl alojamiento = new AlojamientoImpl();
		return alojamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Excursion createExcursion() {
		ExcursionImpl excursion = new ExcursionImpl();
		return excursion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Guia createGuia() {
		GuiaImpl guia = new GuiaImpl();
		return guia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeloagenciaPackage getModeloagenciaPackage() {
		return (ModeloagenciaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeloagenciaPackage getPackage() {
		return ModeloagenciaPackage.eINSTANCE;
	}

} //ModeloagenciaFactoryImpl
