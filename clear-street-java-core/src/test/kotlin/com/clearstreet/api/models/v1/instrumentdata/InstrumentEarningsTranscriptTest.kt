// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentEarningsTranscriptTest {

    @Test
    fun create() {
        val instrumentEarningsTranscript =
            InstrumentEarningsTranscript.builder()
                .content(
                    "Operator: Good afternoon, and welcome to the Apple Q3 2025 earnings call..."
                )
                .date(LocalDate.parse("2025-07-31"))
                .period(FiscalQuarter.Q3)
                .periodType(FiscalPeriodType.QUARTERLY)
                .year(2025)
                .build()

        assertThat(instrumentEarningsTranscript.content())
            .isEqualTo(
                "Operator: Good afternoon, and welcome to the Apple Q3 2025 earnings call..."
            )
        assertThat(instrumentEarningsTranscript.date()).isEqualTo(LocalDate.parse("2025-07-31"))
        assertThat(instrumentEarningsTranscript.period()).isEqualTo(FiscalQuarter.Q3)
        assertThat(instrumentEarningsTranscript.periodType()).isEqualTo(FiscalPeriodType.QUARTERLY)
        assertThat(instrumentEarningsTranscript.year()).isEqualTo(2025)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentEarningsTranscript =
            InstrumentEarningsTranscript.builder()
                .content(
                    "Operator: Good afternoon, and welcome to the Apple Q3 2025 earnings call..."
                )
                .date(LocalDate.parse("2025-07-31"))
                .period(FiscalQuarter.Q3)
                .periodType(FiscalPeriodType.QUARTERLY)
                .year(2025)
                .build()

        val roundtrippedInstrumentEarningsTranscript =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentEarningsTranscript),
                jacksonTypeRef<InstrumentEarningsTranscript>(),
            )

        assertThat(roundtrippedInstrumentEarningsTranscript).isEqualTo(instrumentEarningsTranscript)
    }
}
