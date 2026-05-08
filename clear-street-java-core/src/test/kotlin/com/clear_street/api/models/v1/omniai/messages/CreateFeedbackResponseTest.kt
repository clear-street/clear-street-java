// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.messages

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateFeedbackResponseTest {

    @Test
    fun create() {
        val createFeedbackResponse =
            CreateFeedbackResponse.builder()
                .createdAt("created_at")
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(createFeedbackResponse.createdAt()).isEqualTo("created_at")
        assertThat(createFeedbackResponse.feedbackId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createFeedbackResponse =
            CreateFeedbackResponse.builder()
                .createdAt("created_at")
                .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedCreateFeedbackResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createFeedbackResponse),
                jacksonTypeRef<CreateFeedbackResponse>(),
            )

        assertThat(roundtrippedCreateFeedbackResponse).isEqualTo(createFeedbackResponse)
    }
}
