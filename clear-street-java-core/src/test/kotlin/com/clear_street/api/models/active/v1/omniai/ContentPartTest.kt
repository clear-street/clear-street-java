// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityType
import com.clear_street.api.models.active.v1.accounts.orders.OrderType
import com.clear_street.api.models.active.v1.accounts.orders.Side
import com.clear_street.api.models.active.v1.accounts.orders.TimeInForce
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ContentPartTest {

    @Test
    fun ofText() {
        val text = ContentPart.Text.builder().text("text").type(ContentPart.Text.Type.TEXT).build()

        val contentPart = ContentPart.ofText(text)

        assertThat(contentPart.text()).contains(text)
        assertThat(contentPart.structuredAction()).isEmpty
        assertThat(contentPart.thinking()).isEmpty
        assertThat(contentPart.chart()).isEmpty
        assertThat(contentPart.suggestedActions()).isEmpty
        assertThat(contentPart.type()).isEmpty
    }

    @Test
    fun ofTextRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentPart =
            ContentPart.ofText(
                ContentPart.Text.builder().text("text").type(ContentPart.Text.Type.TEXT).build()
            )

        val roundtrippedContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPart),
                jacksonTypeRef<ContentPart>(),
            )

        assertThat(roundtrippedContentPart).isEqualTo(contentPart)
    }

    @Test
    fun ofStructuredAction() {
        val structuredAction =
            ContentPart.StructuredAction.ofPrefillOrder(
                ContentPart.StructuredAction.PrefillOrder.builder()
                    .addOrder(
                        OrderPayload.builder()
                            .orderType(OrderType.LIMIT)
                            .quantity("100")
                            .securityType(SecurityType.COMMON_STOCK)
                            .side(Side.BUY)
                            .symbol("AAPL")
                            .timeInForce(TimeInForce.DAY)
                            .limitPrice("150.00")
                            .stopPrice("148.00")
                            .strategy(OrderStrategyType.SOR)
                            .build()
                    )
                    .accountId(19816L)
                    .actionType(ContentPart.StructuredAction.PrefillOrder.ActionType.PREFILL_ORDER)
                    .type(ContentPart.StructuredAction.PrefillOrder.Type.STRUCTURED_ACTION)
                    .build()
            )

        val contentPart = ContentPart.ofStructuredAction(structuredAction)

        assertThat(contentPart.text()).isEmpty
        assertThat(contentPart.structuredAction()).contains(structuredAction)
        assertThat(contentPart.thinking()).isEmpty
        assertThat(contentPart.chart()).isEmpty
        assertThat(contentPart.suggestedActions()).isEmpty
        assertThat(contentPart.type()).isEmpty
    }

    @Test
    fun ofStructuredActionRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentPart =
            ContentPart.ofStructuredAction(
                ContentPart.StructuredAction.ofPrefillOrder(
                    ContentPart.StructuredAction.PrefillOrder.builder()
                        .addOrder(
                            OrderPayload.builder()
                                .orderType(OrderType.LIMIT)
                                .quantity("100")
                                .securityType(SecurityType.COMMON_STOCK)
                                .side(Side.BUY)
                                .symbol("AAPL")
                                .timeInForce(TimeInForce.DAY)
                                .limitPrice("150.00")
                                .stopPrice("148.00")
                                .strategy(OrderStrategyType.SOR)
                                .build()
                        )
                        .accountId(19816L)
                        .actionType(
                            ContentPart.StructuredAction.PrefillOrder.ActionType.PREFILL_ORDER
                        )
                        .type(ContentPart.StructuredAction.PrefillOrder.Type.STRUCTURED_ACTION)
                        .build()
                )
            )

        val roundtrippedContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPart),
                jacksonTypeRef<ContentPart>(),
            )

        assertThat(roundtrippedContentPart).isEqualTo(contentPart)
    }

    @Test
    fun ofThinking() {
        val thinking =
            ContentPart.Thinking.builder()
                .addThought("string")
                .type(ContentPart.Thinking.Type.THINKING)
                .build()

        val contentPart = ContentPart.ofThinking(thinking)

        assertThat(contentPart.text()).isEmpty
        assertThat(contentPart.structuredAction()).isEmpty
        assertThat(contentPart.thinking()).contains(thinking)
        assertThat(contentPart.chart()).isEmpty
        assertThat(contentPart.suggestedActions()).isEmpty
        assertThat(contentPart.type()).isEmpty
    }

    @Test
    fun ofThinkingRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentPart =
            ContentPart.ofThinking(
                ContentPart.Thinking.builder()
                    .addThought("string")
                    .type(ContentPart.Thinking.Type.THINKING)
                    .build()
            )

        val roundtrippedContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPart),
                jacksonTypeRef<ContentPart>(),
            )

        assertThat(roundtrippedContentPart).isEqualTo(contentPart)
    }

    @Test
    fun ofChart() {
        val chart =
            ContentPart.Chart.builder()
                .chartId("chart_id")
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("button_id")
                        .label("label")
                        .action(
                            ButtonAction.Prompt.builder()
                                .prompt("prompt")
                                .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                                .build()
                        )
                        .build()
                )
                .chartKind(
                    ChartKind.SymbolChart.builder()
                        .symbol("symbol")
                        .timeframe("timeframe")
                        .chartType(ChartKind.SymbolChart.ChartType.SYMBOL_CHART)
                        .build()
                )
                .type(ContentPart.Chart.Type.CHART)
                .build()

        val contentPart = ContentPart.ofChart(chart)

        assertThat(contentPart.text()).isEmpty
        assertThat(contentPart.structuredAction()).isEmpty
        assertThat(contentPart.thinking()).isEmpty
        assertThat(contentPart.chart()).contains(chart)
        assertThat(contentPart.suggestedActions()).isEmpty
        assertThat(contentPart.type()).isEmpty
    }

    @Test
    fun ofChartRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentPart =
            ContentPart.ofChart(
                ContentPart.Chart.builder()
                    .chartId("chart_id")
                    .addActionButton(
                        ActionButton.builder()
                            .buttonId("button_id")
                            .label("label")
                            .action(
                                ButtonAction.Prompt.builder()
                                    .prompt("prompt")
                                    .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                                    .build()
                            )
                            .build()
                    )
                    .chartKind(
                        ChartKind.SymbolChart.builder()
                            .symbol("symbol")
                            .timeframe("timeframe")
                            .chartType(ChartKind.SymbolChart.ChartType.SYMBOL_CHART)
                            .build()
                    )
                    .type(ContentPart.Chart.Type.CHART)
                    .build()
            )

        val roundtrippedContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPart),
                jacksonTypeRef<ContentPart>(),
            )

        assertThat(roundtrippedContentPart).isEqualTo(contentPart)
    }

    @Test
    fun ofSuggestedActions() {
        val suggestedActions =
            ContentPart.SuggestedActions.builder()
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("button_id")
                        .label("label")
                        .action(
                            ButtonAction.Prompt.builder()
                                .prompt("prompt")
                                .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                                .build()
                        )
                        .build()
                )
                .type(ContentPart.SuggestedActions.Type.SUGGESTED_ACTIONS)
                .build()

        val contentPart = ContentPart.ofSuggestedActions(suggestedActions)

        assertThat(contentPart.text()).isEmpty
        assertThat(contentPart.structuredAction()).isEmpty
        assertThat(contentPart.thinking()).isEmpty
        assertThat(contentPart.chart()).isEmpty
        assertThat(contentPart.suggestedActions()).contains(suggestedActions)
        assertThat(contentPart.type()).isEmpty
    }

    @Test
    fun ofSuggestedActionsRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentPart =
            ContentPart.ofSuggestedActions(
                ContentPart.SuggestedActions.builder()
                    .addActionButton(
                        ActionButton.builder()
                            .buttonId("button_id")
                            .label("label")
                            .action(
                                ButtonAction.Prompt.builder()
                                    .prompt("prompt")
                                    .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                                    .build()
                            )
                            .build()
                    )
                    .type(ContentPart.SuggestedActions.Type.SUGGESTED_ACTIONS)
                    .build()
            )

        val roundtrippedContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPart),
                jacksonTypeRef<ContentPart>(),
            )

        assertThat(roundtrippedContentPart).isEqualTo(contentPart)
    }

    @Test
    fun ofType() {
        val type = ContentPart.Type.builder().type(ContentPart.Type.InnerType.CUSTOM).build()

        val contentPart = ContentPart.ofType(type)

        assertThat(contentPart.text()).isEmpty
        assertThat(contentPart.structuredAction()).isEmpty
        assertThat(contentPart.thinking()).isEmpty
        assertThat(contentPart.chart()).isEmpty
        assertThat(contentPart.suggestedActions()).isEmpty
        assertThat(contentPart.type()).contains(type)
    }

    @Test
    fun ofTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentPart =
            ContentPart.ofType(
                ContentPart.Type.builder().type(ContentPart.Type.InnerType.CUSTOM).build()
            )

        val roundtrippedContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPart),
                jacksonTypeRef<ContentPart>(),
            )

        assertThat(roundtrippedContentPart).isEqualTo(contentPart)
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
        val contentPart = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ContentPart>())

        val e = assertThrows<ClearStreetInvalidDataException> { contentPart.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
