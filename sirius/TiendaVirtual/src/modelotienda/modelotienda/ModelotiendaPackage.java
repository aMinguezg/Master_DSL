/**
 */
package modelotienda.modelotienda;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modelotienda.modelotienda.ModelotiendaFactory
 * @model kind="package"
 * @generated
 */
public interface ModelotiendaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelotienda";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelotienda";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tienda";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelotiendaPackage eINSTANCE = modelotienda.modelotienda.impl.ModelotiendaPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelotienda.modelotienda.impl.TiendaImpl <em>Tienda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelotienda.modelotienda.impl.TiendaImpl
	 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getTienda()
	 * @generated
	 */
	int TIENDA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tiena tiene clientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__TIENA_TIENE_CLIENTES = 1;

	/**
	 * The feature id for the '<em><b>Tienda tiene pedidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__TIENDA_TIENE_PEDIDOS = 2;

	/**
	 * The feature id for the '<em><b>Tienda tiene productos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__TIENDA_TIENE_PRODUCTOS = 3;

	/**
	 * The feature id for the '<em><b>Tienda tiene proveedores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__TIENDA_TIENE_PROVEEDORES = 4;

	/**
	 * The feature id for the '<em><b>Tienda tiene marcas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__TIENDA_TIENE_MARCAS = 5;

	/**
	 * The number of structural features of the '<em>Tienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Tienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelotienda.modelotienda.impl.ProveedorImpl <em>Proveedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelotienda.modelotienda.impl.ProveedorImpl
	 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getProveedor()
	 * @generated
	 */
	int PROVEEDOR = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Proveedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Proveedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelotienda.modelotienda.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelotienda.modelotienda.impl.ProductoImpl
	 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PRECIO = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Proveedor tiene productos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS = 3;

	/**
	 * The feature id for the '<em><b>Producto tiene marca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PRODUCTO_TIENE_MARCA = 4;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelotienda.modelotienda.impl.PedidoImpl <em>Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelotienda.modelotienda.impl.PedidoImpl
	 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getPedido()
	 * @generated
	 */
	int PEDIDO = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ID = 0;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Pedido tiene clientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__PEDIDO_TIENE_CLIENTES = 2;

	/**
	 * The feature id for the '<em><b>Pedido tiene productos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__PEDIDO_TIENE_PRODUCTOS = 3;

	/**
	 * The number of structural features of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelotienda.modelotienda.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelotienda.modelotienda.impl.ClienteImpl
	 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__DIRECCION = 1;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelotienda.modelotienda.impl.MarcaImpl <em>Marca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelotienda.modelotienda.impl.MarcaImpl
	 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getMarca()
	 * @generated
	 */
	int MARCA = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARCA__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Marca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARCA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARCA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link modelotienda.modelotienda.Tienda <em>Tienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tienda</em>'.
	 * @see modelotienda.modelotienda.Tienda
	 * @generated
	 */
	EClass getTienda();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Tienda#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modelotienda.modelotienda.Tienda#getNombre()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link modelotienda.modelotienda.Tienda#getTiena_tiene_clientes <em>Tiena tiene clientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiena tiene clientes</em>'.
	 * @see modelotienda.modelotienda.Tienda#getTiena_tiene_clientes()
	 * @see #getTienda()
	 * @generated
	 */
	EReference getTienda_Tiena_tiene_clientes();

	/**
	 * Returns the meta object for the containment reference list '{@link modelotienda.modelotienda.Tienda#getTienda_tiene_pedidos <em>Tienda tiene pedidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene pedidos</em>'.
	 * @see modelotienda.modelotienda.Tienda#getTienda_tiene_pedidos()
	 * @see #getTienda()
	 * @generated
	 */
	EReference getTienda_Tienda_tiene_pedidos();

	/**
	 * Returns the meta object for the containment reference list '{@link modelotienda.modelotienda.Tienda#getTienda_tiene_productos <em>Tienda tiene productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene productos</em>'.
	 * @see modelotienda.modelotienda.Tienda#getTienda_tiene_productos()
	 * @see #getTienda()
	 * @generated
	 */
	EReference getTienda_Tienda_tiene_productos();

	/**
	 * Returns the meta object for the containment reference list '{@link modelotienda.modelotienda.Tienda#getTienda_tiene_proveedores <em>Tienda tiene proveedores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene proveedores</em>'.
	 * @see modelotienda.modelotienda.Tienda#getTienda_tiene_proveedores()
	 * @see #getTienda()
	 * @generated
	 */
	EReference getTienda_Tienda_tiene_proveedores();

	/**
	 * Returns the meta object for the containment reference list '{@link modelotienda.modelotienda.Tienda#getTienda_tiene_marcas <em>Tienda tiene marcas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene marcas</em>'.
	 * @see modelotienda.modelotienda.Tienda#getTienda_tiene_marcas()
	 * @see #getTienda()
	 * @generated
	 */
	EReference getTienda_Tienda_tiene_marcas();

	/**
	 * Returns the meta object for class '{@link modelotienda.modelotienda.Proveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proveedor</em>'.
	 * @see modelotienda.modelotienda.Proveedor
	 * @generated
	 */
	EClass getProveedor();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Proveedor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modelotienda.modelotienda.Proveedor#getNombre()
	 * @see #getProveedor()
	 * @generated
	 */
	EAttribute getProveedor_Nombre();

	/**
	 * Returns the meta object for class '{@link modelotienda.modelotienda.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see modelotienda.modelotienda.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Producto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modelotienda.modelotienda.Producto#getNombre()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Producto#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see modelotienda.modelotienda.Producto#getPrecio()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Precio();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Producto#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see modelotienda.modelotienda.Producto#getDescripcion()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Descripcion();

	/**
	 * Returns the meta object for the reference list '{@link modelotienda.modelotienda.Producto#getProveedor_tiene_productos <em>Proveedor tiene productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proveedor tiene productos</em>'.
	 * @see modelotienda.modelotienda.Producto#getProveedor_tiene_productos()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Proveedor_tiene_productos();

	/**
	 * Returns the meta object for the reference '{@link modelotienda.modelotienda.Producto#getProducto_tiene_marca <em>Producto tiene marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producto tiene marca</em>'.
	 * @see modelotienda.modelotienda.Producto#getProducto_tiene_marca()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Producto_tiene_marca();

	/**
	 * Returns the meta object for class '{@link modelotienda.modelotienda.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedido</em>'.
	 * @see modelotienda.modelotienda.Pedido
	 * @generated
	 */
	EClass getPedido();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Pedido#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see modelotienda.modelotienda.Pedido#getID()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_ID();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Pedido#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see modelotienda.modelotienda.Pedido#getTotal()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Total();

	/**
	 * Returns the meta object for the reference '{@link modelotienda.modelotienda.Pedido#getPedido_tiene_clientes <em>Pedido tiene clientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pedido tiene clientes</em>'.
	 * @see modelotienda.modelotienda.Pedido#getPedido_tiene_clientes()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Pedido_tiene_clientes();

	/**
	 * Returns the meta object for the reference list '{@link modelotienda.modelotienda.Pedido#getPedido_tiene_productos <em>Pedido tiene productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pedido tiene productos</em>'.
	 * @see modelotienda.modelotienda.Pedido#getPedido_tiene_productos()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Pedido_tiene_productos();

	/**
	 * Returns the meta object for class '{@link modelotienda.modelotienda.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see modelotienda.modelotienda.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Cliente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modelotienda.modelotienda.Cliente#getNombre()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Cliente#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see modelotienda.modelotienda.Cliente#getDireccion()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Direccion();

	/**
	 * Returns the meta object for class '{@link modelotienda.modelotienda.Marca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marca</em>'.
	 * @see modelotienda.modelotienda.Marca
	 * @generated
	 */
	EClass getMarca();

	/**
	 * Returns the meta object for the attribute '{@link modelotienda.modelotienda.Marca#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modelotienda.modelotienda.Marca#getNombre()
	 * @see #getMarca()
	 * @generated
	 */
	EAttribute getMarca_Nombre();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelotiendaFactory getModelotiendaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modelotienda.modelotienda.impl.TiendaImpl <em>Tienda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelotienda.modelotienda.impl.TiendaImpl
		 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getTienda()
		 * @generated
		 */
		EClass TIENDA = eINSTANCE.getTienda();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__NOMBRE = eINSTANCE.getTienda_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tiena tiene clientes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIENDA__TIENA_TIENE_CLIENTES = eINSTANCE.getTienda_Tiena_tiene_clientes();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene pedidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIENDA__TIENDA_TIENE_PEDIDOS = eINSTANCE.getTienda_Tienda_tiene_pedidos();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene productos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIENDA__TIENDA_TIENE_PRODUCTOS = eINSTANCE.getTienda_Tienda_tiene_productos();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene proveedores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIENDA__TIENDA_TIENE_PROVEEDORES = eINSTANCE.getTienda_Tienda_tiene_proveedores();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene marcas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIENDA__TIENDA_TIENE_MARCAS = eINSTANCE.getTienda_Tienda_tiene_marcas();

		/**
		 * The meta object literal for the '{@link modelotienda.modelotienda.impl.ProveedorImpl <em>Proveedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelotienda.modelotienda.impl.ProveedorImpl
		 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getProveedor()
		 * @generated
		 */
		EClass PROVEEDOR = eINSTANCE.getProveedor();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVEEDOR__NOMBRE = eINSTANCE.getProveedor_Nombre();

		/**
		 * The meta object literal for the '{@link modelotienda.modelotienda.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelotienda.modelotienda.impl.ProductoImpl
		 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__NOMBRE = eINSTANCE.getProducto_Nombre();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__PRECIO = eINSTANCE.getProducto_Precio();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__DESCRIPCION = eINSTANCE.getProducto_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Proveedor tiene productos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS = eINSTANCE.getProducto_Proveedor_tiene_productos();

		/**
		 * The meta object literal for the '<em><b>Producto tiene marca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__PRODUCTO_TIENE_MARCA = eINSTANCE.getProducto_Producto_tiene_marca();

		/**
		 * The meta object literal for the '{@link modelotienda.modelotienda.impl.PedidoImpl <em>Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelotienda.modelotienda.impl.PedidoImpl
		 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getPedido()
		 * @generated
		 */
		EClass PEDIDO = eINSTANCE.getPedido();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__ID = eINSTANCE.getPedido_ID();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__TOTAL = eINSTANCE.getPedido_Total();

		/**
		 * The meta object literal for the '<em><b>Pedido tiene clientes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__PEDIDO_TIENE_CLIENTES = eINSTANCE.getPedido_Pedido_tiene_clientes();

		/**
		 * The meta object literal for the '<em><b>Pedido tiene productos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__PEDIDO_TIENE_PRODUCTOS = eINSTANCE.getPedido_Pedido_tiene_productos();

		/**
		 * The meta object literal for the '{@link modelotienda.modelotienda.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelotienda.modelotienda.impl.ClienteImpl
		 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__NOMBRE = eINSTANCE.getCliente_Nombre();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__DIRECCION = eINSTANCE.getCliente_Direccion();

		/**
		 * The meta object literal for the '{@link modelotienda.modelotienda.impl.MarcaImpl <em>Marca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelotienda.modelotienda.impl.MarcaImpl
		 * @see modelotienda.modelotienda.impl.ModelotiendaPackageImpl#getMarca()
		 * @generated
		 */
		EClass MARCA = eINSTANCE.getMarca();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARCA__NOMBRE = eINSTANCE.getMarca_Nombre();

	}

} //ModelotiendaPackage
