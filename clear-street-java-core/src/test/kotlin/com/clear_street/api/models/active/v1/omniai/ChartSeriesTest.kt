// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartSeriesTest {

    @Test
    fun create() {
        val chartSeries =
            ChartSeries.builder()
                .name("name")
                .addPoint(ChartPoint.builder().x("x").y(0.0).build())
                .build()

        assertThat(chartSeries.name()).isEqualTo("name")
        assertThat(chartSeries.points()).containsExactly(ChartPoint.builder().x("x").y(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chartSeries =
            ChartSeries.builder()
                .name("name")
                .addPoint(ChartPoint.builder().x("x").y(0.0).build())
                .build()

        val roundtrippedChartSeries =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartSeries),
                jacksonTypeRef<ChartSeries>(),
            )

        assertThat(roundtrippedChartSeries).isEqualTo(chartSeries)
    }
}
