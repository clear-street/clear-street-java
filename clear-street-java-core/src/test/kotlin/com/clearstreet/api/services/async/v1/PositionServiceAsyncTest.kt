// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.positions.PositionCancelPositionInstructionParams
import com.clearstreet.api.models.v1.positions.PositionClosePositionParams
import com.clearstreet.api.models.v1.positions.PositionClosePositionsParams
import com.clearstreet.api.models.v1.positions.PositionGetPositionInstructionsParams
import com.clearstreet.api.models.v1.positions.PositionGetPositionsParams
import com.clearstreet.api.models.v1.positions.PositionInstructionType
import com.clearstreet.api.models.v1.positions.PositionSubmitPositionInstructionsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PositionServiceAsyncTest {

    @Test
    fun cancelPositionInstruction() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Test
    fun closePosition() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.closePosition(
                PositionClosePositionParams.builder()
                    .accountId(0L)
                    .instrumentId("x")
                    .cancelOrders(false)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun closePositions() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.closePositions(
                PositionClosePositionsParams.builder().accountId(0L).cancelOrders(false).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPositionInstructions() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val positionServiceAsync = client.v1().positions()

        val responseFuture =
            positionServiceAsync.getPositionInstructions(
                PositionGetPositionInstructionsParams.builder()
                    .accountId(0L)
                    .instrumentId("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPositions() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Test
    fun submitPositionInstructions() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
