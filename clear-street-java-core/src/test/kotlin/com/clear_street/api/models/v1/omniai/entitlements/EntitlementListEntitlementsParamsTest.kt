// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementListEntitlementsParamsTest {

    @Test
    fun create() {
        EntitlementListEntitlementsParams.builder().tradingAccountId(0L).build()
    }

    @Test
    fun queryParams() {
        val params = EntitlementListEntitlementsParams.builder().tradingAccountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("trading_account_id", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntitlementListEntitlementsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
