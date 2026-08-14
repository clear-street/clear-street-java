// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingParticipantResourceTest {

    @Test
    fun create() {
        val offeringParticipantResource =
            OfferingParticipantResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayOrder(0)
                .name("name")
                .role(ParticipantRole.LEAD_INVESTOR)
                .build()

        assertThat(offeringParticipantResource.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offeringParticipantResource.displayOrder()).isEqualTo(0)
        assertThat(offeringParticipantResource.name()).isEqualTo("name")
        assertThat(offeringParticipantResource.role()).isEqualTo(ParticipantRole.LEAD_INVESTOR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringParticipantResource =
            OfferingParticipantResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayOrder(0)
                .name("name")
                .role(ParticipantRole.LEAD_INVESTOR)
                .build()

        val roundtrippedOfferingParticipantResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringParticipantResource),
                jacksonTypeRef<OfferingParticipantResource>(),
            )

        assertThat(roundtrippedOfferingParticipantResource).isEqualTo(offeringParticipantResource)
    }
}
