// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseStrategyParamsTest {

    @Test
    fun create() {
        val baseStrategyParams =
            BaseStrategyParams.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .build()

        assertThat(baseStrategyParams.endAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(baseStrategyParams.startAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(baseStrategyParams.urgency()).contains(Urgency.SUPER_PASSIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseStrategyParams =
            BaseStrategyParams.builder()
                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .urgency(Urgency.SUPER_PASSIVE)
                .build()

        val roundtrippedBaseStrategyParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseStrategyParams),
                jacksonTypeRef<BaseStrategyParams>(),
            )

        assertThat(roundtrippedBaseStrategyParams).isEqualTo(baseStrategyParams)
    }
}
