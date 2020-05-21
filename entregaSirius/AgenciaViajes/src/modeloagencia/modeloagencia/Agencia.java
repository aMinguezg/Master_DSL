/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_clientes <em>Tienda tiene clientes</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_desplazamientos <em>Tienda tiene desplazamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_excursiones <em>Tienda tiene excursiones</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_guias <em>Tienda tiene guias</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_alojamientos <em>Tienda tiene alojamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_viajes <em>Tienda tiene viajes</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getId <em>Id</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Agencia#getUbicacion <em>Ubicacion</em>}</li>
 * </ul>
 *
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia()
 * @model
 * @generated
 */
public interface Agencia extends EObject {
	/**
	 * Returns the value of the '<em><b>Tienda tiene clientes</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Cliente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene clientes</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Tienda_tiene_clientes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cliente> getTienda_tiene_clientes();

	/**
	 * Returns the value of the '<em><b>Tienda tiene desplazamientos</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Desplazamiento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene desplazamientos</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Tienda_tiene_desplazamientos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Desplazamiento> getTienda_tiene_desplazamientos();

	/**
	 * Returns the value of the '<em><b>Tienda tiene excursiones</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Excursion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene excursiones</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Tienda_tiene_excursiones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Excursion> getTienda_tiene_excursiones();

	/**
	 * Returns the value of the '<em><b>Tienda tiene guias</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Guia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene guias</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Tienda_tiene_guias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guia> getTienda_tiene_guias();

	/**
	 * Returns the value of the '<em><b>Tienda tiene alojamientos</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Alojamiento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene alojamientos</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Tienda_tiene_alojamientos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alojamiento> getTienda_tiene_alojamientos();

	/**
	 * Returns the value of the '<em><b>Tienda tiene viajes</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Viaje}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienda tiene viajes</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Tienda_tiene_viajes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Viaje> getTienda_tiene_viajes();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Agencia#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Agencia#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubicacion</em>' attribute.
	 * @see #setUbicacion(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAgencia_Ubicacion()
	 * @model
	 * @generated
	 */
	String getUbicacion();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Agencia#getUbicacion <em>Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubicacion</em>' attribute.
	 * @see #getUbicacion()
	 * @generated
	 */
	void setUbicacion(String value);

} // Agencia
