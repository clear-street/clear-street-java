// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendar.MarketType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CalendarServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getClock() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val calendarService = client.v1().calendar()

        val response = calendarService.getClock()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMarketHoursCalendar() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val calendarService = client.v1().calendar()

        val response =
            calendarService.getMarketHoursCalendar(
                CalendarGetMarketHoursCalendarParams.builder()
                    .date("date")
                    .market(MarketType.US_EQUITIES)
                    .build()
            )

        response.validate()
    }
}
