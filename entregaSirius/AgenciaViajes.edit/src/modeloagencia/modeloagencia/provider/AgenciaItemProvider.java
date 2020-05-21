/**
 */
package modeloagencia.modeloagencia.provider;


import java.util.Collection;
import java.util.List;

import modeloagencia.modeloagencia.Agencia;
import modeloagencia.modeloagencia.ModeloagenciaFactory;
import modeloagencia.modeloagencia.ModeloagenciaPackage;

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
 * This is the item provider adapter for a {@link modeloagencia.modeloagencia.Agencia} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgenciaItemProvider 
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
	public AgenciaItemProvider(AdapterFactory adapterFactory) {
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
			addIdPropertyDescriptor(object);
			addUbicacionPropertyDescriptor(object);
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
				 getString("_UI_Agencia_Nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Agencia_Nombre_feature", "_UI_Agencia_type"),
				 ModeloagenciaPackage.Literals.AGENCIA__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Agencia_Id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Agencia_Id_feature", "_UI_Agencia_type"),
				 ModeloagenciaPackage.Literals.AGENCIA__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ubicacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUbicacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Agencia_Ubicacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Agencia_Ubicacion_feature", "_UI_Agencia_type"),
				 ModeloagenciaPackage.Literals.AGENCIA__UBICACION,
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
			childrenFeatures.add(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_CLIENTES);
			childrenFeatures.add(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS);
			childrenFeatures.add(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_EXCURSIONES);
			childrenFeatures.add(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_GUIAS);
			childrenFeatures.add(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS);
			childrenFeatures.add(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_VIAJES);
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
	 * This returns Agencia.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Agencia"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Agencia agencia = (Agencia)object;
		return getString("_UI_Agencia_type") + " " + agencia.getId();
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

		switch (notification.getFeatureID(Agencia.class)) {
			case ModeloagenciaPackage.AGENCIA__NOMBRE:
			case ModeloagenciaPackage.AGENCIA__ID:
			case ModeloagenciaPackage.AGENCIA__UBICACION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_CLIENTES:
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS:
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_EXCURSIONES:
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_GUIAS:
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS:
			case ModeloagenciaPackage.AGENCIA__TIENDA_TIENE_VIAJES:
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
				(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_CLIENTES,
				 ModeloagenciaFactory.eINSTANCE.createCliente()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS,
				 ModeloagenciaFactory.eINSTANCE.createDesplazamiento()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_EXCURSIONES,
				 ModeloagenciaFactory.eINSTANCE.createExcursion()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_GUIAS,
				 ModeloagenciaFactory.eINSTANCE.createGuia()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_ALOJAMIENTOS,
				 ModeloagenciaFactory.eINSTANCE.createAlojamiento()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloagenciaPackage.Literals.AGENCIA__TIENDA_TIENE_VIAJES,
				 ModeloagenciaFactory.eINSTANCE.createViaje()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModeloagenciaEditPlugin.INSTANCE;
	}

}
