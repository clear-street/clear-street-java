// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateOrderStatus
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LocateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLocateRequest() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val locateServiceAsync = client.active().v1().accounts().locates()

        val responseFuture =
            locateServiceAsync.createLocateRequest(
                LocateCreateLocateRequestParams.builder()
                    .accountId(0L)
                    .addBody(
                        LocateCreateLocateRequestParams.Body.builder()
                            .quantity(500L)
                            .symbol("AAPL")
                            .comments("Locate for earnings play")
                            .referenceId("my-locate-batch-001")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocateRequests() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val locateServiceAsync = client.active().v1().accounts().locates()

        val responseFuture =
            locateServiceAsync.getLocateRequests(
                LocateGetLocateRequestsParams.builder()
                    .accountId(0L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .referenceId("reference_id")
                    .status(LocateOrderStatus.PENDING)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateLocateRequest() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val locateServiceAsync = client.active().v1().accounts().locates()

        val responseFuture =
            locateServiceAsync.updateLocateRequest(
                LocateUpdateLocateRequestParams.builder().accountId(0L).accept(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
