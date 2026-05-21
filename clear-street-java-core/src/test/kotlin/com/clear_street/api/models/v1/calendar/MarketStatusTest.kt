// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.calendar

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketStatusTest {

    @Test
    fun create() {
        val marketStatus =
            MarketStatus.builder()
                .dayType(DayType.TRADING_DAY)
                .isOpen(true)
                .currentSession(MarketSessionType.REGULAR)
                .build()

        assertThat(marketStatus.dayType()).isEqualTo(DayType.TRADING_DAY)
        assertThat(marketStatus.isOpen()).isEqualTo(true)
        assertThat(marketStatus.currentSession()).contains(MarketSessionType.REGULAR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketStatus =
            MarketStatus.builder()
                .dayType(DayType.TRADING_DAY)
                .isOpen(true)
                .currentSession(MarketSessionType.REGULAR)
                .build()

        val roundtrippedMarketStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketStatus),
                jacksonTypeRef<MarketStatus>(),
            )

        assertThat(roundtrippedMarketStatus).isEqualTo(marketStatus)
    }
}
