// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionCategoriesTest {

    @Test
    fun create() {
        val predictionCategories =
            PredictionCategories.builder()
                .categories(listOf("Economics", "Elections", "Sports"))
                .build()

        assertThat(predictionCategories.categories())
            .containsExactly("Economics", "Elections", "Sports")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionCategories =
            PredictionCategories.builder()
                .categories(listOf("Economics", "Elections", "Sports"))
                .build()

        val roundtrippedPredictionCategories =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionCategories),
                jacksonTypeRef<PredictionCategories>(),
            )

        assertThat(roundtrippedPredictionCategories).isEqualTo(predictionCategories)
    }
}
