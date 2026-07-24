// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CalendarServiceAsyncTest {

    @Test
    fun getClock() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val calendarServiceAsync = client.v1().calendar()

        val responseFuture = calendarServiceAsync.getClock()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getMarketHoursCalendar() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val calendarServiceAsync = client.v1().calendar()

        val responseFuture =
            calendarServiceAsync.getMarketHoursCalendar(
                CalendarGetMarketHoursCalendarParams.builder()
                    .date("date")
                    .market(CalendarGetMarketHoursCalendarParams.Market.US_EQUITIES)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
