// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.threads

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.omniai.ActionButton
import com.clearstreet.api.models.v1.omniai.ChartPayload
import com.clearstreet.api.models.v1.omniai.ChartPoint
import com.clearstreet.api.models.v1.omniai.ChartSeries
import com.clearstreet.api.models.v1.omniai.DataChart
import com.clearstreet.api.models.v1.omniai.PrefillOrderAction
import com.clearstreet.api.models.v1.omniai.PromptButtonAction
import com.clearstreet.api.models.v1.omniai.StructuredAction
import com.clearstreet.api.models.v1.omniai.StructuredActionButtonAction
import com.clearstreet.api.models.v1.omniai.SuggestedActionsPayload
import com.clearstreet.api.models.v1.orders.NewOrderRequest
import com.clearstreet.api.models.v1.orders.PositionEffect
import com.clearstreet.api.models.v1.orders.RequestOrderType
import com.clearstreet.api.models.v1.orders.RequestTimeInForce
import com.clearstreet.api.models.v1.orders.Side
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class MessageContentPartTest {

    @Test
    fun ofContentPartText() {
        val contentPartText =
            MessageContentPart.ContentPartText.builder()
                .text("text")
                .type(MessageContentPart.ContentPartText.Type.TEXT)
                .build()

        val messageContentPart = MessageContentPart.ofContentPartText(contentPartText)

        assertThat(messageContentPart.contentPartText()).contains(contentPartText)
        assertThat(messageContentPart.contentPartStructuredAction()).isEmpty
        assertThat(messageContentPart.contentPartChart()).isEmpty
        assertThat(messageContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(messageContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartTextRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofContentPartText(
                MessageContentPart.ContentPartText.builder()
                    .text("text")
                    .type(MessageContentPart.ContentPartText.Type.TEXT)
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
    fun ofContentPartStructuredAction() {
        val contentPartStructuredAction =
            MessageContentPart.ContentPartStructuredAction.builder()
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
                .type(MessageContentPart.ContentPartStructuredAction.Type.STRUCTURED_ACTION)
                .build()

        val messageContentPart =
            MessageContentPart.ofContentPartStructuredAction(contentPartStructuredAction)

        assertThat(messageContentPart.contentPartText()).isEmpty
        assertThat(messageContentPart.contentPartStructuredAction())
            .contains(contentPartStructuredAction)
        assertThat(messageContentPart.contentPartChart()).isEmpty
        assertThat(messageContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(messageContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartStructuredActionRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofContentPartStructuredAction(
                MessageContentPart.ContentPartStructuredAction.builder()
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
                    .type(MessageContentPart.ContentPartStructuredAction.Type.STRUCTURED_ACTION)
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
    fun ofContentPartChart() {
        val contentPartChart =
            MessageContentPart.ContentPartChart.builder()
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
                .type(MessageContentPart.ContentPartChart.Type.CHART)
                .build()

        val messageContentPart = MessageContentPart.ofContentPartChart(contentPartChart)

        assertThat(messageContentPart.contentPartText()).isEmpty
        assertThat(messageContentPart.contentPartStructuredAction()).isEmpty
        assertThat(messageContentPart.contentPartChart()).contains(contentPartChart)
        assertThat(messageContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(messageContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartChartRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofContentPartChart(
                MessageContentPart.ContentPartChart.builder()
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
                    .type(MessageContentPart.ContentPartChart.Type.CHART)
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
    fun ofContentPartSuggestedActions() {
        val contentPartSuggestedActions =
            MessageContentPart.ContentPartSuggestedActions.builder()
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
                .type(MessageContentPart.ContentPartSuggestedActions.Type.SUGGESTED_ACTIONS)
                .build()

        val messageContentPart =
            MessageContentPart.ofContentPartSuggestedActions(contentPartSuggestedActions)

        assertThat(messageContentPart.contentPartText()).isEmpty
        assertThat(messageContentPart.contentPartStructuredAction()).isEmpty
        assertThat(messageContentPart.contentPartChart()).isEmpty
        assertThat(messageContentPart.contentPartSuggestedActions())
            .contains(contentPartSuggestedActions)
        assertThat(messageContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartSuggestedActionsRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofContentPartSuggestedActions(
                MessageContentPart.ContentPartSuggestedActions.builder()
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
                    .type(MessageContentPart.ContentPartSuggestedActions.Type.SUGGESTED_ACTIONS)
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
    fun ofContentPartCustom() {
        val contentPartCustom =
            MessageContentPart.ContentPartCustom.builder()
                .payload(JsonValue.from(mapOf<String, Any>()))
                .type(MessageContentPart.ContentPartCustom.Type.CUSTOM)
                .build()

        val messageContentPart = MessageContentPart.ofContentPartCustom(contentPartCustom)

        assertThat(messageContentPart.contentPartText()).isEmpty
        assertThat(messageContentPart.contentPartStructuredAction()).isEmpty
        assertThat(messageContentPart.contentPartChart()).isEmpty
        assertThat(messageContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(messageContentPart.contentPartCustom()).contains(contentPartCustom)
    }

    @Test
    fun ofContentPartCustomRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofContentPartCustom(
                MessageContentPart.ContentPartCustom.builder()
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .type(MessageContentPart.ContentPartCustom.Type.CUSTOM)
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
