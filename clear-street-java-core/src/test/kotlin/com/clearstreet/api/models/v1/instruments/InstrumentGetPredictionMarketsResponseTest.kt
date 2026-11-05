// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetPredictionMarketsResponseTest {

    @Test
    fun create() {
        val instrumentGetPredictionMarketsResponse =
            InstrumentGetPredictionMarketsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                                .expectedSettlementAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
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
                )
                .build()

        assertThat(instrumentGetPredictionMarketsResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(1)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(42L)
                    .totalPages(5)
                    .build()
            )
        assertThat(instrumentGetPredictionMarketsResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(instrumentGetPredictionMarketsResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentGetPredictionMarketsResponse =
            InstrumentGetPredictionMarketsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                                .expectedSettlementAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
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
                )
                .build()

        val roundtrippedInstrumentGetPredictionMarketsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentGetPredictionMarketsResponse),
                jacksonTypeRef<InstrumentGetPredictionMarketsResponse>(),
            )

        assertThat(roundtrippedInstrumentGetPredictionMarketsResponse)
            .isEqualTo(instrumentGetPredictionMarketsResponse)
    }
}
