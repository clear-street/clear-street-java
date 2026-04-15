// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GetThreadResponseTest {

    @Test
    fun create() {
        val getThreadResponse =
            GetThreadResponse.builder()
                .thread(
                    Thread.builder()
                        .accountId("account_id")
                        .createdAt("created_at")
                        .description("description")
                        .ownerUserId("owner_user_id")
                        .title("title")
                        .updatedAt("updated_at")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(getThreadResponse.thread())
            .isEqualTo(
                Thread.builder()
                    .accountId("account_id")
                    .createdAt("created_at")
                    .description("description")
                    .ownerUserId("owner_user_id")
                    .title("title")
                    .updatedAt("updated_at")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val getThreadResponse =
            GetThreadResponse.builder()
                .thread(
                    Thread.builder()
                        .accountId("account_id")
                        .createdAt("created_at")
                        .description("description")
                        .ownerUserId("owner_user_id")
                        .title("title")
                        .updatedAt("updated_at")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedGetThreadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(getThreadResponse),
                jacksonTypeRef<GetThreadResponse>(),
            )

        assertThat(roundtrippedGetThreadResponse).isEqualTo(getThreadResponse)
    }
}
