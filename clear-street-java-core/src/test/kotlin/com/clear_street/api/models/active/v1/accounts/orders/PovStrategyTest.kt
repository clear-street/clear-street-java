// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PovStrategyTest {

    @Test
    fun create() {
        val povStrategy =
            PovStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .targetPercent("5.012")
                .build()

        assertThat(povStrategy.endAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(povStrategy.startAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(povStrategy.urgency()).contains(Urgency.SUPER_PASSIVE)
        assertThat(povStrategy.targetPercent()).isEqualTo("5.012")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val povStrategy =
            PovStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .targetPercent("5.012")
                .build()

        val roundtrippedPovStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(povStrategy),
                jacksonTypeRef<PovStrategy>(),
            )

        assertThat(roundtrippedPovStrategy).isEqualTo(povStrategy)
    }
}
