// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.screener

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchFilterTest {

    @Test
    fun create() {
        val searchFilter =
            SearchFilter.builder()
                .left(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .op(
                    FilterOpSpec.builder()
                        .name(FilterOperator.GTE)
                        .addArg(OperatorArg.LEFT_INCLUSIVE)
                        .build()
                )
                .addRight(
                    FilterValue.builder()
                        .value(1000000000.0)
                        .variable(
                            Variable.builder()
                                .name("today")
                                .lookback(FieldLookback.ONE_WEEK)
                                .modifier(
                                    Modifier.builder()
                                        .addArg(30.0)
                                        .addArg("DAY")
                                        .name(ModifierOp.SUB)
                                        .build()
                                )
                                .period(FieldPeriod.QUARTER)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(searchFilter.left())
            .isEqualTo(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(searchFilter.op())
            .contains(
                FilterOpSpec.builder()
                    .name(FilterOperator.GTE)
                    .addArg(OperatorArg.LEFT_INCLUSIVE)
                    .build()
            )
        assertThat(searchFilter.right().getOrNull())
            .containsExactly(
                FilterValue.builder()
                    .value(1000000000.0)
                    .variable(
                        Variable.builder()
                            .name("today")
                            .lookback(FieldLookback.ONE_WEEK)
                            .modifier(
                                Modifier.builder()
                                    .addArg(30.0)
                                    .addArg("DAY")
                                    .name(ModifierOp.SUB)
                                    .build()
                            )
                            .period(FieldPeriod.QUARTER)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val searchFilter =
            SearchFilter.builder()
                .left(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .op(
                    FilterOpSpec.builder()
                        .name(FilterOperator.GTE)
                        .addArg(OperatorArg.LEFT_INCLUSIVE)
                        .build()
                )
                .addRight(
                    FilterValue.builder()
                        .value(1000000000.0)
                        .variable(
                            Variable.builder()
                                .name("today")
                                .lookback(FieldLookback.ONE_WEEK)
                                .modifier(
                                    Modifier.builder()
                                        .addArg(30.0)
                                        .addArg("DAY")
                                        .name(ModifierOp.SUB)
                                        .build()
                                )
                                .period(FieldPeriod.QUARTER)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSearchFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(searchFilter),
                jacksonTypeRef<SearchFilter>(),
            )

        assertThat(roundtrippedSearchFilter).isEqualTo(searchFilter)
    }
}
