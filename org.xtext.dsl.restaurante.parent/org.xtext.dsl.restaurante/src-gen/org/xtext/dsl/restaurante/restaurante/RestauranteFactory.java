/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.restaurante.restaurante;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage
 * @generated
 */
public interface RestauranteFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RestauranteFactory eINSTANCE = org.xtext.dsl.restaurante.restaurante.impl.RestauranteFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Restaurante</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restaurante</em>'.
   * @generated
   */
  Restaurante createRestaurante();

  /**
   * Returns a new object of class '<em>Ingrediente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ingrediente</em>'.
   * @generated
   */
  Ingrediente createIngrediente();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RestaurantePackage getRestaurantePackage();

} //RestauranteFactory
