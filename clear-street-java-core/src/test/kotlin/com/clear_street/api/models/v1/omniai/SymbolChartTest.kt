// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SymbolChartTest {

    @Test
    fun create() {
        val symbolChart = SymbolChart.builder().symbol("symbol").timeframe("timeframe").build()

        assertThat(symbolChart.symbol()).isEqualTo("symbol")
        assertThat(symbolChart.timeframe()).contains("timeframe")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val symbolChart = SymbolChart.builder().symbol("symbol").timeframe("timeframe").build()

        val roundtrippedSymbolChart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(symbolChart),
                jacksonTypeRef<SymbolChart>(),
            )

        assertThat(roundtrippedSymbolChart).isEqualTo(symbolChart)
    }
}
