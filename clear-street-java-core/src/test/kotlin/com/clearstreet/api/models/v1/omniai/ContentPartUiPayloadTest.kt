// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartUiPayloadTest {

    @Test
    fun create() {
        val contentPartUiPayload =
            ContentPartUiPayload.builder()
                .payload(
                    UiPayload.builder()
                        .root(
                            UiNode.builder()
                                .type("Row")
                                .addChild(
                                    JsonValue.from(
                                        mapOf(
                                            "props" to
                                                mapOf("label" to "Day P&L", "value" to "+\$1,240"),
                                            "type" to "MetricCard",
                                        )
                                    )
                                )
                                .props(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .uiId("ui_day_pnl")
                        .build()
                )
                .build()

        assertThat(contentPartUiPayload.payload())
            .isEqualTo(
                UiPayload.builder()
                    .root(
                        UiNode.builder()
                            .type("Row")
                            .addChild(
                                JsonValue.from(
                                    mapOf(
                                        "props" to
                                            mapOf("label" to "Day P&L", "value" to "+\$1,240"),
                                        "type" to "MetricCard",
                                    )
                                )
                            )
                            .props(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .uiId("ui_day_pnl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartUiPayload =
            ContentPartUiPayload.builder()
                .payload(
                    UiPayload.builder()
                        .root(
                            UiNode.builder()
                                .type("Row")
                                .addChild(
                                    JsonValue.from(
                                        mapOf(
                                            "props" to
                                                mapOf("label" to "Day P&L", "value" to "+\$1,240"),
                                            "type" to "MetricCard",
                                        )
                                    )
                                )
                                .props(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .uiId("ui_day_pnl")
                        .build()
                )
                .build()

        val roundtrippedContentPartUiPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartUiPayload),
                jacksonTypeRef<ContentPartUiPayload>(),
            )

        assertThat(roundtrippedContentPartUiPayload).isEqualTo(contentPartUiPayload)
    }
}
