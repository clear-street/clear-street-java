// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.summary

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarDateSummaryTest {

    @Test
    fun create() {
        val calendarDateSummary =
            CalendarDateSummary.builder()
                .date(LocalDate.parse("2025-10-28"))
                .dividendsCount(75L)
                .earningsCount(150L)
                .economicEventsCount(20L)
                .mergersAcquisitionsCount(2L)
                .stockSplitsCount(5L)
                .build()

        assertThat(calendarDateSummary.date()).isEqualTo(LocalDate.parse("2025-10-28"))
        assertThat(calendarDateSummary.dividendsCount()).isEqualTo(75L)
        assertThat(calendarDateSummary.earningsCount()).isEqualTo(150L)
        assertThat(calendarDateSummary.economicEventsCount()).isEqualTo(20L)
        assertThat(calendarDateSummary.mergersAcquisitionsCount()).isEqualTo(2L)
        assertThat(calendarDateSummary.stockSplitsCount()).isEqualTo(5L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarDateSummary =
            CalendarDateSummary.builder()
                .date(LocalDate.parse("2025-10-28"))
                .dividendsCount(75L)
                .earningsCount(150L)
                .economicEventsCount(20L)
                .mergersAcquisitionsCount(2L)
                .stockSplitsCount(5L)
                .build()

        val roundtrippedCalendarDateSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarDateSummary),
                jacksonTypeRef<CalendarDateSummary>(),
            )

        assertThat(roundtrippedCalendarDateSummary).isEqualTo(calendarDateSummary)
    }
}
