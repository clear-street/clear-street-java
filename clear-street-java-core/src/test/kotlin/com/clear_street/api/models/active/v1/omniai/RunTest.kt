// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunTest {

    @Test
    fun create() {
        val run =
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

        assertThat(run.createdAt()).isEqualTo("created_at")
        assertThat(run.status()).isEqualTo(RunStatus.UNSPECIFIED)
        assertThat(run.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(run.capabilities().getOrNull()).containsExactly(Capability.NAVIGATE)
        assertThat(run.endedAt()).contains("ended_at")
        assertThat(run._error()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(run.startedAt()).contains("started_at")
        assertThat(run.threadId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val run =
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

        val roundtrippedRun =
            jsonMapper.readValue(jsonMapper.writeValueAsString(run), jacksonTypeRef<Run>())

        assertThat(roundtrippedRun).isEqualTo(run)
    }
}
