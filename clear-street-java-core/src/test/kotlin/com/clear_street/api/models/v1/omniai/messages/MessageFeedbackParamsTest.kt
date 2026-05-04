// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.messages

import com.clear_street.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageFeedbackParamsTest {

    @Test
    fun create() {
        MessageFeedbackParams.builder()
            .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountId(0L)
            .score(0)
            .comment("comment")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageFeedbackParams.builder()
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .score(0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageFeedbackParams.builder()
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .score(0)
                .comment("comment")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(0L)
        assertThat(body.score()).isEqualTo(0)
        assertThat(body.comment()).contains("comment")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageFeedbackParams.builder()
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .score(0)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(0L)
        assertThat(body.score()).isEqualTo(0)
    }
}
