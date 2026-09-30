// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.calendar

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EconomicEventTest {

    @Test
    fun create() {
        val economicEvent =
            EconomicEvent.builder()
                .country("US")
                .name("CPI m/m")
                .timestamp(OffsetDateTime.parse("2026-09-25T12:30:00.000000000Z"))
                .actual(null)
                .change(null)
                .changePercentage(null)
                .currency("USD")
                .estimate("0.30")
                .impact(EconomicEventImpact.HIGH)
                .previous("0.20")
                .unit("%")
                .build()

        assertThat(economicEvent.country()).isEqualTo("US")
        assertThat(economicEvent.name()).isEqualTo("CPI m/m")
        assertThat(economicEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2026-09-25T12:30:00.000000000Z"))
        assertThat(economicEvent.actual()).isEmpty
        assertThat(economicEvent.change()).isEmpty
        assertThat(economicEvent.changePercentage()).isEmpty
        assertThat(economicEvent.currency()).contains("USD")
        assertThat(economicEvent.estimate()).contains("0.30")
        assertThat(economicEvent.impact()).contains(EconomicEventImpact.HIGH)
        assertThat(economicEvent.previous()).contains("0.20")
        assertThat(economicEvent.unit()).contains("%")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val economicEvent =
            EconomicEvent.builder()
                .country("US")
                .name("CPI m/m")
                .timestamp(OffsetDateTime.parse("2026-09-25T12:30:00.000000000Z"))
                .actual(null)
                .change(null)
                .changePercentage(null)
                .currency("USD")
                .estimate("0.30")
                .impact(EconomicEventImpact.HIGH)
                .previous("0.20")
                .unit("%")
                .build()

        val roundtrippedEconomicEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(economicEvent),
                jacksonTypeRef<EconomicEvent>(),
            )

        assertThat(roundtrippedEconomicEvent).isEqualTo(economicEvent)
    }
}
