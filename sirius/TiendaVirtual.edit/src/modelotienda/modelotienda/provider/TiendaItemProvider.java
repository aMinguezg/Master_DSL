/**
 */
package modelotienda.modelotienda.provider;


import java.util.Collection;
import java.util.List;

import modelotienda.modelotienda.ModelotiendaFactory;
import modelotienda.modelotienda.ModelotiendaPackage;
import modelotienda.modelotienda.Tienda;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link modelotienda.modelotienda.Tienda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TiendaItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiendaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNombrePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tienda_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tienda_nombre_feature", "_UI_Tienda_type"),
				 ModelotiendaPackage.Literals.TIENDA__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelotiendaPackage.Literals.TIENDA__TIENA_TIENE_CLIENTES);
			childrenFeatures.add(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_PEDIDOS);
			childrenFeatures.add(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_PRODUCTOS);
			childrenFeatures.add(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_PROVEEDORES);
			childrenFeatures.add(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_MARCAS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Tienda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tienda"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tienda)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Tienda_type") :
			getString("_UI_Tienda_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Tienda.class)) {
			case ModelotiendaPackage.TIENDA__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelotiendaPackage.TIENDA__TIENA_TIENE_CLIENTES:
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PEDIDOS:
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PRODUCTOS:
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_PROVEEDORES:
			case ModelotiendaPackage.TIENDA__TIENDA_TIENE_MARCAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModelotiendaPackage.Literals.TIENDA__TIENA_TIENE_CLIENTES,
				 ModelotiendaFactory.eINSTANCE.createCliente()));

		newChildDescriptors.add
			(createChildParameter
				(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_PEDIDOS,
				 ModelotiendaFactory.eINSTANCE.createPedido()));

		newChildDescriptors.add
			(createChildParameter
				(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_PRODUCTOS,
				 ModelotiendaFactory.eINSTANCE.createProducto()));

		newChildDescriptors.add
			(createChildParameter
				(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_PROVEEDORES,
				 ModelotiendaFactory.eINSTANCE.createProveedor()));

		newChildDescriptors.add
			(createChildParameter
				(ModelotiendaPackage.Literals.TIENDA__TIENDA_TIENE_MARCAS,
				 ModelotiendaFactory.eINSTANCE.createMarca()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelotiendaEditPlugin.INSTANCE;
	}

}
