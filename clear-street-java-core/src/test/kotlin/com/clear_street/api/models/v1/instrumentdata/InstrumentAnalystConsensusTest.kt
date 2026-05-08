// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentAnalystConsensusTest {

    @Test
    fun create() {
        val instrumentAnalystConsensus =
            InstrumentAnalystConsensus.builder()
                .date(LocalDate.parse("2024-11-15"))
                .distribution(
                    AnalystDistribution.builder()
                        .buy(28L)
                        .hold(6L)
                        .sell(2L)
                        .strongBuy(20L)
                        .strongSell(0L)
                        .build()
                )
                .priceTarget(
                    PriceTarget.builder()
                        .average("220.00")
                        .currency("USD")
                        .high("250.00")
                        .low("180.00")
                        .build()
                )
                .rating(AnalystRating.STRONG_BUY)
                .build()

        assertThat(instrumentAnalystConsensus.date()).isEqualTo(LocalDate.parse("2024-11-15"))
        assertThat(instrumentAnalystConsensus.distribution())
            .contains(
                AnalystDistribution.builder()
                    .buy(28L)
                    .hold(6L)
                    .sell(2L)
                    .strongBuy(20L)
                    .strongSell(0L)
                    .build()
            )
        assertThat(instrumentAnalystConsensus.priceTarget())
            .contains(
                PriceTarget.builder()
                    .average("220.00")
                    .currency("USD")
                    .high("250.00")
                    .low("180.00")
                    .build()
            )
        assertThat(instrumentAnalystConsensus.rating()).contains(AnalystRating.STRONG_BUY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentAnalystConsensus =
            InstrumentAnalystConsensus.builder()
                .date(LocalDate.parse("2024-11-15"))
                .distribution(
                    AnalystDistribution.builder()
                        .buy(28L)
                        .hold(6L)
                        .sell(2L)
                        .strongBuy(20L)
                        .strongSell(0L)
                        .build()
                )
                .priceTarget(
                    PriceTarget.builder()
                        .average("220.00")
                        .currency("USD")
                        .high("250.00")
                        .low("180.00")
                        .build()
                )
                .rating(AnalystRating.STRONG_BUY)
                .build()

        val roundtrippedInstrumentAnalystConsensus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentAnalystConsensus),
                jacksonTypeRef<InstrumentAnalystConsensus>(),
            )

        assertThat(roundtrippedInstrumentAnalystConsensus).isEqualTo(instrumentAnalystConsensus)
    }
}
