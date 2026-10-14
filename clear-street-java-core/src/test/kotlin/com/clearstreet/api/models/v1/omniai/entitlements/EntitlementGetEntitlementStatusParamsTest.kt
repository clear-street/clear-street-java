// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.entitlements

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementGetEntitlementStatusParamsTest {

    @Test
    fun create() {
        EntitlementGetEntitlementStatusParams.builder().accountId(0L).build()
    }

    @Test
    fun queryParams() {
        val params = EntitlementGetEntitlementStatusParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("account_id", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntitlementGetEntitlementStatusParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
