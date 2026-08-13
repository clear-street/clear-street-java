// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillModifyOrderActionTest {

    @Test
    fun create() {
        val prefillModifyOrderAction =
            PrefillModifyOrderAction.builder()
                .addOrder(
                    PrefillModifyOrderRequest.builder()
                        .accountId(100019L)
                        .limitOffset("0.50")
                        .limitPrice("178.00")
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .quantity("1")
                        .stopPrice("52.00")
                        .trailingOffset("2.00")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .build()
                )
                .build()

        assertThat(prefillModifyOrderAction.orders())
            .containsExactly(
                PrefillModifyOrderRequest.builder()
                    .accountId(100019L)
                    .limitOffset("0.50")
                    .limitPrice("178.00")
                    .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                    .quantity("1")
                    .stopPrice("52.00")
                    .trailingOffset("2.00")
                    .trailingOffsetType(TrailingOffsetType.PRICE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillModifyOrderAction =
            PrefillModifyOrderAction.builder()
                .addOrder(
                    PrefillModifyOrderRequest.builder()
                        .accountId(100019L)
                        .limitOffset("0.50")
                        .limitPrice("178.00")
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .quantity("1")
                        .stopPrice("52.00")
                        .trailingOffset("2.00")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .build()
                )
                .build()

        val roundtrippedPrefillModifyOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillModifyOrderAction),
                jacksonTypeRef<PrefillModifyOrderAction>(),
            )

        assertThat(roundtrippedPrefillModifyOrderAction).isEqualTo(prefillModifyOrderAction)
    }
}
