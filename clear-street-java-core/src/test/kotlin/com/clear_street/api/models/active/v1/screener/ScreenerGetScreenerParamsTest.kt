// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.screener

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenerGetScreenerParamsTest {

    @Test
    fun create() {
        ScreenerGetScreenerParams.builder()
            .addFieldFilter("string")
            .filter(
                ScreenerGetScreenerParams.Filter.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .sortBy("sort_by")
            .sortDirection(ScreenerGetScreenerParams.SortDirection.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ScreenerGetScreenerParams.builder()
                .addFieldFilter("string")
                .filter(
                    ScreenerGetScreenerParams.Filter.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .sortBy("sort_by")
                .sortDirection(ScreenerGetScreenerParams.SortDirection.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("field_filter[0]", "string")
                    .put("filter[foo]", "string")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("sort_by", "sort_by")
                    .put("sort_direction", "ASC")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScreenerGetScreenerParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
