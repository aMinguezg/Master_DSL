/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.restaurante.restaurante.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.dsl.restaurante.restaurante.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestauranteFactoryImpl extends EFactoryImpl implements RestauranteFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestauranteFactory init()
  {
    try
    {
      RestauranteFactory theRestauranteFactory = (RestauranteFactory)EPackage.Registry.INSTANCE.getEFactory(RestaurantePackage.eNS_URI);
      if (theRestauranteFactory != null)
      {
        return theRestauranteFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestauranteFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestauranteFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RestaurantePackage.RESTAURANTE: return createRestaurante();
      case RestaurantePackage.INGREDIENTE: return createIngrediente();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Restaurante createRestaurante()
  {
    RestauranteImpl restaurante = new RestauranteImpl();
    return restaurante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ingrediente createIngrediente()
  {
    IngredienteImpl ingrediente = new IngredienteImpl();
    return ingrediente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RestaurantePackage getRestaurantePackage()
  {
    return (RestaurantePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestaurantePackage getPackage()
  {
    return RestaurantePackage.eINSTANCE;
  }

} //RestauranteFactoryImpl