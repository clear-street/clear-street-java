// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.portfoliohistory

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortfolioHistoryGetPortfolioHistoryResponseTest {

    @Test
    fun create() {
        val portfolioHistoryGetPortfolioHistoryResponse =
            PortfolioHistoryGetPortfolioHistoryResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                    PortfolioHistoryResponse.builder()
                        .addSegment(
                            PortfolioHistorySegment.builder()
                                .date(LocalDate.parse("2019-12-27"))
                                .endingEquity("ending_equity")
                                .realizedPnl("realized_pnl")
                                .startingEquity("starting_equity")
                                .unrealizedPnl("unrealized_pnl")
                                .boughtNotional("bought_notional")
                                .boughtQuantity("bought_quantity")
                                .dayPnl("day_pnl")
                                .netPnl("net_pnl")
                                .positionPnl("position_pnl")
                                .soldNotional("sold_notional")
                                .soldQuantity("sold_quantity")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(portfolioHistoryGetPortfolioHistoryResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(portfolioHistoryGetPortfolioHistoryResponse.error())
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
        assertThat(portfolioHistoryGetPortfolioHistoryResponse.data())
            .isEqualTo(
                PortfolioHistoryResponse.builder()
                    .addSegment(
                        PortfolioHistorySegment.builder()
                            .date(LocalDate.parse("2019-12-27"))
                            .endingEquity("ending_equity")
                            .realizedPnl("realized_pnl")
                            .startingEquity("starting_equity")
                            .unrealizedPnl("unrealized_pnl")
                            .boughtNotional("bought_notional")
                            .boughtQuantity("bought_quantity")
                            .dayPnl("day_pnl")
                            .netPnl("net_pnl")
                            .positionPnl("position_pnl")
                            .soldNotional("sold_notional")
                            .soldQuantity("sold_quantity")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portfolioHistoryGetPortfolioHistoryResponse =
            PortfolioHistoryGetPortfolioHistoryResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                    PortfolioHistoryResponse.builder()
                        .addSegment(
                            PortfolioHistorySegment.builder()
                                .date(LocalDate.parse("2019-12-27"))
                                .endingEquity("ending_equity")
                                .realizedPnl("realized_pnl")
                                .startingEquity("starting_equity")
                                .unrealizedPnl("unrealized_pnl")
                                .boughtNotional("bought_notional")
                                .boughtQuantity("bought_quantity")
                                .dayPnl("day_pnl")
                                .netPnl("net_pnl")
                                .positionPnl("position_pnl")
                                .soldNotional("sold_notional")
                                .soldQuantity("sold_quantity")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPortfolioHistoryGetPortfolioHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portfolioHistoryGetPortfolioHistoryResponse),
                jacksonTypeRef<PortfolioHistoryGetPortfolioHistoryResponse>(),
            )

        assertThat(roundtrippedPortfolioHistoryGetPortfolioHistoryResponse)
            .isEqualTo(portfolioHistoryGetPortfolioHistoryResponse)
    }
}
