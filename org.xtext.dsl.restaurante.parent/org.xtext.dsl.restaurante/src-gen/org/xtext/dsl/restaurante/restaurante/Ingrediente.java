/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.restaurante.restaurante;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingrediente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getInfoURL <em>Info URL</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getFoto <em>Foto</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#isAlergenico <em>Alergenico</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getIngrediente()
 * @model
 * @generated
 */
public interface Ingrediente extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getIngrediente_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getIngrediente_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Info URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info URL</em>' attribute.
   * @see #setInfoURL(String)
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getIngrediente_InfoURL()
   * @model
   * @generated
   */
  String getInfoURL();

  /**
   * Sets the value of the '{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getInfoURL <em>Info URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info URL</em>' attribute.
   * @see #getInfoURL()
   * @generated
   */
  void setInfoURL(String value);

  /**
   * Returns the value of the '<em><b>Foto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foto</em>' attribute.
   * @see #setFoto(String)
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getIngrediente_Foto()
   * @model
   * @generated
   */
  String getFoto();

  /**
   * Sets the value of the '{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#getFoto <em>Foto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foto</em>' attribute.
   * @see #getFoto()
   * @generated
   */
  void setFoto(String value);

  /**
   * Returns the value of the '<em><b>Alergenico</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alergenico</em>' attribute.
   * @see #setAlergenico(boolean)
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getIngrediente_Alergenico()
   * @model
   * @generated
   */
  boolean isAlergenico();

  /**
   * Sets the value of the '{@link org.xtext.dsl.restaurante.restaurante.Ingrediente#isAlergenico <em>Alergenico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alergenico</em>' attribute.
   * @see #isAlergenico()
   * @generated
   */
  void setAlergenico(boolean value);

} // Ingrediente