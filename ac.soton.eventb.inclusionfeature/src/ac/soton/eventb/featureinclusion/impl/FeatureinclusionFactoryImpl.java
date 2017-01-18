/**
 */
package ac.soton.eventb.featureinclusion.impl;

import ac.soton.eventb.featureinclusion.*;

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
public class FeatureinclusionFactoryImpl extends EFactoryImpl implements FeatureinclusionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureinclusionFactory init() {
		try {
			FeatureinclusionFactory theFeatureinclusionFactory = (FeatureinclusionFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureinclusionPackage.eNS_URI);
			if (theFeatureinclusionFactory != null) {
				return theFeatureinclusionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureinclusionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureinclusionFactoryImpl() {
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
			case FeatureinclusionPackage.MACHINE_INCLUSION: return createMachineInclusion();
			case FeatureinclusionPackage.EVENT_SYNCHRONISATION: return createEventSynchronisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineInclusion createMachineInclusion() {
		MachineInclusionImpl machineInclusion = new MachineInclusionImpl();
		return machineInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSynchronisation createEventSynchronisation() {
		EventSynchronisationImpl eventSynchronisation = new EventSynchronisationImpl();
		return eventSynchronisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureinclusionPackage getFeatureinclusionPackage() {
		return (FeatureinclusionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeatureinclusionPackage getPackage() {
		return FeatureinclusionPackage.eINSTANCE;
	}

} //FeatureinclusionFactoryImpl
