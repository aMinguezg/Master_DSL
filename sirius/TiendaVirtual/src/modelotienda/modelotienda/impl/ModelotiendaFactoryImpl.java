/**
 */
package modelotienda.modelotienda.impl;

import modelotienda.modelotienda.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelotiendaFactoryImpl extends EFactoryImpl implements ModelotiendaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelotiendaFactory init() {
		try {
			ModelotiendaFactory theModelotiendaFactory = (ModelotiendaFactory)EPackage.Registry.INSTANCE.getEFactory(ModelotiendaPackage.eNS_URI);
			if (theModelotiendaFactory != null) {
				return theModelotiendaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelotiendaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelotiendaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelotiendaPackage.TIENDA: return createTienda();
			case ModelotiendaPackage.PROVEEDOR: return createProveedor();
			case ModelotiendaPackage.PRODUCTO: return createProducto();
			case ModelotiendaPackage.PEDIDO: return createPedido();
			case ModelotiendaPackage.CLIENTE: return createCliente();
			case ModelotiendaPackage.MARCA: return createMarca();
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
	public Tienda createTienda() {
		TiendaImpl tienda = new TiendaImpl();
		return tienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proveedor createProveedor() {
		ProveedorImpl proveedor = new ProveedorImpl();
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Producto createProducto() {
		ProductoImpl producto = new ProductoImpl();
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pedido createPedido() {
		PedidoImpl pedido = new PedidoImpl();
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marca createMarca() {
		MarcaImpl marca = new MarcaImpl();
		return marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelotiendaPackage getModelotiendaPackage() {
		return (ModelotiendaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelotiendaPackage getPackage() {
		return ModelotiendaPackage.eINSTANCE;
	}

} //ModelotiendaFactoryImpl
