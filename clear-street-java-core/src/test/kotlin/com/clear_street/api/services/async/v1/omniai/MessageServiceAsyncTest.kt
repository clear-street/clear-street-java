// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.core.JsonValue
import com.clear_street.api.models.v1.omniai.messages.MessageGetMessageByIdParams
import com.clear_street.api.models.v1.omniai.messages.MessageSubmitFeedbackParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMessageById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.v1().omniAi().messages()

        val responseFuture =
            messageServiceAsync.getMessageById(
                MessageGetMessageByIdParams.builder()
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitFeedback() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.v1().omniAi().messages()

        val responseFuture =
            messageServiceAsync.submitFeedback(
                MessageSubmitFeedbackParams.builder()
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .score(0)
                    .comment("comment")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
