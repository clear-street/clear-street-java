// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentCoreTest {

    @Test
    fun create() {
        val instrumentCore =
            InstrumentCore.builder()
                .id("0f5a1a4e-5b3e-4d8f-9b7a-2b1d0e3f4a5b")
                .countryOfIssue("US")
                .currency("USD")
                .easyToBorrow(true)
                .isLiquidationOnly(false)
                .isMarginable(true)
                .isRestricted(false)
                .isShortProhibited(false)
                .isThresholdSecurity(false)
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
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .previousClose("210.87")
                .securityType(SecurityType.COMMON_STOCK)
                .shortMarginRate("0.25")
                .strikePrice("150.00")
                .build()

        assertThat(instrumentCore.id()).isEqualTo("0f5a1a4e-5b3e-4d8f-9b7a-2b1d0e3f4a5b")
        assertThat(instrumentCore.countryOfIssue()).isEqualTo("US")
        assertThat(instrumentCore.currency()).isEqualTo("USD")
        assertThat(instrumentCore.easyToBorrow()).isEqualTo(true)
        assertThat(instrumentCore.isLiquidationOnly()).isEqualTo(false)
        assertThat(instrumentCore.isMarginable()).isEqualTo(true)
        assertThat(instrumentCore.isRestricted()).isEqualTo(false)
        assertThat(instrumentCore.isShortProhibited()).isEqualTo(false)
        assertThat(instrumentCore.isThresholdSecurity()).isEqualTo(false)
        assertThat(instrumentCore.securityId()).isEqualTo("AAPL")
        assertThat(instrumentCore.securityIdSource()).isEqualTo(SecurityIdSource.CMS)
        assertThat(instrumentCore.securityIds())
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
        assertThat(instrumentCore.symbol()).isEqualTo("AAPL")
        assertThat(instrumentCore.venue()).isEqualTo("XNMS")
        assertThat(instrumentCore.adv()).contains("75000000")
        assertThat(instrumentCore.expiry()).contains(LocalDate.parse("2024-12-20"))
        assertThat(instrumentCore.longMarginRate()).contains("0.25")
        assertThat(instrumentCore.name()).contains("Apple Inc.")
        assertThat(instrumentCore.notionalAdv()).contains("15815250000")
        assertThat(instrumentCore.previousClose()).contains("210.87")
        assertThat(instrumentCore.securityType()).contains(SecurityType.COMMON_STOCK)
        assertThat(instrumentCore.shortMarginRate()).contains("0.25")
        assertThat(instrumentCore.strikePrice()).contains("150.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentCore =
            InstrumentCore.builder()
                .id("0f5a1a4e-5b3e-4d8f-9b7a-2b1d0e3f4a5b")
                .countryOfIssue("US")
                .currency("USD")
                .easyToBorrow(true)
                .isLiquidationOnly(false)
                .isMarginable(true)
                .isRestricted(false)
                .isShortProhibited(false)
                .isThresholdSecurity(false)
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
                .longMarginRate("0.25")
                .name("Apple Inc.")
                .notionalAdv("15815250000")
                .previousClose("210.87")
                .securityType(SecurityType.COMMON_STOCK)
                .shortMarginRate("0.25")
                .strikePrice("150.00")
                .build()

        val roundtrippedInstrumentCore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentCore),
                jacksonTypeRef<InstrumentCore>(),
            )

        assertThat(roundtrippedInstrumentCore).isEqualTo(instrumentCore)
    }
}
