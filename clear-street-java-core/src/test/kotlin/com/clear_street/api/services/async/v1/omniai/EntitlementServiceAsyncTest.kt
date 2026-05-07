// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.omniai.EntitlementCode
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementGetEntitlementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEntitlements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().omniAi().entitlements()

        val responseFuture =
            entitlementServiceAsync.createEntitlements(
                EntitlementCreateEntitlementsParams.builder()
                    .agreementId("01JZ0000000000000000000000")
                    .addRequestedEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                    .addTradingAccountId(100019L)
                    .addTradingAccountId(100021L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteEntitlement() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().omniAi().entitlements()

        val responseFuture = entitlementServiceAsync.deleteEntitlement("entitlement_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEntitlements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().omniAi().entitlements()

        val responseFuture =
            entitlementServiceAsync.getEntitlements(
                EntitlementGetEntitlementsParams.builder().tradingAccountId(0L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
