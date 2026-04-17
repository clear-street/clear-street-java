// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataChartTest {

    @Test
    fun create() {
        val dataChart =
            DataChart.builder()
                .addSeries(
                    ChartSeries.builder()
                        .name("name")
                        .addPoint(ChartPoint.builder().x("x").y(0.0).build())
                        .build()
                )
                .build()

        assertThat(dataChart.series())
            .containsExactly(
                ChartSeries.builder()
                    .name("name")
                    .addPoint(ChartPoint.builder().x("x").y(0.0).build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataChart =
            DataChart.builder()
                .addSeries(
                    ChartSeries.builder()
                        .name("name")
                        .addPoint(ChartPoint.builder().x("x").y(0.0).build())
                        .build()
                )
                .build()

        val roundtrippedDataChart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataChart),
                jacksonTypeRef<DataChart>(),
            )

        assertThat(roundtrippedDataChart).isEqualTo(dataChart)
    }
}
