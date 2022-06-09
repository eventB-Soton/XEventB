/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xeventb.xcontext.serializer;

import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XContextSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XContextGrammarAccess grammarAccess;
	protected AbstractElementAlias match_XContext_AxiomsKeyword_5_4_0_q;
	protected AbstractElementAlias match_XContext_ConstantKeyword_5_2_0_0_or_CstKeyword_5_2_0_1;
	protected AbstractElementAlias match_XContext_ConstantsKeyword_5_1_0_q;
	protected AbstractElementAlias match_XContext_SetsKeyword_5_0_0_q;
	protected AbstractElementAlias match_XIndividualAxiom_AxiomKeyword_2_1_0_or_AxmKeyword_2_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XContextGrammarAccess) access;
		match_XContext_AxiomsKeyword_5_4_0_q = new TokenAlias(false, true, grammarAccess.getXContextAccess().getAxiomsKeyword_5_4_0());
		match_XContext_ConstantKeyword_5_2_0_0_or_CstKeyword_5_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXContextAccess().getConstantKeyword_5_2_0_0()), new TokenAlias(false, false, grammarAccess.getXContextAccess().getCstKeyword_5_2_0_1()));
		match_XContext_ConstantsKeyword_5_1_0_q = new TokenAlias(false, true, grammarAccess.getXContextAccess().getConstantsKeyword_5_1_0());
		match_XContext_SetsKeyword_5_0_0_q = new TokenAlias(false, true, grammarAccess.getXContextAccess().getSetsKeyword_5_0_0());
		match_XIndividualAxiom_AxiomKeyword_2_1_0_or_AxmKeyword_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXIndividualAxiomAccess().getAxiomKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getXIndividualAxiomAccess().getAxmKeyword_2_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_XContext_AxiomsKeyword_5_4_0_q.equals(syntax))
				emit_XContext_AxiomsKeyword_5_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XContext_ConstantKeyword_5_2_0_0_or_CstKeyword_5_2_0_1.equals(syntax))
				emit_XContext_ConstantKeyword_5_2_0_0_or_CstKeyword_5_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XContext_ConstantsKeyword_5_1_0_q.equals(syntax))
				emit_XContext_ConstantsKeyword_5_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XContext_SetsKeyword_5_0_0_q.equals(syntax))
				emit_XContext_SetsKeyword_5_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XIndividualAxiom_AxiomKeyword_2_1_0_or_AxmKeyword_2_1_1.equals(syntax))
				emit_XIndividualAxiom_AxiomKeyword_2_1_0_or_AxmKeyword_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'axioms'?
	 *
	 * This ambiguous syntax occurs at:
	 *     orderedChildren+=XAxiom (ambiguity) orderedChildren+=XAxiom
	 */
	protected void emit_XContext_AxiomsKeyword_5_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'constant' | 'cst'
	 *
	 * This ambiguous syntax occurs at:
	 *     extends+=[Context|QualifiedName] (ambiguity) orderedChildren+=XTypedConstant
	 *     name=ID (ambiguity) orderedChildren+=XTypedConstant
	 *     orderedChildren+=XAxiom (ambiguity) orderedChildren+=XTypedConstant
	 *     orderedChildren+=XCarrierSet (ambiguity) orderedChildren+=XTypedConstant
	 *     orderedChildren+=XConstant (ambiguity) orderedChildren+=XTypedConstant
	 *     orderedChildren+=XIndividualAxiom (ambiguity) orderedChildren+=XTypedConstant
	 *     orderedChildren+=XRecord (ambiguity) orderedChildren+=XTypedConstant
	 *     orderedChildren+=XTypedConstant (ambiguity) orderedChildren+=XTypedConstant
	 */
	protected void emit_XContext_ConstantKeyword_5_2_0_0_or_CstKeyword_5_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'constants'?
	 *
	 * This ambiguous syntax occurs at:
	 *     orderedChildren+=XConstant (ambiguity) orderedChildren+=XConstant
	 */
	protected void emit_XContext_ConstantsKeyword_5_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'sets'?
	 *
	 * This ambiguous syntax occurs at:
	 *     orderedChildren+=XCarrierSet (ambiguity) orderedChildren+=XCarrierSet
	 */
	protected void emit_XContext_SetsKeyword_5_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'axiom' | 'axm'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=XLABEL
	 *     comment=STRING (ambiguity) name=XLABEL
	 */
	protected void emit_XIndividualAxiom_AxiomKeyword_2_1_0_or_AxmKeyword_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
