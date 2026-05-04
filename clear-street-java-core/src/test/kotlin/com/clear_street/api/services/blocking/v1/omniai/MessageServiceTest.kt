// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.core.JsonValue
import com.clear_street.api.models.v1.omniai.messages.MessageFeedbackParams
import com.clear_street.api.models.v1.omniai.messages.MessageGetMessageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun feedback() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.v1().omniAi().messages()

        val response =
            messageService.feedback(
                MessageFeedbackParams.builder()
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .score(0)
                    .comment("comment")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMessage() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.v1().omniAi().messages()

        val response =
            messageService.getMessage(
                MessageGetMessageParams.builder()
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }
}
