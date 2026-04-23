// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EconomicServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEconomicCalendar() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val economicServiceAsync = client.active().v1().calendars().economic()

        val responseFuture =
            economicServiceAsync.getEconomicCalendar(
                EconomicGetEconomicCalendarParams.builder()
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
