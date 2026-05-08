// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.threads

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadTest {

    @Test
    fun create() {
        val thread =
            Thread.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .title("title")
                .updatedAt("updated_at")
                .build()

        assertThat(thread.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(thread.createdAt()).isEqualTo("created_at")
        assertThat(thread.title()).isEqualTo("title")
        assertThat(thread.updatedAt()).isEqualTo("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thread =
            Thread.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .title("title")
                .updatedAt("updated_at")
                .build()

        val roundtrippedThread =
            jsonMapper.readValue(jsonMapper.writeValueAsString(thread), jacksonTypeRef<Thread>())

        assertThat(roundtrippedThread).isEqualTo(thread)
    }
}
