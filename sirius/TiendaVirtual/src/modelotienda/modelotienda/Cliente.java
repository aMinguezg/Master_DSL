/**
 */
package modelotienda.modelotienda;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelotienda.modelotienda.Cliente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modelotienda.modelotienda.Cliente#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @see modelotienda.modelotienda.ModelotiendaPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getCliente_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Cliente#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see modelotienda.modelotienda.ModelotiendaPackage#getCliente_Direccion()
	 * @model
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link modelotienda.modelotienda.Cliente#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

} // Cliente
