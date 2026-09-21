// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.threads

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContextItemTest {

    @Test
    fun create() {
        val contextItem =
            ContextItem.builder()
                .data(
                    ContextItem.Data.builder()
                        .putAdditionalProperty("change_pct", JsonValue.from("bar"))
                        .putAdditionalProperty("range", JsonValue.from("bar"))
                        .putAdditionalProperty("ticker", JsonValue.from("bar"))
                        .build()
                )
                .kind("chart")
                .label("NVDA intraday performance")
                .capturedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(contextItem.data())
            .isEqualTo(
                ContextItem.Data.builder()
                    .putAdditionalProperty("change_pct", JsonValue.from("bar"))
                    .putAdditionalProperty("range", JsonValue.from("bar"))
                    .putAdditionalProperty("ticker", JsonValue.from("bar"))
                    .build()
            )
        assertThat(contextItem.kind()).isEqualTo("chart")
        assertThat(contextItem.label()).isEqualTo("NVDA intraday performance")
        assertThat(contextItem.capturedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contextItem =
            ContextItem.builder()
                .data(
                    ContextItem.Data.builder()
                        .putAdditionalProperty("change_pct", JsonValue.from("bar"))
                        .putAdditionalProperty("range", JsonValue.from("bar"))
                        .putAdditionalProperty("ticker", JsonValue.from("bar"))
                        .build()
                )
                .kind("chart")
                .label("NVDA intraday performance")
                .capturedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedContextItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contextItem),
                jacksonTypeRef<ContextItem>(),
            )

        assertThat(roundtrippedContextItem).isEqualTo(contextItem)
    }
}
