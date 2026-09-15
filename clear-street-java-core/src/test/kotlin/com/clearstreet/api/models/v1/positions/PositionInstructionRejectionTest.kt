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
                .metadata(
                    PositionInstructionRejection.Metadata.builder()
                        .putAdditionalProperty("available", JsonValue.from("3"))
                        .putAdditionalProperty("requested", JsonValue.from("5"))
                        .build()
                )
                .reason("INSUFFICIENT_POSITION")
                .build()

        assertThat(positionInstructionRejection.domain()).isEqualTo("com.clearstreet.oems.exercise")
        assertThat(positionInstructionRejection.metadata())
            .isEqualTo(
                PositionInstructionRejection.Metadata.builder()
                    .putAdditionalProperty("available", JsonValue.from("3"))
                    .putAdditionalProperty("requested", JsonValue.from("5"))
                    .build()
            )
        assertThat(positionInstructionRejection.reason()).isEqualTo("INSUFFICIENT_POSITION")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val positionInstructionRejection =
            PositionInstructionRejection.builder()
                .domain("com.clearstreet.oems.exercise")
                .metadata(
                    PositionInstructionRejection.Metadata.builder()
                        .putAdditionalProperty("available", JsonValue.from("3"))
                        .putAdditionalProperty("requested", JsonValue.from("5"))
                        .build()
                )
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
