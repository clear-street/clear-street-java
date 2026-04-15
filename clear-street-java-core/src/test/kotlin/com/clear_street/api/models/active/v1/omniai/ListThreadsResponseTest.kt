// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListThreadsResponseTest {

    @Test
    fun create() {
        val listThreadsResponse =
            ListThreadsResponse.builder()
                .addThread(
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
                .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(listThreadsResponse.threads())
            .containsExactly(
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
        assertThat(listThreadsResponse.nextPageToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listThreadsResponse =
            ListThreadsResponse.builder()
                .addThread(
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
                .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedListThreadsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listThreadsResponse),
                jacksonTypeRef<ListThreadsResponse>(),
            )

        assertThat(roundtrippedListThreadsResponse).isEqualTo(listThreadsResponse)
    }
}
