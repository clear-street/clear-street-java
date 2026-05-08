// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementResourceTest {

    @Test
    fun create() {
        val entitlementResource =
            EntitlementResource.builder()
                .agreementId("agreement_id")
                .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .entitlementId("entitlement_id")
                .grantedAt("granted_at")
                .tradingAccountId(0L)
                .build()

        assertThat(entitlementResource.agreementId()).isEqualTo("agreement_id")
        assertThat(entitlementResource.entitlementCode())
            .isEqualTo(EntitlementCode.OMNI_ACCOUNT_DATA)
        assertThat(entitlementResource.entitlementId()).isEqualTo("entitlement_id")
        assertThat(entitlementResource.grantedAt()).isEqualTo("granted_at")
        assertThat(entitlementResource.tradingAccountId()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementResource =
            EntitlementResource.builder()
                .agreementId("agreement_id")
                .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .entitlementId("entitlement_id")
                .grantedAt("granted_at")
                .tradingAccountId(0L)
                .build()

        val roundtrippedEntitlementResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementResource),
                jacksonTypeRef<EntitlementResource>(),
            )

        assertThat(roundtrippedEntitlementResource).isEqualTo(entitlementResource)
    }
}
