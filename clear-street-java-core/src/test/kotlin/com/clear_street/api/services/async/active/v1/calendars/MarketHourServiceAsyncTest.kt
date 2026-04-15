// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.calendars.markethours.MarketHourGetMarketHoursCalendarParams
import com.clear_street.api.models.active.v1.calendars.markethours.MarketType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MarketHourServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMarketHoursCalendar() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val marketHourServiceAsync = client.active().v1().calendars().marketHours()

        val responseFuture =
            marketHourServiceAsync.getMarketHoursCalendar(
                MarketHourGetMarketHoursCalendarParams.builder()
                    .date("date")
                    .market(MarketType.US_EQUITIES)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
