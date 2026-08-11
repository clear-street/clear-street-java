// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.SecurityType
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
                .isFractionable(false)
                .isLiquidationOnly(false)
                .isMarginable(true)
                .isPtp(false)
                .isShortProhibited(false)
                .isThresholdSecurity(false)
                .isTradable(true)
                .symbol("AAPL")
                .venue("XNMS")
                .adv("75000000")
                .caxAdjustedPreviousClose("105.44")
                .instrumentType(SecurityType.COMMON_STOCK)
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .addOptionsContractExpiryDate(
                    OptionExpiryDate.builder()
                        .date(LocalDate.parse("2026-06-19"))
                        .hasSettlesOnClose(true)
                        .hasSettlesOnOpen(false)
                        .build()
                )
                .addOptionsExpiryDate(LocalDate.parse("2019-12-27"))
                .previousClose("210.87")
                .shortMarginRate("0.25")
                .build()

        assertThat(instrument.id()).isEqualTo("0f5a1a4e-5b3e-4d8f-9b7a-2b1d0e3f4a5b")
        assertThat(instrument.countryOfIssue()).isEqualTo("US")
        assertThat(instrument.currency()).isEqualTo("USD")
        assertThat(instrument.easyToBorrow()).isEqualTo(true)
        assertThat(instrument.isFractionable()).isEqualTo(false)
        assertThat(instrument.isLiquidationOnly()).isEqualTo(false)
        assertThat(instrument.isMarginable()).isEqualTo(true)
        assertThat(instrument.isPtp()).isEqualTo(false)
        assertThat(instrument.isShortProhibited()).isEqualTo(false)
        assertThat(instrument.isThresholdSecurity()).isEqualTo(false)
        assertThat(instrument.isTradable()).isEqualTo(true)
        assertThat(instrument.symbol()).isEqualTo("AAPL")
        assertThat(instrument.venue()).isEqualTo("XNMS")
        assertThat(instrument.adv()).contains("75000000")
        assertThat(instrument.caxAdjustedPreviousClose()).contains("105.44")
        assertThat(instrument.instrumentType()).contains(SecurityType.COMMON_STOCK)
        assertThat(instrument.longMarginRate()).contains("0.25")
        assertThat(instrument.name()).contains("Apple Inc.")
        assertThat(instrument.notionalAdv()).contains("15815250000")
        assertThat(instrument.optionsContractExpiryDates().getOrNull())
            .containsExactly(
                OptionExpiryDate.builder()
                    .date(LocalDate.parse("2026-06-19"))
                    .hasSettlesOnClose(true)
                    .hasSettlesOnOpen(false)
                    .build()
            )
        assertThat(instrument.optionsExpiryDates().getOrNull())
            .containsExactly(LocalDate.parse("2019-12-27"))
        assertThat(instrument.previousClose()).contains("210.87")
        assertThat(instrument.shortMarginRate()).contains("0.25")
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
                .isFractionable(false)
                .isLiquidationOnly(false)
                .isMarginable(true)
                .isPtp(false)
                .isShortProhibited(false)
                .isThresholdSecurity(false)
                .isTradable(true)
                .symbol("AAPL")
                .venue("XNMS")
                .adv("75000000")
                .caxAdjustedPreviousClose("105.44")
                .instrumentType(SecurityType.COMMON_STOCK)
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .addOptionsContractExpiryDate(
                    OptionExpiryDate.builder()
                        .date(LocalDate.parse("2026-06-19"))
                        .hasSettlesOnClose(true)
                        .hasSettlesOnOpen(false)
                        .build()
                )
                .addOptionsExpiryDate(LocalDate.parse("2019-12-27"))
                .previousClose("210.87")
                .shortMarginRate("0.25")
                .build()

        val roundtrippedInstrument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrument),
                jacksonTypeRef<Instrument>(),
            )

        assertThat(roundtrippedInstrument).isEqualTo(instrument)
    }
}
