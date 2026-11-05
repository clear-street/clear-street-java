// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionMarketTest {

    @Test
    fun create() {
        val predictionMarket =
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

        assertThat(predictionMarket.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(predictionMarket.canCloseEarly()).isEqualTo(true)
        assertThat(predictionMarket.categories()).containsExactly("string")
        assertThat(predictionMarket.eventCode()).isEqualTo("KXNBA-27")
        assertThat(predictionMarket.isLiquidationOnly()).isEqualTo(true)
        assertThat(predictionMarket.isTradable()).isEqualTo(true)
        assertThat(predictionMarket.restrictions()).containsExactly("string")
        assertThat(predictionMarket.seriesCode()).isEqualTo("KXNBA")
        assertThat(predictionMarket.status()).isEqualTo(PredictionMarketStatus.OPEN)
        assertThat(predictionMarket.symbol()).isEqualTo("KXNBA-27-MIN")
        assertThat(predictionMarket.closeAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(predictionMarket.contractTermsUrl()).contains("contract_terms_url")
        assertThat(predictionMarket.earlyCloseCondition()).contains("early_close_condition")
        assertThat(predictionMarket.expectedSettlementAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(predictionMarket.fullTitle())
            .contains("2027 Pro Basketball Champion - Minnesota")
        assertThat(predictionMarket.openAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(predictionMarket.outcome()).contains(PredictionMarketOutcome.YES)
        assertThat(predictionMarket.predicate()).contains("predicate")
        assertThat(predictionMarket.rulesPrimary()).contains("rules_primary")
        assertThat(predictionMarket.rulesSecondary()).contains("rules_secondary")
        assertThat(predictionMarket.settlementPrice()).contains("1")
        assertThat(predictionMarket.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionMarket =
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

        val roundtrippedPredictionMarket =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionMarket),
                jacksonTypeRef<PredictionMarket>(),
            )

        assertThat(roundtrippedPredictionMarket).isEqualTo(predictionMarket)
    }
}
