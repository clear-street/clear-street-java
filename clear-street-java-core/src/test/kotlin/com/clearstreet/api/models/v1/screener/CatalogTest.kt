// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CatalogTest {

    @Test
    fun create() {
        val catalog =
            Catalog.builder()
                .addDefaultResponseField("string")
                .enums(
                    Enums.builder()
                        .addBuiltinVariable("string")
                        .addCategory("string")
                        .addDateUnit("string")
                        .addFormat("string")
                        .addLookback("string")
                        .addModifierOp("string")
                        .addOperator("string")
                        .addOperatorArg("string")
                        .addPeriod("string")
                        .addValueType("string")
                        .build()
                )
                .fields(
                    FieldColumns.builder()
                        .addDescription("string")
                        .addDisplayName("string")
                        .addKind(0)
                        .addName("string")
                        .build()
                )
                .addKind(
                    FieldKind.builder()
                        .category("category")
                        .addCombination(
                            Combination.builder().lookback("lookback").period("period").build()
                        )
                        .defaultCombination(
                            Combination.builder().lookback("lookback").period("period").build()
                        )
                        .format("format")
                        .valueType("value_type")
                        .build()
                )
                .addModifier(
                    ModifierDef.builder()
                        .addArg(
                            ModifierArg.builder()
                                .kind("kind")
                                .note("note")
                                .position(0)
                                .required(true)
                                .default_("default")
                                .ref("ref")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .operatorsByValueType(
                    Catalog.OperatorsByValueType.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .rules(
                    Rules.builder()
                        .apiNameComposition("api_name_composition")
                        .axes("axes")
                        .defaults("defaults")
                        .modifiers("modifiers")
                        .operators("operators")
                        .variables("variables")
                        .build()
                )
                .suffixes(
                    Catalog.Suffixes.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addVariable(
                    VariableDef.builder()
                        .description("description")
                        .name("name")
                        .resolvesTo("resolves_to")
                        .build()
                )
                .build()

        assertThat(catalog.defaultResponseFields()).containsExactly("string")
        assertThat(catalog.enums())
            .isEqualTo(
                Enums.builder()
                    .addBuiltinVariable("string")
                    .addCategory("string")
                    .addDateUnit("string")
                    .addFormat("string")
                    .addLookback("string")
                    .addModifierOp("string")
                    .addOperator("string")
                    .addOperatorArg("string")
                    .addPeriod("string")
                    .addValueType("string")
                    .build()
            )
        assertThat(catalog.fields())
            .isEqualTo(
                FieldColumns.builder()
                    .addDescription("string")
                    .addDisplayName("string")
                    .addKind(0)
                    .addName("string")
                    .build()
            )
        assertThat(catalog.kinds())
            .containsExactly(
                FieldKind.builder()
                    .category("category")
                    .addCombination(
                        Combination.builder().lookback("lookback").period("period").build()
                    )
                    .defaultCombination(
                        Combination.builder().lookback("lookback").period("period").build()
                    )
                    .format("format")
                    .valueType("value_type")
                    .build()
            )
        assertThat(catalog.modifiers())
            .containsExactly(
                ModifierDef.builder()
                    .addArg(
                        ModifierArg.builder()
                            .kind("kind")
                            .note("note")
                            .position(0)
                            .required(true)
                            .default_("default")
                            .ref("ref")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(catalog.operatorsByValueType())
            .isEqualTo(
                Catalog.OperatorsByValueType.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(catalog.rules())
            .isEqualTo(
                Rules.builder()
                    .apiNameComposition("api_name_composition")
                    .axes("axes")
                    .defaults("defaults")
                    .modifiers("modifiers")
                    .operators("operators")
                    .variables("variables")
                    .build()
            )
        assertThat(catalog.suffixes())
            .isEqualTo(
                Catalog.Suffixes.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(catalog.variables())
            .containsExactly(
                VariableDef.builder()
                    .description("description")
                    .name("name")
                    .resolvesTo("resolves_to")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val catalog =
            Catalog.builder()
                .addDefaultResponseField("string")
                .enums(
                    Enums.builder()
                        .addBuiltinVariable("string")
                        .addCategory("string")
                        .addDateUnit("string")
                        .addFormat("string")
                        .addLookback("string")
                        .addModifierOp("string")
                        .addOperator("string")
                        .addOperatorArg("string")
                        .addPeriod("string")
                        .addValueType("string")
                        .build()
                )
                .fields(
                    FieldColumns.builder()
                        .addDescription("string")
                        .addDisplayName("string")
                        .addKind(0)
                        .addName("string")
                        .build()
                )
                .addKind(
                    FieldKind.builder()
                        .category("category")
                        .addCombination(
                            Combination.builder().lookback("lookback").period("period").build()
                        )
                        .defaultCombination(
                            Combination.builder().lookback("lookback").period("period").build()
                        )
                        .format("format")
                        .valueType("value_type")
                        .build()
                )
                .addModifier(
                    ModifierDef.builder()
                        .addArg(
                            ModifierArg.builder()
                                .kind("kind")
                                .note("note")
                                .position(0)
                                .required(true)
                                .default_("default")
                                .ref("ref")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .operatorsByValueType(
                    Catalog.OperatorsByValueType.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .rules(
                    Rules.builder()
                        .apiNameComposition("api_name_composition")
                        .axes("axes")
                        .defaults("defaults")
                        .modifiers("modifiers")
                        .operators("operators")
                        .variables("variables")
                        .build()
                )
                .suffixes(
                    Catalog.Suffixes.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addVariable(
                    VariableDef.builder()
                        .description("description")
                        .name("name")
                        .resolvesTo("resolves_to")
                        .build()
                )
                .build()

        val roundtrippedCatalog =
            jsonMapper.readValue(jsonMapper.writeValueAsString(catalog), jacksonTypeRef<Catalog>())

        assertThat(roundtrippedCatalog).isEqualTo(catalog)
    }
}
