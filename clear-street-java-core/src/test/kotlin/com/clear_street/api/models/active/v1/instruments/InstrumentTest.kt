// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
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
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .addSecurityId(
                    InstrumentSecurityId.builder()
                        .securityId("AAPL")
                        .securityIdSource(SecurityIdSource.CMS)
                        .build()
                )
                .addSecurityId(
                    InstrumentSecurityId.builder()
                        .securityId("037833100")
                        .securityIdSource(SecurityIdSource.CUSIP)
                        .build()
                )
                .symbol("AAPL")
                .venue("XNMS")
                .adv("75000000")
                .expiry(LocalDate.parse("2024-12-20"))
                .instrumentType(SecurityType.COMMON_STOCK)
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .previousClose("210.87")
                .shortMarginRate("0.25")
                .strikePrice("150.00")
                .availableToBorrow(1500000L)
                .averageVolume(76000000L)
                .beta("1.20")
                .borrowFee("0.0030")
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
                .longConcentrationLimit("0.10")
                .marketCap("2800000000000")
                .addOptionsExpiryDate(LocalDate.parse("2019-12-27"))
                .priceToEarnings("30.5")
                .quote(
                    InstrumentQuote.builder()
                        .high("215.20")
                        .lastPrice("212.54")
                        .low("210.10")
                        .open("211.00")
                        .volume(88000000L)
                        .build()
                )
                .sector("Technology")
                .shortConcentrationLimit("0.10")
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
        assertThat(instrument.securityId()).isEqualTo("AAPL")
        assertThat(instrument.securityIdSource()).isEqualTo(SecurityIdSource.CMS)
        assertThat(instrument.securityIds())
            .containsExactly(
                InstrumentSecurityId.builder()
                    .securityId("AAPL")
                    .securityIdSource(SecurityIdSource.CMS)
                    .build(),
                InstrumentSecurityId.builder()
                    .securityId("037833100")
                    .securityIdSource(SecurityIdSource.CUSIP)
                    .build(),
            )
        assertThat(instrument.symbol()).isEqualTo("AAPL")
        assertThat(instrument.venue()).isEqualTo("XNMS")
        assertThat(instrument.adv()).contains("75000000")
        assertThat(instrument.expiry()).contains(LocalDate.parse("2024-12-20"))
        assertThat(instrument.instrumentType()).contains(SecurityType.COMMON_STOCK)
        assertThat(instrument.longMarginRate()).contains("0.25")
        assertThat(instrument.name()).contains("Apple Inc.")
        assertThat(instrument.notionalAdv()).contains("15815250000")
        assertThat(instrument.previousClose()).contains("210.87")
        assertThat(instrument.shortMarginRate()).contains("0.25")
        assertThat(instrument.strikePrice()).contains("150.00")
        assertThat(instrument.availableToBorrow()).contains(1500000L)
        assertThat(instrument.averageVolume()).contains(76000000L)
        assertThat(instrument.beta()).contains("1.20")
        assertThat(instrument.borrowFee()).contains("0.0030")
        assertThat(instrument.description())
            .contains(
                "Apple Inc. designs, manufactures, and markets smartphones, personal computers, tablets, wearables, and accessories worldwide."
            )
        assertThat(instrument.dividendYield()).contains("0.005")
        assertThat(instrument.earningsPerShare()).contains("5.61")
        assertThat(instrument.fiftyTwoWeekHigh()).contains("230.00")
        assertThat(instrument.fiftyTwoWeekLow()).contains("165.00")
        assertThat(instrument.industry()).contains("Consumer Electronics")
        assertThat(instrument.listDate()).contains(LocalDate.parse("1980-12-12"))
        assertThat(instrument.logoUrl()).contains("https://example.com/logos/aapl.png")
        assertThat(instrument.longConcentrationLimit()).contains("0.10")
        assertThat(instrument.marketCap()).contains("2800000000000")
        assertThat(instrument.optionsExpiryDates().getOrNull())
            .containsExactly(LocalDate.parse("2019-12-27"))
        assertThat(instrument.priceToEarnings()).contains("30.5")
        assertThat(instrument.quote())
            .contains(
                InstrumentQuote.builder()
                    .high("215.20")
                    .lastPrice("212.54")
                    .low("210.10")
                    .open("211.00")
                    .volume(88000000L)
                    .build()
            )
        assertThat(instrument.sector()).contains("Technology")
        assertThat(instrument.shortConcentrationLimit()).contains("0.10")
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
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .addSecurityId(
                    InstrumentSecurityId.builder()
                        .securityId("AAPL")
                        .securityIdSource(SecurityIdSource.CMS)
                        .build()
                )
                .addSecurityId(
                    InstrumentSecurityId.builder()
                        .securityId("037833100")
                        .securityIdSource(SecurityIdSource.CUSIP)
                        .build()
                )
                .symbol("AAPL")
                .venue("XNMS")
                .adv("75000000")
                .expiry(LocalDate.parse("2024-12-20"))
                .instrumentType(SecurityType.COMMON_STOCK)
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .previousClose("210.87")
                .shortMarginRate("0.25")
                .strikePrice("150.00")
                .availableToBorrow(1500000L)
                .averageVolume(76000000L)
                .beta("1.20")
                .borrowFee("0.0030")
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
                .longConcentrationLimit("0.10")
                .marketCap("2800000000000")
                .addOptionsExpiryDate(LocalDate.parse("2019-12-27"))
                .priceToEarnings("30.5")
                .quote(
                    InstrumentQuote.builder()
                        .high("215.20")
                        .lastPrice("212.54")
                        .low("210.10")
                        .open("211.00")
                        .volume(88000000L)
                        .build()
                )
                .sector("Technology")
                .shortConcentrationLimit("0.10")
                .build()

        val roundtrippedInstrument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrument),
                jacksonTypeRef<Instrument>(),
            )

        assertThat(roundtrippedInstrument).isEqualTo(instrument)
    }
}
