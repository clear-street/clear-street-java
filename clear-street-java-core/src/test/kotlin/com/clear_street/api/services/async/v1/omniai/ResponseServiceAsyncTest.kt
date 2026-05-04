// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.omniai.responses.ResponseCancelResponseParams
import com.clear_street.api.models.v1.omniai.responses.ResponseGetResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelResponse() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.v1().omniAi().responses()

        val responseFuture =
            responseServiceAsync.cancelResponse(
                ResponseCancelResponseParams.builder()
                    .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResponse() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.v1().omniAi().responses()

        val responseFuture =
            responseServiceAsync.getResponse(
                ResponseGetResponseParams.builder()
                    .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
