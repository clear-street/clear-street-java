// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createThread() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.active().v1().omniAi().threads()

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
    fun getThread() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.active().v1().omniAi().threads()

        val response =
            threadService.getThread(
                ThreadGetThreadParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
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
                    .accountId(0L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun response() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.active().v1().omniAi().threads()

        val response =
            threadService.response(
                ThreadResponseParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }
}
