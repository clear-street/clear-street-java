// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.positions

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionTest {

    @Test
    fun create() {
        val position =
            Position.builder()
                .accountId(19816L)
                .availableQuantity("100")
                .instrumentType(SecurityType.COMMON_STOCK)
                .marketValue("15050.00")
                .positionType(PositionType.LONG)
                .quantity("100")
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .symbol("AAPL")
                .avgPrice("145.00")
                .closingPrice("150.50")
                .costBasis("14500.00")
                .dailyUnrealizedPnl("550.00")
                .dailyUnrealizedPnlPct("3.65")
                .marketPrice("151.00")
                .underlierInstrumentId("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                .unrealizedPnl("550.00")
                .unrealizedPnlPct("3.79")
                .build()

        assertThat(position.accountId()).isEqualTo(19816L)
        assertThat(position.availableQuantity()).isEqualTo("100")
        assertThat(position.instrumentType()).isEqualTo(SecurityType.COMMON_STOCK)
        assertThat(position.marketValue()).isEqualTo("15050.00")
        assertThat(position.positionType()).isEqualTo(PositionType.LONG)
        assertThat(position.quantity()).isEqualTo("100")
        assertThat(position.securityId()).isEqualTo("AAPL")
        assertThat(position.securityIdSource()).isEqualTo(SecurityIdSource.CMS)
        assertThat(position.symbol()).isEqualTo("AAPL")
        assertThat(position.avgPrice()).contains("145.00")
        assertThat(position.closingPrice()).contains("150.50")
        assertThat(position.costBasis()).contains("14500.00")
        assertThat(position.dailyUnrealizedPnl()).contains("550.00")
        assertThat(position.dailyUnrealizedPnlPct()).contains("3.65")
        assertThat(position.marketPrice()).contains("151.00")
        assertThat(position.underlierInstrumentId())
            .contains("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
        assertThat(position.unrealizedPnl()).contains("550.00")
        assertThat(position.unrealizedPnlPct()).contains("3.79")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val position =
            Position.builder()
                .accountId(19816L)
                .availableQuantity("100")
                .instrumentType(SecurityType.COMMON_STOCK)
                .marketValue("15050.00")
                .positionType(PositionType.LONG)
                .quantity("100")
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .symbol("AAPL")
                .avgPrice("145.00")
                .closingPrice("150.50")
                .costBasis("14500.00")
                .dailyUnrealizedPnl("550.00")
                .dailyUnrealizedPnlPct("3.65")
                .marketPrice("151.00")
                .underlierInstrumentId("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                .unrealizedPnl("550.00")
                .unrealizedPnlPct("3.79")
                .build()

        val roundtrippedPosition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(position),
                jacksonTypeRef<Position>(),
            )

        assertThat(roundtrippedPosition).isEqualTo(position)
    }
}
