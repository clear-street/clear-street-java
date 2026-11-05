// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionMarketBalancesTest {

    @Test
    fun create() {
        val predictionMarketBalances =
            PredictionMarketBalances.builder().buyingPower("55.00").build()

        assertThat(predictionMarketBalances.buyingPower()).isEqualTo("55.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionMarketBalances =
            PredictionMarketBalances.builder().buyingPower("55.00").build()

        val roundtrippedPredictionMarketBalances =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionMarketBalances),
                jacksonTypeRef<PredictionMarketBalances>(),
            )

        assertThat(roundtrippedPredictionMarketBalances).isEqualTo(predictionMarketBalances)
    }
}
