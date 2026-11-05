// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionMarketsTest {

    @Test
    fun create() {
        val predictionMarkets =
            PredictionMarkets.builder()
                .addMarket(
                    PredictionMarket.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .canCloseEarly(true)
                        .addCategory("string")
                        .eventCode("KXNBA-27")
                        .isLiquidationOnly(true)
                        .isTradable(true)
                        .addRestriction("string")
                        .seriesCode("KXNBA")
                        .status(PredictionMarketStatus.OPEN)
                        .symbol("KXNBA-27-MIN")
                        .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contractTermsUrl("contract_terms_url")
                        .earlyCloseCondition("early_close_condition")
                        .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullTitle("2027 Pro Basketball Champion - Minnesota")
                        .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outcome(PredictionMarketOutcome.YES)
                        .predicate("predicate")
                        .rulesPrimary("rules_primary")
                        .rulesSecondary("rules_secondary")
                        .settlementPrice("1")
                        .title("title")
                        .build()
                )
                .build()

        assertThat(predictionMarkets.markets())
            .containsExactly(
                PredictionMarket.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .canCloseEarly(true)
                    .addCategory("string")
                    .eventCode("KXNBA-27")
                    .isLiquidationOnly(true)
                    .isTradable(true)
                    .addRestriction("string")
                    .seriesCode("KXNBA")
                    .status(PredictionMarketStatus.OPEN)
                    .symbol("KXNBA-27-MIN")
                    .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .contractTermsUrl("contract_terms_url")
                    .earlyCloseCondition("early_close_condition")
                    .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fullTitle("2027 Pro Basketball Champion - Minnesota")
                    .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .outcome(PredictionMarketOutcome.YES)
                    .predicate("predicate")
                    .rulesPrimary("rules_primary")
                    .rulesSecondary("rules_secondary")
                    .settlementPrice("1")
                    .title("title")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionMarkets =
            PredictionMarkets.builder()
                .addMarket(
                    PredictionMarket.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .canCloseEarly(true)
                        .addCategory("string")
                        .eventCode("KXNBA-27")
                        .isLiquidationOnly(true)
                        .isTradable(true)
                        .addRestriction("string")
                        .seriesCode("KXNBA")
                        .status(PredictionMarketStatus.OPEN)
                        .symbol("KXNBA-27-MIN")
                        .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contractTermsUrl("contract_terms_url")
                        .earlyCloseCondition("early_close_condition")
                        .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullTitle("2027 Pro Basketball Champion - Minnesota")
                        .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outcome(PredictionMarketOutcome.YES)
                        .predicate("predicate")
                        .rulesPrimary("rules_primary")
                        .rulesSecondary("rules_secondary")
                        .settlementPrice("1")
                        .title("title")
                        .build()
                )
                .build()

        val roundtrippedPredictionMarkets =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionMarkets),
                jacksonTypeRef<PredictionMarkets>(),
            )

        assertThat(roundtrippedPredictionMarkets).isEqualTo(predictionMarkets)
    }
}
