// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.omniai

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.models.v1.omniai.messages.MessageGetMessageByIdParams
import com.clearstreet.api.models.v1.omniai.messages.MessageSubmitFeedbackParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceTest {

    @Test
    fun getMessageById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.v1().omniAi().messages()

        val response =
            messageService.getMessageById(
                MessageGetMessageByIdParams.builder()
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun submitFeedback() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.v1().omniAi().messages()

        val response =
            messageService.submitFeedback(
                MessageSubmitFeedbackParams.builder()
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .score(0)
                    .comment("comment")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }
}
