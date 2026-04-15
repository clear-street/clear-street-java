// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentQuoteTest {

    @Test
    fun create() {
        val instrumentQuote =
            InstrumentQuote.builder()
                .high("215.20")
                .lastPrice("212.54")
                .low("210.10")
                .open("211.00")
                .volume(88000000L)
                .build()

        assertThat(instrumentQuote.high()).isEqualTo("215.20")
        assertThat(instrumentQuote.lastPrice()).isEqualTo("212.54")
        assertThat(instrumentQuote.low()).isEqualTo("210.10")
        assertThat(instrumentQuote.open()).isEqualTo("211.00")
        assertThat(instrumentQuote.volume()).isEqualTo(88000000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentQuote =
            InstrumentQuote.builder()
                .high("215.20")
                .lastPrice("212.54")
                .low("210.10")
                .open("211.00")
                .volume(88000000L)
                .build()

        val roundtrippedInstrumentQuote =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentQuote),
                jacksonTypeRef<InstrumentQuote>(),
            )

        assertThat(roundtrippedInstrumentQuote).isEqualTo(instrumentQuote)
    }
}
