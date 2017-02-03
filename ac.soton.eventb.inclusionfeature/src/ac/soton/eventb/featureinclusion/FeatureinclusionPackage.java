/**
 */
package ac.soton.eventb.featureinclusion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.CorePackage;

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
 * @see ac.soton.eventb.featureinclusion.FeatureinclusionFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureinclusionPackage extends EPackage {
	/**
	 * Featureinclusion extension ID, assigned to classdiagrams extensions to Event-B,
	 * as well as used by transformation to Event-B.
	 * @custom
	 */
	String FEATUREINCLUSION_EXTENSION_ID = "ac.soton.eventb.featureinclusion";
	
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featureinclusion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/featureinclusion/2017";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featureinclusion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureinclusionPackage eINSTANCE = ac.soton.eventb.featureinclusion.impl.FeatureinclusionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl <em>Machine Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl
	 * @see ac.soton.eventb.featureinclusion.impl.FeatureinclusionPackageImpl#getMachineInclusion()
	 * @generated
	 */
	int MACHINE_INCLUSION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__ANNOTATIONS = CorePackage.ABSTRACT_EXTENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__EXTENSIONS = CorePackage.ABSTRACT_EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__ATTRIBUTES = CorePackage.ABSTRACT_EXTENSION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__REFERENCE = CorePackage.ABSTRACT_EXTENSION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__GENERATED = CorePackage.ABSTRACT_EXTENSION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__LOCAL_GENERATED = CorePackage.ABSTRACT_EXTENSION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__INTERNAL_ID = CorePackage.ABSTRACT_EXTENSION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__EXTENSION_ID = CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;

	/**
	 * The feature id for the '<em><b>Abstract Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__ABSTRACT_MACHINE = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__CONCRETE_MACHINE = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION__PREFIXES = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Machine Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_INCLUSION_FEATURE_COUNT = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.featureinclusion.impl.EventSynchronisationImpl <em>Event Synchronisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.featureinclusion.impl.EventSynchronisationImpl
	 * @see ac.soton.eventb.featureinclusion.impl.FeatureinclusionPackageImpl#getEventSynchronisation()
	 * @generated
	 */
	int EVENT_SYNCHRONISATION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__ANNOTATIONS = CorePackage.ABSTRACT_EXTENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__EXTENSIONS = CorePackage.ABSTRACT_EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__ATTRIBUTES = CorePackage.ABSTRACT_EXTENSION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__REFERENCE = CorePackage.ABSTRACT_EXTENSION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__GENERATED = CorePackage.ABSTRACT_EXTENSION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__LOCAL_GENERATED = CorePackage.ABSTRACT_EXTENSION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__INTERNAL_ID = CorePackage.ABSTRACT_EXTENSION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__EXTENSION_ID = CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;

	/**
	 * The feature id for the '<em><b>Synchronised Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION__PREFIX = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Synchronisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRONISATION_FEATURE_COUNT = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.featureinclusion.MachineInclusion <em>Machine Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Inclusion</em>'.
	 * @see ac.soton.eventb.featureinclusion.MachineInclusion
	 * @generated
	 */
	EClass getMachineInclusion();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.featureinclusion.MachineInclusion#getAbstractMachine <em>Abstract Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Machine</em>'.
	 * @see ac.soton.eventb.featureinclusion.MachineInclusion#getAbstractMachine()
	 * @see #getMachineInclusion()
	 * @generated
	 */
	EReference getMachineInclusion_AbstractMachine();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.featureinclusion.MachineInclusion#getConcreteMachine <em>Concrete Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Machine</em>'.
	 * @see ac.soton.eventb.featureinclusion.MachineInclusion#getConcreteMachine()
	 * @see #getMachineInclusion()
	 * @generated
	 */
	EReference getMachineInclusion_ConcreteMachine();

	/**
	 * Returns the meta object for the attribute list '{@link ac.soton.eventb.featureinclusion.MachineInclusion#getPrefixes <em>Prefixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prefixes</em>'.
	 * @see ac.soton.eventb.featureinclusion.MachineInclusion#getPrefixes()
	 * @see #getMachineInclusion()
	 * @generated
	 */
	EAttribute getMachineInclusion_Prefixes();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.featureinclusion.EventSynchronisation <em>Event Synchronisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Synchronisation</em>'.
	 * @see ac.soton.eventb.featureinclusion.EventSynchronisation
	 * @generated
	 */
	EClass getEventSynchronisation();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.featureinclusion.EventSynchronisation#getSynchronisedEvent <em>Synchronised Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronised Event</em>'.
	 * @see ac.soton.eventb.featureinclusion.EventSynchronisation#getSynchronisedEvent()
	 * @see #getEventSynchronisation()
	 * @generated
	 */
	EReference getEventSynchronisation_SynchronisedEvent();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.featureinclusion.EventSynchronisation#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ac.soton.eventb.featureinclusion.EventSynchronisation#getPrefix()
	 * @see #getEventSynchronisation()
	 * @generated
	 */
	EAttribute getEventSynchronisation_Prefix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureinclusionFactory getFeatureinclusionFactory();

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
		 * The meta object literal for the '{@link ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl <em>Machine Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl
		 * @see ac.soton.eventb.featureinclusion.impl.FeatureinclusionPackageImpl#getMachineInclusion()
		 * @generated
		 */
		EClass MACHINE_INCLUSION = eINSTANCE.getMachineInclusion();

		/**
		 * The meta object literal for the '<em><b>Abstract Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_INCLUSION__ABSTRACT_MACHINE = eINSTANCE.getMachineInclusion_AbstractMachine();

		/**
		 * The meta object literal for the '<em><b>Concrete Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_INCLUSION__CONCRETE_MACHINE = eINSTANCE.getMachineInclusion_ConcreteMachine();

		/**
		 * The meta object literal for the '<em><b>Prefixes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_INCLUSION__PREFIXES = eINSTANCE.getMachineInclusion_Prefixes();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.featureinclusion.impl.EventSynchronisationImpl <em>Event Synchronisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.featureinclusion.impl.EventSynchronisationImpl
		 * @see ac.soton.eventb.featureinclusion.impl.FeatureinclusionPackageImpl#getEventSynchronisation()
		 * @generated
		 */
		EClass EVENT_SYNCHRONISATION = eINSTANCE.getEventSynchronisation();

		/**
		 * The meta object literal for the '<em><b>Synchronised Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT = eINSTANCE.getEventSynchronisation_SynchronisedEvent();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_SYNCHRONISATION__PREFIX = eINSTANCE.getEventSynchronisation_Prefix();

	}

} //FeatureinclusionPackage
