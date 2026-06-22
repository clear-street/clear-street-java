// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.responses

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

internal class ResponseContentPartTest {

    @Test
    fun ofContentPartText() {
        val contentPartText =
            ResponseContentPart.ContentPartText.builder()
                .text("text")
                .type(ResponseContentPart.ContentPartText.Type.TEXT)
                .build()

        val responseContentPart = ResponseContentPart.ofContentPartText(contentPartText)

        assertThat(responseContentPart.contentPartText()).contains(contentPartText)
        assertThat(responseContentPart.contentPartThinking()).isEmpty
        assertThat(responseContentPart.contentPartStructuredAction()).isEmpty
        assertThat(responseContentPart.contentPartChart()).isEmpty
        assertThat(responseContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(responseContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartTextRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofContentPartText(
                ResponseContentPart.ContentPartText.builder()
                    .text("text")
                    .type(ResponseContentPart.ContentPartText.Type.TEXT)
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
    fun ofContentPartThinking() {
        val contentPartThinking =
            ResponseContentPart.ContentPartThinking.builder()
                .addThought("string")
                .type(ResponseContentPart.ContentPartThinking.Type.THINKING)
                .build()

        val responseContentPart = ResponseContentPart.ofContentPartThinking(contentPartThinking)

        assertThat(responseContentPart.contentPartText()).isEmpty
        assertThat(responseContentPart.contentPartThinking()).contains(contentPartThinking)
        assertThat(responseContentPart.contentPartStructuredAction()).isEmpty
        assertThat(responseContentPart.contentPartChart()).isEmpty
        assertThat(responseContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(responseContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartThinkingRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofContentPartThinking(
                ResponseContentPart.ContentPartThinking.builder()
                    .addThought("string")
                    .type(ResponseContentPart.ContentPartThinking.Type.THINKING)
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
    fun ofContentPartStructuredAction() {
        val contentPartStructuredAction =
            ResponseContentPart.ContentPartStructuredAction.builder()
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
                                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .limitOffset("0.50")
                                        .limitPrice("150.00")
                                        .positionEffect(PositionEffect.OPEN)
                                        .stopPrice("52.00")
                                        .symbol("AAPL")
                                        .trailingOffset("2.00")
                                        .trailingOffsetType(TrailingOffsetType.PRICE)
                                        .build()
                                )
                                .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
                                .build()
                        )
                        .build()
                )
                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ResponseContentPart.ContentPartStructuredAction.Type.STRUCTURED_ACTION)
                .build()

        val responseContentPart =
            ResponseContentPart.ofContentPartStructuredAction(contentPartStructuredAction)

        assertThat(responseContentPart.contentPartText()).isEmpty
        assertThat(responseContentPart.contentPartThinking()).isEmpty
        assertThat(responseContentPart.contentPartStructuredAction())
            .contains(contentPartStructuredAction)
        assertThat(responseContentPart.contentPartChart()).isEmpty
        assertThat(responseContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(responseContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartStructuredActionRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofContentPartStructuredAction(
                ResponseContentPart.ContentPartStructuredAction.builder()
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
                                            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .limitOffset("0.50")
                                            .limitPrice("150.00")
                                            .positionEffect(PositionEffect.OPEN)
                                            .stopPrice("52.00")
                                            .symbol("AAPL")
                                            .trailingOffset("2.00")
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
                    .type(ResponseContentPart.ContentPartStructuredAction.Type.STRUCTURED_ACTION)
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
    fun ofContentPartChart() {
        val contentPartChart =
            ResponseContentPart.ContentPartChart.builder()
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
                .type(ResponseContentPart.ContentPartChart.Type.CHART)
                .build()

        val responseContentPart = ResponseContentPart.ofContentPartChart(contentPartChart)

        assertThat(responseContentPart.contentPartText()).isEmpty
        assertThat(responseContentPart.contentPartThinking()).isEmpty
        assertThat(responseContentPart.contentPartStructuredAction()).isEmpty
        assertThat(responseContentPart.contentPartChart()).contains(contentPartChart)
        assertThat(responseContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(responseContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartChartRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofContentPartChart(
                ResponseContentPart.ContentPartChart.builder()
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
                    .type(ResponseContentPart.ContentPartChart.Type.CHART)
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
    fun ofContentPartSuggestedActions() {
        val contentPartSuggestedActions =
            ResponseContentPart.ContentPartSuggestedActions.builder()
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
                .type(ResponseContentPart.ContentPartSuggestedActions.Type.SUGGESTED_ACTIONS)
                .build()

        val responseContentPart =
            ResponseContentPart.ofContentPartSuggestedActions(contentPartSuggestedActions)

        assertThat(responseContentPart.contentPartText()).isEmpty
        assertThat(responseContentPart.contentPartThinking()).isEmpty
        assertThat(responseContentPart.contentPartStructuredAction()).isEmpty
        assertThat(responseContentPart.contentPartChart()).isEmpty
        assertThat(responseContentPart.contentPartSuggestedActions())
            .contains(contentPartSuggestedActions)
        assertThat(responseContentPart.contentPartCustom()).isEmpty
    }

    @Test
    fun ofContentPartSuggestedActionsRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofContentPartSuggestedActions(
                ResponseContentPart.ContentPartSuggestedActions.builder()
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
                    .type(ResponseContentPart.ContentPartSuggestedActions.Type.SUGGESTED_ACTIONS)
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
    fun ofContentPartCustom() {
        val contentPartCustom =
            ResponseContentPart.ContentPartCustom.builder()
                .payload(JsonValue.from(mapOf<String, Any>()))
                .type(ResponseContentPart.ContentPartCustom.Type.CUSTOM)
                .build()

        val responseContentPart = ResponseContentPart.ofContentPartCustom(contentPartCustom)

        assertThat(responseContentPart.contentPartText()).isEmpty
        assertThat(responseContentPart.contentPartThinking()).isEmpty
        assertThat(responseContentPart.contentPartStructuredAction()).isEmpty
        assertThat(responseContentPart.contentPartChart()).isEmpty
        assertThat(responseContentPart.contentPartSuggestedActions()).isEmpty
        assertThat(responseContentPart.contentPartCustom()).contains(contentPartCustom)
    }

    @Test
    fun ofContentPartCustomRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPart =
            ResponseContentPart.ofContentPartCustom(
                ResponseContentPart.ContentPartCustom.builder()
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .type(ResponseContentPart.ContentPartCustom.Type.CUSTOM)
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
