// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.core.JsonValue
import com.clear_street.api.models.active.v1.iris.feedback.FeedbackCreateFeedbackDeprecatedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FeedbackServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFeedbackDeprecated() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val feedbackService = client.active().v1().iris().feedback()

        val response =
            feedbackService.createFeedbackDeprecated(
                FeedbackCreateFeedbackDeprecatedParams.builder()
                    .accountId("account_id")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .score(0)
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }
}
