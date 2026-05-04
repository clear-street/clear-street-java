// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VwapStrategyTest {

    @Test
    fun create() {
        val vwapStrategy =
            VwapStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .maxPercent("5.012")
                .minPercent("5.012")
                .build()

        assertThat(vwapStrategy.endAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vwapStrategy.startAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vwapStrategy.urgency()).contains(Urgency.SUPER_PASSIVE)
        assertThat(vwapStrategy.maxPercent()).contains("5.012")
        assertThat(vwapStrategy.minPercent()).contains("5.012")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vwapStrategy =
            VwapStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .maxPercent("5.012")
                .minPercent("5.012")
                .build()

        val roundtrippedVwapStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vwapStrategy),
                jacksonTypeRef<VwapStrategy>(),
            )

        assertThat(roundtrippedVwapStrategy).isEqualTo(vwapStrategy)
    }
}
