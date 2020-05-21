/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.Guia#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Guia#getIdioma <em>Idioma</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Guia#getTarifa <em>Tarifa</em>}</li>
 * </ul>
 *
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getGuia()
 * @model
 * @generated
 */
public interface Guia extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getGuia_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Guia#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Idioma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idioma</em>' attribute.
	 * @see #setIdioma(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getGuia_Idioma()
	 * @model
	 * @generated
	 */
	String getIdioma();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Guia#getIdioma <em>Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idioma</em>' attribute.
	 * @see #getIdioma()
	 * @generated
	 */
	void setIdioma(String value);

	/**
	 * Returns the value of the '<em><b>Tarifa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarifa</em>' attribute.
	 * @see #setTarifa(double)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getGuia_Tarifa()
	 * @model
	 * @generated
	 */
	double getTarifa();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Guia#getTarifa <em>Tarifa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarifa</em>' attribute.
	 * @see #getTarifa()
	 * @generated
	 */
	void setTarifa(double value);

} // Guia
