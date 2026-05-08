// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.orders.CancelOrderRequest
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillCancelOrderActionTest {

    @Test
    fun create() {
        val prefillCancelOrderAction =
            PrefillCancelOrderAction.builder()
                .addOrder(
                    CancelOrderRequest.builder()
                        .accountId(100019L)
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .build()
                )
                .build()

        assertThat(prefillCancelOrderAction.orders())
            .containsExactly(
                CancelOrderRequest.builder()
                    .accountId(100019L)
                    .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillCancelOrderAction =
            PrefillCancelOrderAction.builder()
                .addOrder(
                    CancelOrderRequest.builder()
                        .accountId(100019L)
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .build()
                )
                .build()

        val roundtrippedPrefillCancelOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillCancelOrderAction),
                jacksonTypeRef<PrefillCancelOrderAction>(),
            )

        assertThat(roundtrippedPrefillCancelOrderAction).isEqualTo(prefillCancelOrderAction)
    }
}
