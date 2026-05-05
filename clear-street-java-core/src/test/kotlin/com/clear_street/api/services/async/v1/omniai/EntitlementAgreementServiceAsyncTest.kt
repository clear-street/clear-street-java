// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementAgreementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEntitlementAgreements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementAgreementServiceAsync = client.v1().omniAi().entitlementAgreements()

        val responseFuture = entitlementAgreementServiceAsync.getEntitlementAgreements()

        val response = responseFuture.get()
        response.validate()
    }
}
