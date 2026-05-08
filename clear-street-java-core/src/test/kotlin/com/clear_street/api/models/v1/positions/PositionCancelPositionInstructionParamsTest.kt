// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.positions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionCancelPositionInstructionParamsTest {

    @Test
    fun create() {
        PositionCancelPositionInstructionParams.builder()
            .accountId(0L)
            .instructionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PositionCancelPositionInstructionParams.builder()
                .accountId(0L)
                .instructionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
