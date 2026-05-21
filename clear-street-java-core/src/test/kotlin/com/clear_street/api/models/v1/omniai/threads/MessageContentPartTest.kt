// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.threads

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

internal class MessageContentPartTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            MessageContentPart.UnionMember0.builder()
                .text("text")
                .type(MessageContentPart.UnionMember0.Type.TEXT)
                .build()

        val messageContentPart = MessageContentPart.ofUnionMember0(unionMember0)

        assertThat(messageContentPart.unionMember0()).contains(unionMember0)
        assertThat(messageContentPart.unionMember1()).isEmpty
        assertThat(messageContentPart.unionMember2()).isEmpty
        assertThat(messageContentPart.unionMember3()).isEmpty
        assertThat(messageContentPart.unionMember4()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofUnionMember0(
                MessageContentPart.UnionMember0.builder()
                    .text("text")
                    .type(MessageContentPart.UnionMember0.Type.TEXT)
                    .build()
            )

        val roundtrippedMessageContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContentPart),
                jacksonTypeRef<MessageContentPart>(),
            )

        assertThat(roundtrippedMessageContentPart).isEqualTo(messageContentPart)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            MessageContentPart.UnionMember1.builder()
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
                .type(MessageContentPart.UnionMember1.Type.STRUCTURED_ACTION)
                .build()

        val messageContentPart = MessageContentPart.ofUnionMember1(unionMember1)

        assertThat(messageContentPart.unionMember0()).isEmpty
        assertThat(messageContentPart.unionMember1()).contains(unionMember1)
        assertThat(messageContentPart.unionMember2()).isEmpty
        assertThat(messageContentPart.unionMember3()).isEmpty
        assertThat(messageContentPart.unionMember4()).isEmpty
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofUnionMember1(
                MessageContentPart.UnionMember1.builder()
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
                    .type(MessageContentPart.UnionMember1.Type.STRUCTURED_ACTION)
                    .build()
            )

        val roundtrippedMessageContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContentPart),
                jacksonTypeRef<MessageContentPart>(),
            )

        assertThat(roundtrippedMessageContentPart).isEqualTo(messageContentPart)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            MessageContentPart.UnionMember2.builder()
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
                .type(MessageContentPart.UnionMember2.Type.CHART)
                .build()

        val messageContentPart = MessageContentPart.ofUnionMember2(unionMember2)

        assertThat(messageContentPart.unionMember0()).isEmpty
        assertThat(messageContentPart.unionMember1()).isEmpty
        assertThat(messageContentPart.unionMember2()).contains(unionMember2)
        assertThat(messageContentPart.unionMember3()).isEmpty
        assertThat(messageContentPart.unionMember4()).isEmpty
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofUnionMember2(
                MessageContentPart.UnionMember2.builder()
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
                    .type(MessageContentPart.UnionMember2.Type.CHART)
                    .build()
            )

        val roundtrippedMessageContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContentPart),
                jacksonTypeRef<MessageContentPart>(),
            )

        assertThat(roundtrippedMessageContentPart).isEqualTo(messageContentPart)
    }

    @Test
    fun ofUnionMember3() {
        val unionMember3 =
            MessageContentPart.UnionMember3.builder()
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
                .type(MessageContentPart.UnionMember3.Type.SUGGESTED_ACTIONS)
                .build()

        val messageContentPart = MessageContentPart.ofUnionMember3(unionMember3)

        assertThat(messageContentPart.unionMember0()).isEmpty
        assertThat(messageContentPart.unionMember1()).isEmpty
        assertThat(messageContentPart.unionMember2()).isEmpty
        assertThat(messageContentPart.unionMember3()).contains(unionMember3)
        assertThat(messageContentPart.unionMember4()).isEmpty
    }

    @Test
    fun ofUnionMember3Roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofUnionMember3(
                MessageContentPart.UnionMember3.builder()
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
                    .type(MessageContentPart.UnionMember3.Type.SUGGESTED_ACTIONS)
                    .build()
            )

        val roundtrippedMessageContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContentPart),
                jacksonTypeRef<MessageContentPart>(),
            )

        assertThat(roundtrippedMessageContentPart).isEqualTo(messageContentPart)
    }

    @Test
    fun ofUnionMember4() {
        val unionMember4 =
            MessageContentPart.UnionMember4.builder()
                .payload(JsonValue.from(mapOf<String, Any>()))
                .type(MessageContentPart.UnionMember4.Type.CUSTOM)
                .build()

        val messageContentPart = MessageContentPart.ofUnionMember4(unionMember4)

        assertThat(messageContentPart.unionMember0()).isEmpty
        assertThat(messageContentPart.unionMember1()).isEmpty
        assertThat(messageContentPart.unionMember2()).isEmpty
        assertThat(messageContentPart.unionMember3()).isEmpty
        assertThat(messageContentPart.unionMember4()).contains(unionMember4)
    }

    @Test
    fun ofUnionMember4Roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofUnionMember4(
                MessageContentPart.UnionMember4.builder()
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .type(MessageContentPart.UnionMember4.Type.CUSTOM)
                    .build()
            )

        val roundtrippedMessageContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContentPart),
                jacksonTypeRef<MessageContentPart>(),
            )

        assertThat(roundtrippedMessageContentPart).isEqualTo(messageContentPart)
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
        val messageContentPart =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<MessageContentPart>())

        val e = assertThrows<ClearStreetInvalidDataException> { messageContentPart.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
