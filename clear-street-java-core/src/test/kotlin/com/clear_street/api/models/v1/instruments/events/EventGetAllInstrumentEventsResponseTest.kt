// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.instruments.InstrumentEarnings
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetAllInstrumentEventsResponseTest {

    @Test
    fun create() {
        val eventGetAllInstrumentEventsResponse =
            EventGetAllInstrumentEventsResponse.builder()
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
                    InstrumentAllEventsData.builder()
                        .addEventDate(
                            InstrumentEventsByDate.builder()
                                .date(LocalDate.parse("2019-12-27"))
                                .addEvent(
                                    InstrumentEventEnvelope.builder()
                                        .symbol("symbol")
                                        .type(AllEventsEventType.EARNINGS)
                                        .dividendEventData(
                                            InstrumentDividendEvent.builder()
                                                .adjustedDividendAmount("0.88")
                                                .exDate(LocalDate.parse("2025-08-15"))
                                                .declarationDate(LocalDate.parse("2025-07-25"))
                                                .dividendAmount("0.88")
                                                .dividendYield("1.25")
                                                .frequency("Quarterly")
                                                .paymentDate(LocalDate.parse("2025-08-20"))
                                                .recordDate(LocalDate.parse("2025-08-01"))
                                                .build()
                                        )
                                        .earningsEventData(
                                            InstrumentEarnings.builder()
                                                .date(LocalDate.parse("2025-07-25"))
                                                .epsActual("1.35")
                                                .epsEstimate("1.30")
                                                .epsSurprisePercent("3.8")
                                                .revenueActual("391035000000")
                                                .revenueEstimate("391025000000")
                                                .revenueSurprisePercent("0.05")
                                                .build()
                                        )
                                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .ipoEventData(
                                            InstrumentEventIpoItem.builder()
                                                .actions("actions")
                                                .announcedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .company("company")
                                                .exchange("exchange")
                                                .marketCap("market_cap")
                                                .priceRange("price_range")
                                                .shares("shares")
                                                .build()
                                        )
                                        .name("name")
                                        .stockSplitEventData(
                                            InstrumentSplitEvent.builder()
                                                .date(LocalDate.parse("2025-08-15"))
                                                .denominator("4")
                                                .numerator("1")
                                                .splitType("stock-split")
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(eventGetAllInstrumentEventsResponse.metadata())
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
        assertThat(eventGetAllInstrumentEventsResponse.error())
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
        assertThat(eventGetAllInstrumentEventsResponse.data())
            .isEqualTo(
                InstrumentAllEventsData.builder()
                    .addEventDate(
                        InstrumentEventsByDate.builder()
                            .date(LocalDate.parse("2019-12-27"))
                            .addEvent(
                                InstrumentEventEnvelope.builder()
                                    .symbol("symbol")
                                    .type(AllEventsEventType.EARNINGS)
                                    .dividendEventData(
                                        InstrumentDividendEvent.builder()
                                            .adjustedDividendAmount("0.88")
                                            .exDate(LocalDate.parse("2025-08-15"))
                                            .declarationDate(LocalDate.parse("2025-07-25"))
                                            .dividendAmount("0.88")
                                            .dividendYield("1.25")
                                            .frequency("Quarterly")
                                            .paymentDate(LocalDate.parse("2025-08-20"))
                                            .recordDate(LocalDate.parse("2025-08-01"))
                                            .build()
                                    )
                                    .earningsEventData(
                                        InstrumentEarnings.builder()
                                            .date(LocalDate.parse("2025-07-25"))
                                            .epsActual("1.35")
                                            .epsEstimate("1.30")
                                            .epsSurprisePercent("3.8")
                                            .revenueActual("391035000000")
                                            .revenueEstimate("391025000000")
                                            .revenueSurprisePercent("0.05")
                                            .build()
                                    )
                                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ipoEventData(
                                        InstrumentEventIpoItem.builder()
                                            .actions("actions")
                                            .announcedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .company("company")
                                            .exchange("exchange")
                                            .marketCap("market_cap")
                                            .priceRange("price_range")
                                            .shares("shares")
                                            .build()
                                    )
                                    .name("name")
                                    .stockSplitEventData(
                                        InstrumentSplitEvent.builder()
                                            .date(LocalDate.parse("2025-08-15"))
                                            .denominator("4")
                                            .numerator("1")
                                            .splitType("stock-split")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventGetAllInstrumentEventsResponse =
            EventGetAllInstrumentEventsResponse.builder()
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
                    InstrumentAllEventsData.builder()
                        .addEventDate(
                            InstrumentEventsByDate.builder()
                                .date(LocalDate.parse("2019-12-27"))
                                .addEvent(
                                    InstrumentEventEnvelope.builder()
                                        .symbol("symbol")
                                        .type(AllEventsEventType.EARNINGS)
                                        .dividendEventData(
                                            InstrumentDividendEvent.builder()
                                                .adjustedDividendAmount("0.88")
                                                .exDate(LocalDate.parse("2025-08-15"))
                                                .declarationDate(LocalDate.parse("2025-07-25"))
                                                .dividendAmount("0.88")
                                                .dividendYield("1.25")
                                                .frequency("Quarterly")
                                                .paymentDate(LocalDate.parse("2025-08-20"))
                                                .recordDate(LocalDate.parse("2025-08-01"))
                                                .build()
                                        )
                                        .earningsEventData(
                                            InstrumentEarnings.builder()
                                                .date(LocalDate.parse("2025-07-25"))
                                                .epsActual("1.35")
                                                .epsEstimate("1.30")
                                                .epsSurprisePercent("3.8")
                                                .revenueActual("391035000000")
                                                .revenueEstimate("391025000000")
                                                .revenueSurprisePercent("0.05")
                                                .build()
                                        )
                                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .ipoEventData(
                                            InstrumentEventIpoItem.builder()
                                                .actions("actions")
                                                .announcedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .company("company")
                                                .exchange("exchange")
                                                .marketCap("market_cap")
                                                .priceRange("price_range")
                                                .shares("shares")
                                                .build()
                                        )
                                        .name("name")
                                        .stockSplitEventData(
                                            InstrumentSplitEvent.builder()
                                                .date(LocalDate.parse("2025-08-15"))
                                                .denominator("4")
                                                .numerator("1")
                                                .splitType("stock-split")
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEventGetAllInstrumentEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventGetAllInstrumentEventsResponse),
                jacksonTypeRef<EventGetAllInstrumentEventsResponse>(),
            )

        assertThat(roundtrippedEventGetAllInstrumentEventsResponse)
            .isEqualTo(eventGetAllInstrumentEventsResponse)
    }
}
