// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.iris.feedback

import com.clear_street.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackCreateFeedbackDeprecatedParamsTest {

    @Test
    fun create() {
        FeedbackCreateFeedbackDeprecatedParams.builder()
            .accountId("account_id")
            .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .score(0)
            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun body() {
        val params =
            FeedbackCreateFeedbackDeprecatedParams.builder()
                .accountId("account_id")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .score(0)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.messageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.score()).isEqualTo(0)
        assertThat(body.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.comment()).contains("comment")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeedbackCreateFeedbackDeprecatedParams.builder()
                .accountId("account_id")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .score(0)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.messageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.score()).isEqualTo(0)
        assertThat(body.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
