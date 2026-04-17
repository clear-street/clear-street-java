// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigateActionTest {

    @Test
    fun create() {
        val navigateAction =
            NavigateAction.builder()
                .route("/portfolio")
                .params(JsonValue.from(mapOf("tab" to "positions")))
                .build()

        assertThat(navigateAction.route()).isEqualTo("/portfolio")
        assertThat(navigateAction._params()).isEqualTo(JsonValue.from(mapOf("tab" to "positions")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val navigateAction =
            NavigateAction.builder()
                .route("/portfolio")
                .params(JsonValue.from(mapOf("tab" to "positions")))
                .build()

        val roundtrippedNavigateAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(navigateAction),
                jacksonTypeRef<NavigateAction>(),
            )

        assertThat(roundtrippedNavigateAction).isEqualTo(navigateAction)
    }
}
