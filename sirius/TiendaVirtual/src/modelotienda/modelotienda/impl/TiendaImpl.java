/**
 */
package modelotienda.modelotienda.impl;

import java.util.Collection;

import modelotienda.modelotienda.Cliente;
import modelotienda.modelotienda.Marca;
import modelotienda.modelotienda.ModelotiendaPackage;
import modelotienda.modelotienda.Pedido;
import modelotienda.modelotienda.Producto;
import modelotienda.modelotienda.Proveedor;
import modelotienda.modelotienda.Tienda;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tienda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelotienda.modelotienda.impl.TiendaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.TiendaImpl#getTiena_tiene_clientes <em>Tiena tiene clientes</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.TiendaImpl#getTienda_tiene_pedidos <em>Tienda tiene pedidos</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.TiendaImpl#getTienda_tiene_productos <em>Tienda tiene productos</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.TiendaImpl#getTienda_tiene_proveedores <em>Tienda tiene proveedores</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.TiendaImpl#getTienda_tiene_marcas <em>Tienda tiene marcas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TiendaImpl extends MinimalEObjectImpl.Container implements Tienda {
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
	 * The cached value of the '{@link #getTiena_tiene_clientes() <em>Tiena tiene clientes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiena_tiene_clientes()
	 * @generated
	 * @ordered
	 */
	protected EList<Cliente> tiena_tiene_clientes;

	/**
	 * The cached value of the '{@link #getTienda_tiene_pedidos() <em>Tienda tiene pedidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_pedidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> tienda_tiene_pedidos;

	/**
	 * The cached value of the '{@link #getTienda_tiene_productos() <em>Tienda tiene productos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_productos()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> tienda_tiene_productos;

	/**
	 * The cached value of the '{@link #getTienda_tiene_proveedores() <em>Tienda tiene proveedores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_proveedores()
	 * @generated
	 * @ordered
	 */
	protected EList<Proveedor> tienda_tiene_proveedores;

	/**
	 * The cached value of the '{@link #getTienda_tiene_marcas() <em>Tienda tiene marcas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_tiene_marcas()
	 * @generated
	 * @ordered
	 */
	protected EList<Marca> tienda_tiene_marcas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TiendaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelotiendaPackage.Literals.TIENDA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.TIENDA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cliente> getTiena_tiene_clientes() {
		if (tiena_tiene_clientes == null) {
			tiena_tiene_clientes = new EObjectContainmentEList<Cliente>(Cliente.class, this, ModelotiendaPackage.TIENDA__TIENA_TIENE_CLIENTES);
		}
		return tiena_tiene_clientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pedido> getTienda_tiene_pedidos() {
		if (tienda_tiene_pedidos == null) {
			tienda_tiene_pedidos = new EObjectContainmentEList<Pedido>(Pedido.class, this, ModelotiendaPackage.TIENDA__TIENDA_TIENE_PEDIDOS);
		}
		return tienda_tiene_pedidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Producto> getTienda_tiene_productos() {
		if (tienda_tiene_productos == null) {
			tienda_tiene_productos = new EObjectContainmentEList<Producto>(Producto.class, this, ModelotiendaPackage.TIENDA__TIENDA_TIENE_PRODUCTOS);
		}
		return tienda_tiene_productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Proveedor> getTienda_tiene_proveedores() {
		if (tienda_tiene_proveedores == null) {
			tienda_tiene_proveedores = new EObjectContainmentEList<Proveedor>(Proveedor.class, this, ModelotiendaPackage.TIENDA__TIENDA_TIENE_PROVEEDORES);
		}
		return tienda_tiene_proveedores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Marca> getTienda_tiene_marcas() {
		if (tienda_tiene_marcas == null) {
			tienda_tiene_marcas = new EObjectContainmentEList<Marca>(Marca.class, this, ModelotiendaPackage.TIENDA__TIENDA_TIENE_MARCAS);
		}
		return tienda_tiene_marcas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelotiendaPackage.TIENDA__TIENA_TIENE_CLIENTES:
				return ((InternalEList<?>)getTiena_tiene_clientes()).basicRemove(otherEnd, msgs);
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PEDIDOS:
				return ((InternalEList<?>)getTienda_tiene_pedidos()).basicRemove(otherEnd, msgs);
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PRODUCTOS:
				return ((InternalEList<?>)getTienda_tiene_productos()).basicRemove(otherEnd, msgs);
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PROVEEDORES:
				return ((InternalEList<?>)getTienda_tiene_proveedores()).basicRemove(otherEnd, msgs);
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_MARCAS:
				return ((InternalEList<?>)getTienda_tiene_marcas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelotiendaPackage.TIENDA__NOMBRE:
				return getNombre();
			case ModelotiendaPackage.TIENDA__TIENA_TIENE_CLIENTES:
				return getTiena_tiene_clientes();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PEDIDOS:
				return getTienda_tiene_pedidos();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PRODUCTOS:
				return getTienda_tiene_productos();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PROVEEDORES:
				return getTienda_tiene_proveedores();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_MARCAS:
				return getTienda_tiene_marcas();
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
			case ModelotiendaPackage.TIENDA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModelotiendaPackage.TIENDA__TIENA_TIENE_CLIENTES:
				getTiena_tiene_clientes().clear();
				getTiena_tiene_clientes().addAll((Collection<? extends Cliente>)newValue);
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PEDIDOS:
				getTienda_tiene_pedidos().clear();
				getTienda_tiene_pedidos().addAll((Collection<? extends Pedido>)newValue);
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PRODUCTOS:
				getTienda_tiene_productos().clear();
				getTienda_tiene_productos().addAll((Collection<? extends Producto>)newValue);
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PROVEEDORES:
				getTienda_tiene_proveedores().clear();
				getTienda_tiene_proveedores().addAll((Collection<? extends Proveedor>)newValue);
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_MARCAS:
				getTienda_tiene_marcas().clear();
				getTienda_tiene_marcas().addAll((Collection<? extends Marca>)newValue);
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
			case ModelotiendaPackage.TIENDA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModelotiendaPackage.TIENDA__TIENA_TIENE_CLIENTES:
				getTiena_tiene_clientes().clear();
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PEDIDOS:
				getTienda_tiene_pedidos().clear();
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PRODUCTOS:
				getTienda_tiene_productos().clear();
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PROVEEDORES:
				getTienda_tiene_proveedores().clear();
				return;
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_MARCAS:
				getTienda_tiene_marcas().clear();
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
			case ModelotiendaPackage.TIENDA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModelotiendaPackage.TIENDA__TIENA_TIENE_CLIENTES:
				return tiena_tiene_clientes != null && !tiena_tiene_clientes.isEmpty();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PEDIDOS:
				return tienda_tiene_pedidos != null && !tienda_tiene_pedidos.isEmpty();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PRODUCTOS:
				return tienda_tiene_productos != null && !tienda_tiene_productos.isEmpty();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PROVEEDORES:
				return tienda_tiene_proveedores != null && !tienda_tiene_proveedores.isEmpty();
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_MARCAS:
				return tienda_tiene_marcas != null && !tienda_tiene_marcas.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TiendaImpl
