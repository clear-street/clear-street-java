// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementAgreementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEntitlementAgreements() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementAgreementService = client.v1().omniAi().entitlementAgreements()

        val response = entitlementAgreementService.getEntitlementAgreements()

        response.validate()
    }
}
