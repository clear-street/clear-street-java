// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentEarningsTest {

    @Test
    fun create() {
        val instrumentEarnings =
            InstrumentEarnings.builder()
                .date(LocalDate.parse("2025-07-25"))
                .epsActual("1.35")
                .epsEstimate("1.30")
                .epsSurprisePercent("3.8")
                .revenueActual("391035000000")
                .revenueEstimate("391025000000")
                .revenueSurprisePercent("0.05")
                .build()

        assertThat(instrumentEarnings.date()).isEqualTo(LocalDate.parse("2025-07-25"))
        assertThat(instrumentEarnings.epsActual()).contains("1.35")
        assertThat(instrumentEarnings.epsEstimate()).contains("1.30")
        assertThat(instrumentEarnings.epsSurprisePercent()).contains("3.8")
        assertThat(instrumentEarnings.revenueActual()).contains("391035000000")
        assertThat(instrumentEarnings.revenueEstimate()).contains("391025000000")
        assertThat(instrumentEarnings.revenueSurprisePercent()).contains("0.05")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentEarnings =
            InstrumentEarnings.builder()
                .date(LocalDate.parse("2025-07-25"))
                .epsActual("1.35")
                .epsEstimate("1.30")
                .epsSurprisePercent("3.8")
                .revenueActual("391035000000")
                .revenueEstimate("391025000000")
                .revenueSurprisePercent("0.05")
                .build()

        val roundtrippedInstrumentEarnings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentEarnings),
                jacksonTypeRef<InstrumentEarnings>(),
            )

        assertThat(roundtrippedInstrumentEarnings).isEqualTo(instrumentEarnings)
    }
}
