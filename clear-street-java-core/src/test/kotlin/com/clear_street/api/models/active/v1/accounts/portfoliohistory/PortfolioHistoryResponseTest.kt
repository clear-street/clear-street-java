// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.portfoliohistory

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortfolioHistoryResponseTest {

    @Test
    fun create() {
        val portfolioHistoryResponse =
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

        assertThat(portfolioHistoryResponse.segments())
            .containsExactly(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portfolioHistoryResponse =
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

        val roundtrippedPortfolioHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portfolioHistoryResponse),
                jacksonTypeRef<PortfolioHistoryResponse>(),
            )

        assertThat(roundtrippedPortfolioHistoryResponse).isEqualTo(portfolioHistoryResponse)
    }
}
