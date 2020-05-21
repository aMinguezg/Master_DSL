/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desplazamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.Desplazamiento#getOrigen <em>Origen</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Desplazamiento#getDestino <em>Destino</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Desplazamiento#getMedio <em>Medio</em>}</li>
 * </ul>
 *
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getDesplazamiento()
 * @model
 * @generated
 */
public interface Desplazamiento extends EObject {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' attribute.
	 * @see #setOrigen(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getDesplazamiento_Origen()
	 * @model
	 * @generated
	 */
	String getOrigen();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Desplazamiento#getOrigen <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' attribute.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(String value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' attribute.
	 * @see #setDestino(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getDesplazamiento_Destino()
	 * @model
	 * @generated
	 */
	String getDestino();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Desplazamiento#getDestino <em>Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' attribute.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(String value);

	/**
	 * Returns the value of the '<em><b>Medio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medio</em>' attribute.
	 * @see #setMedio(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getDesplazamiento_Medio()
	 * @model
	 * @generated
	 */
	String getMedio();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Desplazamiento#getMedio <em>Medio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medio</em>' attribute.
	 * @see #getMedio()
	 * @generated
	 */
	void setMedio(String value);

} // Desplazamiento
