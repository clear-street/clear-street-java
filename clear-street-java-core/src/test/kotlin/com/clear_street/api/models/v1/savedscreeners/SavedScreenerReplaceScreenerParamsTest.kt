// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.savedscreeners

import com.clear_street.api.models.v1.screener.FieldLookback
import com.clear_street.api.models.v1.screener.FieldPeriod
import com.clear_street.api.models.v1.screener.FieldRef
import com.clear_street.api.models.v1.screener.FieldType
import com.clear_street.api.models.v1.screener.FilterOpSpec
import com.clear_street.api.models.v1.screener.FilterOperator
import com.clear_street.api.models.v1.screener.FilterValue
import com.clear_street.api.models.v1.screener.Modifier
import com.clear_street.api.models.v1.screener.ModifierOp
import com.clear_street.api.models.v1.screener.OperatorArg
import com.clear_street.api.models.v1.screener.SearchFilter
import com.clear_street.api.models.v1.screener.Variable
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SavedScreenerReplaceScreenerParamsTest {

    @Test
    fun create() {
        SavedScreenerReplaceScreenerParams.builder()
            .screenerId("550e8400-e29b-41d4-a716-446655440000")
            .addFieldFilter(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
            .addFilter(
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
            )
            .name("name")
            .sortBy(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
            .sortDirection(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SavedScreenerReplaceScreenerParams.builder()
                .screenerId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SavedScreenerReplaceScreenerParams.builder()
                .screenerId("550e8400-e29b-41d4-a716-446655440000")
                .addFieldFilter(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .addFilter(
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
                )
                .name("name")
                .sortBy(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .sortDirection(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
                .build()

        val body = params._body()

        assertThat(body.fieldFilter().getOrNull())
            .containsExactly(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(body.filters().getOrNull())
            .containsExactly(
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
            )
        assertThat(body.name()).contains("name")
        assertThat(body.sortBy())
            .contains(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(body.sortDirection())
            .contains(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SavedScreenerReplaceScreenerParams.builder()
                .screenerId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val body = params._body()
    }
}
