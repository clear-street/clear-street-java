// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.responses

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ErrorStatusTest {

    @Test
    fun create() {
        val errorStatus =
            ErrorStatus.builder()
                .code("code")
                .message("message")
                .details(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(errorStatus.code()).isEqualTo("code")
        assertThat(errorStatus.message()).isEqualTo("message")
        assertThat(errorStatus._details()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val errorStatus =
            ErrorStatus.builder()
                .code("code")
                .message("message")
                .details(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedErrorStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(errorStatus),
                jacksonTypeRef<ErrorStatus>(),
            )

        assertThat(roundtrippedErrorStatus).isEqualTo(errorStatus)
    }
}
