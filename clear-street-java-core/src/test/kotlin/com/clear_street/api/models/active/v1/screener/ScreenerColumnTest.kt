// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.screener

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenerColumnTest {

    @Test
    fun create() {
        val screenerColumn =
            ScreenerColumn.builder()
                .field(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .name("Market Cap")
                .value(2890000000000.0)
                .type("CURR_USD")
                .build()

        assertThat(screenerColumn.field())
            .isEqualTo(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_WEEK)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(screenerColumn.name()).isEqualTo("Market Cap")
        assertThat(screenerColumn.value()).contains(ScreenerColumn.Value.ofNumber(2890000000000.0))
        assertThat(screenerColumn.type()).contains("CURR_USD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val screenerColumn =
            ScreenerColumn.builder()
                .field(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_WEEK)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .name("Market Cap")
                .value(2890000000000.0)
                .type("CURR_USD")
                .build()

        val roundtrippedScreenerColumn =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(screenerColumn),
                jacksonTypeRef<ScreenerColumn>(),
            )

        assertThat(roundtrippedScreenerColumn).isEqualTo(screenerColumn)
    }
}
