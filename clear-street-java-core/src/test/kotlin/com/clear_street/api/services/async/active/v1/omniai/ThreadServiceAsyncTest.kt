// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThread() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.active().v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getThread(
                ThreadGetThreadParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listThreads() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.active().v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.listThreads(
                ThreadListThreadsParams.builder()
                    .accountId("account_id")
                    .pageSize(0)
                    .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
