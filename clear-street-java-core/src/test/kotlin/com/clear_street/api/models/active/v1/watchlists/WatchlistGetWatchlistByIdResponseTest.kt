// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.clear_street.api.models.active.v1.instruments.Instrument
import com.clear_street.api.models.active.v1.instruments.InstrumentQuote
import com.clear_street.api.models.active.v1.instruments.InstrumentSecurityId
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistGetWatchlistByIdResponseTest {

    @Test
    fun create() {
        val watchlistGetWatchlistByIdResponse =
            WatchlistGetWatchlistByIdResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                                )
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        assertThat(watchlistGetWatchlistByIdResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(watchlistGetWatchlistByIdResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(watchlistGetWatchlistByIdResponse.data())
            .isEqualTo(
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
                            )
                            .build()
                    )
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchlistGetWatchlistByIdResponse =
            WatchlistGetWatchlistByIdResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                                )
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedWatchlistGetWatchlistByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchlistGetWatchlistByIdResponse),
                jacksonTypeRef<WatchlistGetWatchlistByIdResponse>(),
            )

        assertThat(roundtrippedWatchlistGetWatchlistByIdResponse)
            .isEqualTo(watchlistGetWatchlistByIdResponse)
    }
}
