/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alojamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.Alojamiento#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Alojamiento#getUbicacion <em>Ubicacion</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Alojamiento#getTiempo <em>Tiempo</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Alojamiento#getPrecio <em>Precio</em>}</li>
 * </ul>
 *
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAlojamiento()
 * @model
 * @generated
 */
public interface Alojamiento extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAlojamiento_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Alojamiento#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubicacion</em>' attribute.
	 * @see #setUbicacion(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAlojamiento_Ubicacion()
	 * @model
	 * @generated
	 */
	String getUbicacion();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Alojamiento#getUbicacion <em>Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubicacion</em>' attribute.
	 * @see #getUbicacion()
	 * @generated
	 */
	void setUbicacion(String value);

	/**
	 * Returns the value of the '<em><b>Tiempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiempo</em>' attribute.
	 * @see #setTiempo(int)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAlojamiento_Tiempo()
	 * @model
	 * @generated
	 */
	int getTiempo();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Alojamiento#getTiempo <em>Tiempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiempo</em>' attribute.
	 * @see #getTiempo()
	 * @generated
	 */
	void setTiempo(int value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(double)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getAlojamiento_Precio()
	 * @model
	 * @generated
	 */
	double getPrecio();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Alojamiento#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(double value);

} // Alojamiento
