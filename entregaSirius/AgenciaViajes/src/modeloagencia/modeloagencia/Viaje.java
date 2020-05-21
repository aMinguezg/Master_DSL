/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viaje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.Viaje#getViaje_tiene_alojamientos <em>Viaje tiene alojamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Viaje#getViaje_tiene_desplazamientos <em>Viaje tiene desplazamientos</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Viaje#getViaje_tiene_excursiones <em>Viaje tiene excursiones</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Viaje#getFactura <em>Factura</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Viaje#getPrecio <em>Precio</em>}</li>
 * </ul>
 *
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getViaje()
 * @model
 * @generated
 */
public interface Viaje extends EObject {
	/**
	 * Returns the value of the '<em><b>Viaje tiene alojamientos</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Alojamiento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viaje tiene alojamientos</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getViaje_Viaje_tiene_alojamientos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alojamiento> getViaje_tiene_alojamientos();

	/**
	 * Returns the value of the '<em><b>Viaje tiene desplazamientos</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Desplazamiento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viaje tiene desplazamientos</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getViaje_Viaje_tiene_desplazamientos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Desplazamiento> getViaje_tiene_desplazamientos();

	/**
	 * Returns the value of the '<em><b>Viaje tiene excursiones</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Excursion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viaje tiene excursiones</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getViaje_Viaje_tiene_excursiones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Excursion> getViaje_tiene_excursiones();

	/**
	 * Returns the value of the '<em><b>Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factura</em>' attribute.
	 * @see #setFactura(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getViaje_Factura()
	 * @model
	 * @generated
	 */
	String getFactura();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Viaje#getFactura <em>Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factura</em>' attribute.
	 * @see #getFactura()
	 * @generated
	 */
	void setFactura(String value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(double)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getViaje_Precio()
	 * @model
	 * @generated
	 */
	double getPrecio();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Viaje#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(double value);

} // Viaje
