// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EconomicServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEconomicCalendar() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val economicService = client.active().v1().calendars().economic()

        val response =
            economicService.getEconomicCalendar(
                EconomicGetEconomicCalendarParams.builder()
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
