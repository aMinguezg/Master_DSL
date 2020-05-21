/**
 */
package modeloagencia.modeloagencia.util;

import modeloagencia.modeloagencia.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage
 * @generated
 */
public class ModeloagenciaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeloagenciaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloagenciaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModeloagenciaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloagenciaSwitch<Adapter> modelSwitch =
		new ModeloagenciaSwitch<Adapter>() {
			@Override
			public Adapter caseAgencia(Agencia object) {
				return createAgenciaAdapter();
			}
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseViaje(Viaje object) {
				return createViajeAdapter();
			}
			@Override
			public Adapter caseDesplazamiento(Desplazamiento object) {
				return createDesplazamientoAdapter();
			}
			@Override
			public Adapter caseAlojamiento(Alojamiento object) {
				return createAlojamientoAdapter();
			}
			@Override
			public Adapter caseExcursion(Excursion object) {
				return createExcursionAdapter();
			}
			@Override
			public Adapter caseGuia(Guia object) {
				return createGuiaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link modeloagencia.modeloagencia.Agencia <em>Agencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloagencia.modeloagencia.Agencia
	 * @generated
	 */
	public Adapter createAgenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloagencia.modeloagencia.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloagencia.modeloagencia.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloagencia.modeloagencia.Viaje <em>Viaje</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloagencia.modeloagencia.Viaje
	 * @generated
	 */
	public Adapter createViajeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloagencia.modeloagencia.Desplazamiento <em>Desplazamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloagencia.modeloagencia.Desplazamiento
	 * @generated
	 */
	public Adapter createDesplazamientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloagencia.modeloagencia.Alojamiento <em>Alojamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloagencia.modeloagencia.Alojamiento
	 * @generated
	 */
	public Adapter createAlojamientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloagencia.modeloagencia.Excursion <em>Excursion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloagencia.modeloagencia.Excursion
	 * @generated
	 */
	public Adapter createExcursionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloagencia.modeloagencia.Guia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloagencia.modeloagencia.Guia
	 * @generated
	 */
	public Adapter createGuiaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModeloagenciaAdapterFactory
