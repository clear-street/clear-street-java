// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.accounts.orders.OrderType
import com.clear_street.api.models.v1.accounts.orders.Side
import com.clear_street.api.models.v1.accounts.orders.TimeInForce
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
                            PrefillOrderAction.builder()
                                .actionType(PrefillOrderActionType.NEW)
                                .addOrder(
                                    OrderPayload.builder()
                                        .instrumentType(SecurityType.COMMON_STOCK)
                                        .orderType(OrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .symbol("AAPL")
                                        .timeInForce(TimeInForce.DAY)
                                        .limitPrice("150.00")
                                        .orderId("order_id")
                                        .stopPrice("148.00")
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
                            PrefillOrderAction.builder()
                                .actionType(PrefillOrderActionType.NEW)
                                .addOrder(
                                    OrderPayload.builder()
                                        .instrumentType(SecurityType.COMMON_STOCK)
                                        .orderType(OrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .symbol("AAPL")
                                        .timeInForce(TimeInForce.DAY)
                                        .limitPrice("150.00")
                                        .orderId("order_id")
                                        .stopPrice("148.00")
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
                            PrefillOrderAction.builder()
                                .actionType(PrefillOrderActionType.NEW)
                                .addOrder(
                                    OrderPayload.builder()
                                        .instrumentType(SecurityType.COMMON_STOCK)
                                        .orderType(OrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .symbol("AAPL")
                                        .timeInForce(TimeInForce.DAY)
                                        .limitPrice("150.00")
                                        .orderId("order_id")
                                        .stopPrice("148.00")
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
