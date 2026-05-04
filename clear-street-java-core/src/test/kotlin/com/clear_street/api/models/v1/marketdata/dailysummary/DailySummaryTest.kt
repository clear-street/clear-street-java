// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.marketdata.dailysummary

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DailySummaryTest {

    @Test
    fun create() {
        val dailySummary =
            DailySummary.builder()
                .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .high("215.20")
                .low("210.10")
                .open("211.00")
                .symbol("AAPL")
                .tradeDate(LocalDate.parse("2026-04-23"))
                .volume(88000000L)
                .build()

        assertThat(dailySummary.instrumentId()).isEqualTo("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
        assertThat(dailySummary.high()).contains("215.20")
        assertThat(dailySummary.low()).contains("210.10")
        assertThat(dailySummary.open()).contains("211.00")
        assertThat(dailySummary.symbol()).contains("AAPL")
        assertThat(dailySummary.tradeDate()).contains(LocalDate.parse("2026-04-23"))
        assertThat(dailySummary.volume()).contains(88000000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dailySummary =
            DailySummary.builder()
                .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .high("215.20")
                .low("210.10")
                .open("211.00")
                .symbol("AAPL")
                .tradeDate(LocalDate.parse("2026-04-23"))
                .volume(88000000L)
                .build()

        val roundtrippedDailySummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dailySummary),
                jacksonTypeRef<DailySummary>(),
            )

        assertThat(roundtrippedDailySummary).isEqualTo(dailySummary)
    }
}
