// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartChartPayloadTest {

    @Test
    fun create() {
        val contentPartChartPayload =
            ContentPartChartPayload.builder().payload(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(contentPartChartPayload._payload())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartChartPayload =
            ContentPartChartPayload.builder().payload(JsonValue.from(mapOf<String, Any>())).build()

        val roundtrippedContentPartChartPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartChartPayload),
                jacksonTypeRef<ContentPartChartPayload>(),
            )

        assertThat(roundtrippedContentPartChartPayload).isEqualTo(contentPartChartPayload)
    }
}
