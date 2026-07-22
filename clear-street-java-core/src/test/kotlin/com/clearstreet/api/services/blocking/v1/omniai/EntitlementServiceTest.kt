// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.omniai

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.omniai.EntitlementCode
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntitlementServiceTest {

    @Test
    fun createEntitlements() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementService = client.v1().omniAi().entitlements()

        val response =
            entitlementService.createEntitlements(
                EntitlementCreateEntitlementsParams.builder()
                    .addAccountId(100019L)
                    .addAccountId(100021L)
                    .agreementId("01JZ0000000000000000000000")
                    .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                    .build()
            )

        response.validate()
    }

    @Test
    fun deleteEntitlement() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementService = client.v1().omniAi().entitlements()

        val response = entitlementService.deleteEntitlement("entitlement_id")

        response.validate()
    }

    @Test
    fun getEntitlementAgreements() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementService = client.v1().omniAi().entitlements()

        val response = entitlementService.getEntitlementAgreements()

        response.validate()
    }

    @Test
    fun getEntitlements() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entitlementService = client.v1().omniAi().entitlements()

        val response =
            entitlementService.getEntitlements(
                EntitlementGetEntitlementsParams.builder().accountId(0L).build()
            )

        response.validate()
    }
}
