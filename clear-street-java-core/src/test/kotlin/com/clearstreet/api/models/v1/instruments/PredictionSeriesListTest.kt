// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionSeriesListTest {

    @Test
    fun create() {
        val predictionSeriesList =
            PredictionSeriesList.builder()
                .addSeries(PredictionSeries.builder().code("KXPRESPERSON").build())
                .build()

        assertThat(predictionSeriesList.series())
            .containsExactly(PredictionSeries.builder().code("KXPRESPERSON").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionSeriesList =
            PredictionSeriesList.builder()
                .addSeries(PredictionSeries.builder().code("KXPRESPERSON").build())
                .build()

        val roundtrippedPredictionSeriesList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionSeriesList),
                jacksonTypeRef<PredictionSeriesList>(),
            )

        assertThat(roundtrippedPredictionSeriesList).isEqualTo(predictionSeriesList)
    }
}
