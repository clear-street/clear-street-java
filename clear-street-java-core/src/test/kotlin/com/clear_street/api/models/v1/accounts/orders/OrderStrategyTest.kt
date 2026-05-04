// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class OrderStrategyTest {

    @Test
    fun ofSor() {
        val sor =
            OrderStrategy.Sor.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .type(OrderStrategy.Sor.Type.SOR)
                .build()

        val orderStrategy = OrderStrategy.ofSor(sor)

        assertThat(orderStrategy.sor()).contains(sor)
        assertThat(orderStrategy.vwap()).isEmpty
        assertThat(orderStrategy.twap()).isEmpty
        assertThat(orderStrategy.ap()).isEmpty
        assertThat(orderStrategy.pov()).isEmpty
        assertThat(orderStrategy.dark()).isEmpty
        assertThat(orderStrategy.dma()).isEmpty
    }

    @Test
    fun ofSorRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofSor(
                OrderStrategy.Sor.builder()
                    .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .urgency(Urgency.SUPER_PASSIVE)
                    .type(OrderStrategy.Sor.Type.SOR)
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
    fun ofVwap() {
        val vwap = OrderStrategy.Vwap.builder().type(OrderStrategy.Vwap.Type.VWAP).build()

        val orderStrategy = OrderStrategy.ofVwap(vwap)

        assertThat(orderStrategy.sor()).isEmpty
        assertThat(orderStrategy.vwap()).contains(vwap)
        assertThat(orderStrategy.twap()).isEmpty
        assertThat(orderStrategy.ap()).isEmpty
        assertThat(orderStrategy.pov()).isEmpty
        assertThat(orderStrategy.dark()).isEmpty
        assertThat(orderStrategy.dma()).isEmpty
    }

    @Test
    fun ofVwapRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofVwap(
                OrderStrategy.Vwap.builder().type(OrderStrategy.Vwap.Type.VWAP).build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun ofTwap() {
        val twap = OrderStrategy.Twap.builder().type(OrderStrategy.Twap.Type.TWAP).build()

        val orderStrategy = OrderStrategy.ofTwap(twap)

        assertThat(orderStrategy.sor()).isEmpty
        assertThat(orderStrategy.vwap()).isEmpty
        assertThat(orderStrategy.twap()).contains(twap)
        assertThat(orderStrategy.ap()).isEmpty
        assertThat(orderStrategy.pov()).isEmpty
        assertThat(orderStrategy.dark()).isEmpty
        assertThat(orderStrategy.dma()).isEmpty
    }

    @Test
    fun ofTwapRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofTwap(
                OrderStrategy.Twap.builder().type(OrderStrategy.Twap.Type.TWAP).build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun ofAp() {
        val ap = OrderStrategy.Ap.builder().type(OrderStrategy.Ap.Type.AP).build()

        val orderStrategy = OrderStrategy.ofAp(ap)

        assertThat(orderStrategy.sor()).isEmpty
        assertThat(orderStrategy.vwap()).isEmpty
        assertThat(orderStrategy.twap()).isEmpty
        assertThat(orderStrategy.ap()).contains(ap)
        assertThat(orderStrategy.pov()).isEmpty
        assertThat(orderStrategy.dark()).isEmpty
        assertThat(orderStrategy.dma()).isEmpty
    }

    @Test
    fun ofApRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofAp(OrderStrategy.Ap.builder().type(OrderStrategy.Ap.Type.AP).build())

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun ofPov() {
        val pov = OrderStrategy.Pov.builder().type(OrderStrategy.Pov.Type.POV).build()

        val orderStrategy = OrderStrategy.ofPov(pov)

        assertThat(orderStrategy.sor()).isEmpty
        assertThat(orderStrategy.vwap()).isEmpty
        assertThat(orderStrategy.twap()).isEmpty
        assertThat(orderStrategy.ap()).isEmpty
        assertThat(orderStrategy.pov()).contains(pov)
        assertThat(orderStrategy.dark()).isEmpty
        assertThat(orderStrategy.dma()).isEmpty
    }

    @Test
    fun ofPovRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofPov(
                OrderStrategy.Pov.builder().type(OrderStrategy.Pov.Type.POV).build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun ofDark() {
        val dark = OrderStrategy.Dark.builder().type(OrderStrategy.Dark.Type.DARK).build()

        val orderStrategy = OrderStrategy.ofDark(dark)

        assertThat(orderStrategy.sor()).isEmpty
        assertThat(orderStrategy.vwap()).isEmpty
        assertThat(orderStrategy.twap()).isEmpty
        assertThat(orderStrategy.ap()).isEmpty
        assertThat(orderStrategy.pov()).isEmpty
        assertThat(orderStrategy.dark()).contains(dark)
        assertThat(orderStrategy.dma()).isEmpty
    }

    @Test
    fun ofDarkRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofDark(
                OrderStrategy.Dark.builder().type(OrderStrategy.Dark.Type.DARK).build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun ofDma() {
        val dma =
            OrderStrategy.Dma.builder()
                .destination("destination")
                .type(OrderStrategy.Dma.Type.DMA)
                .build()

        val orderStrategy = OrderStrategy.ofDma(dma)

        assertThat(orderStrategy.sor()).isEmpty
        assertThat(orderStrategy.vwap()).isEmpty
        assertThat(orderStrategy.twap()).isEmpty
        assertThat(orderStrategy.ap()).isEmpty
        assertThat(orderStrategy.pov()).isEmpty
        assertThat(orderStrategy.dark()).isEmpty
        assertThat(orderStrategy.dma()).contains(dma)
    }

    @Test
    fun ofDmaRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofDma(
                OrderStrategy.Dma.builder()
                    .destination("destination")
                    .type(OrderStrategy.Dma.Type.DMA)
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
