// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.orders.NewOrderRequest
import com.clear_street.api.models.v1.orders.PositionEffect
import com.clear_street.api.models.v1.orders.RequestOrderType
import com.clear_street.api.models.v1.orders.RequestTimeInForce
import com.clear_street.api.models.v1.orders.Side
import com.clear_street.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillNewOrderActionTest {

    @Test
    fun create() {
        val prefillNewOrderAction =
            PrefillNewOrderAction.builder()
                .addOrder(
                    NewOrderRequest.builder()
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("100")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .id("my-ref-id-20251001-002")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(true)
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .limitOffset("0.10")
                        .limitPrice("150.00")
                        .positionEffect(PositionEffect.OPEN)
                        .stopPrice("135.00")
                        .symbol("AAPL")
                        .trailingOffset("1.25")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .build()
                )
                .build()

        assertThat(prefillNewOrderAction.orders())
            .containsExactly(
                NewOrderRequest.builder()
                    .instrumentType(SecurityType.COMMON_STOCK)
                    .orderType(RequestOrderType.LIMIT)
                    .quantity("100")
                    .side(Side.BUY)
                    .timeInForce(RequestTimeInForce.DAY)
                    .id("my-ref-id-20251001-002")
                    .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                    .extendedHours(true)
                    .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .limitOffset("0.10")
                    .limitPrice("150.00")
                    .positionEffect(PositionEffect.OPEN)
                    .stopPrice("135.00")
                    .symbol("AAPL")
                    .trailingOffset("1.25")
                    .trailingOffsetType(TrailingOffsetType.PRICE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillNewOrderAction =
            PrefillNewOrderAction.builder()
                .addOrder(
                    NewOrderRequest.builder()
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("100")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .id("my-ref-id-20251001-002")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(true)
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .limitOffset("0.10")
                        .limitPrice("150.00")
                        .positionEffect(PositionEffect.OPEN)
                        .stopPrice("135.00")
                        .symbol("AAPL")
                        .trailingOffset("1.25")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .build()
                )
                .build()

        val roundtrippedPrefillNewOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillNewOrderAction),
                jacksonTypeRef<PrefillNewOrderAction>(),
            )

        assertThat(roundtrippedPrefillNewOrderAction).isEqualTo(prefillNewOrderAction)
    }
}
