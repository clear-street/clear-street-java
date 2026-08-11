// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

import com.clearstreet.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertCreateAlertParamsTest {

    @Test
    fun create() {
        AlertCreateAlertParams.builder()
            .condition(
                JsonValue.from(
                    mapOf(
                        "conditions" to
                            listOf(
                                mapOf(
                                    "op" to "lte",
                                    "signal" to "market.day_change_pct",
                                    "subject" to mapOf("instrument_id" to "NVDA"),
                                    "value" to -5,
                                )
                            ),
                        "match" to "all",
                    )
                )
            )
            .schedule(Schedule.EVERY_1M)
            .trigger(TriggerMode.ONCE)
            .accountId(19816L)
            .build()
    }

    @Test
    fun body() {
        val params =
            AlertCreateAlertParams.builder()
                .condition(
                    JsonValue.from(
                        mapOf(
                            "conditions" to
                                listOf(
                                    mapOf(
                                        "op" to "lte",
                                        "signal" to "market.day_change_pct",
                                        "subject" to mapOf("instrument_id" to "NVDA"),
                                        "value" to -5,
                                    )
                                ),
                            "match" to "all",
                        )
                    )
                )
                .schedule(Schedule.EVERY_1M)
                .trigger(TriggerMode.ONCE)
                .accountId(19816L)
                .build()

        val body = params._body()

        assertThat(body._condition())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "conditions" to
                            listOf(
                                mapOf(
                                    "op" to "lte",
                                    "signal" to "market.day_change_pct",
                                    "subject" to mapOf("instrument_id" to "NVDA"),
                                    "value" to -5,
                                )
                            ),
                        "match" to "all",
                    )
                )
            )
        assertThat(body.schedule()).isEqualTo(Schedule.EVERY_1M)
        assertThat(body.trigger()).isEqualTo(TriggerMode.ONCE)
        assertThat(body.accountId()).contains(19816L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateAlertParams.builder()
                .condition(
                    JsonValue.from(
                        mapOf(
                            "conditions" to
                                listOf(
                                    mapOf(
                                        "op" to "lte",
                                        "signal" to "market.day_change_pct",
                                        "subject" to mapOf("instrument_id" to "NVDA"),
                                        "value" to -5,
                                    )
                                ),
                            "match" to "all",
                        )
                    )
                )
                .schedule(Schedule.EVERY_1M)
                .trigger(TriggerMode.ONCE)
                .build()

        val body = params._body()

        assertThat(body._condition())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "conditions" to
                            listOf(
                                mapOf(
                                    "op" to "lte",
                                    "signal" to "market.day_change_pct",
                                    "subject" to mapOf("instrument_id" to "NVDA"),
                                    "value" to -5,
                                )
                            ),
                        "match" to "all",
                    )
                )
            )
        assertThat(body.schedule()).isEqualTo(Schedule.EVERY_1M)
        assertThat(body.trigger()).isEqualTo(TriggerMode.ONCE)
    }
}
