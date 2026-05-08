// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.positions.PositionCancelPositionInstructionParams
import com.clear_street.api.models.v1.positions.PositionClosePositionParams
import com.clear_street.api.models.v1.positions.PositionClosePositionsParams
import com.clear_street.api.models.v1.positions.PositionGetPositionInstructionsParams
import com.clear_street.api.models.v1.positions.PositionGetPositionsParams
import com.clear_street.api.models.v1.positions.PositionInstructionType
import com.clear_street.api.models.v1.positions.PositionSubmitPositionInstructionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PositionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelPositionInstruction() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.cancelPositionInstruction(
                PositionCancelPositionInstructionParams.builder()
                    .accountId(0L)
                    .instructionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun closePosition() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.closePosition(
                PositionClosePositionParams.builder()
                    .accountId(0L)
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cancelOrders(false)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun closePositions() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.closePositions(
                PositionClosePositionsParams.builder().accountId(0L).cancelOrders(false).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPositionInstructions() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.getPositionInstructions(
                PositionGetPositionInstructionsParams.builder()
                    .accountId(0L)
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPositions() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.getPositions(
                PositionGetPositionsParams.builder()
                    .accountId(0L)
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .sortBy(PositionGetPositionsParams.SortBy.SYMBOL)
                    .sortDirection(PositionGetPositionsParams.SortDirection.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitPositionInstructions() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.submitPositionInstructions(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
