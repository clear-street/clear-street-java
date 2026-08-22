// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingSpvTest {

    @Test
    fun create() {
        val offeringSpv =
            OfferingSpv.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .status(SpvStatus.DRAFT)
                .custodianName("custodian_name")
                .managerName("manager_name")
                .ndaAgreement(
                    NdaAgreementResource.builder()
                        .acceptanceText("acceptance_text")
                        .acceptanceTextVersion(0)
                        .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .documentReference("document_reference")
                        .documentSha256("document_sha256")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(0)
                        .build()
                )
                .shareClass("share_class")
                .structureDescription("structure_description")
                .build()

        assertThat(offeringSpv.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offeringSpv.name()).isEqualTo("name")
        assertThat(offeringSpv.status()).isEqualTo(SpvStatus.DRAFT)
        assertThat(offeringSpv.custodianName()).contains("custodian_name")
        assertThat(offeringSpv.managerName()).contains("manager_name")
        assertThat(offeringSpv.ndaAgreement())
            .contains(
                NdaAgreementResource.builder()
                    .acceptanceText("acceptance_text")
                    .acceptanceTextVersion(0)
                    .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentReference("document_reference")
                    .documentSha256("document_sha256")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .version(0)
                    .build()
            )
        assertThat(offeringSpv.shareClass()).contains("share_class")
        assertThat(offeringSpv.structureDescription()).contains("structure_description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringSpv =
            OfferingSpv.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .status(SpvStatus.DRAFT)
                .custodianName("custodian_name")
                .managerName("manager_name")
                .ndaAgreement(
                    NdaAgreementResource.builder()
                        .acceptanceText("acceptance_text")
                        .acceptanceTextVersion(0)
                        .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .documentReference("document_reference")
                        .documentSha256("document_sha256")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(0)
                        .build()
                )
                .shareClass("share_class")
                .structureDescription("structure_description")
                .build()

        val roundtrippedOfferingSpv =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringSpv),
                jacksonTypeRef<OfferingSpv>(),
            )

        assertThat(roundtrippedOfferingSpv).isEqualTo(offeringSpv)
    }
}
