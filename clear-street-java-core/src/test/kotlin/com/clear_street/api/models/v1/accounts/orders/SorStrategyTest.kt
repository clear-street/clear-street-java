// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SorStrategyTest {

    @Test
    fun create() {
        val sorStrategy =
            SorStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .build()

        assertThat(sorStrategy.endAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sorStrategy.startAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sorStrategy.urgency()).contains(Urgency.SUPER_PASSIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sorStrategy =
            SorStrategy.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .build()

        val roundtrippedSorStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sorStrategy),
                jacksonTypeRef<SorStrategy>(),
            )

        assertThat(roundtrippedSorStrategy).isEqualTo(sorStrategy)
    }
}
