// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetPredictionSeriesParamsTest {

    @Test
    fun create() {
        InstrumentGetPredictionSeriesParams.builder()
            .categories("categories")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetPredictionSeriesParams.builder()
                .categories("categories")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("categories", "categories")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentGetPredictionSeriesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
