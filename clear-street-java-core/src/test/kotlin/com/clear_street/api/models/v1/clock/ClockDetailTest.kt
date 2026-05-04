// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.clock

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClockDetailTest {

    @Test
    fun create() {
        val clockDetail =
            ClockDetail.builder()
                .clock(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                .build()

        assertThat(clockDetail.clock())
            .isEqualTo(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clockDetail =
            ClockDetail.builder()
                .clock(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                .build()

        val roundtrippedClockDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clockDetail),
                jacksonTypeRef<ClockDetail>(),
            )

        assertThat(roundtrippedClockDetail).isEqualTo(clockDetail)
    }
}
