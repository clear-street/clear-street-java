// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.orders.CancelOrderRequest
import com.clearstreet.api.models.v1.orders.NewOrderRequest
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

internal class PrefillOrderActionTest {

    @Test
    fun ofPrefillNewOrderAction() {
        val prefillNewOrderAction =
            PrefillOrderAction.PrefillNewOrderAction.builder()
                .addOrder(
                    NewOrderRequest.builder()
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("100")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .id("my-ref-id-20251001-002")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(true)
                        .instrumentId("x")
                        .limitOffset("0.50")
                        .limitPrice("150.00")
                        .stopPrice("52.00")
                        .symbol("AAPL")
                        .trailingOffset("2.00")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .build()
                )
                .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
                .build()

        val prefillOrderAction = PrefillOrderAction.ofPrefillNewOrderAction(prefillNewOrderAction)

        assertThat(prefillOrderAction.prefillNewOrderAction()).contains(prefillNewOrderAction)
        assertThat(prefillOrderAction.cancel()).isEmpty
        assertThat(prefillOrderAction.modify()).isEmpty
    }

    @Test
    fun ofPrefillNewOrderActionRoundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.ofPrefillNewOrderAction(
                PrefillOrderAction.PrefillNewOrderAction.builder()
                    .addOrder(
                        NewOrderRequest.builder()
                            .orderType(RequestOrderType.LIMIT)
                            .quantity("100")
                            .side(Side.BUY)
                            .timeInForce(RequestTimeInForce.DAY)
                            .id("my-ref-id-20251001-002")
                            .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                            .extendedHours(true)
                            .instrumentId("x")
                            .limitOffset("0.50")
                            .limitPrice("150.00")
                            .stopPrice("52.00")
                            .symbol("AAPL")
                            .trailingOffset("2.00")
                            .trailingOffsetType(TrailingOffsetType.PRICE)
                            .build()
                    )
                    .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
                    .build()
            )

        val roundtrippedPrefillOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillOrderAction),
                jacksonTypeRef<PrefillOrderAction>(),
            )

        assertThat(roundtrippedPrefillOrderAction).isEqualTo(prefillOrderAction)
    }

    @Test
    fun ofCancel() {
        val cancel =
            PrefillOrderAction.PrefillCancelOrderAction.builder()
                .addOrder(
                    CancelOrderRequest.builder()
                        .accountId(100019L)
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .build()
                )
                .actionType(PrefillOrderAction.PrefillCancelOrderAction.ActionType.CANCEL)
                .build()

        val prefillOrderAction = PrefillOrderAction.ofCancel(cancel)

        assertThat(prefillOrderAction.prefillNewOrderAction()).isEmpty
        assertThat(prefillOrderAction.cancel()).contains(cancel)
        assertThat(prefillOrderAction.modify()).isEmpty
    }

    @Test
    fun ofCancelRoundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.ofCancel(
                PrefillOrderAction.PrefillCancelOrderAction.builder()
                    .addOrder(
                        CancelOrderRequest.builder()
                            .accountId(100019L)
                            .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                            .build()
                    )
                    .actionType(PrefillOrderAction.PrefillCancelOrderAction.ActionType.CANCEL)
                    .build()
            )

        val roundtrippedPrefillOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillOrderAction),
                jacksonTypeRef<PrefillOrderAction>(),
            )

        assertThat(roundtrippedPrefillOrderAction).isEqualTo(prefillOrderAction)
    }

    @Test
    fun ofModify() {
        val modify =
            PrefillOrderAction.PrefillModifyOrderAction.builder()
                .addOrder(
                    PrefillModifyOrderRequest.builder()
                        .accountId(100019L)
                        .limitPrice("178.00")
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .quantity("1")
                        .stopPrice("52.00")
                        .build()
                )
                .actionType(PrefillOrderAction.PrefillModifyOrderAction.ActionType.MODIFY)
                .build()

        val prefillOrderAction = PrefillOrderAction.ofModify(modify)

        assertThat(prefillOrderAction.prefillNewOrderAction()).isEmpty
        assertThat(prefillOrderAction.cancel()).isEmpty
        assertThat(prefillOrderAction.modify()).contains(modify)
    }

    @Test
    fun ofModifyRoundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.ofModify(
                PrefillOrderAction.PrefillModifyOrderAction.builder()
                    .addOrder(
                        PrefillModifyOrderRequest.builder()
                            .accountId(100019L)
                            .limitPrice("178.00")
                            .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                            .quantity("1")
                            .stopPrice("52.00")
                            .build()
                    )
                    .actionType(PrefillOrderAction.PrefillModifyOrderAction.ActionType.MODIFY)
                    .build()
            )

        val roundtrippedPrefillOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillOrderAction),
                jacksonTypeRef<PrefillOrderAction>(),
            )

        assertThat(roundtrippedPrefillOrderAction).isEqualTo(prefillOrderAction)
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
        val prefillOrderAction =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PrefillOrderAction>())

        val e = assertThrows<ClearStreetInvalidDataException> { prefillOrderAction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
