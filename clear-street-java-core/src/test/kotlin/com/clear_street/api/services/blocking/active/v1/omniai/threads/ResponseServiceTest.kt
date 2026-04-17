// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai.threads

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.omniai.threads.response.ResponseGetThreadResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreadResponse() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val responseService = client.active().v1().omniAi().threads().response()

        val response =
            responseService.getThreadResponse(
                ResponseGetThreadResponseParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }
}
