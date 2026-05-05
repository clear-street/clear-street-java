// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateMessageResponseTest {

    @Test
    fun create() {
        val createMessageResponse =
            CreateMessageResponse.builder()
                .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(createMessageResponse.responseId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createMessageResponse.threadId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createMessageResponse.userMessageId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createMessageResponse =
            CreateMessageResponse.builder()
                .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedCreateMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createMessageResponse),
                jacksonTypeRef<CreateMessageResponse>(),
            )

        assertThat(roundtrippedCreateMessageResponse).isEqualTo(createMessageResponse)
    }
}
