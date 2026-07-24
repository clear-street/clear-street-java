// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentEventsParamsTest {

    @Test
    fun create() {
        InstrumentDataGetInstrumentEventsParams.builder()
            .instrumentId("x")
            .fromDate("from_date")
            .toDate("to_date")
            .build()
    }

    @Test
    fun pathParams() {
        val params = InstrumentDataGetInstrumentEventsParams.builder().instrumentId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentDataGetInstrumentEventsParams.builder()
                .instrumentId("x")
                .fromDate("from_date")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from_date", "from_date")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentDataGetInstrumentEventsParams.builder().instrumentId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
