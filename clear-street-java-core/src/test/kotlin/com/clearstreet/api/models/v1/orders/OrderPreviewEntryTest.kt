// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.ApiError
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class OrderPreviewEntryTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            OrderPreviewEntry.UnionMember0.builder()
                .preview(
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
                                        .putAdditionalProperty(
                                            "required_total",
                                            JsonValue.from("10000"),
                                        )
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
                )
                .id("my-ref-id-20251001-002")
                .build()

        val orderPreviewEntry = OrderPreviewEntry.ofUnionMember0(unionMember0)

        assertThat(orderPreviewEntry.unionMember0()).contains(unionMember0)
        assertThat(orderPreviewEntry.unionMember1()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewEntry =
            OrderPreviewEntry.ofUnionMember0(
                OrderPreviewEntry.UnionMember0.builder()
                    .preview(
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
                                            .putAdditionalProperty(
                                                "available",
                                                JsonValue.from("5000"),
                                            )
                                            .putAdditionalProperty(
                                                "required_total",
                                                JsonValue.from("10000"),
                                            )
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
                    )
                    .id("my-ref-id-20251001-002")
                    .build()
            )

        val roundtrippedOrderPreviewEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewEntry),
                jacksonTypeRef<OrderPreviewEntry>(),
            )

        assertThat(roundtrippedOrderPreviewEntry).isEqualTo(orderPreviewEntry)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            OrderPreviewEntry.UnionMember1.builder()
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .id("my-ref-id-20251001-002")
                .build()

        val orderPreviewEntry = OrderPreviewEntry.ofUnionMember1(unionMember1)

        assertThat(orderPreviewEntry.unionMember0()).isEmpty
        assertThat(orderPreviewEntry.unionMember1()).contains(unionMember1)
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewEntry =
            OrderPreviewEntry.ofUnionMember1(
                OrderPreviewEntry.UnionMember1.builder()
                    .error(
                        ApiError.builder()
                            .code(400)
                            .message("Order quantity must be greater than zero")
                            .addDetail(
                                ApiError.Detail.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .id("my-ref-id-20251001-002")
                    .build()
            )

        val roundtrippedOrderPreviewEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewEntry),
                jacksonTypeRef<OrderPreviewEntry>(),
            )

        assertThat(roundtrippedOrderPreviewEntry).isEqualTo(orderPreviewEntry)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val orderPreviewEntry =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<OrderPreviewEntry>())

        val e = assertThrows<ClearStreetInvalidDataException> { orderPreviewEntry.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
