// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalystDistributionTest {

    @Test
    fun create() {
        val analystDistribution =
            AnalystDistribution.builder()
                .buy(28L)
                .hold(6L)
                .sell(2L)
                .strongBuy(20L)
                .strongSell(0L)
                .build()

        assertThat(analystDistribution.buy()).isEqualTo(28L)
        assertThat(analystDistribution.hold()).isEqualTo(6L)
        assertThat(analystDistribution.sell()).isEqualTo(2L)
        assertThat(analystDistribution.strongBuy()).isEqualTo(20L)
        assertThat(analystDistribution.strongSell()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analystDistribution =
            AnalystDistribution.builder()
                .buy(28L)
                .hold(6L)
                .sell(2L)
                .strongBuy(20L)
                .strongSell(0L)
                .build()

        val roundtrippedAnalystDistribution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analystDistribution),
                jacksonTypeRef<AnalystDistribution>(),
            )

        assertThat(roundtrippedAnalystDistribution).isEqualTo(analystDistribution)
    }
}
