/**
 */
package ac.soton.eventb.featureinclusion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage
 * @generated
 */
public interface FeatureinclusionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureinclusionFactory eINSTANCE = ac.soton.eventb.featureinclusion.impl.FeatureinclusionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Machine Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Inclusion</em>'.
	 * @generated
	 */
	MachineInclusion createMachineInclusion();

	/**
	 * Returns a new object of class '<em>Event Synchronisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Synchronisation</em>'.
	 * @generated
	 */
	EventSynchronisation createEventSynchronisation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureinclusionPackage getFeatureinclusionPackage();

} //FeatureinclusionFactory
