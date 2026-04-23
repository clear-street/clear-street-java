// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementListEntitlementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEntitlements() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.active().v1().omniAi().entitlements()

        val response =
            entitlementService.createEntitlements(
                EntitlementCreateEntitlementsParams.builder()
                    .agreementId("01JZ0000000000000000000000")
                    .addRequestedEntitlementCode("omni.account_data")
                    .addTradingAccountId(100019L)
                    .addTradingAccountId(100021L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteEntitlement() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.active().v1().omniAi().entitlements()

        val response = entitlementService.deleteEntitlement("entitlement_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEntitlements() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.active().v1().omniAi().entitlements()

        val response =
            entitlementService.listEntitlements(
                EntitlementListEntitlementsParams.builder().tradingAccountId(0L).build()
            )

        response.validate()
    }
}
