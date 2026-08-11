// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertTest {

    @Test
    fun create() {
        val alert =
            Alert.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .condition(JsonValue.from(mapOf<String, Any>()))
                .createdAt("created_at")
                .schedule(Schedule.EVERY_1M)
                .source(AlertSource.API)
                .status(AlertStatus.ACTIVE)
                .trigger(TriggerMode.ONCE)
                .accountId(0L)
                .expiresAt("expires_at")
                .omniText("omni_text")
                .triggeredAt("triggered_at")
                .build()

        assertThat(alert.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(alert._condition()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(alert.createdAt()).isEqualTo("created_at")
        assertThat(alert.schedule()).isEqualTo(Schedule.EVERY_1M)
        assertThat(alert.source()).isEqualTo(AlertSource.API)
        assertThat(alert.status()).isEqualTo(AlertStatus.ACTIVE)
        assertThat(alert.trigger()).isEqualTo(TriggerMode.ONCE)
        assertThat(alert.accountId()).contains(0L)
        assertThat(alert.expiresAt()).contains("expires_at")
        assertThat(alert.omniText()).contains("omni_text")
        assertThat(alert.triggeredAt()).contains("triggered_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alert =
            Alert.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .condition(JsonValue.from(mapOf<String, Any>()))
                .createdAt("created_at")
                .schedule(Schedule.EVERY_1M)
                .source(AlertSource.API)
                .status(AlertStatus.ACTIVE)
                .trigger(TriggerMode.ONCE)
                .accountId(0L)
                .expiresAt("expires_at")
                .omniText("omni_text")
                .triggeredAt("triggered_at")
                .build()

        val roundtrippedAlert =
            jsonMapper.readValue(jsonMapper.writeValueAsString(alert), jacksonTypeRef<Alert>())

        assertThat(roundtrippedAlert).isEqualTo(alert)
    }
}
