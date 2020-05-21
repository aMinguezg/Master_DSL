/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage
 * @generated
 */
public interface ModeloagenciaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloagenciaFactory eINSTANCE = modeloagencia.modeloagencia.impl.ModeloagenciaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Agencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agencia</em>'.
	 * @generated
	 */
	Agencia createAgencia();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Viaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viaje</em>'.
	 * @generated
	 */
	Viaje createViaje();

	/**
	 * Returns a new object of class '<em>Desplazamiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desplazamiento</em>'.
	 * @generated
	 */
	Desplazamiento createDesplazamiento();

	/**
	 * Returns a new object of class '<em>Alojamiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alojamiento</em>'.
	 * @generated
	 */
	Alojamiento createAlojamiento();

	/**
	 * Returns a new object of class '<em>Excursion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excursion</em>'.
	 * @generated
	 */
	Excursion createExcursion();

	/**
	 * Returns a new object of class '<em>Guia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guia</em>'.
	 * @generated
	 */
	Guia createGuia();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeloagenciaPackage getModeloagenciaPackage();

} //ModeloagenciaFactory
