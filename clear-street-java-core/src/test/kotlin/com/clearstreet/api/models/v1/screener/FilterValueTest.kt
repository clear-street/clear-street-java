// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterValueTest {

    @Test
    fun create() {
        val filterValue =
            FilterValue.builder()
                .value(1000000000.0)
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

        assertThat(filterValue.value()).contains(FilterValue.Value.ofNumber(1000000000.0))
        assertThat(filterValue.variable())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterValue =
            FilterValue.builder()
                .value(1000000000.0)
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

        val roundtrippedFilterValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterValue),
                jacksonTypeRef<FilterValue>(),
            )

        assertThat(roundtrippedFilterValue).isEqualTo(filterValue)
    }
}
