// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCreateEntitlementsParamsTest {

    @Test
    fun create() {
        EntitlementCreateEntitlementsParams.builder()
            .addAccountId(100019L)
            .addAccountId(100021L)
            .agreementId("01JZ0000000000000000000000")
            .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
            .build()
    }

    @Test
    fun body() {
        val params =
            EntitlementCreateEntitlementsParams.builder()
                .addAccountId(100019L)
                .addAccountId(100021L)
                .agreementId("01JZ0000000000000000000000")
                .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .build()

        val body = params._body()

        assertThat(body.accountIds()).containsExactly(100019L, 100021L)
        assertThat(body.agreementId()).isEqualTo("01JZ0000000000000000000000")
        assertThat(body.entitlementCodes()).containsExactly(EntitlementCode.OMNI_ACCOUNT_DATA)
    }
}
