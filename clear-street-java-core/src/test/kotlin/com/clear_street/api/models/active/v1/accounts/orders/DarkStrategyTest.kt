// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DarkStrategyTest {

    @Test
    fun create() {
        val darkStrategy =
            DarkStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .maxPercent("5.012")
                .build()

        assertThat(darkStrategy.endAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(darkStrategy.startAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(darkStrategy.urgency()).contains(Urgency.SUPER_PASSIVE)
        assertThat(darkStrategy.maxPercent()).contains("5.012")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val darkStrategy =
            DarkStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .maxPercent("5.012")
                .build()

        val roundtrippedDarkStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(darkStrategy),
                jacksonTypeRef<DarkStrategy>(),
            )

        assertThat(roundtrippedDarkStrategy).isEqualTo(darkStrategy)
    }
}
