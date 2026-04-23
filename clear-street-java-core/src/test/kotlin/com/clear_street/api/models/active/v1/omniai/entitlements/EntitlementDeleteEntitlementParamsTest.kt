// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.entitlements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementDeleteEntitlementParamsTest {

    @Test
    fun create() {
        EntitlementDeleteEntitlementParams.builder().entitlementId("entitlement_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            EntitlementDeleteEntitlementParams.builder().entitlementId("entitlement_id").build()

        assertThat(params._pathParam(0)).isEqualTo("entitlement_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
