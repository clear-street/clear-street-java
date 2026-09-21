// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.threads

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TurnContextTest {

    @Test
    fun create() {
        val turnContext =
            TurnContext.builder()
                .addItem(
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
                )
                .build()

        assertThat(turnContext.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val turnContext =
            TurnContext.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedTurnContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnContext),
                jacksonTypeRef<TurnContext>(),
            )

        assertThat(roundtrippedTurnContext).isEqualTo(turnContext)
    }
}
