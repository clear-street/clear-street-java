// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThread() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.active().v1().omniAi().threads()

        val response =
            threadService.getThread(
                ThreadGetThreadParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listThreads() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.active().v1().omniAi().threads()

        val response =
            threadService.listThreads(
                ThreadListThreadsParams.builder()
                    .accountId("account_id")
                    .pageSize(0)
                    .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
