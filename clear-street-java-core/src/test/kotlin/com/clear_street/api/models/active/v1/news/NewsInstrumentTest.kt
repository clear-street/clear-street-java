// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.news

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewsInstrumentTest {

    @Test
    fun create() {
        val newsInstrument =
            NewsInstrument.builder()
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .name("name")
                .symbol("AAPL")
                .build()

        assertThat(newsInstrument.securityId()).isEqualTo("AAPL")
        assertThat(newsInstrument.securityIdSource()).isEqualTo(SecurityIdSource.CMS)
        assertThat(newsInstrument.instrumentId()).contains("f47ac10b-58cc-4372-a567-0e02b2c3d479")
        assertThat(newsInstrument.name()).contains("name")
        assertThat(newsInstrument.symbol()).contains("AAPL")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newsInstrument =
            NewsInstrument.builder()
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .name("name")
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
