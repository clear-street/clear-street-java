// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateAlertResponseTest {

    @Test
    fun create() {
        val createAlertResponse =
            CreateAlertResponse.builder().alertId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(createAlertResponse.alertId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createAlertResponse =
            CreateAlertResponse.builder().alertId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val roundtrippedCreateAlertResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createAlertResponse),
                jacksonTypeRef<CreateAlertResponse>(),
            )

        assertThat(roundtrippedCreateAlertResponse).isEqualTo(createAlertResponse)
    }
}
