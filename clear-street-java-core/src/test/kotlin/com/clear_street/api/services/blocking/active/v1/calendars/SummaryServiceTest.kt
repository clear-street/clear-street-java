// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.calendars.summary.SummaryGetCalendarSummaryParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SummaryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCalendarSummary() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val summaryService = client.active().v1().calendars().summary()

        val response =
            summaryService.getCalendarSummary(
                SummaryGetCalendarSummaryParams.builder()
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
