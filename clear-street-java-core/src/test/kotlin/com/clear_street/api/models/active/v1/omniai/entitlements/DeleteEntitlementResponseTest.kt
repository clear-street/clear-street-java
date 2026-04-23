// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.entitlements

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeleteEntitlementResponseTest {

    @Test
    fun create() {
        val deleteEntitlementResponse =
            DeleteEntitlementResponse.builder()
                .entitlementId("entitlement_id")
                .revoked(true)
                .build()

        assertThat(deleteEntitlementResponse.entitlementId()).isEqualTo("entitlement_id")
        assertThat(deleteEntitlementResponse.revoked()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deleteEntitlementResponse =
            DeleteEntitlementResponse.builder()
                .entitlementId("entitlement_id")
                .revoked(true)
                .build()

        val roundtrippedDeleteEntitlementResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteEntitlementResponse),
                jacksonTypeRef<DeleteEntitlementResponse>(),
            )

        assertThat(roundtrippedDeleteEntitlementResponse).isEqualTo(deleteEntitlementResponse)
    }
}
