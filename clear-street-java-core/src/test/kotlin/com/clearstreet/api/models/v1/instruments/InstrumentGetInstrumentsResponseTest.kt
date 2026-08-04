// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetInstrumentsResponseTest {

    @Test
    fun create() {
        val instrumentGetInstrumentsResponse =
            InstrumentGetInstrumentsResponse.builder()
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
                .addData(
                    InstrumentCore.builder()
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
                        .previousClose("210.87")
                        .shortMarginRate("0.25")
                        .build()
                )
                .build()

        assertThat(instrumentGetInstrumentsResponse.metadata())
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
        assertThat(instrumentGetInstrumentsResponse.error())
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
        assertThat(instrumentGetInstrumentsResponse.data())
            .containsExactly(
                InstrumentCore.builder()
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
                    .previousClose("210.87")
                    .shortMarginRate("0.25")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentGetInstrumentsResponse =
            InstrumentGetInstrumentsResponse.builder()
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
                .addData(
                    InstrumentCore.builder()
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
                        .previousClose("210.87")
                        .shortMarginRate("0.25")
                        .build()
                )
                .build()

        val roundtrippedInstrumentGetInstrumentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentGetInstrumentsResponse),
                jacksonTypeRef<InstrumentGetInstrumentsResponse>(),
            )

        assertThat(roundtrippedInstrumentGetInstrumentsResponse)
            .isEqualTo(instrumentGetInstrumentsResponse)
    }
}
