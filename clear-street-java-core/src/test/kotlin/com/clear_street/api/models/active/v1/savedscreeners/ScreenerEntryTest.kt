// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.screener.FieldLookback
import com.clear_street.api.models.active.v1.screener.FieldPeriod
import com.clear_street.api.models.active.v1.screener.FieldRef
import com.clear_street.api.models.active.v1.screener.FieldType
import com.clear_street.api.models.active.v1.screener.FilterOpSpec
import com.clear_street.api.models.active.v1.screener.FilterOperator
import com.clear_street.api.models.active.v1.screener.FilterValue
import com.clear_street.api.models.active.v1.screener.Modifier
import com.clear_street.api.models.active.v1.screener.ModifierOp
import com.clear_street.api.models.active.v1.screener.OperatorArg
import com.clear_street.api.models.active.v1.screener.SearchFilter
import com.clear_street.api.models.active.v1.screener.Variable
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenerEntryTest {

    @Test
    fun create() {
        val screenerEntry =
            ScreenerEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFieldFilter(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .sortBy(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .sortDirection("sort_direction")
                .build()

        assertThat(screenerEntry.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(screenerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(screenerEntry.filters())
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
        assertThat(screenerEntry.name()).isEqualTo("name")
        assertThat(screenerEntry.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(screenerEntry.fieldFilter().getOrNull())
            .containsExactly(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(screenerEntry.sortBy())
            .contains(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(screenerEntry.sortDirection()).contains("sort_direction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val screenerEntry =
            ScreenerEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFieldFilter(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .sortBy(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .sortDirection("sort_direction")
                .build()

        val roundtrippedScreenerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(screenerEntry),
                jacksonTypeRef<ScreenerEntry>(),
            )

        assertThat(roundtrippedScreenerEntry).isEqualTo(screenerEntry)
    }
}
