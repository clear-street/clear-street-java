// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NdaAgreementResourceTest {

    @Test
    fun create() {
        val ndaAgreementResource =
            NdaAgreementResource.builder()
                .acceptanceText("acceptance_text")
                .acceptanceTextVersion(0)
                .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentReference("document_reference")
                .documentSha256("document_sha256")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0)
                .build()

        assertThat(ndaAgreementResource.acceptanceText()).isEqualTo("acceptance_text")
        assertThat(ndaAgreementResource.acceptanceTextVersion()).isEqualTo(0)
        assertThat(ndaAgreementResource.agreementId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ndaAgreementResource.documentReference()).isEqualTo("document_reference")
        assertThat(ndaAgreementResource.documentSha256()).isEqualTo("document_sha256")
        assertThat(ndaAgreementResource.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ndaAgreementResource.version()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ndaAgreementResource =
            NdaAgreementResource.builder()
                .acceptanceText("acceptance_text")
                .acceptanceTextVersion(0)
                .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentReference("document_reference")
                .documentSha256("document_sha256")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0)
                .build()

        val roundtrippedNdaAgreementResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ndaAgreementResource),
                jacksonTypeRef<NdaAgreementResource>(),
            )

        assertThat(roundtrippedNdaAgreementResource).isEqualTo(ndaAgreementResource)
    }
}
