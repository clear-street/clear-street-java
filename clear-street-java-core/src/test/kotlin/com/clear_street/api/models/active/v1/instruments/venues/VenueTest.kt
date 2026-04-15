// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.venues

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VenueTest {

    @Test
    fun create() {
        val venue =
            Venue.builder()
                .country("US")
                .displayType(DisplayType.LIT)
                .gtdAccepts(GtdAccepts.builder().date(true).timestamp(true).build())
                .lotSize(100L)
                .mic("XNMS")
                .name("Nasdaq")
                .addSession(
                    VenueSession.builder()
                        .endLocal("16:00")
                        .name("CONTINUOUS")
                        .startLocal("09:30")
                        .build()
                )
                .supportedOrderTypes(listOf("MARKET", "LIMIT", "STOP", "STOP_LIMIT"))
                .supportedTifs(
                    listOf("DAY", "GOOD_TILL_CANCEL", "IMMEDIATE_OR_CANCEL", "FILL_OR_KILL")
                )
                .tickSize("tick_size")
                .timezone("America/New_York")
                .build()

        assertThat(venue.country()).isEqualTo("US")
        assertThat(venue.displayType()).isEqualTo(DisplayType.LIT)
        assertThat(venue.gtdAccepts())
            .isEqualTo(GtdAccepts.builder().date(true).timestamp(true).build())
        assertThat(venue.lotSize()).isEqualTo(100L)
        assertThat(venue.mic()).isEqualTo("XNMS")
        assertThat(venue.name()).isEqualTo("Nasdaq")
        assertThat(venue.sessions())
            .containsExactly(
                VenueSession.builder()
                    .endLocal("16:00")
                    .name("CONTINUOUS")
                    .startLocal("09:30")
                    .build()
            )
        assertThat(venue.supportedOrderTypes())
            .containsExactly("MARKET", "LIMIT", "STOP", "STOP_LIMIT")
        assertThat(venue.supportedTifs())
            .containsExactly("DAY", "GOOD_TILL_CANCEL", "IMMEDIATE_OR_CANCEL", "FILL_OR_KILL")
        assertThat(venue.tickSize()).isEqualTo("tick_size")
        assertThat(venue.timezone()).isEqualTo("America/New_York")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val venue =
            Venue.builder()
                .country("US")
                .displayType(DisplayType.LIT)
                .gtdAccepts(GtdAccepts.builder().date(true).timestamp(true).build())
                .lotSize(100L)
                .mic("XNMS")
                .name("Nasdaq")
                .addSession(
                    VenueSession.builder()
                        .endLocal("16:00")
                        .name("CONTINUOUS")
                        .startLocal("09:30")
                        .build()
                )
                .supportedOrderTypes(listOf("MARKET", "LIMIT", "STOP", "STOP_LIMIT"))
                .supportedTifs(
                    listOf("DAY", "GOOD_TILL_CANCEL", "IMMEDIATE_OR_CANCEL", "FILL_OR_KILL")
                )
                .tickSize("tick_size")
                .timezone("America/New_York")
                .build()

        val roundtrippedVenue =
            jsonMapper.readValue(jsonMapper.writeValueAsString(venue), jacksonTypeRef<Venue>())

        assertThat(roundtrippedVenue).isEqualTo(venue)
    }
}
