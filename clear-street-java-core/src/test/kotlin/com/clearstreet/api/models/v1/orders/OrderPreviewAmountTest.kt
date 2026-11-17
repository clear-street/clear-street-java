// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPreviewAmountTest {

    @Test
    fun create() {
        val orderPreviewAmount =
            OrderPreviewAmount.builder()
                .grossAmount("10000.00")
                .netAmount("10000.00")
                .fees(Fees.builder().total("0.10").exchangeFee("0.10").build())
                .build()

        assertThat(orderPreviewAmount.grossAmount()).isEqualTo("10000.00")
        assertThat(orderPreviewAmount.netAmount()).isEqualTo("10000.00")
        assertThat(orderPreviewAmount.fees())
            .contains(Fees.builder().total("0.10").exchangeFee("0.10").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewAmount =
            OrderPreviewAmount.builder()
                .grossAmount("10000.00")
                .netAmount("10000.00")
                .fees(Fees.builder().total("0.10").exchangeFee("0.10").build())
                .build()

        val roundtrippedOrderPreviewAmount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewAmount),
                jacksonTypeRef<OrderPreviewAmount>(),
            )

        assertThat(roundtrippedOrderPreviewAmount).isEqualTo(orderPreviewAmount)
    }
}
