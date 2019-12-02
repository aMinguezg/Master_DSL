/**
 */
package modelotienda.modelotienda.impl;

import modelotienda.modelotienda.Cliente;
import modelotienda.modelotienda.Marca;
import modelotienda.modelotienda.ModelotiendaFactory;
import modelotienda.modelotienda.ModelotiendaPackage;
import modelotienda.modelotienda.Pedido;
import modelotienda.modelotienda.Producto;
import modelotienda.modelotienda.Proveedor;
import modelotienda.modelotienda.Tienda;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelotiendaPackageImpl extends EPackageImpl implements ModelotiendaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proveedorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedidoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marcaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modelotienda.modelotienda.ModelotiendaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelotiendaPackageImpl() {
		super(eNS_URI, ModelotiendaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelotiendaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelotiendaPackage init() {
		if (isInited) return (ModelotiendaPackage)EPackage.Registry.INSTANCE.getEPackage(ModelotiendaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelotiendaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelotiendaPackageImpl theModelotiendaPackage = registeredModelotiendaPackage instanceof ModelotiendaPackageImpl ? (ModelotiendaPackageImpl)registeredModelotiendaPackage : new ModelotiendaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelotiendaPackage.createPackageContents();

		// Initialize created meta-data
		theModelotiendaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelotiendaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelotiendaPackage.eNS_URI, theModelotiendaPackage);
		return theModelotiendaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTienda() {
		return tiendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTienda_Nombre() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTienda_Tiena_tiene_clientes() {
		return (EReference)tiendaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTienda_Tienda_tiene_pedidos() {
		return (EReference)tiendaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTienda_Tienda_tiene_productos() {
		return (EReference)tiendaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTienda_Tienda_tiene_proveedores() {
		return (EReference)tiendaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTienda_Tienda_tiene_marcas() {
		return (EReference)tiendaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProveedor() {
		return proveedorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProveedor_Nombre() {
		return (EAttribute)proveedorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProducto() {
		return productoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProducto_Nombre() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProducto_Precio() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProducto_Descripcion() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProducto_Proveedor_tiene_productos() {
		return (EReference)productoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProducto_Producto_tiene_marca() {
		return (EReference)productoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPedido() {
		return pedidoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPedido_ID() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPedido_Total() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedido_Pedido_tiene_clientes() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedido_Pedido_tiene_productos() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Nombre() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Direccion() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarca() {
		return marcaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarca_Nombre() {
		return (EAttribute)marcaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelotiendaFactory getModelotiendaFactory() {
		return (ModelotiendaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tiendaEClass = createEClass(TIENDA);
		createEAttribute(tiendaEClass, TIENDA__NOMBRE);
		createEReference(tiendaEClass, TIENDA__TIENA_TIENE_CLIENTES);
		createEReference(tiendaEClass, TIENDA__TIENDA_TIENE_PEDIDOS);
		createEReference(tiendaEClass, TIENDA__TIENDA_TIENE_PRODUCTOS);
		createEReference(tiendaEClass, TIENDA__TIENDA_TIENE_PROVEEDORES);
		createEReference(tiendaEClass, TIENDA__TIENDA_TIENE_MARCAS);

		proveedorEClass = createEClass(PROVEEDOR);
		createEAttribute(proveedorEClass, PROVEEDOR__NOMBRE);

		productoEClass = createEClass(PRODUCTO);
		createEAttribute(productoEClass, PRODUCTO__NOMBRE);
		createEAttribute(productoEClass, PRODUCTO__PRECIO);
		createEAttribute(productoEClass, PRODUCTO__DESCRIPCION);
		createEReference(productoEClass, PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS);
		createEReference(productoEClass, PRODUCTO__PRODUCTO_TIENE_MARCA);

		pedidoEClass = createEClass(PEDIDO);
		createEAttribute(pedidoEClass, PEDIDO__ID);
		createEAttribute(pedidoEClass, PEDIDO__TOTAL);
		createEReference(pedidoEClass, PEDIDO__PEDIDO_TIENE_CLIENTES);
		createEReference(pedidoEClass, PEDIDO__PEDIDO_TIENE_PRODUCTOS);

		clienteEClass = createEClass(CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__NOMBRE);
		createEAttribute(clienteEClass, CLIENTE__DIRECCION);

		marcaEClass = createEClass(MARCA);
		createEAttribute(marcaEClass, MARCA__NOMBRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tiendaEClass, Tienda.class, "Tienda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTienda_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTienda_Tiena_tiene_clientes(), this.getCliente(), null, "tiena_tiene_clientes", null, 0, -1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTienda_Tienda_tiene_pedidos(), this.getPedido(), null, "tienda_tiene_pedidos", null, 0, -1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTienda_Tienda_tiene_productos(), this.getProducto(), null, "tienda_tiene_productos", null, 0, -1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTienda_Tienda_tiene_proveedores(), this.getProveedor(), null, "tienda_tiene_proveedores", null, 0, -1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTienda_Tienda_tiene_marcas(), this.getMarca(), null, "tienda_tiene_marcas", null, 0, -1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proveedorEClass, Proveedor.class, "Proveedor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProveedor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productoEClass, Producto.class, "Producto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProducto_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Precio(), ecorePackage.getEInt(), "precio", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducto_Proveedor_tiene_productos(), this.getProveedor(), null, "proveedor_tiene_productos", null, 0, -1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducto_Producto_tiene_marca(), this.getMarca(), null, "producto_tiene_marca", null, 1, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pedidoEClass, Pedido.class, "Pedido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPedido_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_Total(), ecorePackage.getEInt(), "Total", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_Pedido_tiene_clientes(), this.getCliente(), null, "pedido_tiene_clientes", null, 1, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_Pedido_tiene_productos(), this.getProducto(), null, "pedido_tiene_productos", null, 1, -1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliente_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Direccion(), ecorePackage.getEString(), "direccion", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marcaEClass, Marca.class, "Marca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarca_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Marca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelotiendaPackageImpl
