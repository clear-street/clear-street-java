// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.models.v1.alerts.AlertCreateAlertParams
import com.clearstreet.api.models.v1.alerts.AlertGetAlertsParams
import com.clearstreet.api.models.v1.alerts.Schedule
import com.clearstreet.api.models.v1.alerts.TriggerMode
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlertServiceTest {

    @Test
    fun createAlert() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.v1().alerts()

        val response =
            alertService.createAlert(
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
            )

        response.validate()
    }

    @Test
    fun deleteAlert() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.v1().alerts()

        alertService.deleteAlert("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getAlertById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.v1().alerts()

        val response = alertService.getAlertById("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Test
    fun getAlerts() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.v1().alerts()

        val response =
            alertService.getAlerts(
                AlertGetAlertsParams.builder()
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .status("status")
                    .build()
            )

        response.validate()
    }
}
