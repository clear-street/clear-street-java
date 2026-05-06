// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenEntitlementConsentActionTest {

    @Test
    fun create() {
        val openEntitlementConsentAction =
            OpenEntitlementConsentAction.builder()
                .agreementKey(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
                .reason("Portfolio analysis requires Omni consent to access account data.")
                .addRequestedEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .addTradingAccountId(100019L)
                .build()

        assertThat(openEntitlementConsentAction.agreementKey())
            .isEqualTo(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
        assertThat(openEntitlementConsentAction.reason())
            .isEqualTo("Portfolio analysis requires Omni consent to access account data.")
        assertThat(openEntitlementConsentAction.requestedEntitlementCodes())
            .containsExactly(EntitlementCode.OMNI_ACCOUNT_DATA)
        assertThat(openEntitlementConsentAction.tradingAccountIds()).containsExactly(100019L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openEntitlementConsentAction =
            OpenEntitlementConsentAction.builder()
                .agreementKey(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
                .reason("Portfolio analysis requires Omni consent to access account data.")
                .addRequestedEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
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
