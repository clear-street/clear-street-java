// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.economic

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EconomicCalendarEventTest {

    @Test
    fun create() {
        val economicCalendarEvent =
            EconomicCalendarEvent.builder()
                .country("JP")
                .currency("JPY")
                .eventName("3-Month Bill Auction")
                .eventTimestamp(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                .impact(EconomicEventImpact.LOW)
                .actualValue("-0.096")
                .changePercent("14.29")
                .estimatedValue("-0.100")
                .previousValue("-0.112")
                .build()

        assertThat(economicCalendarEvent.country()).isEqualTo("JP")
        assertThat(economicCalendarEvent.currency()).isEqualTo("JPY")
        assertThat(economicCalendarEvent.eventName()).isEqualTo("3-Month Bill Auction")
        assertThat(economicCalendarEvent.eventTimestamp())
            .isEqualTo(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
        assertThat(economicCalendarEvent.impact()).isEqualTo(EconomicEventImpact.LOW)
        assertThat(economicCalendarEvent.actualValue()).contains("-0.096")
        assertThat(economicCalendarEvent.changePercent()).contains("14.29")
        assertThat(economicCalendarEvent.estimatedValue()).contains("-0.100")
        assertThat(economicCalendarEvent.previousValue()).contains("-0.112")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val economicCalendarEvent =
            EconomicCalendarEvent.builder()
                .country("JP")
                .currency("JPY")
                .eventName("3-Month Bill Auction")
                .eventTimestamp(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                .impact(EconomicEventImpact.LOW)
                .actualValue("-0.096")
                .changePercent("14.29")
                .estimatedValue("-0.100")
                .previousValue("-0.112")
                .build()

        val roundtrippedEconomicCalendarEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(economicCalendarEvent),
                jacksonTypeRef<EconomicCalendarEvent>(),
            )

        assertThat(roundtrippedEconomicCalendarEvent).isEqualTo(economicCalendarEvent)
    }
}
