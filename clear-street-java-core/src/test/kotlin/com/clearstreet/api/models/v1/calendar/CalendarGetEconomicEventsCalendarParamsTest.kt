// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.calendar

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarGetEconomicEventsCalendarParamsTest {

    @Test
    fun create() {
        CalendarGetEconomicEventsCalendarParams.builder()
            .country("country")
            .addImpact(CalendarGetEconomicEventsCalendarParams.Impact.NONE)
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .timestamp(
                CalendarGetEconomicEventsCalendarParams.Timestamp.builder()
                    .gt("gt")
                    .gte("gte")
                    .lt("lt")
                    .lte("lte")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CalendarGetEconomicEventsCalendarParams.builder()
                .country("country")
                .addImpact(CalendarGetEconomicEventsCalendarParams.Impact.NONE)
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .timestamp(
                    CalendarGetEconomicEventsCalendarParams.Timestamp.builder()
                        .gt("gt")
                        .gte("gte")
                        .lt("lt")
                        .lte("lte")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("country", "country")
                    .put("impact", listOf("NONE").joinToString(","))
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("timestamp[gt]", "gt")
                    .put("timestamp[gte]", "gte")
                    .put("timestamp[lt]", "lt")
                    .put("timestamp[lte]", "lte")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CalendarGetEconomicEventsCalendarParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
