// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.positions

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionGetPositionsParamsTest {

    @Test
    fun create() {
        PositionGetPositionsParams.builder()
            .accountId(0L)
            .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .sortBy(PositionGetPositionsParams.SortBy.SYMBOL)
            .sortDirection(PositionGetPositionsParams.SortDirection.ASC)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PositionGetPositionsParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PositionGetPositionsParams.builder()
                .accountId(0L)
                .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .sortBy(PositionGetPositionsParams.SortBy.SYMBOL)
                .sortDirection(PositionGetPositionsParams.SortDirection.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("instrument_ids[0]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("sort_by", "SYMBOL")
                    .put("sort_direction", "ASC")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PositionGetPositionsParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
