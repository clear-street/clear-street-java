// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetAllInstrumentEventsParamsTest {

    @Test
    fun create() {
        InstrumentDataGetAllInstrumentEventsParams.builder()
            .addEventType(AllEventsEventType.EARNINGS)
            .fromDate("from_date")
            .addInstrumentId("x")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentDataGetAllInstrumentEventsParams.builder()
                .addEventType(AllEventsEventType.EARNINGS)
                .fromDate("from_date")
                .addInstrumentId("x")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("event_types", listOf("EARNINGS").joinToString(","))
                    .put("from_date", "from_date")
                    .put("instrument_ids", listOf("x").joinToString(","))
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentDataGetAllInstrumentEventsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
