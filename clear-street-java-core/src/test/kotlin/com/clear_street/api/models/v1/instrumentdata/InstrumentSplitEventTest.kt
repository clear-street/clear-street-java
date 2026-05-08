// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentSplitEventTest {

    @Test
    fun create() {
        val instrumentSplitEvent =
            InstrumentSplitEvent.builder()
                .date(LocalDate.parse("2025-08-15"))
                .denominator("4")
                .numerator("1")
                .splitType("stock-split")
                .build()

        assertThat(instrumentSplitEvent.date()).isEqualTo(LocalDate.parse("2025-08-15"))
        assertThat(instrumentSplitEvent.denominator()).isEqualTo("4")
        assertThat(instrumentSplitEvent.numerator()).isEqualTo("1")
        assertThat(instrumentSplitEvent.splitType()).isEqualTo("stock-split")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentSplitEvent =
            InstrumentSplitEvent.builder()
                .date(LocalDate.parse("2025-08-15"))
                .denominator("4")
                .numerator("1")
                .splitType("stock-split")
                .build()

        val roundtrippedInstrumentSplitEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentSplitEvent),
                jacksonTypeRef<InstrumentSplitEvent>(),
            )

        assertThat(roundtrippedInstrumentSplitEvent).isEqualTo(instrumentSplitEvent)
    }
}
