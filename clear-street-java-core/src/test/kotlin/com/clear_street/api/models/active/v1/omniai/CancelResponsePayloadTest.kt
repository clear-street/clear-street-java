// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CancelResponsePayloadTest {

    @Test
    fun create() {
        val cancelResponsePayload = CancelResponsePayload.builder().canceled(true).build()

        assertThat(cancelResponsePayload.canceled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cancelResponsePayload = CancelResponsePayload.builder().canceled(true).build()

        val roundtrippedCancelResponsePayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelResponsePayload),
                jacksonTypeRef<CancelResponsePayload>(),
            )

        assertThat(roundtrippedCancelResponsePayload).isEqualTo(cancelResponsePayload)
    }
}
