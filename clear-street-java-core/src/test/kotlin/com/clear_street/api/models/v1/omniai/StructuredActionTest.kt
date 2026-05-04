// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.accounts.orders.OrderType
import com.clear_street.api.models.v1.accounts.orders.Side
import com.clear_street.api.models.v1.accounts.orders.TimeInForce
import com.clear_street.api.models.v1.screener.ScreenerFilter
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
                .prefillOrder(
                    PrefillOrderAction.builder()
                        .actionType(PrefillOrderActionType.NEW)
                        .addOrder(
                            OrderPayload.builder()
                                .instrumentType(SecurityType.COMMON_STOCK)
                                .orderType(OrderType.LIMIT)
                                .quantity("100")
                                .side(Side.BUY)
                                .symbol("AAPL")
                                .timeInForce(TimeInForce.DAY)
                                .limitPrice("150.00")
                                .orderId("order_id")
                                .stopPrice("148.00")
                                .strategy(OrderStrategyType.SOR)
                                .build()
                        )
                        .build()
                )
                .build()

        val structuredAction = StructuredAction.ofPrefillOrder(prefillOrder)

        assertThat(structuredAction.prefillOrder()).contains(prefillOrder)
        assertThat(structuredAction.openChart()).isEmpty
        assertThat(structuredAction.openScreener()).isEmpty
        assertThat(structuredAction.openEntitlementConsent()).isEmpty
    }

    @Test
    fun ofPrefillOrderRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofPrefillOrder(
                StructuredAction.PrefillOrder.builder()
                    .prefillOrder(
                        PrefillOrderAction.builder()
                            .actionType(PrefillOrderActionType.NEW)
                            .addOrder(
                                OrderPayload.builder()
                                    .instrumentType(SecurityType.COMMON_STOCK)
                                    .orderType(OrderType.LIMIT)
                                    .quantity("100")
                                    .side(Side.BUY)
                                    .symbol("AAPL")
                                    .timeInForce(TimeInForce.DAY)
                                    .limitPrice("150.00")
                                    .orderId("order_id")
                                    .stopPrice("148.00")
                                    .strategy(OrderStrategyType.SOR)
                                    .build()
                            )
                            .build()
                    )
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
                .openChart(
                    OpenChartAction.builder()
                        .symbol("AAPL")
                        .extras(JsonValue.from(mapOf<String, Any>()))
                        .timeframe("1M")
                        .build()
                )
                .build()

        val structuredAction = StructuredAction.ofOpenChart(openChart)

        assertThat(structuredAction.prefillOrder()).isEmpty
        assertThat(structuredAction.openChart()).contains(openChart)
        assertThat(structuredAction.openScreener()).isEmpty
        assertThat(structuredAction.openEntitlementConsent()).isEmpty
    }

    @Test
    fun ofOpenChartRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofOpenChart(
                StructuredAction.OpenChart.builder()
                    .openChart(
                        OpenChartAction.builder()
                            .symbol("AAPL")
                            .extras(JsonValue.from(mapOf<String, Any>()))
                            .timeframe("1M")
                            .build()
                    )
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
                .openScreener(
                    OpenScreenerAction.builder()
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
                        .build()
                )
                .build()

        val structuredAction = StructuredAction.ofOpenScreener(openScreener)

        assertThat(structuredAction.prefillOrder()).isEmpty
        assertThat(structuredAction.openChart()).isEmpty
        assertThat(structuredAction.openScreener()).contains(openScreener)
        assertThat(structuredAction.openEntitlementConsent()).isEmpty
    }

    @Test
    fun ofOpenScreenerRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofOpenScreener(
                StructuredAction.OpenScreener.builder()
                    .openScreener(
                        OpenScreenerAction.builder()
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
                            .build()
                    )
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
    fun ofOpenEntitlementConsent() {
        val openEntitlementConsent =
            StructuredAction.OpenEntitlementConsent.builder()
                .openEntitlementConsent(
                    OpenEntitlementConsentAction.builder()
                        .agreementKey("omni_account_data_access")
                        .reason("Portfolio analysis requires Omni consent to access account data.")
                        .addRequestedEntitlementCode("omni.account_data")
                        .addTradingAccountId(100019L)
                        .build()
                )
                .build()

        val structuredAction = StructuredAction.ofOpenEntitlementConsent(openEntitlementConsent)

        assertThat(structuredAction.prefillOrder()).isEmpty
        assertThat(structuredAction.openChart()).isEmpty
        assertThat(structuredAction.openScreener()).isEmpty
        assertThat(structuredAction.openEntitlementConsent()).contains(openEntitlementConsent)
    }

    @Test
    fun ofOpenEntitlementConsentRoundtrip() {
        val jsonMapper = jsonMapper()
        val structuredAction =
            StructuredAction.ofOpenEntitlementConsent(
                StructuredAction.OpenEntitlementConsent.builder()
                    .openEntitlementConsent(
                        OpenEntitlementConsentAction.builder()
                            .agreementKey("omni_account_data_access")
                            .reason(
                                "Portfolio analysis requires Omni consent to access account data."
                            )
                            .addRequestedEntitlementCode("omni.account_data")
                            .addTradingAccountId(100019L)
                            .build()
                    )
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
