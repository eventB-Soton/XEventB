/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xeventb.xmachine.serializer;

import ac.soton.eventb.emf.containment.Containment;
import ac.soton.eventb.emf.containment.ContainmentPackage;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.TypedVariable;
import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.InclusionPackage;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.eventb.emf.record.Constraint;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordPackage;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.Variant;
import org.eventb.emf.core.machine.Witness;

@SuppressWarnings("all")
public class XMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XMachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ContainmentPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ContainmentPackage.CONTAINMENT:
				sequence_MContains(context, (Containment) semanticObject); 
				return; 
			}
		else if (epackage == CoreextensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CoreextensionPackage.TYPED_VARIABLE:
				sequence_XIndividualVariable(context, (TypedVariable) semanticObject); 
				return; 
			}
		else if (epackage == InclusionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case InclusionPackage.EVENT_SYNCHRONISATION:
				sequence_EventSync(context, (EventSynchronisation) semanticObject); 
				return; 
			case InclusionPackage.MACHINE_INCLUSION:
				sequence_MIncludes(context, (MachineInclusion) semanticObject); 
				return; 
			}
		else if (epackage == MachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MachinePackage.ACTION:
				sequence_XAction(context, (org.eventb.emf.core.machine.Action) semanticObject); 
				return; 
			case MachinePackage.EVENT:
				sequence_XEvent(context, (Event) semanticObject); 
				return; 
			case MachinePackage.GUARD:
				sequence_XGuard(context, (Guard) semanticObject); 
				return; 
			case MachinePackage.INVARIANT:
				if (rule == grammarAccess.getXIndividualInvariantRule()) {
					sequence_XIndividualInvariant(context, (Invariant) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXMultipleInvariantRule()) {
					sequence_XMultipleInvariant(context, (Invariant) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.MACHINE:
				sequence_Machine(context, (Machine) semanticObject); 
				return; 
			case MachinePackage.PARAMETER:
				sequence_XParameter(context, (org.eventb.emf.core.machine.Parameter) semanticObject); 
				return; 
			case MachinePackage.VARIABLE:
				sequence_XMultipleVariable(context, (Variable) semanticObject); 
				return; 
			case MachinePackage.VARIANT:
				sequence_XVariant(context, (Variant) semanticObject); 
				return; 
			case MachinePackage.WITNESS:
				sequence_XWitness(context, (Witness) semanticObject); 
				return; 
			}
		else if (epackage == RecordPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RecordPackage.CONSTRAINT:
				sequence_XConstraint(context, (Constraint) semanticObject); 
				return; 
			case RecordPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case RecordPackage.RECORD:
				sequence_XRecord(context, (Record) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EventSync returns EventSynchronisation
	 *
	 * Constraint:
	 *     (prefix=ID? synchronisedEvent=[Event|ID])
	 */
	protected void sequence_EventSync(ISerializationContext context, EventSynchronisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (comment=STRING? name=ID multiplicity=Multiplicity? type=XType)
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MContains returns Containment
	 *
	 * Constraint:
	 *     extension=[DiagramOwner|QualifiedName]
	 */
	protected void sequence_MContains(ISerializationContext context, Containment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContainmentPackage.Literals.CONTAINMENT__EXTENSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainmentPackage.Literals.CONTAINMENT__EXTENSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(ContainmentPackage.Literals.CONTAINMENT__EXTENSION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MIncludes returns MachineInclusion
	 *
	 * Constraint:
	 *     (abstractMachine=[Machine|QualifiedName] concreteMachine=[Machine|ID]? (prefixes+=ID prefixes+=ID*)?)
	 */
	protected void sequence_MIncludes(ISerializationContext context, MachineInclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Machine returns Machine
	 *
	 * Constraint:
	 *     (
	 *         comment=STRING? 
	 *         name=ID 
	 *         (orderedChildren+=MIncludes | refines+=[Machine|ID] | sees+=[Context|ID])* 
	 *         orderedChildren+=MContains* 
	 *         orderedChildren+=XMultipleVariable? 
	 *         (
	 *             (
	 *                 orderedChildren+=XIndividualVariable | 
	 *                 orderedChildren+=XMultipleInvariant | 
	 *                 orderedChildren+=XIndividualInvariant | 
	 *                 orderedChildren+=XRecord | 
	 *                 orderedChildren+=XVariant | 
	 *                 orderedChildren+=XEvent
	 *             )? 
	 *             orderedChildren+=XMultipleVariable?
	 *         )* 
	 *         orderedChildren+=XEvent*
	 *     )
	 */
	protected void sequence_Machine(ISerializationContext context, Machine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XAction returns Action
	 *
	 * Constraint:
	 *     (comment=STRING? name=XLABEL action=XFormula)
	 */
	protected void sequence_XAction(ISerializationContext context, org.eventb.emf.core.machine.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XConstraint returns Constraint
	 *
	 * Constraint:
	 *     (comment=STRING? name=XLABEL predicate=XFormula)
	 */
	protected void sequence_XConstraint(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XEvent returns Event
	 *
	 * Constraint:
	 *     (
	 *         comment=STRING? 
	 *         convergence=XConvergence? 
	 *         name=ID 
	 *         (refines+=[Event|ID]+ | (extended?='extends' refines+=[Event|ID]))? 
	 *         orderedChildren+=XParameter* 
	 *         orderedChildren+=EventSync* 
	 *         orderedChildren+=XGuard* 
	 *         orderedChildren+=XAction* 
	 *         orderedChildren+=XWitness*
	 *     )
	 */
	protected void sequence_XEvent(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XGuard returns Guard
	 *
	 * Constraint:
	 *     (comment=STRING? theorem?='theorem'? name=XLABEL predicate=XFormula)
	 */
	protected void sequence_XGuard(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XIndividualInvariant returns Invariant
	 *
	 * Constraint:
	 *     (comment=STRING? theorem?='theorem'? name=XLABEL predicate=XFormula)
	 */
	protected void sequence_XIndividualInvariant(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XIndividualVariable returns TypedVariable
	 *
	 * Constraint:
	 *     (comment=STRING? name=ID type=XType? value=XFormula?)
	 */
	protected void sequence_XIndividualVariable(ISerializationContext context, TypedVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XMultipleInvariant returns Invariant
	 *
	 * Constraint:
	 *     (comment=STRING? name=XLABEL predicate=XFormula)
	 */
	protected void sequence_XMultipleInvariant(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XMultipleVariable returns Variable
	 *
	 * Constraint:
	 *     (comment=STRING? name=ID)
	 */
	protected void sequence_XMultipleVariable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XParameter returns Parameter
	 *
	 * Constraint:
	 *     (comment=STRING? name=ID)
	 */
	protected void sequence_XParameter(ISerializationContext context, org.eventb.emf.core.machine.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XRecord returns Record
	 *
	 * Constraint:
	 *     (
	 *         comment=STRING? 
	 *         (extended?='extended' | extended?='ext' | refined?='refined' | refined?='ref')? 
	 *         name=ID 
	 *         inheritsNames+=ID? 
	 *         (orderedChildren+=Field | orderedChildren+=XConstraint)*
	 *     )
	 */
	protected void sequence_XRecord(ISerializationContext context, Record semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XVariant returns Variant
	 *
	 * Constraint:
	 *     (comment=STRING? name=XLABEL expression=XFormula)
	 */
	protected void sequence_XVariant(ISerializationContext context, Variant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XWitness returns Witness
	 *
	 * Constraint:
	 *     (comment=STRING? name=XLABEL predicate=XFormula)
	 */
	protected void sequence_XWitness(ISerializationContext context, Witness semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
