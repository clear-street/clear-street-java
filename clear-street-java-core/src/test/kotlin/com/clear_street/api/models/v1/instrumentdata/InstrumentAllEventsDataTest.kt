// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentAllEventsDataTest {

    @Test
    fun create() {
        val instrumentAllEventsData =
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
                                .reportingCurrency("reporting_currency")
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

        assertThat(instrumentAllEventsData.eventDates())
            .containsExactly(
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
                                    .announcedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .company("company")
                                    .exchange("exchange")
                                    .marketCap("market_cap")
                                    .priceRange("price_range")
                                    .shares("shares")
                                    .build()
                            )
                            .name("name")
                            .reportingCurrency("reporting_currency")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentAllEventsData =
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
                                .reportingCurrency("reporting_currency")
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

        val roundtrippedInstrumentAllEventsData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentAllEventsData),
                jacksonTypeRef<InstrumentAllEventsData>(),
            )

        assertThat(roundtrippedInstrumentAllEventsData).isEqualTo(instrumentAllEventsData)
    }
}
