// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenEntitlementConsentActionTest {

    @Test
    fun create() {
        val openEntitlementConsentAction =
            OpenEntitlementConsentAction.builder()
                .agreementKey("omni_account_data_access")
                .reason("Portfolio analysis requires Omni consent to access account data.")
                .addRequestedEntitlementCode("omni.account_data")
                .addTradingAccountId(100019L)
                .build()

        assertThat(openEntitlementConsentAction.agreementKey())
            .isEqualTo("omni_account_data_access")
        assertThat(openEntitlementConsentAction.reason())
            .isEqualTo("Portfolio analysis requires Omni consent to access account data.")
        assertThat(openEntitlementConsentAction.requestedEntitlementCodes())
            .containsExactly("omni.account_data")
        assertThat(openEntitlementConsentAction.tradingAccountIds()).containsExactly(100019L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openEntitlementConsentAction =
            OpenEntitlementConsentAction.builder()
                .agreementKey("omni_account_data_access")
                .reason("Portfolio analysis requires Omni consent to access account data.")
                .addRequestedEntitlementCode("omni.account_data")
                .addTradingAccountId(100019L)
                .build()

        val roundtrippedOpenEntitlementConsentAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openEntitlementConsentAction),
                jacksonTypeRef<OpenEntitlementConsentAction>(),
            )

        assertThat(roundtrippedOpenEntitlementConsentAction).isEqualTo(openEntitlementConsentAction)
    }
}
