// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentIpoEventTest {

    @Test
    fun create() {
        val instrumentIpoEvent =
            InstrumentIpoEvent.builder()
                .date(LocalDate.parse("2025-01-10"))
                .actions("Expected")
                .announcedAt(OffsetDateTime.parse("2025-01-05T14:30:00Z"))
                .company("Apple Inc.")
                .exchange("NASDAQ")
                .marketCap("2500000000")
                .priceRange("100.00 - 110.00")
                .shares("1000000")
                .build()

        assertThat(instrumentIpoEvent.date()).isEqualTo(LocalDate.parse("2025-01-10"))
        assertThat(instrumentIpoEvent.actions()).contains("Expected")
        assertThat(instrumentIpoEvent.announcedAt())
            .contains(OffsetDateTime.parse("2025-01-05T14:30:00Z"))
        assertThat(instrumentIpoEvent.company()).contains("Apple Inc.")
        assertThat(instrumentIpoEvent.exchange()).contains("NASDAQ")
        assertThat(instrumentIpoEvent.marketCap()).contains("2500000000")
        assertThat(instrumentIpoEvent.priceRange()).contains("100.00 - 110.00")
        assertThat(instrumentIpoEvent.shares()).contains("1000000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentIpoEvent =
            InstrumentIpoEvent.builder()
                .date(LocalDate.parse("2025-01-10"))
                .actions("Expected")
                .announcedAt(OffsetDateTime.parse("2025-01-05T14:30:00Z"))
                .company("Apple Inc.")
                .exchange("NASDAQ")
                .marketCap("2500000000")
                .priceRange("100.00 - 110.00")
                .shares("1000000")
                .build()

        val roundtrippedInstrumentIpoEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentIpoEvent),
                jacksonTypeRef<InstrumentIpoEvent>(),
            )

        assertThat(roundtrippedInstrumentIpoEvent).isEqualTo(instrumentIpoEvent)
    }
}
