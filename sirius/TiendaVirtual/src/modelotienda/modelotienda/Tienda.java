/**
 */
package modelotienda.modelotienda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tienda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Documentation example
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelotienda.modelotienda.Tienda#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Tienda#getTiena_tiene_clientes <em>Tiena tiene clientes</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Tienda#getTienda_tiene_pedidos <em>Tienda tiene pedidos</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Tienda#getTienda_tiene_productos <em>Tienda tiene productos</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Tienda#getTienda_tiene_proveedores <em>Tienda tiene proveedores</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Tienda#getTienda_tiene_marcas <em>Tienda tiene marcas</em>}</li>
 * </ul>
 *
 * @see modelotienda.modelotienda.ModelotiendaPackage#getTienda()
 * @model
 * @generated
 */
public interface Tienda extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getTienda_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Tienda#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tiena tiene clientes</b></em>' containment reference list.
	 * The list contents are of type {@link modelotienda.modelotienda.Cliente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiena tiene clientes</em>' containment reference list.
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getTienda_Tiena_tiene_clientes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cliente> getTiena_tiene_clientes();

	/**
	 * Returns the value of the '<em><b>Tienda tiene pedidos</b></em>' containment reference list.
	 * The list contents are of type {@link modelotienda.modelotienda.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene pedidos</em>' containment reference list.
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getTienda_Tienda_tiene_pedidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pedido> getTienda_tiene_pedidos();

	/**
	 * Returns the value of the '<em><b>Tienda tiene productos</b></em>' containment reference list.
	 * The list contents are of type {@link modelotienda.modelotienda.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene productos</em>' containment reference list.
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getTienda_Tienda_tiene_productos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Producto> getTienda_tiene_productos();

	/**
	 * Returns the value of the '<em><b>Tienda tiene proveedores</b></em>' containment reference list.
	 * The list contents are of type {@link modelotienda.modelotienda.Proveedor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene proveedores</em>' containment reference list.
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getTienda_Tienda_tiene_proveedores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proveedor> getTienda_tiene_proveedores();

	/**
	 * Returns the value of the '<em><b>Tienda tiene marcas</b></em>' containment reference list.
	 * The list contents are of type {@link modelotienda.modelotienda.Marca}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene marcas</em>' containment reference list.
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getTienda_Tienda_tiene_marcas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Marca> getTienda_tiene_marcas();

} // Tienda
