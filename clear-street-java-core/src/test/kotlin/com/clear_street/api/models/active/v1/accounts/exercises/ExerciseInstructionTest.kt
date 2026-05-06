// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.exercises

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityIdSource
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExerciseInstructionTest {

    @Test
    fun create() {
        val exerciseInstruction =
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

        assertThat(exerciseInstruction.id()).isEqualTo("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
        assertThat(exerciseInstruction.accountId()).isEqualTo(122503L)
        assertThat(exerciseInstruction.action()).isEqualTo(ExerciseAction.EXERCISE)
        assertThat(exerciseInstruction.clientExerciseId()).isEqualTo("ui-20260424-001")
        assertThat(exerciseInstruction.instrumentId())
            .isEqualTo("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
        assertThat(exerciseInstruction.quantity()).isEqualTo("1")
        assertThat(exerciseInstruction.securityId()).isEqualTo("AAPL  280121C00195000")
        assertThat(exerciseInstruction.securityIdSource()).isEqualTo(SecurityIdSource.CMS)
        assertThat(exerciseInstruction.status()).isEqualTo(ExerciseStatus.SENT)
        assertThat(exerciseInstruction.symbol()).isEqualTo("AAPL")
        assertThat(exerciseInstruction.acceptedQuantity()).isEmpty
        assertThat(exerciseInstruction.createdAt())
            .contains(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
        assertThat(exerciseInstruction.error()).contains("error")
        assertThat(exerciseInstruction.rejectionReason()).isEmpty
        assertThat(exerciseInstruction.updatedAt())
            .contains(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exerciseInstruction =
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

        val roundtrippedExerciseInstruction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exerciseInstruction),
                jacksonTypeRef<ExerciseInstruction>(),
            )

        assertThat(roundtrippedExerciseInstruction).isEqualTo(exerciseInstruction)
    }
}
