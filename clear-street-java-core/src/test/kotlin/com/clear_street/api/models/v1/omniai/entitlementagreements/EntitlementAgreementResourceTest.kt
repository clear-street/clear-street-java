// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlementagreements

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementAgreementResourceTest {

    @Test
    fun create() {
        val entitlementAgreementResource =
            EntitlementAgreementResource.builder()
                .agreementId("agreement_id")
                .agreementKey("agreement_key")
                .documentContent("document_content")
                .documentSha256("document_sha256")
                .addEntitlementCode("string")
                .title("title")
                .version(0)
                .build()

        assertThat(entitlementAgreementResource.agreementId()).isEqualTo("agreement_id")
        assertThat(entitlementAgreementResource.agreementKey()).isEqualTo("agreement_key")
        assertThat(entitlementAgreementResource.documentContent()).isEqualTo("document_content")
        assertThat(entitlementAgreementResource.documentSha256()).isEqualTo("document_sha256")
        assertThat(entitlementAgreementResource.entitlementCodes()).containsExactly("string")
        assertThat(entitlementAgreementResource.title()).isEqualTo("title")
        assertThat(entitlementAgreementResource.version()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementAgreementResource =
            EntitlementAgreementResource.builder()
                .agreementId("agreement_id")
                .agreementKey("agreement_key")
                .documentContent("document_content")
                .documentSha256("document_sha256")
                .addEntitlementCode("string")
                .title("title")
                .version(0)
                .build()

        val roundtrippedEntitlementAgreementResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementAgreementResource),
                jacksonTypeRef<EntitlementAgreementResource>(),
            )

        assertThat(roundtrippedEntitlementAgreementResource).isEqualTo(entitlementAgreementResource)
    }
}
