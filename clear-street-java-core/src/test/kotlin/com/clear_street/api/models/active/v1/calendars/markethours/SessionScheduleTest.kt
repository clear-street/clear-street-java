// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.markethours

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionScheduleTest {

    @Test
    fun create() {
        val sessionSchedule =
            SessionSchedule.builder()
                .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                .timeUntilClose("PT1H30M")
                .timeUntilOpen(null)
                .build()

        assertThat(sessionSchedule.close())
            .isEqualTo(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
        assertThat(sessionSchedule.open())
            .isEqualTo(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
        assertThat(sessionSchedule.timeUntilClose()).contains("PT1H30M")
        assertThat(sessionSchedule.timeUntilOpen()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionSchedule =
            SessionSchedule.builder()
                .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                .timeUntilClose("PT1H30M")
                .timeUntilOpen(null)
                .build()

        val roundtrippedSessionSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionSchedule),
                jacksonTypeRef<SessionSchedule>(),
            )

        assertThat(roundtrippedSessionSchedule).isEqualTo(sessionSchedule)
    }
}
