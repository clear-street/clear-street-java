// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.news

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewsInstrumentTest {

    @Test
    fun create() {
        val newsInstrument =
            NewsInstrument.builder()
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .name("Apple Inc.")
                .symbol("AAPL")
                .build()

        assertThat(newsInstrument.instrumentId()).isEqualTo("f47ac10b-58cc-4372-a567-0e02b2c3d479")
        assertThat(newsInstrument.name()).contains("Apple Inc.")
        assertThat(newsInstrument.symbol()).contains("AAPL")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newsInstrument =
            NewsInstrument.builder()
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .name("Apple Inc.")
                .symbol("AAPL")
                .build()

        val roundtrippedNewsInstrument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newsInstrument),
                jacksonTypeRef<NewsInstrument>(),
            )

        assertThat(roundtrippedNewsInstrument).isEqualTo(newsInstrument)
    }
}
