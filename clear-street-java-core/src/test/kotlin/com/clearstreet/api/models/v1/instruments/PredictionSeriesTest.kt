// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionSeriesTest {

    @Test
    fun create() {
        val predictionSeries = PredictionSeries.builder().code("KXPRESPERSON").build()

        assertThat(predictionSeries.code()).isEqualTo("KXPRESPERSON")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionSeries = PredictionSeries.builder().code("KXPRESPERSON").build()

        val roundtrippedPredictionSeries =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionSeries),
                jacksonTypeRef<PredictionSeries>(),
            )

        assertThat(roundtrippedPredictionSeries).isEqualTo(predictionSeries)
    }
}
