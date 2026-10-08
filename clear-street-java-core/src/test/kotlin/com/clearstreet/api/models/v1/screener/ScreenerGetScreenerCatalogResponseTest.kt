// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenerGetScreenerCatalogResponseTest {

    @Test
    fun create() {
        val screenerGetScreenerCatalogResponse =
            ScreenerGetScreenerCatalogResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                                    Combination.builder()
                                        .lookback("lookback")
                                        .period("period")
                                        .build()
                                )
                                .defaultCombination(
                                    Combination.builder()
                                        .lookback("lookback")
                                        .period("period")
                                        .build()
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
                )
                .build()

        assertThat(screenerGetScreenerCatalogResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(1)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(42L)
                    .totalPages(5)
                    .build()
            )
        assertThat(screenerGetScreenerCatalogResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(screenerGetScreenerCatalogResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val screenerGetScreenerCatalogResponse =
            ScreenerGetScreenerCatalogResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                                    Combination.builder()
                                        .lookback("lookback")
                                        .period("period")
                                        .build()
                                )
                                .defaultCombination(
                                    Combination.builder()
                                        .lookback("lookback")
                                        .period("period")
                                        .build()
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
                )
                .build()

        val roundtrippedScreenerGetScreenerCatalogResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(screenerGetScreenerCatalogResponse),
                jacksonTypeRef<ScreenerGetScreenerCatalogResponse>(),
            )

        assertThat(roundtrippedScreenerGetScreenerCatalogResponse)
            .isEqualTo(screenerGetScreenerCatalogResponse)
    }
}
