// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionEventTest {

    @Test
    fun create() {
        val predictionEvent =
            PredictionEvent.builder()
                .addCategory("string")
                .code("KXNBA-27")
                .addMarket(
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
                )
                .title("title")
                .build()

        assertThat(predictionEvent.categories()).containsExactly("string")
        assertThat(predictionEvent.code()).isEqualTo("KXNBA-27")
        assertThat(predictionEvent.markets().getOrNull())
            .containsExactly(
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
            )
        assertThat(predictionEvent.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionEvent =
            PredictionEvent.builder()
                .addCategory("string")
                .code("KXNBA-27")
                .addMarket(
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
                )
                .title("title")
                .build()

        val roundtrippedPredictionEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionEvent),
                jacksonTypeRef<PredictionEvent>(),
            )

        assertThat(roundtrippedPredictionEvent).isEqualTo(predictionEvent)
    }
}
