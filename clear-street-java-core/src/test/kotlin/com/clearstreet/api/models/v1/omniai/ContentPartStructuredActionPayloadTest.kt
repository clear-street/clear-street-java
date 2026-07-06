// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.orders.NewOrderRequest
import com.clearstreet.api.models.v1.orders.RequestOrderType
import com.clearstreet.api.models.v1.orders.RequestTimeInForce
import com.clearstreet.api.models.v1.orders.Side
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
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
                            PrefillOrderAction.PrefillNewOrderAction.builder()
                                .addOrder(
                                    NewOrderRequest.builder()
                                        .orderType(RequestOrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .timeInForce(RequestTimeInForce.DAY)
                                        .id("my-ref-id-20251001-002")
                                        .expiresAt(
                                            OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z")
                                        )
                                        .extendedHours(true)
                                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .limitOffset("0.50")
                                        .limitPrice("150.00")
                                        .stopPrice("52.00")
                                        .symbol("AAPL")
                                        .trailingOffset("2.00")
                                        .trailingOffsetType(TrailingOffsetType.PRICE)
                                        .build()
                                )
                                .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
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
                            PrefillOrderAction.PrefillNewOrderAction.builder()
                                .addOrder(
                                    NewOrderRequest.builder()
                                        .orderType(RequestOrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .timeInForce(RequestTimeInForce.DAY)
                                        .id("my-ref-id-20251001-002")
                                        .expiresAt(
                                            OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z")
                                        )
                                        .extendedHours(true)
                                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .limitOffset("0.50")
                                        .limitPrice("150.00")
                                        .stopPrice("52.00")
                                        .symbol("AAPL")
                                        .trailingOffset("2.00")
                                        .trailingOffsetType(TrailingOffsetType.PRICE)
                                        .build()
                                )
                                .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
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
                            PrefillOrderAction.PrefillNewOrderAction.builder()
                                .addOrder(
                                    NewOrderRequest.builder()
                                        .orderType(RequestOrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .timeInForce(RequestTimeInForce.DAY)
                                        .id("my-ref-id-20251001-002")
                                        .expiresAt(
                                            OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z")
                                        )
                                        .extendedHours(true)
                                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .limitOffset("0.50")
                                        .limitPrice("150.00")
                                        .stopPrice("52.00")
                                        .symbol("AAPL")
                                        .trailingOffset("2.00")
                                        .trailingOffsetType(TrailingOffsetType.PRICE)
                                        .build()
                                )
                                .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
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
