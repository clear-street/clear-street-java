// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NdaAcceptanceResourceTest {

    @Test
    fun create() {
        val ndaAcceptanceResource =
            NdaAcceptanceResource.builder()
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .version(0)
                .build()

        assertThat(ndaAcceptanceResource.acceptedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ndaAcceptanceResource.agreementId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ndaAcceptanceResource.version()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ndaAcceptanceResource =
            NdaAcceptanceResource.builder()
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .version(0)
                .build()

        val roundtrippedNdaAcceptanceResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ndaAcceptanceResource),
                jacksonTypeRef<NdaAcceptanceResource>(),
            )

        assertThat(roundtrippedNdaAcceptanceResource).isEqualTo(ndaAcceptanceResource)
    }
}
