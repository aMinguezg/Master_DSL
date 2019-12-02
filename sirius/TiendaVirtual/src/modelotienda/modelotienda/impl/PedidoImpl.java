/**
 */
package modelotienda.modelotienda.impl;

import java.util.Collection;

import modelotienda.modelotienda.Cliente;
import modelotienda.modelotienda.ModelotiendaPackage;
import modelotienda.modelotienda.Pedido;
import modelotienda.modelotienda.Producto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelotienda.modelotienda.impl.PedidoImpl#getID <em>ID</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.PedidoImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.PedidoImpl#getPedido_tiene_clientes <em>Pedido tiene clientes</em>}</li>
 *   <li>{@link modelotienda.modelotienda.impl.PedidoImpl#getPedido_tiene_productos <em>Pedido tiene productos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedidoImpl extends MinimalEObjectImpl.Container implements Pedido {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected int total = TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPedido_tiene_clientes() <em>Pedido tiene clientes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedido_tiene_clientes()
	 * @generated
	 * @ordered
	 */
	protected Cliente pedido_tiene_clientes;

	/**
	 * The cached value of the '{@link #getPedido_tiene_productos() <em>Pedido tiene productos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedido_tiene_productos()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> pedido_tiene_productos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelotiendaPackage.Literals.PEDIDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.PEDIDO__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotal(int newTotal) {
		int oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.PEDIDO__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cliente getPedido_tiene_clientes() {
		if (pedido_tiene_clientes != null && pedido_tiene_clientes.eIsProxy()) {
			InternalEObject oldPedido_tiene_clientes = (InternalEObject)pedido_tiene_clientes;
			pedido_tiene_clientes = (Cliente)eResolveProxy(oldPedido_tiene_clientes);
			if (pedido_tiene_clientes != oldPedido_tiene_clientes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_CLIENTES, oldPedido_tiene_clientes, pedido_tiene_clientes));
			}
		}
		return pedido_tiene_clientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente basicGetPedido_tiene_clientes() {
		return pedido_tiene_clientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPedido_tiene_clientes(Cliente newPedido_tiene_clientes) {
		Cliente oldPedido_tiene_clientes = pedido_tiene_clientes;
		pedido_tiene_clientes = newPedido_tiene_clientes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_CLIENTES, oldPedido_tiene_clientes, pedido_tiene_clientes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Producto> getPedido_tiene_productos() {
		if (pedido_tiene_productos == null) {
			pedido_tiene_productos = new EObjectResolvingEList<Producto>(Producto.class, this, ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_PRODUCTOS);
		}
		return pedido_tiene_productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelotiendaPackage.PEDIDO__ID:
				return getID();
			case ModelotiendaPackage.PEDIDO__TOTAL:
				return getTotal();
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_CLIENTES:
				if (resolve) return getPedido_tiene_clientes();
				return basicGetPedido_tiene_clientes();
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_PRODUCTOS:
				return getPedido_tiene_productos();
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
			case ModelotiendaPackage.PEDIDO__ID:
				setID((Long)newValue);
				return;
			case ModelotiendaPackage.PEDIDO__TOTAL:
				setTotal((Integer)newValue);
				return;
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_CLIENTES:
				setPedido_tiene_clientes((Cliente)newValue);
				return;
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_PRODUCTOS:
				getPedido_tiene_productos().clear();
				getPedido_tiene_productos().addAll((Collection<? extends Producto>)newValue);
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
			case ModelotiendaPackage.PEDIDO__ID:
				setID(ID_EDEFAULT);
				return;
			case ModelotiendaPackage.PEDIDO__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_CLIENTES:
				setPedido_tiene_clientes((Cliente)null);
				return;
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_PRODUCTOS:
				getPedido_tiene_productos().clear();
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
			case ModelotiendaPackage.PEDIDO__ID:
				return id != ID_EDEFAULT;
			case ModelotiendaPackage.PEDIDO__TOTAL:
				return total != TOTAL_EDEFAULT;
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_CLIENTES:
				return pedido_tiene_clientes != null;
			case ModelotiendaPackage.PEDIDO__PEDIDO_TIENE_PRODUCTOS:
				return pedido_tiene_productos != null && !pedido_tiene_productos.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //PedidoImpl
