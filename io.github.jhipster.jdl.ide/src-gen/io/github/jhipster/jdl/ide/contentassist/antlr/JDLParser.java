/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.ide.contentassist.antlr;

import com.google.inject.Inject;
import io.github.jhipster.jdl.ide.contentassist.antlr.internal.InternalJDLParser;
import io.github.jhipster.jdl.services.JDLGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class JDLParser extends AbstractContentAssistParser {

	@Inject
	private JDLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalJDLParser createParser() {
		InternalJDLParser result = new InternalJDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getJdlFeatureAccess().getAlternatives(), "rule__JdlFeature__Alternatives");
					put(grammarAccess.getJdlFieldTypeAccess().getAlternatives(), "rule__JdlFieldType__Alternatives");
					put(grammarAccess.getJdlDateFieldAccess().getAlternatives_0(), "rule__JdlDateField__Alternatives_0");
					put(grammarAccess.getJdlGenerationSettingTypeAccess().getAlternatives(), "rule__JdlGenerationSettingType__Alternatives");
					put(grammarAccess.getJdlEntityInclusionAccess().getAlternatives_0(), "rule__JdlEntityInclusion__Alternatives_0");
					put(grammarAccess.getJdlWildcardPredicateAccess().getAlternatives(), "rule__JdlWildcardPredicate__Alternatives");
					put(grammarAccess.getJdlPaginateTypeAccess().getAlternatives(), "rule__JdlPaginateType__Alternatives");
					put(grammarAccess.getJdlPaginateTypeAccess().getPaginationAlternatives_0_0(), "rule__JdlPaginateType__PaginationAlternatives_0_0");
					put(grammarAccess.getJdlNumericFieldTypeAccess().getAlternatives(), "rule__JdlNumericFieldType__Alternatives");
					put(grammarAccess.getJdlBlobFieldTypeAccess().getAlternatives(), "rule__JdlBlobFieldType__Alternatives");
					put(grammarAccess.getJdlCardinalityAccess().getAlternatives(), "rule__JdlCardinality__Alternatives");
					put(grammarAccess.getJdlServiceTypeAccess().getAlternatives(), "rule__JdlServiceType__Alternatives");
					put(grammarAccess.getJdlEntityAccess().getGroup(), "rule__JdlEntity__Group__0");
					put(grammarAccess.getJdlEntityAccess().getGroup_2(), "rule__JdlEntity__Group_2__0");
					put(grammarAccess.getJdlEntityAccess().getGroup_2_1(), "rule__JdlEntity__Group_2_1__0");
					put(grammarAccess.getJdlEntityAccess().getGroup_2_1_1(), "rule__JdlEntity__Group_2_1_1__0");
					put(grammarAccess.getJdlEntityFieldAccess().getGroup(), "rule__JdlEntityField__Group__0");
					put(grammarAccess.getJdlEnumFieldAccess().getGroup(), "rule__JdlEnumField__Group__0");
					put(grammarAccess.getJdlStringFieldAccess().getGroup(), "rule__JdlStringField__Group__0");
					put(grammarAccess.getJdlNumericFieldAccess().getGroup(), "rule__JdlNumericField__Group__0");
					put(grammarAccess.getJdlBooleanFieldAccess().getGroup(), "rule__JdlBooleanField__Group__0");
					put(grammarAccess.getJdlDateFieldAccess().getGroup(), "rule__JdlDateField__Group__0");
					put(grammarAccess.getJdlBlobFieldAccess().getGroup(), "rule__JdlBlobField__Group__0");
					put(grammarAccess.getJdlStringValidatorsAccess().getGroup(), "rule__JdlStringValidators__Group__0");
					put(grammarAccess.getJdlNumericValidatorsAccess().getGroup(), "rule__JdlNumericValidators__Group__0");
					put(grammarAccess.getJdlBlobValidatorsAccess().getGroup(), "rule__JdlBlobValidators__Group__0");
					put(grammarAccess.getJdlMinLengthValidatorAccess().getGroup(), "rule__JdlMinLengthValidator__Group__0");
					put(grammarAccess.getJdlMaxLengthValidatorAccess().getGroup(), "rule__JdlMaxLengthValidator__Group__0");
					put(grammarAccess.getJdlPatternValidatorAccess().getGroup(), "rule__JdlPatternValidator__Group__0");
					put(grammarAccess.getJdlMinValidatorAccess().getGroup(), "rule__JdlMinValidator__Group__0");
					put(grammarAccess.getJdlMaxValidatorAccess().getGroup(), "rule__JdlMaxValidator__Group__0");
					put(grammarAccess.getJdlMinBytesValidatorAccess().getGroup(), "rule__JdlMinBytesValidator__Group__0");
					put(grammarAccess.getJdlMaxBytesValidatorAccess().getGroup(), "rule__JdlMaxBytesValidator__Group__0");
					put(grammarAccess.getJdlRelationshipsAccess().getGroup(), "rule__JdlRelationships__Group__0");
					put(grammarAccess.getJdlRelationshipsAccess().getGroup_4(), "rule__JdlRelationships__Group_4__0");
					put(grammarAccess.getJdlRelationshipAccess().getGroup(), "rule__JdlRelationship__Group__0");
					put(grammarAccess.getJdlRelationshipNameAccess().getGroup(), "rule__JdlRelationshipName__Group__0");
					put(grammarAccess.getJdlRelationshipNameAccess().getGroup_2(), "rule__JdlRelationshipName__Group_2__0");
					put(grammarAccess.getJdlEnumTypeAccess().getGroup(), "rule__JdlEnumType__Group__0");
					put(grammarAccess.getJdlEnumTypeAccess().getGroup_4(), "rule__JdlEnumType__Group_4__0");
					put(grammarAccess.getJdlGenerationSettingAccess().getGroup(), "rule__JdlGenerationSetting__Group__0");
					put(grammarAccess.getJdlServiceGenerationSettingAccess().getGroup(), "rule__JdlServiceGenerationSetting__Group__0");
					put(grammarAccess.getJdlMicroserviceGenerationSettingAccess().getGroup(), "rule__JdlMicroserviceGenerationSetting__Group__0");
					put(grammarAccess.getJdlSearchGenerationSettingAccess().getGroup(), "rule__JdlSearchGenerationSetting__Group__0");
					put(grammarAccess.getJdlDtoGenerationSettingAccess().getGroup(), "rule__JdlDtoGenerationSetting__Group__0");
					put(grammarAccess.getJdlPaginateGenerationSettingAccess().getGroup(), "rule__JdlPaginateGenerationSetting__Group__0");
					put(grammarAccess.getJdlAngularSuffixGenerationSettingAccess().getGroup(), "rule__JdlAngularSuffixGenerationSetting__Group__0");
					put(grammarAccess.getJdlEntityInclusionAccess().getGroup(), "rule__JdlEntityInclusion__Group__0");
					put(grammarAccess.getJdlEntityInclusionAccess().getGroup_0_1(), "rule__JdlEntityInclusion__Group_0_1__0");
					put(grammarAccess.getJdlEntityInclusionAccess().getGroup_0_1_1(), "rule__JdlEntityInclusion__Group_0_1_1__0");
					put(grammarAccess.getJdlEntityExclusionAccess().getGroup(), "rule__JdlEntityExclusion__Group__0");
					put(grammarAccess.getJdlEntityExclusionAccess().getGroup_2(), "rule__JdlEntityExclusion__Group_2__0");
					put(grammarAccess.getJdlDomainModelAccess().getFeaturesAssignment(), "rule__JdlDomainModel__FeaturesAssignment");
					put(grammarAccess.getJdlEntityAccess().getNameAssignment_1(), "rule__JdlEntity__NameAssignment_1");
					put(grammarAccess.getJdlEntityAccess().getFieldsAssignment_2_1_0(), "rule__JdlEntity__FieldsAssignment_2_1_0");
					put(grammarAccess.getJdlEntityAccess().getFieldsAssignment_2_1_1_1(), "rule__JdlEntity__FieldsAssignment_2_1_1_1");
					put(grammarAccess.getJdlEntityFieldAccess().getNameAssignment_0(), "rule__JdlEntityField__NameAssignment_0");
					put(grammarAccess.getJdlEntityFieldAccess().getTypeAssignment_1(), "rule__JdlEntityField__TypeAssignment_1");
					put(grammarAccess.getJdlEnumFieldAccess().getEnumTypeAssignment_0(), "rule__JdlEnumField__EnumTypeAssignment_0");
					put(grammarAccess.getJdlEnumFieldAccess().getValidatorsAssignment_1(), "rule__JdlEnumField__ValidatorsAssignment_1");
					put(grammarAccess.getJdlStringFieldAccess().getStringTypeAssignment_0(), "rule__JdlStringField__StringTypeAssignment_0");
					put(grammarAccess.getJdlStringFieldAccess().getValidatorsAssignment_1(), "rule__JdlStringField__ValidatorsAssignment_1");
					put(grammarAccess.getJdlNumericFieldAccess().getNumericFieldTypeAssignment_0(), "rule__JdlNumericField__NumericFieldTypeAssignment_0");
					put(grammarAccess.getJdlNumericFieldAccess().getValidatorsAssignment_1(), "rule__JdlNumericField__ValidatorsAssignment_1");
					put(grammarAccess.getJdlBooleanFieldAccess().getBooleanTypeAssignment_0(), "rule__JdlBooleanField__BooleanTypeAssignment_0");
					put(grammarAccess.getJdlBooleanFieldAccess().getValidatorsAssignment_1(), "rule__JdlBooleanField__ValidatorsAssignment_1");
					put(grammarAccess.getJdlDateFieldAccess().getLocalDateTypeAssignment_0_0(), "rule__JdlDateField__LocalDateTypeAssignment_0_0");
					put(grammarAccess.getJdlDateFieldAccess().getZonedDateTimeTypeAssignment_0_1(), "rule__JdlDateField__ZonedDateTimeTypeAssignment_0_1");
					put(grammarAccess.getJdlDateFieldAccess().getValidatorsAssignment_1(), "rule__JdlDateField__ValidatorsAssignment_1");
					put(grammarAccess.getJdlBlobFieldAccess().getBlobFieldTypeAssignment_0(), "rule__JdlBlobField__BlobFieldTypeAssignment_0");
					put(grammarAccess.getJdlBlobFieldAccess().getValidatorsAssignment_1(), "rule__JdlBlobField__ValidatorsAssignment_1");
					put(grammarAccess.getJdlStringValidatorsAccess().getRequiredAssignment_0(), "rule__JdlStringValidators__RequiredAssignment_0");
					put(grammarAccess.getJdlStringValidatorsAccess().getMinLengthAssignment_1(), "rule__JdlStringValidators__MinLengthAssignment_1");
					put(grammarAccess.getJdlStringValidatorsAccess().getMaxlengthAssignment_2(), "rule__JdlStringValidators__MaxlengthAssignment_2");
					put(grammarAccess.getJdlStringValidatorsAccess().getPatternAssignment_3(), "rule__JdlStringValidators__PatternAssignment_3");
					put(grammarAccess.getJdlNumericValidatorsAccess().getRequiredAssignment_0(), "rule__JdlNumericValidators__RequiredAssignment_0");
					put(grammarAccess.getJdlNumericValidatorsAccess().getMinlengthAssignment_1(), "rule__JdlNumericValidators__MinlengthAssignment_1");
					put(grammarAccess.getJdlNumericValidatorsAccess().getMaxlengthAssignment_2(), "rule__JdlNumericValidators__MaxlengthAssignment_2");
					put(grammarAccess.getJdlBlobValidatorsAccess().getRequiredAssignment_0(), "rule__JdlBlobValidators__RequiredAssignment_0");
					put(grammarAccess.getJdlBlobValidatorsAccess().getMinbytesAssignment_1(), "rule__JdlBlobValidators__MinbytesAssignment_1");
					put(grammarAccess.getJdlBlobValidatorsAccess().getMaxbytesAssignment_2(), "rule__JdlBlobValidators__MaxbytesAssignment_2");
					put(grammarAccess.getJdlRequiredValidatorAccess().getRequiredAssignment(), "rule__JdlRequiredValidator__RequiredAssignment");
					put(grammarAccess.getJdlMinLengthValidatorAccess().getValueAssignment_2(), "rule__JdlMinLengthValidator__ValueAssignment_2");
					put(grammarAccess.getJdlMaxLengthValidatorAccess().getValueAssignment_2(), "rule__JdlMaxLengthValidator__ValueAssignment_2");
					put(grammarAccess.getJdlPatternValidatorAccess().getValueAssignment_2(), "rule__JdlPatternValidator__ValueAssignment_2");
					put(grammarAccess.getJdlMinValidatorAccess().getValueAssignment_2(), "rule__JdlMinValidator__ValueAssignment_2");
					put(grammarAccess.getJdlMaxValidatorAccess().getValueAssignment_2(), "rule__JdlMaxValidator__ValueAssignment_2");
					put(grammarAccess.getJdlMinBytesValidatorAccess().getValueAssignment_2(), "rule__JdlMinBytesValidator__ValueAssignment_2");
					put(grammarAccess.getJdlMaxBytesValidatorAccess().getValueAssignment_2(), "rule__JdlMaxBytesValidator__ValueAssignment_2");
					put(grammarAccess.getJdlRelationshipsAccess().getCardinalityAssignment_1(), "rule__JdlRelationships__CardinalityAssignment_1");
					put(grammarAccess.getJdlRelationshipsAccess().getRelationshipsAssignment_3(), "rule__JdlRelationships__RelationshipsAssignment_3");
					put(grammarAccess.getJdlRelationshipsAccess().getRelationshipsAssignment_4_1(), "rule__JdlRelationships__RelationshipsAssignment_4_1");
					put(grammarAccess.getJdlRelationshipAccess().getFromEntityAssignment_0(), "rule__JdlRelationship__FromEntityAssignment_0");
					put(grammarAccess.getJdlRelationshipAccess().getFromNameAssignment_1(), "rule__JdlRelationship__FromNameAssignment_1");
					put(grammarAccess.getJdlRelationshipAccess().getToEntityAssignment_3(), "rule__JdlRelationship__ToEntityAssignment_3");
					put(grammarAccess.getJdlRelationshipAccess().getToNameAssignment_4(), "rule__JdlRelationship__ToNameAssignment_4");
					put(grammarAccess.getJdlRelationshipNameAccess().getNameAssignment_1(), "rule__JdlRelationshipName__NameAssignment_1");
					put(grammarAccess.getJdlRelationshipNameAccess().getRoleAssignment_2_1(), "rule__JdlRelationshipName__RoleAssignment_2_1");
					put(grammarAccess.getJdlEnumTypeAccess().getNameAssignment_1(), "rule__JdlEnumType__NameAssignment_1");
					put(grammarAccess.getJdlEnumTypeAccess().getValuesAssignment_3(), "rule__JdlEnumType__ValuesAssignment_3");
					put(grammarAccess.getJdlEnumTypeAccess().getValuesAssignment_4_1(), "rule__JdlEnumType__ValuesAssignment_4_1");
					put(grammarAccess.getJdlGenerationSettingAccess().getSettingAssignment_0(), "rule__JdlGenerationSetting__SettingAssignment_0");
					put(grammarAccess.getJdlGenerationSettingAccess().getExcludesAssignment_1(), "rule__JdlGenerationSetting__ExcludesAssignment_1");
					put(grammarAccess.getJdlServiceGenerationSettingAccess().getServiceGenerationSettingAssignment_0(), "rule__JdlServiceGenerationSetting__ServiceGenerationSettingAssignment_0");
					put(grammarAccess.getJdlServiceGenerationSettingAccess().getIncludesAssignment_1(), "rule__JdlServiceGenerationSetting__IncludesAssignment_1");
					put(grammarAccess.getJdlServiceGenerationSettingAccess().getServiceTypeAssignment_2(), "rule__JdlServiceGenerationSetting__ServiceTypeAssignment_2");
					put(grammarAccess.getJdlMicroserviceGenerationSettingAccess().getMicroserviceGenerationSettingAssignment_0(), "rule__JdlMicroserviceGenerationSetting__MicroserviceGenerationSettingAssignment_0");
					put(grammarAccess.getJdlMicroserviceGenerationSettingAccess().getIncludesAssignment_1(), "rule__JdlMicroserviceGenerationSetting__IncludesAssignment_1");
					put(grammarAccess.getJdlMicroserviceGenerationSettingAccess().getAppnameAssignment_2(), "rule__JdlMicroserviceGenerationSetting__AppnameAssignment_2");
					put(grammarAccess.getJdlSearchGenerationSettingAccess().getSearchGenerationSettingAssignment_0(), "rule__JdlSearchGenerationSetting__SearchGenerationSettingAssignment_0");
					put(grammarAccess.getJdlSearchGenerationSettingAccess().getIncludesAssignment_1(), "rule__JdlSearchGenerationSetting__IncludesAssignment_1");
					put(grammarAccess.getJdlSearchGenerationSettingAccess().getServiceAssignment_2(), "rule__JdlSearchGenerationSetting__ServiceAssignment_2");
					put(grammarAccess.getJdlDtoGenerationSettingAccess().getDtoGenerationSettingAssignment_0(), "rule__JdlDtoGenerationSetting__DtoGenerationSettingAssignment_0");
					put(grammarAccess.getJdlDtoGenerationSettingAccess().getIncludesAssignment_1(), "rule__JdlDtoGenerationSetting__IncludesAssignment_1");
					put(grammarAccess.getJdlDtoGenerationSettingAccess().getDtoTypeAssignment_2(), "rule__JdlDtoGenerationSetting__DtoTypeAssignment_2");
					put(grammarAccess.getJdlPaginateGenerationSettingAccess().getPaginateGenerationSettingAssignment_0(), "rule__JdlPaginateGenerationSetting__PaginateGenerationSettingAssignment_0");
					put(grammarAccess.getJdlPaginateGenerationSettingAccess().getIncludesAssignment_1(), "rule__JdlPaginateGenerationSetting__IncludesAssignment_1");
					put(grammarAccess.getJdlPaginateGenerationSettingAccess().getPaginateTypeAssignment_2(), "rule__JdlPaginateGenerationSetting__PaginateTypeAssignment_2");
					put(grammarAccess.getJdlAngularSuffixGenerationSettingAccess().getAngularSuffixGenerationSettingAssignment_0(), "rule__JdlAngularSuffixGenerationSetting__AngularSuffixGenerationSettingAssignment_0");
					put(grammarAccess.getJdlAngularSuffixGenerationSettingAccess().getIncludesAssignment_1(), "rule__JdlAngularSuffixGenerationSetting__IncludesAssignment_1");
					put(grammarAccess.getJdlAngularSuffixGenerationSettingAccess().getIdAssignment_2(), "rule__JdlAngularSuffixGenerationSetting__IdAssignment_2");
					put(grammarAccess.getJdlEntityInclusionAccess().getPredicateAssignment_0_0(), "rule__JdlEntityInclusion__PredicateAssignment_0_0");
					put(grammarAccess.getJdlEntityInclusionAccess().getEntitiesAssignment_0_1_0(), "rule__JdlEntityInclusion__EntitiesAssignment_0_1_0");
					put(grammarAccess.getJdlEntityInclusionAccess().getEntitiesAssignment_0_1_1_1(), "rule__JdlEntityInclusion__EntitiesAssignment_0_1_1_1");
					put(grammarAccess.getJdlEntityExclusionAccess().getEntitiesAssignment_1(), "rule__JdlEntityExclusion__EntitiesAssignment_1");
					put(grammarAccess.getJdlEntityExclusionAccess().getEntitiesAssignment_2_1(), "rule__JdlEntityExclusion__EntitiesAssignment_2_1");
					put(grammarAccess.getJdlWildcardPredicateAccess().getWildcardAssignment_0(), "rule__JdlWildcardPredicate__WildcardAssignment_0");
					put(grammarAccess.getJdlWildcardPredicateAccess().getAllAssignment_1(), "rule__JdlWildcardPredicate__AllAssignment_1");
					put(grammarAccess.getJdlPaginateTypeAccess().getPaginationAssignment_0(), "rule__JdlPaginateType__PaginationAssignment_0");
					put(grammarAccess.getJdlPaginateTypeAccess().getInfiniteScrollAssignment_1(), "rule__JdlPaginateType__InfiniteScrollAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalJDLParser typedParser = (InternalJDLParser) parser;
			typedParser.entryRuleJdlDomainModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}