// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentEventsResponseTest {

    @Test
    fun create() {
        val instrumentDataGetInstrumentEventsResponse =
            InstrumentDataGetInstrumentEventsResponse.builder()
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
                    InstrumentEventsData.builder()
                        .addDividend(
                            InstrumentDividendEvent.builder()
                                .adjustedDividendAmount("0.25")
                                .exDate(LocalDate.parse("2024-11-08"))
                                .declarationDate(LocalDate.parse("2024-10-31"))
                                .dividendAmount("0.25")
                                .dividendYield("0.44")
                                .frequency("Quarterly")
                                .paymentDate(LocalDate.parse("2024-11-14"))
                                .recordDate(LocalDate.parse("2024-11-11"))
                                .build()
                        )
                        .addEarning(
                            InstrumentEarnings.builder()
                                .date(LocalDate.parse("2024-10-31"))
                                .epsActual("1.64")
                                .epsEstimate("1.60")
                                .epsSurprisePercent("2.5")
                                .revenueActual("94930000000")
                                .revenueEstimate("94500000000")
                                .revenueSurprisePercent("0.45")
                                .build()
                        )
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .addSplit(
                            InstrumentSplitEvent.builder()
                                .date(LocalDate.parse("2020-08-31"))
                                .denominator("1")
                                .numerator("4")
                                .splitType("stock-split")
                                .build()
                        )
                        .reportingCurrency("reporting_currency")
                        .build()
                )
                .build()

        assertThat(instrumentDataGetInstrumentEventsResponse.metadata())
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
        assertThat(instrumentDataGetInstrumentEventsResponse.error())
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
        assertThat(instrumentDataGetInstrumentEventsResponse.data())
            .isEqualTo(
                InstrumentEventsData.builder()
                    .addDividend(
                        InstrumentDividendEvent.builder()
                            .adjustedDividendAmount("0.25")
                            .exDate(LocalDate.parse("2024-11-08"))
                            .declarationDate(LocalDate.parse("2024-10-31"))
                            .dividendAmount("0.25")
                            .dividendYield("0.44")
                            .frequency("Quarterly")
                            .paymentDate(LocalDate.parse("2024-11-14"))
                            .recordDate(LocalDate.parse("2024-11-11"))
                            .build()
                    )
                    .addEarning(
                        InstrumentEarnings.builder()
                            .date(LocalDate.parse("2024-10-31"))
                            .epsActual("1.64")
                            .epsEstimate("1.60")
                            .epsSurprisePercent("2.5")
                            .revenueActual("94930000000")
                            .revenueEstimate("94500000000")
                            .revenueSurprisePercent("0.45")
                            .build()
                    )
                    .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                    .addSplit(
                        InstrumentSplitEvent.builder()
                            .date(LocalDate.parse("2020-08-31"))
                            .denominator("1")
                            .numerator("4")
                            .splitType("stock-split")
                            .build()
                    )
                    .reportingCurrency("reporting_currency")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentDataGetInstrumentEventsResponse =
            InstrumentDataGetInstrumentEventsResponse.builder()
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
                    InstrumentEventsData.builder()
                        .addDividend(
                            InstrumentDividendEvent.builder()
                                .adjustedDividendAmount("0.25")
                                .exDate(LocalDate.parse("2024-11-08"))
                                .declarationDate(LocalDate.parse("2024-10-31"))
                                .dividendAmount("0.25")
                                .dividendYield("0.44")
                                .frequency("Quarterly")
                                .paymentDate(LocalDate.parse("2024-11-14"))
                                .recordDate(LocalDate.parse("2024-11-11"))
                                .build()
                        )
                        .addEarning(
                            InstrumentEarnings.builder()
                                .date(LocalDate.parse("2024-10-31"))
                                .epsActual("1.64")
                                .epsEstimate("1.60")
                                .epsSurprisePercent("2.5")
                                .revenueActual("94930000000")
                                .revenueEstimate("94500000000")
                                .revenueSurprisePercent("0.45")
                                .build()
                        )
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .addSplit(
                            InstrumentSplitEvent.builder()
                                .date(LocalDate.parse("2020-08-31"))
                                .denominator("1")
                                .numerator("4")
                                .splitType("stock-split")
                                .build()
                        )
                        .reportingCurrency("reporting_currency")
                        .build()
                )
                .build()

        val roundtrippedInstrumentDataGetInstrumentEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentDataGetInstrumentEventsResponse),
                jacksonTypeRef<InstrumentDataGetInstrumentEventsResponse>(),
            )

        assertThat(roundtrippedInstrumentDataGetInstrumentEventsResponse)
            .isEqualTo(instrumentDataGetInstrumentEventsResponse)
    }
}
