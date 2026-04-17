// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai.threads

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.omniai.threads.response.ResponseGetThreadResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreadResponse() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.active().v1().omniAi().threads().response()

        val responseFuture =
            responseServiceAsync.getThreadResponse(
                ResponseGetThreadResponseParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
