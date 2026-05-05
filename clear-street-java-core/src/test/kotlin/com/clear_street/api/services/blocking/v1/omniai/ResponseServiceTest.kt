// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.omniai.responses.ResponseCancelResponseParams
import com.clear_street.api.models.v1.omniai.responses.ResponseGetResponseByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelResponse() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val responseService = client.v1().omniAi().responses()

        val response =
            responseService.cancelResponse(
                ResponseCancelResponseParams.builder()
                    .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResponseById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val responseService = client.v1().omniAi().responses()

        val response =
            responseService.getResponseById(
                ResponseGetResponseByIdParams.builder()
                    .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }
}
