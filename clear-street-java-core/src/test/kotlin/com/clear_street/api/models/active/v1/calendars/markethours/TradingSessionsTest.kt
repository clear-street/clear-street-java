// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.markethours

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TradingSessionsTest {

    @Test
    fun create() {
        val tradingSessions =
            TradingSessions.builder()
                .afterHours(
                    SessionSchedule.builder()
                        .close(OffsetDateTime.parse("2025-10-15T20:00:00-04:00"))
                        .open(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                        .timeUntilClose("PT1H30M")
                        .timeUntilOpen(null)
                        .build()
                )
                .preMarket(
                    SessionSchedule.builder()
                        .close(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                        .open(OffsetDateTime.parse("2025-10-15T04:00:00-04:00"))
                        .timeUntilClose("PT1H30M")
                        .timeUntilOpen(null)
                        .build()
                )
                .regular(
                    SessionSchedule.builder()
                        .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                        .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                        .timeUntilClose("PT1H30M")
                        .timeUntilOpen(null)
                        .build()
                )
                .build()

        assertThat(tradingSessions.afterHours())
            .contains(
                SessionSchedule.builder()
                    .close(OffsetDateTime.parse("2025-10-15T20:00:00-04:00"))
                    .open(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                    .timeUntilClose("PT1H30M")
                    .timeUntilOpen(null)
                    .build()
            )
        assertThat(tradingSessions.preMarket())
            .contains(
                SessionSchedule.builder()
                    .close(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                    .open(OffsetDateTime.parse("2025-10-15T04:00:00-04:00"))
                    .timeUntilClose("PT1H30M")
                    .timeUntilOpen(null)
                    .build()
            )
        assertThat(tradingSessions.regular())
            .contains(
                SessionSchedule.builder()
                    .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                    .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                    .timeUntilClose("PT1H30M")
                    .timeUntilOpen(null)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tradingSessions =
            TradingSessions.builder()
                .afterHours(
                    SessionSchedule.builder()
                        .close(OffsetDateTime.parse("2025-10-15T20:00:00-04:00"))
                        .open(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                        .timeUntilClose("PT1H30M")
                        .timeUntilOpen(null)
                        .build()
                )
                .preMarket(
                    SessionSchedule.builder()
                        .close(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                        .open(OffsetDateTime.parse("2025-10-15T04:00:00-04:00"))
                        .timeUntilClose("PT1H30M")
                        .timeUntilOpen(null)
                        .build()
                )
                .regular(
                    SessionSchedule.builder()
                        .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                        .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                        .timeUntilClose("PT1H30M")
                        .timeUntilOpen(null)
                        .build()
                )
                .build()

        val roundtrippedTradingSessions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tradingSessions),
                jacksonTypeRef<TradingSessions>(),
            )

        assertThat(roundtrippedTradingSessions).isEqualTo(tradingSessions)
    }
}
