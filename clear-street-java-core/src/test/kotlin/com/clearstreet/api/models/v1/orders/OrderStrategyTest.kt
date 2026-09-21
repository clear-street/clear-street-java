// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class OrderStrategyTest {

    @Test
    fun ofType() {
        val type = OrderStrategy.Type.builder().type(OrderStrategy.Type.InnerType.SOR).build()

        val orderStrategy = OrderStrategy.ofType(type)

        assertThat(orderStrategy.type()).contains(type)
        assertThat(orderStrategy.unionMember1()).isEmpty
        assertThat(orderStrategy.unionMember2()).isEmpty
    }

    @Test
    fun ofTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofType(
                OrderStrategy.Type.builder().type(OrderStrategy.Type.InnerType.SOR).build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            OrderStrategy.UnionMember1.builder()
                .type(OrderStrategy.UnionMember1.Type.VWAP)
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val orderStrategy = OrderStrategy.ofUnionMember1(unionMember1)

        assertThat(orderStrategy.type()).isEmpty
        assertThat(orderStrategy.unionMember1()).contains(unionMember1)
        assertThat(orderStrategy.unionMember2()).isEmpty
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofUnionMember1(
                OrderStrategy.UnionMember1.builder()
                    .type(OrderStrategy.UnionMember1.Type.VWAP)
                    .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            OrderStrategy.UnionMember2.builder()
                .type(OrderStrategy.UnionMember2.Type.TWAP)
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val orderStrategy = OrderStrategy.ofUnionMember2(unionMember2)

        assertThat(orderStrategy.type()).isEmpty
        assertThat(orderStrategy.unionMember1()).isEmpty
        assertThat(orderStrategy.unionMember2()).contains(unionMember2)
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofUnionMember2(
                OrderStrategy.UnionMember2.builder()
                    .type(OrderStrategy.UnionMember2.Type.TWAP)
                    .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
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
        val orderStrategy =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<OrderStrategy>())

        val e = assertThrows<ClearStreetInvalidDataException> { orderStrategy.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
