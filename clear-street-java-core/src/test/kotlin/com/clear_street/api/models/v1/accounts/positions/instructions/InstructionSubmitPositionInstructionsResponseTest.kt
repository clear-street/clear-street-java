// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.positions.instructions

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.accounts.positions.instructions.PositionInstruction
import com.clear_street.api.models.active.v1.accounts.positions.instructions.PositionInstructionStatus
import com.clear_street.api.models.active.v1.accounts.positions.instructions.PositionInstructionType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstructionSubmitPositionInstructionsResponseTest {

    @Test
    fun create() {
        val instructionSubmitPositionInstructionsResponse =
            InstructionSubmitPositionInstructionsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
                    PositionInstruction.builder()
                        .id("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .accountId(122503L)
                        .instructionId("ui-20260424-001")
                        .instructionType(PositionInstructionType.EXERCISE)
                        .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .osi("AAPL  280121C00195000")
                        .quantity("1")
                        .status(PositionInstructionStatus.SENT)
                        .symbol("AAPL")
                        .acceptedQuantity(null)
                        .createdAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .error("error")
                        .rejectionReason(null)
                        .updatedAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .build()
                )
                .build()

        assertThat(instructionSubmitPositionInstructionsResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(instructionSubmitPositionInstructionsResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(instructionSubmitPositionInstructionsResponse.data())
            .containsExactly(
                PositionInstruction.builder()
                    .id("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                    .accountId(122503L)
                    .instructionId("ui-20260424-001")
                    .instructionType(PositionInstructionType.EXERCISE)
                    .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                    .osi("AAPL  280121C00195000")
                    .quantity("1")
                    .status(PositionInstructionStatus.SENT)
                    .symbol("AAPL")
                    .acceptedQuantity(null)
                    .createdAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                    .error("error")
                    .rejectionReason(null)
                    .updatedAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instructionSubmitPositionInstructionsResponse =
            InstructionSubmitPositionInstructionsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
                    PositionInstruction.builder()
                        .id("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .accountId(122503L)
                        .instructionId("ui-20260424-001")
                        .instructionType(PositionInstructionType.EXERCISE)
                        .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .osi("AAPL  280121C00195000")
                        .quantity("1")
                        .status(PositionInstructionStatus.SENT)
                        .symbol("AAPL")
                        .acceptedQuantity(null)
                        .createdAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .error("error")
                        .rejectionReason(null)
                        .updatedAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .build()
                )
                .build()

        val roundtrippedInstructionSubmitPositionInstructionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instructionSubmitPositionInstructionsResponse),
                jacksonTypeRef<InstructionSubmitPositionInstructionsResponse>(),
            )

        assertThat(roundtrippedInstructionSubmitPositionInstructionsResponse)
            .isEqualTo(instructionSubmitPositionInstructionsResponse)
    }
}
