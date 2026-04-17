// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai.threads

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageListMessagesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMessages() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.active().v1().omniAi().threads().messages()

        val response =
            messageService.listMessages(
                MessageListMessagesParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .afterSeq(0L)
                    .pageSize(0)
                    .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
