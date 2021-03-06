/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.multiMaven;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proyecto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.Proyecto#getVersion <em>Version</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.Proyecto#getPadre <em>Padre</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getProyecto()
 * @model
 * @generated
 */
public interface Proyecto extends EObject
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getProyecto_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.xtext.dsl.multimaven.multiMaven.Proyecto#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Padre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Padre</em>' containment reference.
   * @see #setPadre(DirectorioPadre)
   * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getProyecto_Padre()
   * @model containment="true"
   * @generated
   */
  DirectorioPadre getPadre();

  /**
   * Sets the value of the '{@link org.xtext.dsl.multimaven.multiMaven.Proyecto#getPadre <em>Padre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Padre</em>' containment reference.
   * @see #getPadre()
   * @generated
   */
  void setPadre(DirectorioPadre value);

} // Proyecto
