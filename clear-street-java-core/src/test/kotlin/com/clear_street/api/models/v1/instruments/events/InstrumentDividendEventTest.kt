// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDividendEventTest {

    @Test
    fun create() {
        val instrumentDividendEvent =
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

        assertThat(instrumentDividendEvent.adjustedDividendAmount()).isEqualTo("0.88")
        assertThat(instrumentDividendEvent.exDate()).isEqualTo(LocalDate.parse("2025-08-15"))
        assertThat(instrumentDividendEvent.declarationDate())
            .contains(LocalDate.parse("2025-07-25"))
        assertThat(instrumentDividendEvent.dividendAmount()).contains("0.88")
        assertThat(instrumentDividendEvent.dividendYield()).contains("1.25")
        assertThat(instrumentDividendEvent.frequency()).contains("Quarterly")
        assertThat(instrumentDividendEvent.paymentDate()).contains(LocalDate.parse("2025-08-20"))
        assertThat(instrumentDividendEvent.recordDate()).contains(LocalDate.parse("2025-08-01"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentDividendEvent =
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

        val roundtrippedInstrumentDividendEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentDividendEvent),
                jacksonTypeRef<InstrumentDividendEvent>(),
            )

        assertThat(roundtrippedInstrumentDividendEvent).isEqualTo(instrumentDividendEvent)
    }
}
