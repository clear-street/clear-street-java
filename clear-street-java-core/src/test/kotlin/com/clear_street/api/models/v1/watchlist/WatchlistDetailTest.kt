// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.watchlist

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.instruments.Instrument
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistDetailTest {

    @Test
    fun create() {
        val watchlistDetail =
            WatchlistDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addItem(
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
                )
                .name("name")
                .build()

        assertThat(watchlistDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(watchlistDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(watchlistDetail.items())
            .containsExactly(
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
            )
        assertThat(watchlistDetail.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchlistDetail =
            WatchlistDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addItem(
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
                )
                .name("name")
                .build()

        val roundtrippedWatchlistDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchlistDetail),
                jacksonTypeRef<WatchlistDetail>(),
            )

        assertThat(roundtrippedWatchlistDetail).isEqualTo(watchlistDetail)
    }
}
