// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionEventsTest {

    @Test
    fun create() {
        val predictionEvents =
            PredictionEvents.builder()
                .addEvent(
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
                )
                .build()

        assertThat(predictionEvents.events())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionEvents =
            PredictionEvents.builder()
                .addEvent(
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
                )
                .build()

        val roundtrippedPredictionEvents =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionEvents),
                jacksonTypeRef<PredictionEvents>(),
            )

        assertThat(roundtrippedPredictionEvents).isEqualTo(predictionEvents)
    }
}
