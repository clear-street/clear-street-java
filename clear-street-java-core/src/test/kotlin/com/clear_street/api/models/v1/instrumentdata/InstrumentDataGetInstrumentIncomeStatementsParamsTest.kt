// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentIncomeStatementsParamsTest {

    @Test
    fun create() {
        InstrumentDataGetInstrumentIncomeStatementsParams.builder()
            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fromDate("from_date")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .toDate("to_date")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InstrumentDataGetInstrumentIncomeStatementsParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentDataGetInstrumentIncomeStatementsParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
            InstrumentDataGetInstrumentIncomeStatementsParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
