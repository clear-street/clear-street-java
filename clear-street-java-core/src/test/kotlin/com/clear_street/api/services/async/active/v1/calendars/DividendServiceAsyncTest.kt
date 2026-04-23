// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DividendServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDividendsCalendar() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dividendServiceAsync = client.active().v1().calendars().dividends()

        val responseFuture =
            dividendServiceAsync.getDividendsCalendar(
                DividendGetDividendsCalendarParams.builder()
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
