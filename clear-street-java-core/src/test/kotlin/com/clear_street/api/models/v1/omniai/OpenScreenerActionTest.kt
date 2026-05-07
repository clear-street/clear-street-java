// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenScreenerActionTest {

    @Test
    fun create() {
        val openScreenerAction =
            OpenScreenerAction.builder()
                .addFilter(
                    ScreenerFilter.builder()
                        .field("sector")
                        .operator("eq")
                        .value(JsonValue.from("Technology"))
                        .build()
                )
                .addFilter(
                    ScreenerFilter.builder()
                        .field("market_cap")
                        .operator("gte")
                        .value(JsonValue.from(10000000000))
                        .build()
                )
                .addFieldFilter("string")
                .pageSize(0)
                .sortBy("sort_by")
                .sortDirection("sort_direction")
                .build()

        assertThat(openScreenerAction.filters())
            .containsExactly(
                ScreenerFilter.builder()
                    .field("sector")
                    .operator("eq")
                    .value(JsonValue.from("Technology"))
                    .build(),
                ScreenerFilter.builder()
                    .field("market_cap")
                    .operator("gte")
                    .value(JsonValue.from(10000000000))
                    .build(),
            )
        assertThat(openScreenerAction.fieldFilter().getOrNull()).containsExactly("string")
        assertThat(openScreenerAction.pageSize()).contains(0)
        assertThat(openScreenerAction.sortBy()).contains("sort_by")
        assertThat(openScreenerAction.sortDirection()).contains("sort_direction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openScreenerAction =
            OpenScreenerAction.builder()
                .addFilter(
                    ScreenerFilter.builder()
                        .field("sector")
                        .operator("eq")
                        .value(JsonValue.from("Technology"))
                        .build()
                )
                .addFilter(
                    ScreenerFilter.builder()
                        .field("market_cap")
                        .operator("gte")
                        .value(JsonValue.from(10000000000))
                        .build()
                )
                .addFieldFilter("string")
                .pageSize(0)
                .sortBy("sort_by")
                .sortDirection("sort_direction")
                .build()

        val roundtrippedOpenScreenerAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openScreenerAction),
                jacksonTypeRef<OpenScreenerAction>(),
            )

        assertThat(roundtrippedOpenScreenerAction).isEqualTo(openScreenerAction)
    }
}
