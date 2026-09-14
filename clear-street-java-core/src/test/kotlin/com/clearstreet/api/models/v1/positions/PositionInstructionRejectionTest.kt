// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.positions

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionInstructionRejectionTest {

    @Test
    fun create() {
        val positionInstructionRejection =
            PositionInstructionRejection.builder()
                .domain("com.clearstreet.oems.exercise")
                .metadata(JsonValue.from(mapOf("available" to "3", "requested" to "5")))
                .reason("INSUFFICIENT_POSITION")
                .build()

        assertThat(positionInstructionRejection.domain()).isEqualTo("com.clearstreet.oems.exercise")
        assertThat(positionInstructionRejection._metadata())
            .isEqualTo(JsonValue.from(mapOf("available" to "3", "requested" to "5")))
        assertThat(positionInstructionRejection.reason()).isEqualTo("INSUFFICIENT_POSITION")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val positionInstructionRejection =
            PositionInstructionRejection.builder()
                .domain("com.clearstreet.oems.exercise")
                .metadata(JsonValue.from(mapOf("available" to "3", "requested" to "5")))
                .reason("INSUFFICIENT_POSITION")
                .build()

        val roundtrippedPositionInstructionRejection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(positionInstructionRejection),
                jacksonTypeRef<PositionInstructionRejection>(),
            )

        assertThat(roundtrippedPositionInstructionRejection).isEqualTo(positionInstructionRejection)
    }
}
