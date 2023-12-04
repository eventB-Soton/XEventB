/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xeventb.xmachine.ide.contentassist.antlr;

import ac.soton.xeventb.xmachine.ide.contentassist.antlr.internal.InternalXMachineParser;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class XMachineParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(XMachineGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XMachineGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMachineAccess().getAlternatives_6(), "rule__Machine__Alternatives_6");
			builder.put(grammarAccess.getMachineAccess().getAlternatives_6_0_0(), "rule__Machine__Alternatives_6_0_0");
			builder.put(grammarAccess.getMachineAccess().getAlternatives_6_2_0(), "rule__Machine__Alternatives_6_2_0");
			builder.put(grammarAccess.getXIndividualVariableAccess().getAlternatives_2(), "rule__XIndividualVariable__Alternatives_2");
			builder.put(grammarAccess.getXTYPEOPERATORAccess().getAlternatives(), "rule__XTYPEOPERATOR__Alternatives");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getAlternatives(), "rule__XTypePrimitive__Alternatives");
			builder.put(grammarAccess.getXIndividualInvariantAccess().getAlternatives_2(), "rule__XIndividualInvariant__Alternatives_2");
			builder.put(grammarAccess.getXEventAccess().getAlternatives_5(), "rule__XEvent__Alternatives_5");
			builder.put(grammarAccess.getXEventAccess().getAlternatives_8_0(), "rule__XEvent__Alternatives_8_0");
			builder.put(grammarAccess.getXEventAccess().getAlternatives_9_0(), "rule__XEvent__Alternatives_9_0");
			builder.put(grammarAccess.getXFormulaAccess().getAlternatives(), "rule__XFormula__Alternatives");
			builder.put(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives(), "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives");
			builder.put(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getXRecordAccess().getAlternatives_2(), "rule__XRecord__Alternatives_2");
			builder.put(grammarAccess.getXRecordAccess().getExtendedAlternatives_2_0_0(), "rule__XRecord__ExtendedAlternatives_2_0_0");
			builder.put(grammarAccess.getXRecordAccess().getRefinedAlternatives_2_1_0(), "rule__XRecord__RefinedAlternatives_2_1_0");
			builder.put(grammarAccess.getXRecordAccess().getAlternatives_3(), "rule__XRecord__Alternatives_3");
			builder.put(grammarAccess.getXRecordAccess().getAlternatives_5_0(), "rule__XRecord__Alternatives_5_0");
			builder.put(grammarAccess.getXRecordAccess().getAlternatives_6(), "rule__XRecord__Alternatives_6");
			builder.put(grammarAccess.getXRecordAccess().getAlternatives_6_0_0(), "rule__XRecord__Alternatives_6_0_0");
			builder.put(grammarAccess.getXConvergenceAccess().getAlternatives(), "rule__XConvergence__Alternatives");
			builder.put(grammarAccess.getMultiplicityAccess().getAlternatives(), "rule__Multiplicity__Alternatives");
			builder.put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_4_1(), "rule__Machine__Group_4_1__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_4_2(), "rule__Machine__Group_4_2__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_5(), "rule__Machine__Group_5__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_6_0(), "rule__Machine__Group_6_0__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_6_2(), "rule__Machine__Group_6_2__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_7(), "rule__Machine__Group_7__0");
			builder.put(grammarAccess.getMContainsAccess().getGroup(), "rule__MContains__Group__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup(), "rule__MIncludes__Group__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup_1(), "rule__MIncludes__Group_1__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup_2(), "rule__MIncludes__Group_2__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup_3(), "rule__MIncludes__Group_3__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getXMultipleVariableAccess().getGroup(), "rule__XMultipleVariable__Group__0");
			builder.put(grammarAccess.getXIndividualVariableAccess().getGroup(), "rule__XIndividualVariable__Group__0");
			builder.put(grammarAccess.getXIndividualVariableAccess().getGroup_4(), "rule__XIndividualVariable__Group_4__0");
			builder.put(grammarAccess.getXIndividualVariableAccess().getGroup_5(), "rule__XIndividualVariable__Group_5__0");
			builder.put(grammarAccess.getXTypeAccess().getGroup(), "rule__XType__Group__0");
			builder.put(grammarAccess.getXTypeAccess().getGroup_1(), "rule__XType__Group_1__0");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getGroup_5(), "rule__XTypePrimitive__Group_5__0");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getGroup_6(), "rule__XTypePrimitive__Group_6__0");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getGroup_7(), "rule__XTypePrimitive__Group_7__0");
			builder.put(grammarAccess.getXMultipleInvariantAccess().getGroup(), "rule__XMultipleInvariant__Group__0");
			builder.put(grammarAccess.getXIndividualInvariantAccess().getGroup(), "rule__XIndividualInvariant__Group__0");
			builder.put(grammarAccess.getXVariantAccess().getGroup(), "rule__XVariant__Group__0");
			builder.put(grammarAccess.getXEventAccess().getGroup(), "rule__XEvent__Group__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_5_0(), "rule__XEvent__Group_5_0__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_5_1(), "rule__XEvent__Group_5_1__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_6(), "rule__XEvent__Group_6__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_8(), "rule__XEvent__Group_8__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_9(), "rule__XEvent__Group_9__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_10(), "rule__XEvent__Group_10__0");
			builder.put(grammarAccess.getEventSyncAccess().getGroup(), "rule__EventSync__Group__0");
			builder.put(grammarAccess.getEventSyncAccess().getGroup_1(), "rule__EventSync__Group_1__0");
			builder.put(grammarAccess.getEventSyncAccess().getGroup_1_1(), "rule__EventSync__Group_1_1__0");
			builder.put(grammarAccess.getXParameterAccess().getGroup(), "rule__XParameter__Group__0");
			builder.put(grammarAccess.getXGuardAccess().getGroup(), "rule__XGuard__Group__0");
			builder.put(grammarAccess.getXWitnessAccess().getGroup(), "rule__XWitness__Group__0");
			builder.put(grammarAccess.getXActionAccess().getGroup(), "rule__XAction__Group__0");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_59(), "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup(), "rule__XRecord__Group__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup_5(), "rule__XRecord__Group_5__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup_6_0(), "rule__XRecord__Group_6_0__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup_6_1(), "rule__XRecord__Group_6_1__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getXConstraintAccess().getGroup(), "rule__XConstraint__Group__0");
			builder.put(grammarAccess.getMachineAccess().getCommentAssignment_1(), "rule__Machine__CommentAssignment_1");
			builder.put(grammarAccess.getMachineAccess().getNameAssignment_3(), "rule__Machine__NameAssignment_3");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0(), "rule__Machine__OrderedChildrenAssignment_4_0");
			builder.put(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1(), "rule__Machine__RefinesAssignment_4_1_1");
			builder.put(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1(), "rule__Machine__SeesAssignment_4_2_1");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1(), "rule__Machine__OrderedChildrenAssignment_5_1");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1(), "rule__Machine__OrderedChildrenAssignment_6_0_1");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_1(), "rule__Machine__OrderedChildrenAssignment_6_1");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1(), "rule__Machine__OrderedChildrenAssignment_6_2_1");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_3(), "rule__Machine__OrderedChildrenAssignment_6_3");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_4(), "rule__Machine__OrderedChildrenAssignment_6_4");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_5(), "rule__Machine__OrderedChildrenAssignment_6_5");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_6(), "rule__Machine__OrderedChildrenAssignment_6_6");
			builder.put(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1(), "rule__Machine__OrderedChildrenAssignment_7_1");
			builder.put(grammarAccess.getMContainsAccess().getExtensionAssignment_1(), "rule__MContains__ExtensionAssignment_1");
			builder.put(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1(), "rule__MIncludes__AbstractMachineAssignment_1_1");
			builder.put(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1(), "rule__MIncludes__ConcreteMachineAssignment_2_1");
			builder.put(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1(), "rule__MIncludes__PrefixesAssignment_3_1");
			builder.put(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2(), "rule__MIncludes__PrefixesAssignment_3_2");
			builder.put(grammarAccess.getXMultipleVariableAccess().getCommentAssignment_1(), "rule__XMultipleVariable__CommentAssignment_1");
			builder.put(grammarAccess.getXMultipleVariableAccess().getNameAssignment_2(), "rule__XMultipleVariable__NameAssignment_2");
			builder.put(grammarAccess.getXIndividualVariableAccess().getCommentAssignment_1(), "rule__XIndividualVariable__CommentAssignment_1");
			builder.put(grammarAccess.getXIndividualVariableAccess().getNameAssignment_3(), "rule__XIndividualVariable__NameAssignment_3");
			builder.put(grammarAccess.getXIndividualVariableAccess().getTypeAssignment_4_1(), "rule__XIndividualVariable__TypeAssignment_4_1");
			builder.put(grammarAccess.getXIndividualVariableAccess().getValueAssignment_5_1(), "rule__XIndividualVariable__ValueAssignment_5_1");
			builder.put(grammarAccess.getXMultipleInvariantAccess().getCommentAssignment_1(), "rule__XMultipleInvariant__CommentAssignment_1");
			builder.put(grammarAccess.getXMultipleInvariantAccess().getNameAssignment_2(), "rule__XMultipleInvariant__NameAssignment_2");
			builder.put(grammarAccess.getXMultipleInvariantAccess().getPredicateAssignment_3(), "rule__XMultipleInvariant__PredicateAssignment_3");
			builder.put(grammarAccess.getXIndividualInvariantAccess().getCommentAssignment_1(), "rule__XIndividualInvariant__CommentAssignment_1");
			builder.put(grammarAccess.getXIndividualInvariantAccess().getTheoremAssignment_2_0(), "rule__XIndividualInvariant__TheoremAssignment_2_0");
			builder.put(grammarAccess.getXIndividualInvariantAccess().getNameAssignment_3(), "rule__XIndividualInvariant__NameAssignment_3");
			builder.put(grammarAccess.getXIndividualInvariantAccess().getPredicateAssignment_4(), "rule__XIndividualInvariant__PredicateAssignment_4");
			builder.put(grammarAccess.getXVariantAccess().getCommentAssignment_1(), "rule__XVariant__CommentAssignment_1");
			builder.put(grammarAccess.getXVariantAccess().getNameAssignment_3(), "rule__XVariant__NameAssignment_3");
			builder.put(grammarAccess.getXVariantAccess().getExpressionAssignment_4(), "rule__XVariant__ExpressionAssignment_4");
			builder.put(grammarAccess.getXEventAccess().getCommentAssignment_1(), "rule__XEvent__CommentAssignment_1");
			builder.put(grammarAccess.getXEventAccess().getConvergenceAssignment_2(), "rule__XEvent__ConvergenceAssignment_2");
			builder.put(grammarAccess.getXEventAccess().getNameAssignment_4(), "rule__XEvent__NameAssignment_4");
			builder.put(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1(), "rule__XEvent__RefinesAssignment_5_0_1");
			builder.put(grammarAccess.getXEventAccess().getExtendedAssignment_5_1_0(), "rule__XEvent__ExtendedAssignment_5_1_0");
			builder.put(grammarAccess.getXEventAccess().getRefinesAssignment_5_1_1(), "rule__XEvent__RefinesAssignment_5_1_1");
			builder.put(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1(), "rule__XEvent__OrderedChildrenAssignment_6_1");
			builder.put(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_7(), "rule__XEvent__OrderedChildrenAssignment_7");
			builder.put(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1(), "rule__XEvent__OrderedChildrenAssignment_8_1");
			builder.put(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1(), "rule__XEvent__OrderedChildrenAssignment_9_1");
			builder.put(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1(), "rule__XEvent__OrderedChildrenAssignment_10_1");
			builder.put(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0(), "rule__EventSync__PrefixAssignment_1_1_0");
			builder.put(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2(), "rule__EventSync__SynchronisedEventAssignment_1_2");
			builder.put(grammarAccess.getXParameterAccess().getCommentAssignment_1(), "rule__XParameter__CommentAssignment_1");
			builder.put(grammarAccess.getXParameterAccess().getNameAssignment_2(), "rule__XParameter__NameAssignment_2");
			builder.put(grammarAccess.getXGuardAccess().getCommentAssignment_1(), "rule__XGuard__CommentAssignment_1");
			builder.put(grammarAccess.getXGuardAccess().getTheoremAssignment_2(), "rule__XGuard__TheoremAssignment_2");
			builder.put(grammarAccess.getXGuardAccess().getNameAssignment_3(), "rule__XGuard__NameAssignment_3");
			builder.put(grammarAccess.getXGuardAccess().getPredicateAssignment_4(), "rule__XGuard__PredicateAssignment_4");
			builder.put(grammarAccess.getXWitnessAccess().getCommentAssignment_1(), "rule__XWitness__CommentAssignment_1");
			builder.put(grammarAccess.getXWitnessAccess().getNameAssignment_2(), "rule__XWitness__NameAssignment_2");
			builder.put(grammarAccess.getXWitnessAccess().getPredicateAssignment_3(), "rule__XWitness__PredicateAssignment_3");
			builder.put(grammarAccess.getXActionAccess().getCommentAssignment_1(), "rule__XAction__CommentAssignment_1");
			builder.put(grammarAccess.getXActionAccess().getNameAssignment_2(), "rule__XAction__NameAssignment_2");
			builder.put(grammarAccess.getXActionAccess().getActionAssignment_3(), "rule__XAction__ActionAssignment_3");
			builder.put(grammarAccess.getXRecordAccess().getCommentAssignment_1(), "rule__XRecord__CommentAssignment_1");
			builder.put(grammarAccess.getXRecordAccess().getExtendedAssignment_2_0(), "rule__XRecord__ExtendedAssignment_2_0");
			builder.put(grammarAccess.getXRecordAccess().getRefinedAssignment_2_1(), "rule__XRecord__RefinedAssignment_2_1");
			builder.put(grammarAccess.getXRecordAccess().getNameAssignment_4(), "rule__XRecord__NameAssignment_4");
			builder.put(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_5_1(), "rule__XRecord__InheritsNamesAssignment_5_1");
			builder.put(grammarAccess.getXRecordAccess().getOrderedChildrenAssignment_6_0_1(), "rule__XRecord__OrderedChildrenAssignment_6_0_1");
			builder.put(grammarAccess.getXRecordAccess().getOrderedChildrenAssignment_6_1_1(), "rule__XRecord__OrderedChildrenAssignment_6_1_1");
			builder.put(grammarAccess.getFieldAccess().getCommentAssignment_1(), "rule__Field__CommentAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_2(), "rule__Field__NameAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getMultiplicityAssignment_4(), "rule__Field__MultiplicityAssignment_4");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_5(), "rule__Field__TypeAssignment_5");
			builder.put(grammarAccess.getXConstraintAccess().getCommentAssignment_1(), "rule__XConstraint__CommentAssignment_1");
			builder.put(grammarAccess.getXConstraintAccess().getNameAssignment_2(), "rule__XConstraint__NameAssignment_2");
			builder.put(grammarAccess.getXConstraintAccess().getPredicateAssignment_3(), "rule__XConstraint__PredicateAssignment_3");
			builder.put(grammarAccess.getMachineAccess().getUnorderedGroup_4(), "rule__Machine__UnorderedGroup_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private XMachineGrammarAccess grammarAccess;

	@Override
	protected InternalXMachineParser createParser() {
		InternalXMachineParser result = new InternalXMachineParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public XMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
