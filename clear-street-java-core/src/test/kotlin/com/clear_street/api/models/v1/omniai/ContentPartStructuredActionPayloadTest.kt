// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.accounts.orders.NewOrderRequest
import com.clear_street.api.models.v1.accounts.orders.PositionEffect
import com.clear_street.api.models.v1.accounts.orders.RequestOrderType
import com.clear_street.api.models.v1.accounts.orders.RequestTimeInForce
import com.clear_street.api.models.v1.accounts.orders.Side
import com.clear_street.api.models.v1.accounts.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartStructuredActionPayloadTest {

    @Test
    fun create() {
        val contentPartStructuredActionPayload =
            ContentPartStructuredActionPayload.builder()
                .action(
                    StructuredAction.PrefillOrder.builder()
                        .prefillOrder(
                            PrefillOrderAction.UnionMember0.builder()
                                .actionType(PrefillOrderAction.UnionMember0.ActionType.NEW)
                                .addOrder(
                                    NewOrderRequest.builder()
                                        .instrumentType(SecurityType.COMMON_STOCK)
                                        .orderType(RequestOrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .timeInForce(RequestTimeInForce.DAY)
                                        .id("my-ref-id-20251001-002")
                                        .expiresAt(
                                            OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z")
                                        )
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
                        )
                        .build()
                )
                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(contentPartStructuredActionPayload.action())
            .isEqualTo(
                StructuredAction.ofPrefillOrder(
                    StructuredAction.PrefillOrder.builder()
                        .prefillOrder(
                            PrefillOrderAction.UnionMember0.builder()
                                .actionType(PrefillOrderAction.UnionMember0.ActionType.NEW)
                                .addOrder(
                                    NewOrderRequest.builder()
                                        .instrumentType(SecurityType.COMMON_STOCK)
                                        .orderType(RequestOrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .timeInForce(RequestTimeInForce.DAY)
                                        .id("my-ref-id-20251001-002")
                                        .expiresAt(
                                            OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z")
                                        )
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
                        )
                        .build()
                )
            )
        assertThat(contentPartStructuredActionPayload.actionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartStructuredActionPayload =
            ContentPartStructuredActionPayload.builder()
                .action(
                    StructuredAction.PrefillOrder.builder()
                        .prefillOrder(
                            PrefillOrderAction.UnionMember0.builder()
                                .actionType(PrefillOrderAction.UnionMember0.ActionType.NEW)
                                .addOrder(
                                    NewOrderRequest.builder()
                                        .instrumentType(SecurityType.COMMON_STOCK)
                                        .orderType(RequestOrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .timeInForce(RequestTimeInForce.DAY)
                                        .id("my-ref-id-20251001-002")
                                        .expiresAt(
                                            OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z")
                                        )
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
                        )
                        .build()
                )
                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedContentPartStructuredActionPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartStructuredActionPayload),
                jacksonTypeRef<ContentPartStructuredActionPayload>(),
            )

        assertThat(roundtrippedContentPartStructuredActionPayload)
            .isEqualTo(contentPartStructuredActionPayload)
    }
}
