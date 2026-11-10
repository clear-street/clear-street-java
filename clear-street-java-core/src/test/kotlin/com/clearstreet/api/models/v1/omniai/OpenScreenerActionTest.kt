// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.SortDirection
import com.clearstreet.api.models.v1.screener.FieldLookback
import com.clearstreet.api.models.v1.screener.FieldPeriod
import com.clearstreet.api.models.v1.screener.FieldRef
import com.clearstreet.api.models.v1.screener.FieldType
import com.clearstreet.api.models.v1.screener.FilterOpSpec
import com.clearstreet.api.models.v1.screener.FilterOperator
import com.clearstreet.api.models.v1.screener.FilterValue
import com.clearstreet.api.models.v1.screener.Modifier
import com.clearstreet.api.models.v1.screener.ModifierOp
import com.clearstreet.api.models.v1.screener.OperatorArg
import com.clearstreet.api.models.v1.screener.SearchFilter
import com.clearstreet.api.models.v1.screener.SortSpec
import com.clearstreet.api.models.v1.screener.Variable
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenScreenerActionTest {

    @Test
    fun create() {
        val openScreenerAction =
            OpenScreenerAction.builder()
                .addFilter(
                    SearchFilter.builder()
                        .left(
                            FieldRef.builder()
                                .name("sector")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .op(
                            FilterOpSpec.builder()
                                .name(FilterOperator.EQUAL)
                                .addArg(OperatorArg.LEFT_INCLUSIVE)
                                .build()
                        )
                        .addRight(
                            FilterValue.builder()
                                .value("Technology")
                                .variable(
                                    Variable.builder()
                                        .name("today")
                                        .lookback(FieldLookback.ONE_DAY)
                                        .modifier(
                                            Modifier.builder()
                                                .addArg(30.0)
                                                .addArg("DAY")
                                                .name(ModifierOp.SUBTRACT)
                                                .build()
                                        )
                                        .period(FieldPeriod.QUARTER)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addFilter(
                    SearchFilter.builder()
                        .left(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .op(
                            FilterOpSpec.builder()
                                .name(FilterOperator.GREATER_OR_EQUAL)
                                .addArg(OperatorArg.LEFT_INCLUSIVE)
                                .build()
                        )
                        .addRight(
                            FilterValue.builder()
                                .value("10000000000")
                                .variable(
                                    Variable.builder()
                                        .name("today")
                                        .lookback(FieldLookback.ONE_DAY)
                                        .modifier(
                                            Modifier.builder()
                                                .addArg(30.0)
                                                .addArg("DAY")
                                                .name(ModifierOp.SUBTRACT)
                                                .build()
                                        )
                                        .period(FieldPeriod.QUARTER)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addColumn(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_DAY)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(0)
                .addSort(
                    SortSpec.builder()
                        .field(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .direction(SortDirection.DESC)
                        .build()
                )
                .build()

        assertThat(openScreenerAction.filters())
            .containsExactly(
                SearchFilter.builder()
                    .left(
                        FieldRef.builder()
                            .name("sector")
                            .lookback(FieldLookback.ONE_DAY)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .op(
                        FilterOpSpec.builder()
                            .name(FilterOperator.EQUAL)
                            .addArg(OperatorArg.LEFT_INCLUSIVE)
                            .build()
                    )
                    .addRight(
                        FilterValue.builder()
                            .value("Technology")
                            .variable(
                                Variable.builder()
                                    .name("today")
                                    .lookback(FieldLookback.ONE_DAY)
                                    .modifier(
                                        Modifier.builder()
                                            .addArg(30.0)
                                            .addArg("DAY")
                                            .name(ModifierOp.SUBTRACT)
                                            .build()
                                    )
                                    .period(FieldPeriod.QUARTER)
                                    .build()
                            )
                            .build()
                    )
                    .build(),
                SearchFilter.builder()
                    .left(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_DAY)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .op(
                        FilterOpSpec.builder()
                            .name(FilterOperator.GREATER_OR_EQUAL)
                            .addArg(OperatorArg.LEFT_INCLUSIVE)
                            .build()
                    )
                    .addRight(
                        FilterValue.builder()
                            .value("10000000000")
                            .variable(
                                Variable.builder()
                                    .name("today")
                                    .lookback(FieldLookback.ONE_DAY)
                                    .modifier(
                                        Modifier.builder()
                                            .addArg(30.0)
                                            .addArg("DAY")
                                            .name(ModifierOp.SUBTRACT)
                                            .build()
                                    )
                                    .period(FieldPeriod.QUARTER)
                                    .build()
                            )
                            .build()
                    )
                    .build(),
            )
        assertThat(openScreenerAction.columns().getOrNull())
            .containsExactly(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_DAY)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(openScreenerAction.itemId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(openScreenerAction.pageSize()).contains(0)
        assertThat(openScreenerAction.sorts().getOrNull())
            .containsExactly(
                SortSpec.builder()
                    .field(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_DAY)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .direction(SortDirection.DESC)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openScreenerAction =
            OpenScreenerAction.builder()
                .addFilter(
                    SearchFilter.builder()
                        .left(
                            FieldRef.builder()
                                .name("sector")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .op(
                            FilterOpSpec.builder()
                                .name(FilterOperator.EQUAL)
                                .addArg(OperatorArg.LEFT_INCLUSIVE)
                                .build()
                        )
                        .addRight(
                            FilterValue.builder()
                                .value("Technology")
                                .variable(
                                    Variable.builder()
                                        .name("today")
                                        .lookback(FieldLookback.ONE_DAY)
                                        .modifier(
                                            Modifier.builder()
                                                .addArg(30.0)
                                                .addArg("DAY")
                                                .name(ModifierOp.SUBTRACT)
                                                .build()
                                        )
                                        .period(FieldPeriod.QUARTER)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addFilter(
                    SearchFilter.builder()
                        .left(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .op(
                            FilterOpSpec.builder()
                                .name(FilterOperator.GREATER_OR_EQUAL)
                                .addArg(OperatorArg.LEFT_INCLUSIVE)
                                .build()
                        )
                        .addRight(
                            FilterValue.builder()
                                .value("10000000000")
                                .variable(
                                    Variable.builder()
                                        .name("today")
                                        .lookback(FieldLookback.ONE_DAY)
                                        .modifier(
                                            Modifier.builder()
                                                .addArg(30.0)
                                                .addArg("DAY")
                                                .name(ModifierOp.SUBTRACT)
                                                .build()
                                        )
                                        .period(FieldPeriod.QUARTER)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addColumn(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_DAY)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(0)
                .addSort(
                    SortSpec.builder()
                        .field(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .direction(SortDirection.DESC)
                        .build()
                )
                .build()

        val roundtrippedOpenScreenerAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openScreenerAction),
                jacksonTypeRef<OpenScreenerAction>(),
            )

        assertThat(roundtrippedOpenScreenerAction).isEqualTo(openScreenerAction)
    }
}
