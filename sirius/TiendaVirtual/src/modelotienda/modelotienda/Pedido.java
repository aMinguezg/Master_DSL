/**
 */
package modelotienda.modelotienda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelotienda.modelotienda.Pedido#getID <em>ID</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Pedido#getTotal <em>Total</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Pedido#getPedido_tiene_clientes <em>Pedido tiene clientes</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Pedido#getPedido_tiene_productos <em>Pedido tiene productos</em>}</li>
 * </ul>
 *
 * @see modelotienda.modelotienda.ModelotiendaPackage#getPedido()
 * @model
 * @generated
 */
public interface Pedido extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getPedido_ID()
	 * @model
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Pedido#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(int)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getPedido_Total()
	 * @model
	 * @generated
	 */
	int getTotal();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Pedido#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(int value);

	/**
	 * Returns the value of the '<em><b>Pedido tiene clientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido tiene clientes</em>' reference.
	 * @see #setPedido_tiene_clientes(Cliente)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getPedido_Pedido_tiene_clientes()
	 * @model required="true"
	 * @generated
	 */
	Cliente getPedido_tiene_clientes();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Pedido#getPedido_tiene_clientes <em>Pedido tiene clientes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pedido tiene clientes</em>' reference.
	 * @see #getPedido_tiene_clientes()
	 * @generated
	 */
	void setPedido_tiene_clientes(Cliente value);

	/**
	 * Returns the value of the '<em><b>Pedido tiene productos</b></em>' reference list.
	 * The list contents are of type {@link modelotienda.modelotienda.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido tiene productos</em>' reference list.
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getPedido_Pedido_tiene_productos()
	 * @model required="true"
	 * @generated
	 */
	EList<Producto> getPedido_tiene_productos();

} // Pedido
