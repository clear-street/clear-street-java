// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementAgreementKey
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenEntitlementConsentActionTest {

    @Test
    fun create() {
        val openEntitlementConsentAction =
            OpenEntitlementConsentAction.builder()
                .addAccountId(100019L)
                .agreementKey(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
                .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .reason("Portfolio analysis requires Omni consent to access account data.")
                .build()

        assertThat(openEntitlementConsentAction.accountIds()).containsExactly(100019L)
        assertThat(openEntitlementConsentAction.agreementKey())
            .isEqualTo(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
        assertThat(openEntitlementConsentAction.entitlementCodes())
            .containsExactly(EntitlementCode.OMNI_ACCOUNT_DATA)
        assertThat(openEntitlementConsentAction.reason())
            .isEqualTo("Portfolio analysis requires Omni consent to access account data.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openEntitlementConsentAction =
            OpenEntitlementConsentAction.builder()
                .addAccountId(100019L)
                .agreementKey(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
                .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                .reason("Portfolio analysis requires Omni consent to access account data.")
                .build()

        val roundtrippedOpenEntitlementConsentAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openEntitlementConsentAction),
                jacksonTypeRef<OpenEntitlementConsentAction>(),
            )

        assertThat(roundtrippedOpenEntitlementConsentAction).isEqualTo(openEntitlementConsentAction)
    }
}
