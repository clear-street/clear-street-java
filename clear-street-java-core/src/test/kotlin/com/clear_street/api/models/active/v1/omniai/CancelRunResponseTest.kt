// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CancelRunResponseTest {

    @Test
    fun create() {
        val cancelRunResponse = CancelRunResponse.builder().canceled(true).build()

        assertThat(cancelRunResponse.canceled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cancelRunResponse = CancelRunResponse.builder().canceled(true).build()

        val roundtrippedCancelRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelRunResponse),
                jacksonTypeRef<CancelRunResponse>(),
            )

        assertThat(roundtrippedCancelRunResponse).isEqualTo(cancelRunResponse)
    }
}
