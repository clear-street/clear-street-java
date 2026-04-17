// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai.messages

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.core.JsonValue
import com.clear_street.api.models.active.v1.omniai.messages.feedback.FeedbackCreateFeedbackParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FeedbackServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFeedback() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val feedbackServiceAsync = client.active().v1().omniAi().messages().feedback()

        val responseFuture =
            feedbackServiceAsync.createFeedback(
                FeedbackCreateFeedbackParams.builder()
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
