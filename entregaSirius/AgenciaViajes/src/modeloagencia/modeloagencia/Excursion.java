/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excursion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloagencia.modeloagencia.Excursion#getExcursion_tiene_guias <em>Excursion tiene guias</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Excursion#getLugar <em>Lugar</em>}</li>
 *   <li>{@link modeloagencia.modeloagencia.Excursion#getPrecio <em>Precio</em>}</li>
 * </ul>
 *
 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getExcursion()
 * @model
 * @generated
 */
public interface Excursion extends EObject {
	/**
	 * Returns the value of the '<em><b>Excursion tiene guias</b></em>' containment reference list.
	 * The list contents are of type {@link modeloagencia.modeloagencia.Guia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excursion tiene guias</em>' containment reference list.
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getExcursion_Excursion_tiene_guias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guia> getExcursion_tiene_guias();

	/**
	 * Returns the value of the '<em><b>Lugar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lugar</em>' attribute.
	 * @see #setLugar(String)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getExcursion_Lugar()
	 * @model
	 * @generated
	 */
	String getLugar();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Excursion#getLugar <em>Lugar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lugar</em>' attribute.
	 * @see #getLugar()
	 * @generated
	 */
	void setLugar(String value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(double)
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#getExcursion_Precio()
	 * @model
	 * @generated
	 */
	double getPrecio();

	/**
	 * Sets the value of the '{@link modeloagencia.modeloagencia.Excursion#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(double value);

} // Excursion
