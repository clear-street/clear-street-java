// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.calendars.markethours.MarketHourGetMarketHoursCalendarParams
import com.clear_street.api.models.active.v1.calendars.markethours.MarketType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MarketHourServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMarketHoursCalendar() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val marketHourService = client.active().v1().calendars().marketHours()

        val response =
            marketHourService.getMarketHoursCalendar(
                MarketHourGetMarketHoursCalendarParams.builder()
                    .date("date")
                    .market(MarketType.US_EQUITIES)
                    .build()
            )

        response.validate()
    }
}
