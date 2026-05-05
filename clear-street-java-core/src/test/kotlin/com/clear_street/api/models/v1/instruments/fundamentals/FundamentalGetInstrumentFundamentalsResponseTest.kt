// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.fundamentals

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundamentalGetInstrumentFundamentalsResponseTest {

    @Test
    fun create() {
        val fundamentalGetInstrumentFundamentalsResponse =
            FundamentalGetInstrumentFundamentalsResponse.builder()
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
                )
                .build()

        assertThat(fundamentalGetInstrumentFundamentalsResponse.metadata())
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
        assertThat(fundamentalGetInstrumentFundamentalsResponse.error())
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
        assertThat(fundamentalGetInstrumentFundamentalsResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundamentalGetInstrumentFundamentalsResponse =
            FundamentalGetInstrumentFundamentalsResponse.builder()
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
                )
                .build()

        val roundtrippedFundamentalGetInstrumentFundamentalsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundamentalGetInstrumentFundamentalsResponse),
                jacksonTypeRef<FundamentalGetInstrumentFundamentalsResponse>(),
            )

        assertThat(roundtrippedFundamentalGetInstrumentFundamentalsResponse)
            .isEqualTo(fundamentalGetInstrumentFundamentalsResponse)
    }
}
