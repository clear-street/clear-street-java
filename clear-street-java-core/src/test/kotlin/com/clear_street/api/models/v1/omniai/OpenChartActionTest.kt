// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenChartActionTest {

    @Test
    fun create() {
        val openChartAction =
            OpenChartAction.builder()
                .symbol("AAPL")
                .extras(JsonValue.from(mapOf<String, Any>()))
                .timeframe("1M")
                .build()

        assertThat(openChartAction.symbol()).isEqualTo("AAPL")
        assertThat(openChartAction._extras()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(openChartAction.timeframe()).contains("1M")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openChartAction =
            OpenChartAction.builder()
                .symbol("AAPL")
                .extras(JsonValue.from(mapOf<String, Any>()))
                .timeframe("1M")
                .build()

        val roundtrippedOpenChartAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openChartAction),
                jacksonTypeRef<OpenChartAction>(),
            )

        assertThat(roundtrippedOpenChartAction).isEqualTo(openChartAction)
    }
}
