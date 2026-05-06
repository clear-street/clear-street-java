// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.accounts.orders.CancelOrderRequest
import com.clear_street.api.models.v1.accounts.orders.NewOrderRequest
import com.clear_street.api.models.v1.accounts.orders.PositionEffect
import com.clear_street.api.models.v1.accounts.orders.RequestOrderType
import com.clear_street.api.models.v1.accounts.orders.RequestTimeInForce
import com.clear_street.api.models.v1.accounts.orders.Side
import com.clear_street.api.models.v1.accounts.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PrefillOrderActionTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            PrefillOrderAction.UnionMember0.builder()
                .actionType(PrefillOrderAction.UnionMember0.ActionType.NEW)
                .addOrder(
                    NewOrderRequest.builder()
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("100")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .id("my-ref-id-20251001-002")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
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
                .build()

        val prefillOrderAction = PrefillOrderAction.ofUnionMember0(unionMember0)

        assertThat(prefillOrderAction.unionMember0()).contains(unionMember0)
        assertThat(prefillOrderAction.unionMember1()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.ofUnionMember0(
                PrefillOrderAction.UnionMember0.builder()
                    .actionType(PrefillOrderAction.UnionMember0.ActionType.NEW)
                    .addOrder(
                        NewOrderRequest.builder()
                            .instrumentType(SecurityType.COMMON_STOCK)
                            .orderType(RequestOrderType.LIMIT)
                            .quantity("100")
                            .side(Side.BUY)
                            .timeInForce(RequestTimeInForce.DAY)
                            .id("my-ref-id-20251001-002")
                            .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
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
    fun ofUnionMember1() {
        val unionMember1 =
            PrefillOrderAction.UnionMember1.builder()
                .actionType(PrefillOrderAction.UnionMember1.ActionType.CANCEL)
                .addOrder(
                    CancelOrderRequest.builder()
                        .accountId(100019L)
                        .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                        .build()
                )
                .build()

        val prefillOrderAction = PrefillOrderAction.ofUnionMember1(unionMember1)

        assertThat(prefillOrderAction.unionMember0()).isEmpty
        assertThat(prefillOrderAction.unionMember1()).contains(unionMember1)
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.ofUnionMember1(
                PrefillOrderAction.UnionMember1.builder()
                    .actionType(PrefillOrderAction.UnionMember1.ActionType.CANCEL)
                    .addOrder(
                        CancelOrderRequest.builder()
                            .accountId(100019L)
                            .orderId("019dfd73-8b49-7d21-8d62-a736fc4199d2")
                            .build()
                    )
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
