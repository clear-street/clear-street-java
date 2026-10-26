// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPreviewMarginDetailsTest {

    @Test
    fun create() {
        val orderPreviewMarginDetails =
            OrderPreviewMarginDetails.builder()
                .initialMarginExcess(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .initialMarginRequirement(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .maintenanceMarginExcess(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .maintenanceMarginRequirement(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .overnightMarginExcess(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .overnightMarginRequirement(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .build()

        assertThat(orderPreviewMarginDetails.initialMarginExcess())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreviewMarginDetails.initialMarginRequirement())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreviewMarginDetails.maintenanceMarginExcess())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreviewMarginDetails.maintenanceMarginRequirement())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreviewMarginDetails.overnightMarginExcess())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreviewMarginDetails.overnightMarginRequirement())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewMarginDetails =
            OrderPreviewMarginDetails.builder()
                .initialMarginExcess(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .initialMarginRequirement(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .maintenanceMarginExcess(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .maintenanceMarginRequirement(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .overnightMarginExcess(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .overnightMarginRequirement(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .build()

        val roundtrippedOrderPreviewMarginDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewMarginDetails),
                jacksonTypeRef<OrderPreviewMarginDetails>(),
            )

        assertThat(roundtrippedOrderPreviewMarginDetails).isEqualTo(orderPreviewMarginDetails)
    }
}
