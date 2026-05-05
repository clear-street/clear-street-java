// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createThread() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.v1().omniAi().threads()

        val response =
            threadService.createThread(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreadById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.v1().omniAi().threads()

        val response =
            threadService.getThreadById(
                ThreadGetThreadByIdParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreadResponse() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.v1().omniAi().threads()

        val response =
            threadService.getThreadResponse(
                ThreadGetThreadResponseParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreads() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.v1().omniAi().threads()

        val response =
            threadService.getThreads(
                ThreadGetThreadsParams.builder()
                    .accountId(0L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        response.validate()
    }
}
