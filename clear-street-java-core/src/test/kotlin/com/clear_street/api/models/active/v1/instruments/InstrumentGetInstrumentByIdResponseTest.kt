// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetInstrumentByIdResponseTest {

    @Test
    fun create() {
        val instrumentGetInstrumentByIdResponse =
            InstrumentGetInstrumentByIdResponse.builder()
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
                        .expiry(LocalDate.parse("2024-12-20"))
                        .longMarginRate("0.25")
                        .name("Apple Inc.")
                        .securityType(SecurityType.COMMON_STOCK)
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
                        .previousClose("210.87")
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

        assertThat(instrumentGetInstrumentByIdResponse.metadata())
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
        assertThat(instrumentGetInstrumentByIdResponse.error())
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
        assertThat(instrumentGetInstrumentByIdResponse.data())
            .isEqualTo(
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
                    .expiry(LocalDate.parse("2024-12-20"))
                    .longMarginRate("0.25")
                    .name("Apple Inc.")
                    .securityType(SecurityType.COMMON_STOCK)
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
                    .previousClose("210.87")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentGetInstrumentByIdResponse =
            InstrumentGetInstrumentByIdResponse.builder()
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
                        .expiry(LocalDate.parse("2024-12-20"))
                        .longMarginRate("0.25")
                        .name("Apple Inc.")
                        .securityType(SecurityType.COMMON_STOCK)
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
                        .previousClose("210.87")
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

        val roundtrippedInstrumentGetInstrumentByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentGetInstrumentByIdResponse),
                jacksonTypeRef<InstrumentGetInstrumentByIdResponse>(),
            )

        assertThat(roundtrippedInstrumentGetInstrumentByIdResponse)
            .isEqualTo(instrumentGetInstrumentByIdResponse)
    }
}
