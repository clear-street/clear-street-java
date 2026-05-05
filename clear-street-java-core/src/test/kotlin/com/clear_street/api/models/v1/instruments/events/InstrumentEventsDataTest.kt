// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.instruments.InstrumentEarnings
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentEventsDataTest {

    @Test
    fun create() {
        val instrumentEventsData =
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
                .build()

        assertThat(instrumentEventsData.dividends())
            .containsExactly(
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
        assertThat(instrumentEventsData.earnings())
            .containsExactly(
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
        assertThat(instrumentEventsData.instrumentId())
            .isEqualTo("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
        assertThat(instrumentEventsData.splits())
            .containsExactly(
                InstrumentSplitEvent.builder()
                    .date(LocalDate.parse("2020-08-31"))
                    .denominator("1")
                    .numerator("4")
                    .splitType("stock-split")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentEventsData =
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
                .build()

        val roundtrippedInstrumentEventsData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentEventsData),
                jacksonTypeRef<InstrumentEventsData>(),
            )

        assertThat(roundtrippedInstrumentEventsData).isEqualTo(instrumentEventsData)
    }
}
