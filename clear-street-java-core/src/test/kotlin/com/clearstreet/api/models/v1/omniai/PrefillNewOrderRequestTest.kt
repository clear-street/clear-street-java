// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.orders.RequestOrderType
import com.clearstreet.api.models.v1.orders.RequestPositionEffect
import com.clearstreet.api.models.v1.orders.RequestTimeInForce
import com.clearstreet.api.models.v1.orders.Side
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillNewOrderRequestTest {

    @Test
    fun create() {
        val prefillNewOrderRequest =
            PrefillNewOrderRequest.builder()
                .orderType(RequestOrderType.MARKET)
                .quantity("1")
                .side(Side.BUY)
                .timeInForce(RequestTimeInForce.DAY)
                .id("my-ref-id-20251001-002")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(true)
                .instrumentId("x")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limitOffset("0.50")
                .limitPrice("48.00")
                .positionIntent(RequestPositionEffect.OPEN)
                .stopPrice("52.00")
                .symbol("TSLA")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        assertThat(prefillNewOrderRequest.orderType()).isEqualTo(RequestOrderType.MARKET)
        assertThat(prefillNewOrderRequest.quantity()).isEqualTo("1")
        assertThat(prefillNewOrderRequest.side()).isEqualTo(Side.BUY)
        assertThat(prefillNewOrderRequest.timeInForce()).isEqualTo(RequestTimeInForce.DAY)
        assertThat(prefillNewOrderRequest.id()).contains("my-ref-id-20251001-002")
        assertThat(prefillNewOrderRequest.expiresAt())
            .contains(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
        assertThat(prefillNewOrderRequest.extendedHours()).contains(true)
        assertThat(prefillNewOrderRequest.instrumentId()).contains("x")
        assertThat(prefillNewOrderRequest.itemId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(prefillNewOrderRequest.limitOffset()).contains("0.50")
        assertThat(prefillNewOrderRequest.limitPrice()).contains("48.00")
        assertThat(prefillNewOrderRequest.positionIntent()).contains(RequestPositionEffect.OPEN)
        assertThat(prefillNewOrderRequest.stopPrice()).contains("52.00")
        assertThat(prefillNewOrderRequest.symbol()).contains("TSLA")
        assertThat(prefillNewOrderRequest.trailingOffset()).contains("2.00")
        assertThat(prefillNewOrderRequest.trailingOffsetType()).contains(TrailingOffsetType.PRICE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillNewOrderRequest =
            PrefillNewOrderRequest.builder()
                .orderType(RequestOrderType.MARKET)
                .quantity("1")
                .side(Side.BUY)
                .timeInForce(RequestTimeInForce.DAY)
                .id("my-ref-id-20251001-002")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(true)
                .instrumentId("x")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limitOffset("0.50")
                .limitPrice("48.00")
                .positionIntent(RequestPositionEffect.OPEN)
                .stopPrice("52.00")
                .symbol("TSLA")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        val roundtrippedPrefillNewOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillNewOrderRequest),
                jacksonTypeRef<PrefillNewOrderRequest>(),
            )

        assertThat(roundtrippedPrefillNewOrderRequest).isEqualTo(prefillNewOrderRequest)
    }
}
