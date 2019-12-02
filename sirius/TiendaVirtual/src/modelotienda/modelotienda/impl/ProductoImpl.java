/**
 */
package modelotienda.modelotienda.impl;

import java.util.Collection;

import modelotienda.modelotienda.Marca;
import modelotienda.modelotienda.ModelotiendaPackage;
import modelotienda.modelotienda.Producto;
import modelotienda.modelotienda.Proveedor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelotienda.modelotienda.impl.ProductoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.ProductoImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.ProductoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.ProductoImpl#getProveedor_tiene_productos <em>Proveedor tiene productos</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.ProductoImpl#getProducto_tiene_marca <em>Producto tiene marca</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoImpl extends MinimalEObjectImpl.Container implements Producto {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected int precio = PRECIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProveedor_tiene_productos() <em>Proveedor tiene productos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProveedor_tiene_productos()
	 * @generated
	 * @ordered
	 */
	protected EList<Proveedor> proveedor_tiene_productos;

	/**
	 * The cached value of the '{@link #getProducto_tiene_marca() <em>Producto tiene marca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto_tiene_marca()
	 * @generated
	 * @ordered
	 */
	protected Marca producto_tiene_marca;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelotiendaPackage.Literals.PRODUCTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.PRODUCTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecio(int newPrecio) {
		int oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.PRODUCTO__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.PRODUCTO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Proveedor> getProveedor_tiene_productos() {
		if (proveedor_tiene_productos == null) {
			proveedor_tiene_productos = new EObjectResolvingEList<Proveedor>(Proveedor.class, this, ModelotiendaPackage.PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS);
		}
		return proveedor_tiene_productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marca getProducto_tiene_marca() {
		if (producto_tiene_marca != null && producto_tiene_marca.eIsProxy()) {
			InternalEObject oldProducto_tiene_marca = (InternalEObject)producto_tiene_marca;
			producto_tiene_marca = (Marca)eResolveProxy(oldProducto_tiene_marca);
			if (producto_tiene_marca != oldProducto_tiene_marca) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelotiendaPackage.PRODUCTO__PRODUCTO_TIENE_MARCA, oldProducto_tiene_marca, producto_tiene_marca));
			}
		}
		return producto_tiene_marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marca basicGetProducto_tiene_marca() {
		return producto_tiene_marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducto_tiene_marca(Marca newProducto_tiene_marca) {
		Marca oldProducto_tiene_marca = producto_tiene_marca;
		producto_tiene_marca = newProducto_tiene_marca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.PRODUCTO__PRODUCTO_TIENE_MARCA, oldProducto_tiene_marca, producto_tiene_marca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelotiendaPackage.PRODUCTO__NOMBRE:
				return getNombre();
			case ModelotiendaPackage.PRODUCTO__PRECIO:
				return getPrecio();
			case ModelotiendaPackage.PRODUCTO__DESCRIPCION:
				return getDescripcion();
			case ModelotiendaPackage.PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS:
				return getProveedor_tiene_productos();
			case ModelotiendaPackage.PRODUCTO__PRODUCTO_TIENE_MARCA:
				if (resolve) return getProducto_tiene_marca();
				return basicGetProducto_tiene_marca();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelotiendaPackage.PRODUCTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModelotiendaPackage.PRODUCTO__PRECIO:
				setPrecio((Integer)newValue);
				return;
			case ModelotiendaPackage.PRODUCTO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case ModelotiendaPackage.PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS:
				getProveedor_tiene_productos().clear();
				getProveedor_tiene_productos().addAll((Collection<? extends Proveedor>)newValue);
				return;
			case ModelotiendaPackage.PRODUCTO__PRODUCTO_TIENE_MARCA:
				setProducto_tiene_marca((Marca)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelotiendaPackage.PRODUCTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModelotiendaPackage.PRODUCTO__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case ModelotiendaPackage.PRODUCTO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case ModelotiendaPackage.PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS:
				getProveedor_tiene_productos().clear();
				return;
			case ModelotiendaPackage.PRODUCTO__PRODUCTO_TIENE_MARCA:
				setProducto_tiene_marca((Marca)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelotiendaPackage.PRODUCTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModelotiendaPackage.PRODUCTO__PRECIO:
				return precio != PRECIO_EDEFAULT;
			case ModelotiendaPackage.PRODUCTO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case ModelotiendaPackage.PRODUCTO__PROVEEDOR_TIENE_PRODUCTOS:
				return proveedor_tiene_productos != null && !proveedor_tiene_productos.isEmpty();
			case ModelotiendaPackage.PRODUCTO__PRODUCTO_TIENE_MARCA:
				return producto_tiene_marca != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", precio: ");
		result.append(precio);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ProductoImpl
