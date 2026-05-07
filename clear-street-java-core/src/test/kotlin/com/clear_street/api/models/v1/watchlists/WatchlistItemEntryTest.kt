// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.watchlists

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.instruments.Instrument
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistItemEntryTest {

    @Test
    fun create() {
        val watchlistItemEntry =
            WatchlistItemEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addedPrice("added_price")
                .instrument(
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
                )
                .build()

        assertThat(watchlistItemEntry.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(watchlistItemEntry.addedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(watchlistItemEntry.addedPrice()).contains("added_price")
        assertThat(watchlistItemEntry.instrument())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchlistItemEntry =
            WatchlistItemEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addedPrice("added_price")
                .instrument(
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
                )
                .build()

        val roundtrippedWatchlistItemEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchlistItemEntry),
                jacksonTypeRef<WatchlistItemEntry>(),
            )

        assertThat(roundtrippedWatchlistItemEntry).isEqualTo(watchlistItemEntry)
    }
}
