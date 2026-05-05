// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai.threads

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.omniai.threads.messages.MessageCreateMessageParams
import com.clear_street.api.models.v1.omniai.threads.messages.MessageGetMessagesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMessage() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.v1().omniAi().threads().messages()

        val responseFuture =
            messageServiceAsync.createMessage(
                MessageCreateMessageParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(19816L)
                    .text("Compare that to AMD.")
                    .addCapability(MessageCreateMessageParams.Capability.PREFILL_ORDER)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMessages() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.v1().omniAi().threads().messages()

        val responseFuture =
            messageServiceAsync.getMessages(
                MessageGetMessagesParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
