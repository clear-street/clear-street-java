// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.apikeys

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyTest {

    @Test
    fun create() {
        val apiKey =
            ApiKey.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiKey("api_key")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        assertThat(apiKey.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKey.apiKey()).isEqualTo("api_key")
        assertThat(apiKey.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKey.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKey.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKey =
            ApiKey.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiKey("api_key")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        val roundtrippedApiKey =
            jsonMapper.readValue(jsonMapper.writeValueAsString(apiKey), jacksonTypeRef<ApiKey>())

        assertThat(roundtrippedApiKey).isEqualTo(apiKey)
    }
}
