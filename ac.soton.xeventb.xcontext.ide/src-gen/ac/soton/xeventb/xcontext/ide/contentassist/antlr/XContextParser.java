/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xeventb.xcontext.ide.contentassist.antlr;

import ac.soton.xeventb.xcontext.ide.contentassist.antlr.internal.InternalXContextParser;
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class XContextParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(XContextGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XContextGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getXContextAccess().getAlternatives_5(), "rule__XContext__Alternatives_5");
			builder.put(grammarAccess.getXContextAccess().getAlternatives_5_2_0(), "rule__XContext__Alternatives_5_2_0");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getAlternatives_2(), "rule__XIndividualAxiom__Alternatives_2");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getTheoremAlternatives_2_0_0(), "rule__XIndividualAxiom__TheoremAlternatives_2_0_0");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getAlternatives_2_1(), "rule__XIndividualAxiom__Alternatives_2_1");
			builder.put(grammarAccess.getXFormulaAccess().getAlternatives(), "rule__XFormula__Alternatives");
			builder.put(grammarAccess.getXTYPEOPERATORAccess().getAlternatives(), "rule__XTYPEOPERATOR__Alternatives");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getAlternatives(), "rule__XTypePrimitive__Alternatives");
			builder.put(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives(), "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives");
			builder.put(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getXRecordAccess().getAlternatives_5(), "rule__XRecord__Alternatives_5");
			builder.put(grammarAccess.getFieldTypeAccess().getAlternatives(), "rule__FieldType__Alternatives");
			builder.put(grammarAccess.getMultiplicityAccess().getAlternatives(), "rule__Multiplicity__Alternatives");
			builder.put(grammarAccess.getXContextAccess().getGroup(), "rule__XContext__Group__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_4(), "rule__XContext__Group_4__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_5_0(), "rule__XContext__Group_5_0__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_5_1(), "rule__XContext__Group_5_1__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_5_2(), "rule__XContext__Group_5_2__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_5_4(), "rule__XContext__Group_5_4__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getXCarrierSetAccess().getGroup(), "rule__XCarrierSet__Group__0");
			builder.put(grammarAccess.getXConstantAccess().getGroup(), "rule__XConstant__Group__0");
			builder.put(grammarAccess.getXTypedConstantAccess().getGroup(), "rule__XTypedConstant__Group__0");
			builder.put(grammarAccess.getXTypedConstantAccess().getGroup_3(), "rule__XTypedConstant__Group_3__0");
			builder.put(grammarAccess.getXTypedConstantAccess().getGroup_4(), "rule__XTypedConstant__Group_4__0");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getGroup(), "rule__XIndividualAxiom__Group__0");
			builder.put(grammarAccess.getXAxiomAccess().getGroup(), "rule__XAxiom__Group__0");
			builder.put(grammarAccess.getXTypeAccess().getGroup(), "rule__XType__Group__0");
			builder.put(grammarAccess.getXTypeAccess().getGroup_1(), "rule__XType__Group_1__0");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getGroup_5(), "rule__XTypePrimitive__Group_5__0");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getGroup_6(), "rule__XTypePrimitive__Group_6__0");
			builder.put(grammarAccess.getXTypePrimitiveAccess().getGroup_7(), "rule__XTypePrimitive__Group_7__0");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32(), "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup(), "rule__XRecord__Group__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup_4(), "rule__XRecord__Group_4__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup_5_0(), "rule__XRecord__Group_5_0__0");
			builder.put(grammarAccess.getXRecordAccess().getGroup_5_1(), "rule__XRecord__Group_5_1__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getXConstraintAccess().getGroup(), "rule__XConstraint__Group__0");
			builder.put(grammarAccess.getXContextAccess().getCommentAssignment_1(), "rule__XContext__CommentAssignment_1");
			builder.put(grammarAccess.getXContextAccess().getNameAssignment_3(), "rule__XContext__NameAssignment_3");
			builder.put(grammarAccess.getXContextAccess().getExtendsAssignment_4_1(), "rule__XContext__ExtendsAssignment_4_1");
			builder.put(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_0_1(), "rule__XContext__OrderedChildrenAssignment_5_0_1");
			builder.put(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_1_1(), "rule__XContext__OrderedChildrenAssignment_5_1_1");
			builder.put(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_2_1(), "rule__XContext__OrderedChildrenAssignment_5_2_1");
			builder.put(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_3(), "rule__XContext__OrderedChildrenAssignment_5_3");
			builder.put(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_4_1(), "rule__XContext__OrderedChildrenAssignment_5_4_1");
			builder.put(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_5(), "rule__XContext__OrderedChildrenAssignment_5_5");
			builder.put(grammarAccess.getXCarrierSetAccess().getCommentAssignment_1(), "rule__XCarrierSet__CommentAssignment_1");
			builder.put(grammarAccess.getXCarrierSetAccess().getNameAssignment_2(), "rule__XCarrierSet__NameAssignment_2");
			builder.put(grammarAccess.getXConstantAccess().getCommentAssignment_1(), "rule__XConstant__CommentAssignment_1");
			builder.put(grammarAccess.getXConstantAccess().getNameAssignment_2(), "rule__XConstant__NameAssignment_2");
			builder.put(grammarAccess.getXTypedConstantAccess().getCommentAssignment_1(), "rule__XTypedConstant__CommentAssignment_1");
			builder.put(grammarAccess.getXTypedConstantAccess().getNameAssignment_2(), "rule__XTypedConstant__NameAssignment_2");
			builder.put(grammarAccess.getXTypedConstantAccess().getTypeAssignment_3_1(), "rule__XTypedConstant__TypeAssignment_3_1");
			builder.put(grammarAccess.getXTypedConstantAccess().getValueAssignment_4_1(), "rule__XTypedConstant__ValueAssignment_4_1");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getCommentAssignment_1(), "rule__XIndividualAxiom__CommentAssignment_1");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getTheoremAssignment_2_0(), "rule__XIndividualAxiom__TheoremAssignment_2_0");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getNameAssignment_3(), "rule__XIndividualAxiom__NameAssignment_3");
			builder.put(grammarAccess.getXIndividualAxiomAccess().getPredicateAssignment_4(), "rule__XIndividualAxiom__PredicateAssignment_4");
			builder.put(grammarAccess.getXAxiomAccess().getCommentAssignment_1(), "rule__XAxiom__CommentAssignment_1");
			builder.put(grammarAccess.getXAxiomAccess().getNameAssignment_2(), "rule__XAxiom__NameAssignment_2");
			builder.put(grammarAccess.getXAxiomAccess().getPredicateAssignment_3(), "rule__XAxiom__PredicateAssignment_3");
			builder.put(grammarAccess.getXRecordAccess().getExtendedAssignment_1(), "rule__XRecord__ExtendedAssignment_1");
			builder.put(grammarAccess.getXRecordAccess().getNameAssignment_3(), "rule__XRecord__NameAssignment_3");
			builder.put(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_4_1(), "rule__XRecord__InheritsNamesAssignment_4_1");
			builder.put(grammarAccess.getXRecordAccess().getFieldsAssignment_5_0_1(), "rule__XRecord__FieldsAssignment_5_0_1");
			builder.put(grammarAccess.getXRecordAccess().getConstraintsAssignment_5_1_1(), "rule__XRecord__ConstraintsAssignment_5_1_1");
			builder.put(grammarAccess.getFieldAccess().getCommentAssignment_1(), "rule__Field__CommentAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_2(), "rule__Field__NameAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getMultiplicityAssignment_4(), "rule__Field__MultiplicityAssignment_4");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_5(), "rule__Field__TypeAssignment_5");
			builder.put(grammarAccess.getXConstraintAccess().getCommentAssignment_1(), "rule__XConstraint__CommentAssignment_1");
			builder.put(grammarAccess.getXConstraintAccess().getNameAssignment_2(), "rule__XConstraint__NameAssignment_2");
			builder.put(grammarAccess.getXConstraintAccess().getPredicateAssignment_3(), "rule__XConstraint__PredicateAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private XContextGrammarAccess grammarAccess;

	@Override
	protected InternalXContextParser createParser() {
		InternalXContextParser result = new InternalXContextParser(null);
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

	public XContextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XContextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
