// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadTest {

    @Test
    fun create() {
        val thread =
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

        assertThat(thread.accountId()).isEqualTo("account_id")
        assertThat(thread.createdAt()).isEqualTo("created_at")
        assertThat(thread.description()).isEqualTo("description")
        assertThat(thread.ownerUserId()).isEqualTo("owner_user_id")
        assertThat(thread.title()).isEqualTo("title")
        assertThat(thread.updatedAt()).isEqualTo("updated_at")
        assertThat(thread.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(thread._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thread =
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

        val roundtrippedThread =
            jsonMapper.readValue(jsonMapper.writeValueAsString(thread), jacksonTypeRef<Thread>())

        assertThat(roundtrippedThread).isEqualTo(thread)
    }
}
