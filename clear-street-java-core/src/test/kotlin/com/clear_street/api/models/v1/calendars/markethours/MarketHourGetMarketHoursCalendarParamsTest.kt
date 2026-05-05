// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.calendars.markethours

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketHourGetMarketHoursCalendarParamsTest {

    @Test
    fun create() {
        MarketHourGetMarketHoursCalendarParams.builder()
            .date("date")
            .market(MarketType.US_EQUITIES)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MarketHourGetMarketHoursCalendarParams.builder()
                .date("date")
                .market(MarketType.US_EQUITIES)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("date", "date").put("market", "us_equities").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MarketHourGetMarketHoursCalendarParams.builder().date("date").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("date", "date").build())
    }
}
