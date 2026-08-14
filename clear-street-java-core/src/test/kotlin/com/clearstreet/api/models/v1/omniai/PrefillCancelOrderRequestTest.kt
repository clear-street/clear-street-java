// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillCancelOrderRequestTest {

    @Test
    fun create() {
        val prefillCancelOrderRequest =
            PrefillCancelOrderRequest.builder()
                .accountId(0L)
                .orderId("order_id")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(prefillCancelOrderRequest.accountId()).isEqualTo(0L)
        assertThat(prefillCancelOrderRequest.orderId()).isEqualTo("order_id")
        assertThat(prefillCancelOrderRequest.itemId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillCancelOrderRequest =
            PrefillCancelOrderRequest.builder()
                .accountId(0L)
                .orderId("order_id")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedPrefillCancelOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillCancelOrderRequest),
                jacksonTypeRef<PrefillCancelOrderRequest>(),
            )

        assertThat(roundtrippedPrefillCancelOrderRequest).isEqualTo(prefillCancelOrderRequest)
    }
}
