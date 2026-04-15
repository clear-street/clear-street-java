// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.splits

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StockSplitEventTest {

    @Test
    fun create() {
        val stockSplitEvent =
            StockSplitEvent.builder()
                .date(LocalDate.parse("2025-06-10"))
                .denominator(1L)
                .numerator(10L)
                .symbol("NVDA")
                .build()

        assertThat(stockSplitEvent.date()).isEqualTo(LocalDate.parse("2025-06-10"))
        assertThat(stockSplitEvent.denominator()).isEqualTo(1L)
        assertThat(stockSplitEvent.numerator()).isEqualTo(10L)
        assertThat(stockSplitEvent.symbol()).isEqualTo("NVDA")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stockSplitEvent =
            StockSplitEvent.builder()
                .date(LocalDate.parse("2025-06-10"))
                .denominator(1L)
                .numerator(10L)
                .symbol("NVDA")
                .build()

        val roundtrippedStockSplitEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stockSplitEvent),
                jacksonTypeRef<StockSplitEvent>(),
            )

        assertThat(roundtrippedStockSplitEvent).isEqualTo(stockSplitEvent)
    }
}
