// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentCashFlowStatementsParamsTest {

    @Test
    fun create() {
        InstrumentDataGetInstrumentCashFlowStatementsParams.builder()
            .instrumentId("x")
            .fromDate("from_date")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .toDate("to_date")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InstrumentDataGetInstrumentCashFlowStatementsParams.builder().instrumentId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentDataGetInstrumentCashFlowStatementsParams.builder()
                .instrumentId("x")
                .fromDate("from_date")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from_date", "from_date")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InstrumentDataGetInstrumentCashFlowStatementsParams.builder().instrumentId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
