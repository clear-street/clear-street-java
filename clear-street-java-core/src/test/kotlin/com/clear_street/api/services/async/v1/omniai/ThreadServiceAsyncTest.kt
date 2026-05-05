// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createThread() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.createThread(
                ThreadCreateThreadParams.builder()
                    .accountId(19816L)
                    .type(ThreadCreateThreadParams.Type.INSTANT)
                    .addCapability(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
                    .target(
                        ThreadCreateThreadParams.Target.builder()
                            .ticker("ticker")
                            .type(ThreadCreateThreadParams.Target.Type.TICKER)
                            .build()
                    )
                    .text("What changed in NVDA today?")
                    .thesis("thesis")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreadById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getThreadById(
                ThreadGetThreadByIdParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreadResponse() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getThreadResponse(
                ThreadGetThreadResponseParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreads() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getThreads(
                ThreadGetThreadsParams.builder()
                    .accountId(0L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
