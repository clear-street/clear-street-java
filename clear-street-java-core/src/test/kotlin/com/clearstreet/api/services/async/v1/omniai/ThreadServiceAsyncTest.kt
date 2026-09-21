// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.omniai

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.models.v1.omniai.threads.ContextItem
import com.clearstreet.api.models.v1.omniai.threads.ThreadCreateMessageParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetMessagesParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadByIdParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadResponseParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadsParams
import com.clearstreet.api.models.v1.omniai.threads.TurnContext
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ThreadServiceAsyncTest {

    @Test
    fun createMessage() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.createMessage(
                ThreadCreateMessageParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .text("Compare that to AMD.")
                    .accountId(19816L)
                    .addCapability(ThreadCreateMessageParams.Capability.PREFILL_ORDER)
                    .context(
                        TurnContext.builder()
                            .addItem(
                                ContextItem.builder()
                                    .data(
                                        ContextItem.Data.builder()
                                            .putAdditionalProperty(
                                                "change_pct",
                                                JsonValue.from("bar"),
                                            )
                                            .putAdditionalProperty("range", JsonValue.from("bar"))
                                            .putAdditionalProperty("ticker", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .kind("chart")
                                    .label("NVDA intraday performance")
                                    .capturedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun createThread() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.createThread(
                ThreadCreateThreadParams.builder()
                    .type(ThreadCreateThreadParams.Type.INSTANT)
                    .accountId(19816L)
                    .addCapability(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
                    .context(
                        TurnContext.builder()
                            .addItem(
                                ContextItem.builder()
                                    .data(
                                        ContextItem.Data.builder()
                                            .putAdditionalProperty(
                                                "change_pct",
                                                JsonValue.from("bar"),
                                            )
                                            .putAdditionalProperty("range", JsonValue.from("bar"))
                                            .putAdditionalProperty("ticker", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .kind("chart")
                                    .label("NVDA intraday performance")
                                    .capturedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
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

    @Test
    fun getMessages() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getMessages(
                ThreadGetMessagesParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(1L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getThreadById() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getThreadById(
                ThreadGetThreadByIdParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getThreadResponse() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getThreadResponse(
                ThreadGetThreadResponseParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getThreads() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val threadServiceAsync = client.v1().omniAi().threads()

        val responseFuture =
            threadServiceAsync.getThreads(
                ThreadGetThreadsParams.builder()
                    .accountId(1L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
