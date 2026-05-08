// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendar.MarketType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CalendarServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getClock() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarServiceAsync = client.v1().calendar()

        val responseFuture = calendarServiceAsync.getClock()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMarketHoursCalendar() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarServiceAsync = client.v1().calendar()

        val responseFuture =
            calendarServiceAsync.getMarketHoursCalendar(
                CalendarGetMarketHoursCalendarParams.builder()
                    .date("date")
                    .market(MarketType.US_EQUITIES)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
