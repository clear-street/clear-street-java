// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.entitlements

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.omniai.EntitlementCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementStatusResourceTest {

    @Test
    fun create() {
        val entitlementStatusResource =
            EntitlementStatusResource.builder()
                .accountId(0L)
                .enabled(true)
                .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .build()

        assertThat(entitlementStatusResource.accountId()).isEqualTo(0L)
        assertThat(entitlementStatusResource.enabled()).isEqualTo(true)
        assertThat(entitlementStatusResource.entitlementCode())
            .isEqualTo(EntitlementCode.OMNI_ACCOUNT_DATA)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementStatusResource =
            EntitlementStatusResource.builder()
                .accountId(0L)
                .enabled(true)
                .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .build()

        val roundtrippedEntitlementStatusResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementStatusResource),
                jacksonTypeRef<EntitlementStatusResource>(),
            )

        assertThat(roundtrippedEntitlementStatusResource).isEqualTo(entitlementStatusResource)
    }
}
