// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.omniai

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.omniai.responses.ResponseCancelResponseParams
import com.clearstreet.api.models.v1.omniai.responses.ResponseGetResponseByIdParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResponseServiceTest {

    @Test
    fun cancelResponse() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Test
    fun getResponseById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
