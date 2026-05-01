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

internal class InstrumentSearchResponseTest {

    @Test
    fun create() {
        val instrumentSearchResponse =
            InstrumentSearchResponse.builder()
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
                        .build()
                )
                .build()

        assertThat(instrumentSearchResponse.metadata())
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
        assertThat(instrumentSearchResponse.error())
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
        assertThat(instrumentSearchResponse.data())
            .containsExactly(
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
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentSearchResponse =
            InstrumentSearchResponse.builder()
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
                        .build()
                )
                .build()

        val roundtrippedInstrumentSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentSearchResponse),
                jacksonTypeRef<InstrumentSearchResponse>(),
            )

        assertThat(roundtrippedInstrumentSearchResponse).isEqualTo(instrumentSearchResponse)
    }
}
