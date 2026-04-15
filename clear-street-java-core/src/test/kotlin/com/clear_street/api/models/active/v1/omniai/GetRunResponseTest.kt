// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GetRunResponseTest {

    @Test
    fun create() {
        val getRunResponse =
            GetRunResponse.builder()
                .addEvent(JsonValue.from(mapOf<String, Any>()))
                .run(
                    Run.builder()
                        .createdAt("created_at")
                        .status(RunStatus.UNSPECIFIED)
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addCapability(Capability.NAVIGATE)
                        .endedAt("ended_at")
                        .error(JsonValue.from(mapOf<String, Any>()))
                        .startedAt("started_at")
                        .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(getRunResponse.events()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(getRunResponse.run())
            .isEqualTo(
                Run.builder()
                    .createdAt("created_at")
                    .status(RunStatus.UNSPECIFIED)
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addCapability(Capability.NAVIGATE)
                    .endedAt("ended_at")
                    .error(JsonValue.from(mapOf<String, Any>()))
                    .startedAt("started_at")
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(getRunResponse.nextPageToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val getRunResponse =
            GetRunResponse.builder()
                .addEvent(JsonValue.from(mapOf<String, Any>()))
                .run(
                    Run.builder()
                        .createdAt("created_at")
                        .status(RunStatus.UNSPECIFIED)
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addCapability(Capability.NAVIGATE)
                        .endedAt("ended_at")
                        .error(JsonValue.from(mapOf<String, Any>()))
                        .startedAt("started_at")
                        .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedGetRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(getRunResponse),
                jacksonTypeRef<GetRunResponse>(),
            )

        assertThat(roundtrippedGetRunResponse).isEqualTo(getRunResponse)
    }
}
