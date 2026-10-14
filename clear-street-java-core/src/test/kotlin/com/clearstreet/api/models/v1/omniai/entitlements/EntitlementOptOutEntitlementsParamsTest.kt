// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.entitlements

import com.clearstreet.api.models.v1.omniai.EntitlementCode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementOptOutEntitlementsParamsTest {

    @Test
    fun create() {
        EntitlementOptOutEntitlementsParams.builder()
            .addAccountId(100019L)
            .addAccountId(100021L)
            .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
            .build()
    }

    @Test
    fun body() {
        val params =
            EntitlementOptOutEntitlementsParams.builder()
                .addAccountId(100019L)
                .addAccountId(100021L)
                .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .build()

        val body = params._body()

        assertThat(body.accountIds()).containsExactly(100019L, 100021L)
        assertThat(body.entitlementCodes()).containsExactly(EntitlementCode.OMNI_ACCOUNT_DATA)
    }
}
