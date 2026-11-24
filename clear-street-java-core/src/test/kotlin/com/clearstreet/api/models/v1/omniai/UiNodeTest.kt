// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UiNodeTest {

    @Test
    fun create() {
        val uiNode =
            UiNode.builder()
                .type("MetricCard")
                .addChild(JsonValue.from(mapOf<String, Any>()))
                .props(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(uiNode.type()).isEqualTo("MetricCard")
        assertThat(uiNode.children().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(uiNode._props()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uiNode =
            UiNode.builder()
                .type("MetricCard")
                .addChild(JsonValue.from(mapOf<String, Any>()))
                .props(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedUiNode =
            jsonMapper.readValue(jsonMapper.writeValueAsString(uiNode), jacksonTypeRef<UiNode>())

        assertThat(roundtrippedUiNode).isEqualTo(uiNode)
    }
}
