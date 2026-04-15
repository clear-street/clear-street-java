// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ChartKindTest {

    @Test
    fun ofSymbolChart() {
        val symbolChart =
            ChartKind.SymbolChart.builder()
                .symbol("symbol")
                .timeframe("timeframe")
                .chartType(ChartKind.SymbolChart.ChartType.SYMBOL_CHART)
                .build()

        val chartKind = ChartKind.ofSymbolChart(symbolChart)

        assertThat(chartKind.symbolChart()).contains(symbolChart)
        assertThat(chartKind.dataChart()).isEmpty
    }

    @Test
    fun ofSymbolChartRoundtrip() {
        val jsonMapper = jsonMapper()
        val chartKind =
            ChartKind.ofSymbolChart(
                ChartKind.SymbolChart.builder()
                    .symbol("symbol")
                    .timeframe("timeframe")
                    .chartType(ChartKind.SymbolChart.ChartType.SYMBOL_CHART)
                    .build()
            )

        val roundtrippedChartKind =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartKind),
                jacksonTypeRef<ChartKind>(),
            )

        assertThat(roundtrippedChartKind).isEqualTo(chartKind)
    }

    @Test
    fun ofDataChart() {
        val dataChart =
            ChartKind.DataChart.builder()
                .addSeries(
                    ChartSeries.builder()
                        .name("name")
                        .addPoint(ChartPoint.builder().x("x").y(0.0).build())
                        .build()
                )
                .chartType(ChartKind.DataChart.ChartType.DATA_CHART)
                .build()

        val chartKind = ChartKind.ofDataChart(dataChart)

        assertThat(chartKind.symbolChart()).isEmpty
        assertThat(chartKind.dataChart()).contains(dataChart)
    }

    @Test
    fun ofDataChartRoundtrip() {
        val jsonMapper = jsonMapper()
        val chartKind =
            ChartKind.ofDataChart(
                ChartKind.DataChart.builder()
                    .addSeries(
                        ChartSeries.builder()
                            .name("name")
                            .addPoint(ChartPoint.builder().x("x").y(0.0).build())
                            .build()
                    )
                    .chartType(ChartKind.DataChart.ChartType.DATA_CHART)
                    .build()
            )

        val roundtrippedChartKind =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartKind),
                jacksonTypeRef<ChartKind>(),
            )

        assertThat(roundtrippedChartKind).isEqualTo(chartKind)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val chartKind = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ChartKind>())

        val e = assertThrows<ClearStreetInvalidDataException> { chartKind.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
