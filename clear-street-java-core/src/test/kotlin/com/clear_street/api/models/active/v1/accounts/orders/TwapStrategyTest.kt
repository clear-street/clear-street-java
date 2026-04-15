// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TwapStrategyTest {

    @Test
    fun create() {
        val twapStrategy =
            TwapStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .maxPercent("5.012")
                .minPercent("5.012")
                .build()

        assertThat(twapStrategy.endAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(twapStrategy.startAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(twapStrategy.urgency()).contains(Urgency.SUPER_PASSIVE)
        assertThat(twapStrategy.maxPercent()).contains("5.012")
        assertThat(twapStrategy.minPercent()).contains("5.012")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val twapStrategy =
            TwapStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .maxPercent("5.012")
                .minPercent("5.012")
                .build()

        val roundtrippedTwapStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(twapStrategy),
                jacksonTypeRef<TwapStrategy>(),
            )

        assertThat(roundtrippedTwapStrategy).isEqualTo(twapStrategy)
    }
}
