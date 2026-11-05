// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionMarketSummaryTest {

    @Test
    fun create() {
        val predictionMarketSummary =
            PredictionMarketSummary.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isLiquidationOnly(true)
                .isTradable(true)
                .status(PredictionMarketStatus.OPEN)
                .symbol("KXNBA-27-MIN")
                .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outcome(PredictionMarketOutcome.YES)
                .settlementPrice("1")
                .title("title")
                .build()

        assertThat(predictionMarketSummary.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(predictionMarketSummary.isLiquidationOnly()).isEqualTo(true)
        assertThat(predictionMarketSummary.isTradable()).isEqualTo(true)
        assertThat(predictionMarketSummary.status()).isEqualTo(PredictionMarketStatus.OPEN)
        assertThat(predictionMarketSummary.symbol()).isEqualTo("KXNBA-27-MIN")
        assertThat(predictionMarketSummary.closeAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(predictionMarketSummary.openAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(predictionMarketSummary.outcome()).contains(PredictionMarketOutcome.YES)
        assertThat(predictionMarketSummary.settlementPrice()).contains("1")
        assertThat(predictionMarketSummary.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionMarketSummary =
            PredictionMarketSummary.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isLiquidationOnly(true)
                .isTradable(true)
                .status(PredictionMarketStatus.OPEN)
                .symbol("KXNBA-27-MIN")
                .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outcome(PredictionMarketOutcome.YES)
                .settlementPrice("1")
                .title("title")
                .build()

        val roundtrippedPredictionMarketSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionMarketSummary),
                jacksonTypeRef<PredictionMarketSummary>(),
            )

        assertThat(roundtrippedPredictionMarketSummary).isEqualTo(predictionMarketSummary)
    }
}
