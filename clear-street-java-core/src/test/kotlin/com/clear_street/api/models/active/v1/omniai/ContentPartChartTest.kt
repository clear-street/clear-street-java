// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartChartTest {

    @Test
    fun create() {
        val contentPartChart =
            ContentPartChart.builder()
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
                .build()

        assertThat(contentPartChart.chartId()).isEqualTo("chart_id")
        assertThat(contentPartChart.actionButtons().getOrNull())
            .containsExactly(
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
        assertThat(contentPartChart.chartKind())
            .contains(
                ChartKind.ofSymbolChart(
                    ChartKind.SymbolChart.builder()
                        .symbol("symbol")
                        .timeframe("timeframe")
                        .chartType(ChartKind.SymbolChart.ChartType.SYMBOL_CHART)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartChart =
            ContentPartChart.builder()
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
                .build()

        val roundtrippedContentPartChart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartChart),
                jacksonTypeRef<ContentPartChart>(),
            )

        assertThat(roundtrippedContentPartChart).isEqualTo(contentPartChart)
    }
}
