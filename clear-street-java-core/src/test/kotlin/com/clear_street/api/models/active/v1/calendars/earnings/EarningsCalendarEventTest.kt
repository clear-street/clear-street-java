// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.earnings

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EarningsCalendarEventTest {

    @Test
    fun create() {
        val earningsCalendarEvent =
            EarningsCalendarEvent.builder()
                .date(LocalDate.parse("2025-10-28"))
                .lastUpdated(LocalDate.parse("2025-08-10"))
                .symbol("AAPL")
                .epsActual("1.30")
                .epsEstimated("1.25")
                .revenueActual("89400000000")
                .revenueEstimated("88900000000")
                .build()

        assertThat(earningsCalendarEvent.date()).isEqualTo(LocalDate.parse("2025-10-28"))
        assertThat(earningsCalendarEvent.lastUpdated()).isEqualTo(LocalDate.parse("2025-08-10"))
        assertThat(earningsCalendarEvent.symbol()).isEqualTo("AAPL")
        assertThat(earningsCalendarEvent.epsActual()).contains("1.30")
        assertThat(earningsCalendarEvent.epsEstimated()).contains("1.25")
        assertThat(earningsCalendarEvent.revenueActual()).contains("89400000000")
        assertThat(earningsCalendarEvent.revenueEstimated()).contains("88900000000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val earningsCalendarEvent =
            EarningsCalendarEvent.builder()
                .date(LocalDate.parse("2025-10-28"))
                .lastUpdated(LocalDate.parse("2025-08-10"))
                .symbol("AAPL")
                .epsActual("1.30")
                .epsEstimated("1.25")
                .revenueActual("89400000000")
                .revenueEstimated("88900000000")
                .build()

        val roundtrippedEarningsCalendarEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(earningsCalendarEvent),
                jacksonTypeRef<EarningsCalendarEvent>(),
            )

        assertThat(roundtrippedEarningsCalendarEvent).isEqualTo(earningsCalendarEvent)
    }
}
