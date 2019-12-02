/**
 */
package modelotienda.modelotienda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelotienda.modelotienda.Producto#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Producto#getPrecio <em>Precio</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Producto#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Producto#getProveedor_tiene_productos <em>Proveedor tiene productos</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Producto#getProducto_tiene_marca <em>Producto tiene marca</em>}</li>
 * </ul>
 *
 * @see modelotienda.modelotienda.ModelotiendaPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getProducto_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Producto#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(int)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getProducto_Precio()
	 * @model
	 * @generated
	 */
	int getPrecio();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Producto#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(int value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getProducto_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Producto#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Proveedor tiene productos</b></em>' reference list.
	 * The list contents are of type {@link modelotienda.modelotienda.Proveedor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proveedor tiene productos</em>' reference list.
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getProducto_Proveedor_tiene_productos()
	 * @model
	 * @generated
	 */
	EList<Proveedor> getProveedor_tiene_productos();

	/**
	 * Returns the value of the '<em><b>Producto tiene marca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto tiene marca</em>' reference.
	 * @see #setProducto_tiene_marca(Marca)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getProducto_Producto_tiene_marca()
	 * @model required="true"
	 * @generated
	 */
	Marca getProducto_tiene_marca();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Producto#getProducto_tiene_marca <em>Producto tiene marca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producto tiene marca</em>' reference.
	 * @see #getProducto_tiene_marca()
	 * @generated
	 */
	void setProducto_tiene_marca(Marca value);

} // Producto
