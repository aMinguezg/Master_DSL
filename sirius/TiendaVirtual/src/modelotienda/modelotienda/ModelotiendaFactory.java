/**
 */
package modelotienda.modelotienda;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modelotienda.modelotienda.ModelotiendaPackage
 * @generated
 */
public interface ModelotiendaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelotiendaFactory eINSTANCE = modelotienda.modelotienda.impl.ModelotiendaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tienda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tienda</em>'.
	 * @generated
	 */
	Tienda createTienda();

	/**
	 * Returns a new object of class '<em>Proveedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proveedor</em>'.
	 * @generated
	 */
	Proveedor createProveedor();

	/**
	 * Returns a new object of class '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Producto</em>'.
	 * @generated
	 */
	Producto createProducto();

	/**
	 * Returns a new object of class '<em>Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedido</em>'.
	 * @generated
	 */
	Pedido createPedido();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Marca</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marca</em>'.
	 * @generated
	 */
	Marca createMarca();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelotiendaPackage getModelotiendaPackage();

} //ModelotiendaFactory
