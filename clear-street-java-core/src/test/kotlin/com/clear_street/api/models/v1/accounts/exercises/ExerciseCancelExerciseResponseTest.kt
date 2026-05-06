// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.exercises

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.accounts.exercises.ExerciseAction
import com.clear_street.api.models.active.v1.accounts.exercises.ExerciseInstruction
import com.clear_street.api.models.active.v1.accounts.exercises.ExerciseStatus
import com.clear_street.api.models.v1.SecurityIdSource
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExerciseCancelExerciseResponseTest {

    @Test
    fun create() {
        val exerciseCancelExerciseResponse =
            ExerciseCancelExerciseResponse.builder()
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
                .data(
                    ExerciseInstruction.builder()
                        .id("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .accountId(122503L)
                        .action(ExerciseAction.EXERCISE)
                        .clientExerciseId("ui-20260424-001")
                        .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .quantity("1")
                        .securityId("AAPL  280121C00195000")
                        .securityIdSource(SecurityIdSource.CMS)
                        .status(ExerciseStatus.SENT)
                        .symbol("AAPL")
                        .acceptedQuantity(null)
                        .createdAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .error("error")
                        .rejectionReason(null)
                        .updatedAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .build()
                )
                .build()

        assertThat(exerciseCancelExerciseResponse.metadata())
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
        assertThat(exerciseCancelExerciseResponse.error())
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
        assertThat(exerciseCancelExerciseResponse.data())
            .isEqualTo(
                ExerciseInstruction.builder()
                    .id("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                    .accountId(122503L)
                    .action(ExerciseAction.EXERCISE)
                    .clientExerciseId("ui-20260424-001")
                    .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                    .quantity("1")
                    .securityId("AAPL  280121C00195000")
                    .securityIdSource(SecurityIdSource.CMS)
                    .status(ExerciseStatus.SENT)
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
        val exerciseCancelExerciseResponse =
            ExerciseCancelExerciseResponse.builder()
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
                .data(
                    ExerciseInstruction.builder()
                        .id("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .accountId(122503L)
                        .action(ExerciseAction.EXERCISE)
                        .clientExerciseId("ui-20260424-001")
                        .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                        .quantity("1")
                        .securityId("AAPL  280121C00195000")
                        .securityIdSource(SecurityIdSource.CMS)
                        .status(ExerciseStatus.SENT)
                        .symbol("AAPL")
                        .acceptedQuantity(null)
                        .createdAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .error("error")
                        .rejectionReason(null)
                        .updatedAt(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
                        .build()
                )
                .build()

        val roundtrippedExerciseCancelExerciseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exerciseCancelExerciseResponse),
                jacksonTypeRef<ExerciseCancelExerciseResponse>(),
            )

        assertThat(roundtrippedExerciseCancelExerciseResponse)
            .isEqualTo(exerciseCancelExerciseResponse)
    }
}
