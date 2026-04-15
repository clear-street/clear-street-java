// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.dividends

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DividendCalendarEventTest {

    @Test
    fun create() {
        val dividendCalendarEvent =
            DividendCalendarEvent.builder()
                .adjustedDividend("0.75")
                .date(LocalDate.parse("2025-11-19"))
                .dividend("0.75")
                .symbol("MSFT")
                .declarationDate(LocalDate.parse("2025-09-17"))
                .frequency(DividendFrequency.QUARTERLY)
                .paymentDate(LocalDate.parse("2025-12-11"))
                .recordDate(LocalDate.parse("2025-11-20"))
                .yield("0.02")
                .build()

        assertThat(dividendCalendarEvent.adjustedDividend()).isEqualTo("0.75")
        assertThat(dividendCalendarEvent.date()).isEqualTo(LocalDate.parse("2025-11-19"))
        assertThat(dividendCalendarEvent.dividend()).isEqualTo("0.75")
        assertThat(dividendCalendarEvent.symbol()).isEqualTo("MSFT")
        assertThat(dividendCalendarEvent.declarationDate()).contains(LocalDate.parse("2025-09-17"))
        assertThat(dividendCalendarEvent.frequency()).contains(DividendFrequency.QUARTERLY)
        assertThat(dividendCalendarEvent.paymentDate()).contains(LocalDate.parse("2025-12-11"))
        assertThat(dividendCalendarEvent.recordDate()).contains(LocalDate.parse("2025-11-20"))
        assertThat(dividendCalendarEvent.yield()).contains("0.02")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dividendCalendarEvent =
            DividendCalendarEvent.builder()
                .adjustedDividend("0.75")
                .date(LocalDate.parse("2025-11-19"))
                .dividend("0.75")
                .symbol("MSFT")
                .declarationDate(LocalDate.parse("2025-09-17"))
                .frequency(DividendFrequency.QUARTERLY)
                .paymentDate(LocalDate.parse("2025-12-11"))
                .recordDate(LocalDate.parse("2025-11-20"))
                .yield("0.02")
                .build()

        val roundtrippedDividendCalendarEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dividendCalendarEvent),
                jacksonTypeRef<DividendCalendarEvent>(),
            )

        assertThat(roundtrippedDividendCalendarEvent).isEqualTo(dividendCalendarEvent)
    }
}
