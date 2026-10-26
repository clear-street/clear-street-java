// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPreviewDeltaTest {

    @Test
    fun create() {
        val orderPreviewDelta =
            OrderPreviewDelta.builder()
                .after("190000.00")
                .before("200000.00")
                .change("-10000.00")
                .build()

        assertThat(orderPreviewDelta.after()).isEqualTo("190000.00")
        assertThat(orderPreviewDelta.before()).isEqualTo("200000.00")
        assertThat(orderPreviewDelta.change()).isEqualTo("-10000.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewDelta =
            OrderPreviewDelta.builder()
                .after("190000.00")
                .before("200000.00")
                .change("-10000.00")
                .build()

        val roundtrippedOrderPreviewDelta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewDelta),
                jacksonTypeRef<OrderPreviewDelta>(),
            )

        assertThat(roundtrippedOrderPreviewDelta).isEqualTo(orderPreviewDelta)
    }
}
