/**
 */
package ac.soton.eventb.featureinclusion;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.AbstractExtension;

import org.eventb.emf.core.machine.Machine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.featureinclusion.MachineInclusion#getAbstractMachine <em>Abstract Machine</em>}</li>
 *   <li>{@link ac.soton.eventb.featureinclusion.MachineInclusion#getConcreteMachine <em>Concrete Machine</em>}</li>
 *   <li>{@link ac.soton.eventb.featureinclusion.MachineInclusion#getPrefixes <em>Prefixes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#getMachineInclusion()
 * @model
 * @generated
 */
public interface MachineInclusion extends AbstractExtension {
	/**
	 * Returns the value of the '<em><b>Abstract Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Machine</em>' reference.
	 * @see #setAbstractMachine(Machine)
	 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#getMachineInclusion_AbstractMachine()
	 * @model
	 * @generated
	 */
	Machine getAbstractMachine();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.featureinclusion.MachineInclusion#getAbstractMachine <em>Abstract Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Machine</em>' reference.
	 * @see #getAbstractMachine()
	 * @generated
	 */
	void setAbstractMachine(Machine value);

	/**
	 * Returns the value of the '<em><b>Concrete Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Machine</em>' reference.
	 * @see #setConcreteMachine(Machine)
	 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#getMachineInclusion_ConcreteMachine()
	 * @model
	 * @generated
	 */
	Machine getConcreteMachine();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.featureinclusion.MachineInclusion#getConcreteMachine <em>Concrete Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Machine</em>' reference.
	 * @see #getConcreteMachine()
	 * @generated
	 */
	void setConcreteMachine(Machine value);

	/**
	 * Returns the value of the '<em><b>Prefixes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefixes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefixes</em>' attribute list.
	 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#getMachineInclusion_Prefixes()
	 * @model
	 * @generated
	 */
	EList<String> getPrefixes();

} // MachineInclusion
