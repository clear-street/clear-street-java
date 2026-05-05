// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai.threads

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.omniai.threads.messages.MessageCreateMessageParams
import com.clear_street.api.models.v1.omniai.threads.messages.MessageGetMessagesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMessage() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.v1().omniAi().threads().messages()

        val response =
            messageService.createMessage(
                MessageCreateMessageParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(19816L)
                    .text("Compare that to AMD.")
                    .addCapability(MessageCreateMessageParams.Capability.PREFILL_ORDER)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMessages() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.v1().omniAi().threads().messages()

        val response =
            messageService.getMessages(
                MessageGetMessagesParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        response.validate()
    }
}
