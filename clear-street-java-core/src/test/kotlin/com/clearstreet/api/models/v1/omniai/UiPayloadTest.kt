// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UiPayloadTest {

    @Test
    fun create() {
        val uiPayload =
            UiPayload.builder()
                .root(
                    UiNode.builder()
                        .type("Row")
                        .addChild(
                            JsonValue.from(
                                mapOf(
                                    "props" to mapOf("label" to "Day P&L", "value" to "+\$1,240"),
                                    "type" to "MetricCard",
                                )
                            )
                        )
                        .props(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .uiId("ui_day_pnl")
                .build()

        assertThat(uiPayload.root())
            .isEqualTo(
                UiNode.builder()
                    .type("Row")
                    .addChild(
                        JsonValue.from(
                            mapOf(
                                "props" to mapOf("label" to "Day P&L", "value" to "+\$1,240"),
                                "type" to "MetricCard",
                            )
                        )
                    )
                    .props(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(uiPayload.uiId()).isEqualTo("ui_day_pnl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uiPayload =
            UiPayload.builder()
                .root(
                    UiNode.builder()
                        .type("Row")
                        .addChild(
                            JsonValue.from(
                                mapOf(
                                    "props" to mapOf("label" to "Day P&L", "value" to "+\$1,240"),
                                    "type" to "MetricCard",
                                )
                            )
                        )
                        .props(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .uiId("ui_day_pnl")
                .build()

        val roundtrippedUiPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uiPayload),
                jacksonTypeRef<UiPayload>(),
            )

        assertThat(roundtrippedUiPayload).isEqualTo(uiPayload)
    }
}
