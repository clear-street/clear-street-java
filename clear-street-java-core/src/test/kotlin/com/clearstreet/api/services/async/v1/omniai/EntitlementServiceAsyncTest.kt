// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.omniai

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.omniai.EntitlementCode
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntitlementServiceAsyncTest {

    @Test
    fun createEntitlements() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementServiceAsync = client.v1().omniAi().entitlements()

        val responseFuture =
            entitlementServiceAsync.createEntitlements(
                EntitlementCreateEntitlementsParams.builder()
                    .addAccountId(100019L)
                    .addAccountId(100021L)
                    .agreementId("01JZ0000000000000000000000")
                    .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun deleteEntitlement() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementServiceAsync = client.v1().omniAi().entitlements()

        val responseFuture = entitlementServiceAsync.deleteEntitlement("entitlement_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getEntitlementAgreements() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementServiceAsync = client.v1().omniAi().entitlements()

        val responseFuture = entitlementServiceAsync.getEntitlementAgreements()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getEntitlements() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementServiceAsync = client.v1().omniAi().entitlements()

        val responseFuture =
            entitlementServiceAsync.getEntitlements(
                EntitlementGetEntitlementsParams.builder().accountId(0L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
