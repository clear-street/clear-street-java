// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.portfoliohistory

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortfolioHistorySegmentTest {

    @Test
    fun create() {
        val portfolioHistorySegment =
            PortfolioHistorySegment.builder()
                .date(LocalDate.parse("2019-12-27"))
                .eodEquity("eod_equity")
                .realizedPnl("realized_pnl")
                .sodEquity("sod_equity")
                .unrealizedPnl("unrealized_pnl")
                .boughtNotional("bought_notional")
                .dayPnl("day_pnl")
                .netPnl("net_pnl")
                .positionPnl("position_pnl")
                .soldNotional("sold_notional")
                .build()

        assertThat(portfolioHistorySegment.date()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(portfolioHistorySegment.eodEquity()).isEqualTo("eod_equity")
        assertThat(portfolioHistorySegment.realizedPnl()).isEqualTo("realized_pnl")
        assertThat(portfolioHistorySegment.sodEquity()).isEqualTo("sod_equity")
        assertThat(portfolioHistorySegment.unrealizedPnl()).isEqualTo("unrealized_pnl")
        assertThat(portfolioHistorySegment.boughtNotional()).contains("bought_notional")
        assertThat(portfolioHistorySegment.dayPnl()).contains("day_pnl")
        assertThat(portfolioHistorySegment.netPnl()).contains("net_pnl")
        assertThat(portfolioHistorySegment.positionPnl()).contains("position_pnl")
        assertThat(portfolioHistorySegment.soldNotional()).contains("sold_notional")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portfolioHistorySegment =
            PortfolioHistorySegment.builder()
                .date(LocalDate.parse("2019-12-27"))
                .eodEquity("eod_equity")
                .realizedPnl("realized_pnl")
                .sodEquity("sod_equity")
                .unrealizedPnl("unrealized_pnl")
                .boughtNotional("bought_notional")
                .dayPnl("day_pnl")
                .netPnl("net_pnl")
                .positionPnl("position_pnl")
                .soldNotional("sold_notional")
                .build()

        val roundtrippedPortfolioHistorySegment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portfolioHistorySegment),
                jacksonTypeRef<PortfolioHistorySegment>(),
            )

        assertThat(roundtrippedPortfolioHistorySegment).isEqualTo(portfolioHistorySegment)
    }
}
