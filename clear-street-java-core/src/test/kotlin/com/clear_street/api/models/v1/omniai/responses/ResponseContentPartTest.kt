// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.responses

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.omniai.ActionButton
import com.clear_street.api.models.v1.omniai.ChartPayload
import com.clear_street.api.models.v1.omniai.ChartPoint
import com.clear_street.api.models.v1.omniai.ChartSeries
import com.clear_street.api.models.v1.omniai.DataChart
import com.clear_street.api.models.v1.omniai.PrefillOrderAction
import com.clear_street.api.models.v1.omniai.PromptButtonAction
import com.clear_street.api.models.v1.omniai.StructuredAction
import com.clear_street.api.models.v1.omniai.StructuredActionButtonAction
import com.clear_street.api.models.v1.omniai.SuggestedActionsPayload
import com.clear_street.api.models.v1.orders.NewOrderRequest
import com.clear_street.api.models.v1.orders.PositionEffect
import com.clear_street.api.models.v1.orders.RequestOrderType
import com.clear_street.api.models.v1.orders.RequestTimeInForce
import com.clear_street.api.models.v1.orders.Side
import com.clear_street.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ResponseContentPartTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            ResponseContentPart.UnionMember0.builder()
                .text("text")
                .type(ResponseContentPart.UnionMember0.Type.TEXT)
                .build()

        val responseContentPart = ResponseContentPart.ofUnionMember0(unionMember0)

        assertThat(responseContentPart.unionMember0()).contains(unionMember0)
        assertThat(responseContentPart.unionMember1()).isEmpty
        assertThat(responseContentPart.unionMember2()).isEmpty
        assertThat(responseContentPart.unionMember3()).isEmpty
        assertThat(responseContentPart.unionMember4()).isEmpty
        assertThat(responseContentPart.unionMember5()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofUnionMember0(
                ResponseContentPart.UnionMember0.builder()
                    .text("text")
                    .type(ResponseContentPart.UnionMember0.Type.TEXT)
                    .build()
            )

        val roundtrippedResponseContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContentPart),
                jacksonTypeRef<ResponseContentPart>(),
            )

        assertThat(roundtrippedResponseContentPart).isEqualTo(responseContentPart)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            ResponseContentPart.UnionMember1.builder()
                .addThought("string")
                .type(ResponseContentPart.UnionMember1.Type.THINKING)
                .build()

        val responseContentPart = ResponseContentPart.ofUnionMember1(unionMember1)

        assertThat(responseContentPart.unionMember0()).isEmpty
        assertThat(responseContentPart.unionMember1()).contains(unionMember1)
        assertThat(responseContentPart.unionMember2()).isEmpty
        assertThat(responseContentPart.unionMember3()).isEmpty
        assertThat(responseContentPart.unionMember4()).isEmpty
        assertThat(responseContentPart.unionMember5()).isEmpty
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofUnionMember1(
                ResponseContentPart.UnionMember1.builder()
                    .addThought("string")
                    .type(ResponseContentPart.UnionMember1.Type.THINKING)
                    .build()
            )

        val roundtrippedResponseContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContentPart),
                jacksonTypeRef<ResponseContentPart>(),
            )

        assertThat(roundtrippedResponseContentPart).isEqualTo(responseContentPart)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            ResponseContentPart.UnionMember2.builder()
                .action(
                    StructuredAction.PrefillOrder.builder()
                        .prefillOrder(
                            PrefillOrderAction.PrefillNewOrderAction.builder()
                                .addOrder(
                                    NewOrderRequest.builder()
                                        .orderType(RequestOrderType.LIMIT)
                                        .quantity("100")
                                        .side(Side.BUY)
                                        .timeInForce(RequestTimeInForce.DAY)
                                        .id("my-ref-id-20251001-002")
                                        .expiresAt(
                                            OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z")
                                        )
                                        .extendedHours(true)
                                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                                        .limitOffset("0.10")
                                        .limitPrice("150.00")
                                        .positionEffect(PositionEffect.OPEN)
                                        .stopPrice("135.00")
                                        .symbol("AAPL")
                                        .trailingOffset("1.25")
                                        .trailingOffsetType(TrailingOffsetType.PRICE)
                                        .build()
                                )
                                .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
                                .build()
                        )
                        .build()
                )
                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ResponseContentPart.UnionMember2.Type.STRUCTURED_ACTION)
                .build()

        val responseContentPart = ResponseContentPart.ofUnionMember2(unionMember2)

        assertThat(responseContentPart.unionMember0()).isEmpty
        assertThat(responseContentPart.unionMember1()).isEmpty
        assertThat(responseContentPart.unionMember2()).contains(unionMember2)
        assertThat(responseContentPart.unionMember3()).isEmpty
        assertThat(responseContentPart.unionMember4()).isEmpty
        assertThat(responseContentPart.unionMember5()).isEmpty
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofUnionMember2(
                ResponseContentPart.UnionMember2.builder()
                    .action(
                        StructuredAction.PrefillOrder.builder()
                            .prefillOrder(
                                PrefillOrderAction.PrefillNewOrderAction.builder()
                                    .addOrder(
                                        NewOrderRequest.builder()
                                            .orderType(RequestOrderType.LIMIT)
                                            .quantity("100")
                                            .side(Side.BUY)
                                            .timeInForce(RequestTimeInForce.DAY)
                                            .id("my-ref-id-20251001-002")
                                            .expiresAt(
                                                OffsetDateTime.parse(
                                                    "2025-10-15T16:00:00.000000000Z"
                                                )
                                            )
                                            .extendedHours(true)
                                            .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                                            .limitOffset("0.10")
                                            .limitPrice("150.00")
                                            .positionEffect(PositionEffect.OPEN)
                                            .stopPrice("135.00")
                                            .symbol("AAPL")
                                            .trailingOffset("1.25")
                                            .trailingOffsetType(TrailingOffsetType.PRICE)
                                            .build()
                                    )
                                    .actionType(
                                        PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(ResponseContentPart.UnionMember2.Type.STRUCTURED_ACTION)
                    .build()
            )

        val roundtrippedResponseContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContentPart),
                jacksonTypeRef<ResponseContentPart>(),
            )

        assertThat(roundtrippedResponseContentPart).isEqualTo(responseContentPart)
    }

    @Test
    fun ofUnionMember3() {
        val unionMember3 =
            ResponseContentPart.UnionMember3.builder()
                .payload(
                    ChartPayload.builder()
                        .chartId("chart_revenue_growth")
                        .addActionButton(
                            ActionButton.builder()
                                .buttonId("btn_compare_aapl_spy")
                                .label("Compare AAPL vs SPY")
                                .prompt(
                                    PromptButtonAction.builder()
                                        .prompt("Compare AAPL vs SPY over 1 year")
                                        .build()
                                )
                                .structuredAction(
                                    StructuredActionButtonAction.builder()
                                        .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .build()
                        )
                        .dataChart(
                            DataChart.builder()
                                .addSeries(
                                    ChartSeries.builder()
                                        .name("Revenue")
                                        .addPoint(ChartPoint.builder().x("Q1").y(100.0).build())
                                        .addPoint(ChartPoint.builder().x("Q2").y(150.0).build())
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .type(ResponseContentPart.UnionMember3.Type.CHART)
                .build()

        val responseContentPart = ResponseContentPart.ofUnionMember3(unionMember3)

        assertThat(responseContentPart.unionMember0()).isEmpty
        assertThat(responseContentPart.unionMember1()).isEmpty
        assertThat(responseContentPart.unionMember2()).isEmpty
        assertThat(responseContentPart.unionMember3()).contains(unionMember3)
        assertThat(responseContentPart.unionMember4()).isEmpty
        assertThat(responseContentPart.unionMember5()).isEmpty
    }

    @Test
    fun ofUnionMember3Roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofUnionMember3(
                ResponseContentPart.UnionMember3.builder()
                    .payload(
                        ChartPayload.builder()
                            .chartId("chart_revenue_growth")
                            .addActionButton(
                                ActionButton.builder()
                                    .buttonId("btn_compare_aapl_spy")
                                    .label("Compare AAPL vs SPY")
                                    .prompt(
                                        PromptButtonAction.builder()
                                            .prompt("Compare AAPL vs SPY over 1 year")
                                            .build()
                                    )
                                    .structuredAction(
                                        StructuredActionButtonAction.builder()
                                            .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .build()
                                    )
                                    .build()
                            )
                            .dataChart(
                                DataChart.builder()
                                    .addSeries(
                                        ChartSeries.builder()
                                            .name("Revenue")
                                            .addPoint(ChartPoint.builder().x("Q1").y(100.0).build())
                                            .addPoint(ChartPoint.builder().x("Q2").y(150.0).build())
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .type(ResponseContentPart.UnionMember3.Type.CHART)
                    .build()
            )

        val roundtrippedResponseContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContentPart),
                jacksonTypeRef<ResponseContentPart>(),
            )

        assertThat(roundtrippedResponseContentPart).isEqualTo(responseContentPart)
    }

    @Test
    fun ofUnionMember4() {
        val unionMember4 =
            ResponseContentPart.UnionMember4.builder()
                .payload(
                    SuggestedActionsPayload.builder()
                        .addActionButton(
                            ActionButton.builder()
                                .buttonId("btn_show_aapl_1y")
                                .label("Show AAPL over 1 year")
                                .prompt(
                                    PromptButtonAction.builder()
                                        .prompt("Show AAPL over the last year")
                                        .build()
                                )
                                .structuredAction(
                                    StructuredActionButtonAction.builder()
                                        .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .build()
                        )
                        .addActionButton(
                            ActionButton.builder()
                                .buttonId("btn_compare_aapl_spy")
                                .label("Compare AAPL vs SPY")
                                .prompt(
                                    PromptButtonAction.builder()
                                        .prompt("Compare AAPL vs SPY over 1 year")
                                        .build()
                                )
                                .structuredAction(
                                    StructuredActionButtonAction.builder()
                                        .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .type(ResponseContentPart.UnionMember4.Type.SUGGESTED_ACTIONS)
                .build()

        val responseContentPart = ResponseContentPart.ofUnionMember4(unionMember4)

        assertThat(responseContentPart.unionMember0()).isEmpty
        assertThat(responseContentPart.unionMember1()).isEmpty
        assertThat(responseContentPart.unionMember2()).isEmpty
        assertThat(responseContentPart.unionMember3()).isEmpty
        assertThat(responseContentPart.unionMember4()).contains(unionMember4)
        assertThat(responseContentPart.unionMember5()).isEmpty
    }

    @Test
    fun ofUnionMember4Roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofUnionMember4(
                ResponseContentPart.UnionMember4.builder()
                    .payload(
                        SuggestedActionsPayload.builder()
                            .addActionButton(
                                ActionButton.builder()
                                    .buttonId("btn_show_aapl_1y")
                                    .label("Show AAPL over 1 year")
                                    .prompt(
                                        PromptButtonAction.builder()
                                            .prompt("Show AAPL over the last year")
                                            .build()
                                    )
                                    .structuredAction(
                                        StructuredActionButtonAction.builder()
                                            .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .build()
                                    )
                                    .build()
                            )
                            .addActionButton(
                                ActionButton.builder()
                                    .buttonId("btn_compare_aapl_spy")
                                    .label("Compare AAPL vs SPY")
                                    .prompt(
                                        PromptButtonAction.builder()
                                            .prompt("Compare AAPL vs SPY over 1 year")
                                            .build()
                                    )
                                    .structuredAction(
                                        StructuredActionButtonAction.builder()
                                            .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .type(ResponseContentPart.UnionMember4.Type.SUGGESTED_ACTIONS)
                    .build()
            )

        val roundtrippedResponseContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContentPart),
                jacksonTypeRef<ResponseContentPart>(),
            )

        assertThat(roundtrippedResponseContentPart).isEqualTo(responseContentPart)
    }

    @Test
    fun ofUnionMember5() {
        val unionMember5 =
            ResponseContentPart.UnionMember5.builder()
                .payload(JsonValue.from(mapOf<String, Any>()))
                .type(ResponseContentPart.UnionMember5.Type.CUSTOM)
                .build()

        val responseContentPart = ResponseContentPart.ofUnionMember5(unionMember5)

        assertThat(responseContentPart.unionMember0()).isEmpty
        assertThat(responseContentPart.unionMember1()).isEmpty
        assertThat(responseContentPart.unionMember2()).isEmpty
        assertThat(responseContentPart.unionMember3()).isEmpty
        assertThat(responseContentPart.unionMember4()).isEmpty
        assertThat(responseContentPart.unionMember5()).contains(unionMember5)
    }

    @Test
    fun ofUnionMember5Roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofUnionMember5(
                ResponseContentPart.UnionMember5.builder()
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .type(ResponseContentPart.UnionMember5.Type.CUSTOM)
                    .build()
            )

        val roundtrippedResponseContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContentPart),
                jacksonTypeRef<ResponseContentPart>(),
            )

        assertThat(roundtrippedResponseContentPart).isEqualTo(responseContentPart)
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
        val responseContentPart =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ResponseContentPart>())

        val e = assertThrows<ClearStreetInvalidDataException> { responseContentPart.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
