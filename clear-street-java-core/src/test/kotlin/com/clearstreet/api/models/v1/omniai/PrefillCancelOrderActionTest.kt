// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillCancelOrderActionTest {

    @Test
    fun create() {
        val prefillCancelOrderAction =
            PrefillCancelOrderAction.builder()
                .addOrder(
                    PrefillCancelOrderRequest.builder()
                        .accountId(100019L)
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(prefillCancelOrderAction.orders())
            .containsExactly(
                PrefillCancelOrderRequest.builder()
                    .accountId(100019L)
                    .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                    .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillCancelOrderAction =
            PrefillCancelOrderAction.builder()
                .addOrder(
                    PrefillCancelOrderRequest.builder()
                        .accountId(100019L)
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
