// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartPayloadTest {

    @Test
    fun create() {
        val chartPayload =
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

        assertThat(chartPayload.chartId()).isEqualTo("chart_revenue_growth")
        assertThat(chartPayload.actionButtons().getOrNull())
            .containsExactly(
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
        assertThat(chartPayload.dataChart())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chartPayload =
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

        val roundtrippedChartPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartPayload),
                jacksonTypeRef<ChartPayload>(),
            )

        assertThat(roundtrippedChartPayload).isEqualTo(chartPayload)
    }
}
