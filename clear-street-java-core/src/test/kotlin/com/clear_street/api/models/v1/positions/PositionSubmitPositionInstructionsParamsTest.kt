// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.positions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionSubmitPositionInstructionsParamsTest {

    @Test
    fun create() {
        PositionSubmitPositionInstructionsParams.builder()
            .accountId(0L)
            .addInstruction(
                PositionSubmitPositionInstructionsParams.Instruction.builder()
                    .instructionType(PositionInstructionType.EXERCISE)
                    .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                    .quantity("1")
                    .instructionId("ui-20260424-001")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PositionSubmitPositionInstructionsParams.builder()
                .accountId(0L)
                .addInstruction(
                    PositionSubmitPositionInstructionsParams.Instruction.builder()
                        .instructionType(PositionInstructionType.EXERCISE)
                        .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .quantity("1")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PositionSubmitPositionInstructionsParams.builder()
                .accountId(0L)
                .addInstruction(
                    PositionSubmitPositionInstructionsParams.Instruction.builder()
                        .instructionType(PositionInstructionType.EXERCISE)
                        .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .quantity("1")
                        .instructionId("ui-20260424-001")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                PositionSubmitPositionInstructionsParams.Instruction.builder()
                    .instructionType(PositionInstructionType.EXERCISE)
                    .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                    .quantity("1")
                    .instructionId("ui-20260424-001")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PositionSubmitPositionInstructionsParams.builder()
                .accountId(0L)
                .addInstruction(
                    PositionSubmitPositionInstructionsParams.Instruction.builder()
                        .instructionType(PositionInstructionType.EXERCISE)
                        .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .quantity("1")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                PositionSubmitPositionInstructionsParams.Instruction.builder()
                    .instructionType(PositionInstructionType.EXERCISE)
                    .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                    .quantity("1")
                    .build()
            )
    }
}
