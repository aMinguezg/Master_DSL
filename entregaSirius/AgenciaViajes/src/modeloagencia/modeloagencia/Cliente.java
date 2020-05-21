/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link modeloagencia.modeloagencia.Cliente#getCliente_tiene_viajes <em>Cliente tiene viajes</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Cliente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Cliente#getDni <em>Dni</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Cliente#getEdad <em>Edad</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Cliente#getTelefono <em>Telefono</em>}</li>
 * </ul>
 *
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends EObject {
	/**
	 * Returns the value of the '<em><b>Cliente tiene viajes</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Viaje}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente tiene viajes</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getCliente_Cliente_tiene_viajes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Viaje> getCliente_tiene_viajes();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getCliente_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Cliente#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Dni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dni</em>' attribute.
	 * @see #setDni(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getCliente_Dni()
	 * @model
	 * @generated
	 */
	String getDni();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Cliente#getDni <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dni</em>' attribute.
	 * @see #getDni()
	 * @generated
	 */
	void setDni(String value);

	/**
	 * Returns the value of the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edad</em>' attribute.
	 * @see #setEdad(int)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getCliente_Edad()
	 * @model
	 * @generated
	 */
	int getEdad();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Cliente#getEdad <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edad</em>' attribute.
	 * @see #getEdad()
	 * @generated
	 */
	void setEdad(int value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(int)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getCliente_Telefono()
	 * @model
	 * @generated
	 */
	int getTelefono();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Cliente#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(int value);

} // Cliente
