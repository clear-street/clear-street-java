// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartPointTest {

    @Test
    fun create() {
        val chartPoint = ChartPoint.builder().x("x").y(0.0).build()

        assertThat(chartPoint.x()).isEqualTo("x")
        assertThat(chartPoint.y()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chartPoint = ChartPoint.builder().x("x").y(0.0).build()

        val roundtrippedChartPoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartPoint),
                jacksonTypeRef<ChartPoint>(),
            )

        assertThat(roundtrippedChartPoint).isEqualTo(chartPoint)
    }
}
