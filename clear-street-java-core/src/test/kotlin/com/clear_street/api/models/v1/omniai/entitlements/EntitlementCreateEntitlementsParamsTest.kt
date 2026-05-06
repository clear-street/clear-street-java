// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

import com.clear_street.api.models.v1.omniai.EntitlementCode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCreateEntitlementsParamsTest {

    @Test
    fun create() {
        EntitlementCreateEntitlementsParams.builder()
            .agreementId("01JZ0000000000000000000000")
            .addRequestedEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
            .addTradingAccountId(100019L)
            .addTradingAccountId(100021L)
            .build()
    }

    @Test
    fun body() {
        val params =
            EntitlementCreateEntitlementsParams.builder()
                .agreementId("01JZ0000000000000000000000")
                .addRequestedEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .addTradingAccountId(100019L)
                .addTradingAccountId(100021L)
                .build()

        val body = params._body()

        assertThat(body.agreementId()).isEqualTo("01JZ0000000000000000000000")
        assertThat(body.requestedEntitlementCodes())
            .containsExactly(EntitlementCode.OMNI_ACCOUNT_DATA)
        assertThat(body.tradingAccountIds()).containsExactly(100019L, 100021L)
    }
}
