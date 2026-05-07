// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentTest {

    @Test
    fun create() {
        val instrument =
            Instrument.builder()
                .id("0f5a1a4e-5b3e-4d8f-9b7a-2b1d0e3f4a5b")
                .countryOfIssue("US")
                .currency("USD")
                .easyToBorrow(true)
                .isLiquidationOnly(false)
                .isMarginable(true)
                .isRestricted(false)
                .isShortProhibited(false)
                .isThresholdSecurity(false)
                .isTradable(true)
                .symbol("AAPL")
                .venue("XNMS")
                .adv("75000000")
                .expiry(LocalDate.parse("2024-12-20"))
                .instrumentType(SecurityType.COMMON_STOCK)
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .addOptionsExpiryDate(LocalDate.parse("2019-12-27"))
                .previousClose("210.87")
                .shortMarginRate("0.25")
                .strikePrice("150.00")
                .build()

        assertThat(instrument.id()).isEqualTo("0f5a1a4e-5b3e-4d8f-9b7a-2b1d0e3f4a5b")
        assertThat(instrument.countryOfIssue()).isEqualTo("US")
        assertThat(instrument.currency()).isEqualTo("USD")
        assertThat(instrument.easyToBorrow()).isEqualTo(true)
        assertThat(instrument.isLiquidationOnly()).isEqualTo(false)
        assertThat(instrument.isMarginable()).isEqualTo(true)
        assertThat(instrument.isRestricted()).isEqualTo(false)
        assertThat(instrument.isShortProhibited()).isEqualTo(false)
        assertThat(instrument.isThresholdSecurity()).isEqualTo(false)
        assertThat(instrument.isTradable()).isEqualTo(true)
        assertThat(instrument.symbol()).isEqualTo("AAPL")
        assertThat(instrument.venue()).isEqualTo("XNMS")
        assertThat(instrument.adv()).contains("75000000")
        assertThat(instrument.expiry()).contains(LocalDate.parse("2024-12-20"))
        assertThat(instrument.instrumentType()).contains(SecurityType.COMMON_STOCK)
        assertThat(instrument.longMarginRate()).contains("0.25")
        assertThat(instrument.name()).contains("Apple Inc.")
        assertThat(instrument.notionalAdv()).contains("15815250000")
        assertThat(instrument.optionsExpiryDates().getOrNull())
            .containsExactly(LocalDate.parse("2019-12-27"))
        assertThat(instrument.previousClose()).contains("210.87")
        assertThat(instrument.shortMarginRate()).contains("0.25")
        assertThat(instrument.strikePrice()).contains("150.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrument =
            Instrument.builder()
                .id("0f5a1a4e-5b3e-4d8f-9b7a-2b1d0e3f4a5b")
                .countryOfIssue("US")
                .currency("USD")
                .easyToBorrow(true)
                .isLiquidationOnly(false)
                .isMarginable(true)
                .isRestricted(false)
                .isShortProhibited(false)
                .isThresholdSecurity(false)
                .isTradable(true)
                .symbol("AAPL")
                .venue("XNMS")
                .adv("75000000")
                .expiry(LocalDate.parse("2024-12-20"))
                .instrumentType(SecurityType.COMMON_STOCK)
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .addOptionsExpiryDate(LocalDate.parse("2019-12-27"))
                .previousClose("210.87")
                .shortMarginRate("0.25")
                .strikePrice("150.00")
                .build()

        val roundtrippedInstrument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrument),
                jacksonTypeRef<Instrument>(),
            )

        assertThat(roundtrippedInstrument).isEqualTo(instrument)
    }
}
