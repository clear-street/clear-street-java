// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.screener

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenerFilterTest {

    @Test
    fun create() {
        val screenerFilter =
            ScreenerFilter.builder()
                .field("market_cap")
                .operator("gte")
                .value(JsonValue.from(10000000000))
                .build()

        assertThat(screenerFilter.field()).isEqualTo("market_cap")
        assertThat(screenerFilter.operator()).isEqualTo("gte")
        assertThat(screenerFilter._value()).isEqualTo(JsonValue.from(10000000000))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val screenerFilter =
            ScreenerFilter.builder()
                .field("market_cap")
                .operator("gte")
                .value(JsonValue.from(10000000000))
                .build()

        val roundtrippedScreenerFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(screenerFilter),
                jacksonTypeRef<ScreenerFilter>(),
            )

        assertThat(roundtrippedScreenerFilter).isEqualTo(screenerFilter)
    }
}
