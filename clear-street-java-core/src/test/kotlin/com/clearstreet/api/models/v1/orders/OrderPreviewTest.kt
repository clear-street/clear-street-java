// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPreviewTest {

    @Test
    fun create() {
        val orderPreview =
            OrderPreview.builder()
                .accountId(19816L)
                .amount(
                    OrderPreviewAmount.builder()
                        .grossAmount("10000.00")
                        .netAmount("10000.00")
                        .build()
                )
                .buyingPower(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .currency("USD")
                .equity(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .addError(
                    OrderPreviewError.builder()
                        .description("Insufficient buying power")
                        .metadata(
                            OrderPreviewError.Metadata.builder()
                                .putAdditionalProperty("available", JsonValue.from("5000"))
                                .putAdditionalProperty("required_total", JsonValue.from("10000"))
                                .build()
                        )
                        .type("BUYING_POWER")
                        .build()
                )
                .marginDetails(
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
                )
                .addPosition(
                    OrderPreviewPosition.builder()
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .quantity(
                            OrderPreviewDelta.builder()
                                .after("190000.00")
                                .before("200000.00")
                                .change("-10000.00")
                                .build()
                        )
                        .symbol("AAPL")
                        .build()
                )
                .build()

        assertThat(orderPreview.accountId()).isEqualTo(19816L)
        assertThat(orderPreview.amount())
            .isEqualTo(
                OrderPreviewAmount.builder().grossAmount("10000.00").netAmount("10000.00").build()
            )
        assertThat(orderPreview.buyingPower())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreview.currency()).isEqualTo("USD")
        assertThat(orderPreview.equity())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreview.errors())
            .containsExactly(
                OrderPreviewError.builder()
                    .description("Insufficient buying power")
                    .metadata(
                        OrderPreviewError.Metadata.builder()
                            .putAdditionalProperty("available", JsonValue.from("5000"))
                            .putAdditionalProperty("required_total", JsonValue.from("10000"))
                            .build()
                    )
                    .type("BUYING_POWER")
                    .build()
            )
        assertThat(orderPreview.marginDetails())
            .isEqualTo(
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
            )
        assertThat(orderPreview.positions())
            .containsExactly(
                OrderPreviewPosition.builder()
                    .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                    .quantity(
                        OrderPreviewDelta.builder()
                            .after("190000.00")
                            .before("200000.00")
                            .change("-10000.00")
                            .build()
                    )
                    .symbol("AAPL")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreview =
            OrderPreview.builder()
                .accountId(19816L)
                .amount(
                    OrderPreviewAmount.builder()
                        .grossAmount("10000.00")
                        .netAmount("10000.00")
                        .build()
                )
                .buyingPower(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .currency("USD")
                .equity(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .addError(
                    OrderPreviewError.builder()
                        .description("Insufficient buying power")
                        .metadata(
                            OrderPreviewError.Metadata.builder()
                                .putAdditionalProperty("available", JsonValue.from("5000"))
                                .putAdditionalProperty("required_total", JsonValue.from("10000"))
                                .build()
                        )
                        .type("BUYING_POWER")
                        .build()
                )
                .marginDetails(
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
                )
                .addPosition(
                    OrderPreviewPosition.builder()
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .quantity(
                            OrderPreviewDelta.builder()
                                .after("190000.00")
                                .before("200000.00")
                                .change("-10000.00")
                                .build()
                        )
                        .symbol("AAPL")
                        .build()
                )
                .build()

        val roundtrippedOrderPreview =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreview),
                jacksonTypeRef<OrderPreview>(),
            )

        assertThat(roundtrippedOrderPreview).isEqualTo(orderPreview)
    }
}
