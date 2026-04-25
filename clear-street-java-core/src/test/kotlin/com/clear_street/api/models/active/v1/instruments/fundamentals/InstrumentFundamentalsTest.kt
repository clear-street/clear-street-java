// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.fundamentals

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentFundamentalsTest {

    @Test
    fun create() {
        val instrumentFundamentals =
            InstrumentFundamentals.builder()
                .averageVolume(76000000L)
                .beta("1.20")
                .description(
                    "Apple Inc. designs, manufactures, and markets smartphones, personal computers, tablets, wearables, and accessories worldwide."
                )
                .dividendYield("0.005")
                .earningsPerShare("5.61")
                .fiftyTwoWeekHigh("230.00")
                .fiftyTwoWeekLow("165.00")
                .industry("Consumer Electronics")
                .listDate(LocalDate.parse("1980-12-12"))
                .logoUrl("https://example.com/logos/aapl.png")
                .marketCap("2800000000000")
                .previousClose("210.87")
                .priceToEarnings("30.5")
                .sector("Technology")
                .build()

        assertThat(instrumentFundamentals.averageVolume()).contains(76000000L)
        assertThat(instrumentFundamentals.beta()).contains("1.20")
        assertThat(instrumentFundamentals.description())
            .contains(
                "Apple Inc. designs, manufactures, and markets smartphones, personal computers, tablets, wearables, and accessories worldwide."
            )
        assertThat(instrumentFundamentals.dividendYield()).contains("0.005")
        assertThat(instrumentFundamentals.earningsPerShare()).contains("5.61")
        assertThat(instrumentFundamentals.fiftyTwoWeekHigh()).contains("230.00")
        assertThat(instrumentFundamentals.fiftyTwoWeekLow()).contains("165.00")
        assertThat(instrumentFundamentals.industry()).contains("Consumer Electronics")
        assertThat(instrumentFundamentals.listDate()).contains(LocalDate.parse("1980-12-12"))
        assertThat(instrumentFundamentals.logoUrl()).contains("https://example.com/logos/aapl.png")
        assertThat(instrumentFundamentals.marketCap()).contains("2800000000000")
        assertThat(instrumentFundamentals.previousClose()).contains("210.87")
        assertThat(instrumentFundamentals.priceToEarnings()).contains("30.5")
        assertThat(instrumentFundamentals.sector()).contains("Technology")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentFundamentals =
            InstrumentFundamentals.builder()
                .averageVolume(76000000L)
                .beta("1.20")
                .description(
                    "Apple Inc. designs, manufactures, and markets smartphones, personal computers, tablets, wearables, and accessories worldwide."
                )
                .dividendYield("0.005")
                .earningsPerShare("5.61")
                .fiftyTwoWeekHigh("230.00")
                .fiftyTwoWeekLow("165.00")
                .industry("Consumer Electronics")
                .listDate(LocalDate.parse("1980-12-12"))
                .logoUrl("https://example.com/logos/aapl.png")
                .marketCap("2800000000000")
                .previousClose("210.87")
                .priceToEarnings("30.5")
                .sector("Technology")
                .build()

        val roundtrippedInstrumentFundamentals =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentFundamentals),
                jacksonTypeRef<InstrumentFundamentals>(),
            )

        assertThat(roundtrippedInstrumentFundamentals).isEqualTo(instrumentFundamentals)
    }
}
