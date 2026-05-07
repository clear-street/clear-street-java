// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts.positions

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionCancelPositionInstructionParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionGetPositionInstructionsParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionSubmitPositionInstructionsParams
import com.clear_street.api.models.v1.accounts.positions.instructions.PositionInstructionType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstructionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelPositionInstruction() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val instructionService = client.v1().accounts().positions().instructions()

        val response =
            instructionService.cancelPositionInstruction(
                InstructionCancelPositionInstructionParams.builder()
                    .accountId(0L)
                    .instructionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPositionInstructions() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val instructionService = client.v1().accounts().positions().instructions()

        val response =
            instructionService.getPositionInstructions(
                InstructionGetPositionInstructionsParams.builder()
                    .accountId(0L)
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitPositionInstructions() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val instructionService = client.v1().accounts().positions().instructions()

        val response =
            instructionService.submitPositionInstructions(
                InstructionSubmitPositionInstructionsParams.builder()
                    .accountId(0L)
                    .addInstruction(
                        InstructionSubmitPositionInstructionsParams.Instruction.builder()
                            .instructionType(PositionInstructionType.EXERCISE)
                            .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                            .quantity("1")
                            .instructionId("ui-20260424-001")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
