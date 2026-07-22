// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.entitlements

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.omniai.EntitlementCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementResourceTest {

    @Test
    fun create() {
        val entitlementResource =
            EntitlementResource.builder()
                .accountId(0L)
                .agreementId("agreement_id")
                .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .entitlementId("entitlement_id")
                .grantedAt("granted_at")
                .build()

        assertThat(entitlementResource.accountId()).isEqualTo(0L)
        assertThat(entitlementResource.agreementId()).isEqualTo("agreement_id")
        assertThat(entitlementResource.entitlementCode())
            .isEqualTo(EntitlementCode.OMNI_ACCOUNT_DATA)
        assertThat(entitlementResource.entitlementId()).isEqualTo("entitlement_id")
        assertThat(entitlementResource.grantedAt()).isEqualTo("granted_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementResource =
            EntitlementResource.builder()
                .accountId(0L)
                .agreementId("agreement_id")
                .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .entitlementId("entitlement_id")
                .grantedAt("granted_at")
                .build()

        val roundtrippedEntitlementResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementResource),
                jacksonTypeRef<EntitlementResource>(),
            )

        assertThat(roundtrippedEntitlementResource).isEqualTo(entitlementResource)
    }
}
