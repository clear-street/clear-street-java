// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.venues

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VenueSessionTest {

    @Test
    fun create() {
        val venueSession =
            VenueSession.builder().endLocal("16:00").name("CONTINUOUS").startLocal("09:30").build()

        assertThat(venueSession.endLocal()).isEqualTo("16:00")
        assertThat(venueSession.name()).isEqualTo("CONTINUOUS")
        assertThat(venueSession.startLocal()).isEqualTo("09:30")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val venueSession =
            VenueSession.builder().endLocal("16:00").name("CONTINUOUS").startLocal("09:30").build()

        val roundtrippedVenueSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(venueSession),
                jacksonTypeRef<VenueSession>(),
            )

        assertThat(roundtrippedVenueSession).isEqualTo(venueSession)
    }
}
