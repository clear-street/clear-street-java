// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.positions.instructions

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionInstructionTest {

    @Test
    fun create() {
        val positionInstruction =
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

        assertThat(positionInstruction.id()).isEqualTo("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
        assertThat(positionInstruction.accountId()).isEqualTo(122503L)
        assertThat(positionInstruction.instructionId()).isEqualTo("ui-20260424-001")
        assertThat(positionInstruction.instructionType())
            .isEqualTo(PositionInstructionType.EXERCISE)
        assertThat(positionInstruction.instrumentId())
            .isEqualTo("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
        assertThat(positionInstruction.osi()).isEqualTo("AAPL  280121C00195000")
        assertThat(positionInstruction.quantity()).isEqualTo("1")
        assertThat(positionInstruction.status()).isEqualTo(PositionInstructionStatus.SENT)
        assertThat(positionInstruction.symbol()).isEqualTo("AAPL")
        assertThat(positionInstruction.acceptedQuantity()).isEmpty
        assertThat(positionInstruction.createdAt())
            .contains(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
        assertThat(positionInstruction.error()).contains("error")
        assertThat(positionInstruction.rejectionReason()).isEmpty
        assertThat(positionInstruction.updatedAt())
            .contains(OffsetDateTime.parse("2026-04-24T14:30:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val positionInstruction =
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

        val roundtrippedPositionInstruction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(positionInstruction),
                jacksonTypeRef<PositionInstruction>(),
            )

        assertThat(roundtrippedPositionInstruction).isEqualTo(positionInstruction)
    }
}
