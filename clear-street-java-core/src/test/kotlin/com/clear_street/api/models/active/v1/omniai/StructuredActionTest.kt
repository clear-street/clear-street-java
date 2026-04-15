// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityType
import com.clear_street.api.models.active.v1.accounts.orders.OrderType
import com.clear_street.api.models.active.v1.accounts.orders.Side
import com.clear_street.api.models.active.v1.accounts.orders.TimeInForce
import com.clear_street.api.models.active.v1.screener.ScreenerFilter
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class StructuredActionTest {

    @Test
    fun ofPrefillOrder() {
        val prefillOrder =
            StructuredAction.PrefillOrder.builder()
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
                .actionType(StructuredAction.PrefillOrder.ActionType.PREFILL_ORDER)
                .build()

        val structuredAction = StructuredAction.ofPrefillOrder(prefillOrder)

        assertThat(structuredAction.prefillOrder()).contains(prefillOrder)
        assertThat(structuredAction.openChart()).isEmpty
        assertThat(structuredAction.openScreener()).isEmpty
        assertThat(structuredAction.openChatWindow()).isEmpty
        assertThat(structuredAction.navigate()).isEmpty
    }

    @Test
    fun ofPrefillOrderRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofPrefillOrder(
                StructuredAction.PrefillOrder.builder()
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
                    .actionType(StructuredAction.PrefillOrder.ActionType.PREFILL_ORDER)
                    .build()
            )

        val roundtrippedStructuredAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(structuredAction),
                jacksonTypeRef<StructuredAction>(),
            )

        assertThat(roundtrippedStructuredAction).isEqualTo(structuredAction)
    }

    @Test
    fun ofOpenChart() {
        val openChart =
            StructuredAction.OpenChart.builder()
                .symbol("AAPL")
                .extras(JsonValue.from(mapOf<String, Any>()))
                .timeframe("1M")
                .actionType(StructuredAction.OpenChart.ActionType.OPEN_CHART)
                .build()

        val structuredAction = StructuredAction.ofOpenChart(openChart)

        assertThat(structuredAction.prefillOrder()).isEmpty
        assertThat(structuredAction.openChart()).contains(openChart)
        assertThat(structuredAction.openScreener()).isEmpty
        assertThat(structuredAction.openChatWindow()).isEmpty
        assertThat(structuredAction.navigate()).isEmpty
    }

    @Test
    fun ofOpenChartRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofOpenChart(
                StructuredAction.OpenChart.builder()
                    .symbol("AAPL")
                    .extras(JsonValue.from(mapOf<String, Any>()))
                    .timeframe("1M")
                    .actionType(StructuredAction.OpenChart.ActionType.OPEN_CHART)
                    .build()
            )

        val roundtrippedStructuredAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(structuredAction),
                jacksonTypeRef<StructuredAction>(),
            )

        assertThat(roundtrippedStructuredAction).isEqualTo(structuredAction)
    }

    @Test
    fun ofOpenScreener() {
        val openScreener =
            StructuredAction.OpenScreener.builder()
                .addFilter(
                    ScreenerFilter.builder()
                        .field("sector")
                        .operator("eq")
                        .value(JsonValue.from("Technology"))
                        .build()
                )
                .addFilter(
                    ScreenerFilter.builder()
                        .field("market_cap")
                        .operator("gte")
                        .value(JsonValue.from(10000000000))
                        .build()
                )
                .addFieldFilter("string")
                .pageSize(0)
                .sortBy("sort_by")
                .sortDirection("sort_direction")
                .actionType(StructuredAction.OpenScreener.ActionType.OPEN_SCREENER)
                .build()

        val structuredAction = StructuredAction.ofOpenScreener(openScreener)

        assertThat(structuredAction.prefillOrder()).isEmpty
        assertThat(structuredAction.openChart()).isEmpty
        assertThat(structuredAction.openScreener()).contains(openScreener)
        assertThat(structuredAction.openChatWindow()).isEmpty
        assertThat(structuredAction.navigate()).isEmpty
    }

    @Test
    fun ofOpenScreenerRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofOpenScreener(
                StructuredAction.OpenScreener.builder()
                    .addFilter(
                        ScreenerFilter.builder()
                            .field("sector")
                            .operator("eq")
                            .value(JsonValue.from("Technology"))
                            .build()
                    )
                    .addFilter(
                        ScreenerFilter.builder()
                            .field("market_cap")
                            .operator("gte")
                            .value(JsonValue.from(10000000000))
                            .build()
                    )
                    .addFieldFilter("string")
                    .pageSize(0)
                    .sortBy("sort_by")
                    .sortDirection("sort_direction")
                    .actionType(StructuredAction.OpenScreener.ActionType.OPEN_SCREENER)
                    .build()
            )

        val roundtrippedStructuredAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(structuredAction),
                jacksonTypeRef<StructuredAction>(),
            )

        assertThat(roundtrippedStructuredAction).isEqualTo(structuredAction)
    }

    @Test
    fun ofOpenChatWindow() {
        val openChatWindow =
            StructuredAction.OpenChatWindow.builder()
                .extras(JsonValue.from(mapOf<String, Any>()))
                .threadId("550e8400-e29b-41d4-a716-446655440000")
                .title("Trading Assistant")
                .actionType(StructuredAction.OpenChatWindow.ActionType.OPEN_CHAT_WINDOW)
                .build()

        val structuredAction = StructuredAction.ofOpenChatWindow(openChatWindow)

        assertThat(structuredAction.prefillOrder()).isEmpty
        assertThat(structuredAction.openChart()).isEmpty
        assertThat(structuredAction.openScreener()).isEmpty
        assertThat(structuredAction.openChatWindow()).contains(openChatWindow)
        assertThat(structuredAction.navigate()).isEmpty
    }

    @Test
    fun ofOpenChatWindowRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofOpenChatWindow(
                StructuredAction.OpenChatWindow.builder()
                    .extras(JsonValue.from(mapOf<String, Any>()))
                    .threadId("550e8400-e29b-41d4-a716-446655440000")
                    .title("Trading Assistant")
                    .actionType(StructuredAction.OpenChatWindow.ActionType.OPEN_CHAT_WINDOW)
                    .build()
            )

        val roundtrippedStructuredAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(structuredAction),
                jacksonTypeRef<StructuredAction>(),
            )

        assertThat(roundtrippedStructuredAction).isEqualTo(structuredAction)
    }

    @Test
    fun ofNavigate() {
        val navigate =
            StructuredAction.Navigate.builder()
                .route("/portfolio")
                .params(JsonValue.from(mapOf("tab" to "positions")))
                .actionType(StructuredAction.Navigate.ActionType.NAVIGATE)
                .build()

        val structuredAction = StructuredAction.ofNavigate(navigate)

        assertThat(structuredAction.prefillOrder()).isEmpty
        assertThat(structuredAction.openChart()).isEmpty
        assertThat(structuredAction.openScreener()).isEmpty
        assertThat(structuredAction.openChatWindow()).isEmpty
        assertThat(structuredAction.navigate()).contains(navigate)
    }

    @Test
    fun ofNavigateRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofNavigate(
                StructuredAction.Navigate.builder()
                    .route("/portfolio")
                    .params(JsonValue.from(mapOf("tab" to "positions")))
                    .actionType(StructuredAction.Navigate.ActionType.NAVIGATE)
                    .build()
            )

        val roundtrippedStructuredAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(structuredAction),
                jacksonTypeRef<StructuredAction>(),
            )

        assertThat(roundtrippedStructuredAction).isEqualTo(structuredAction)
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
        val structuredAction =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<StructuredAction>())

        val e = assertThrows<ClearStreetInvalidDataException> { structuredAction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
