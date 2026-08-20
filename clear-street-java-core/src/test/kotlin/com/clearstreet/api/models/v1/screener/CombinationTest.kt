// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CombinationTest {

    @Test
    fun create() {
        val combination = Combination.builder().lookback("lookback").period("period").build()

        assertThat(combination.lookback()).contains("lookback")
        assertThat(combination.period()).contains("period")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val combination = Combination.builder().lookback("lookback").period("period").build()

        val roundtrippedCombination =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(combination),
                jacksonTypeRef<Combination>(),
            )

        assertThat(roundtrippedCombination).isEqualTo(combination)
    }
}
