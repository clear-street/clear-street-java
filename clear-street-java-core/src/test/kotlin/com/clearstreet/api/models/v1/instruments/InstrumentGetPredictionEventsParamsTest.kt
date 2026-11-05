// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetPredictionEventsParamsTest {

    @Test
    fun create() {
        InstrumentGetPredictionEventsParams.builder()
            .categories("categories")
            .closeAt(
                InstrumentGetPredictionEventsParams.CloseAt.builder()
                    .gt("gt")
                    .gte("gte")
                    .lt("lt")
                    .lte("lte")
                    .build()
            )
            .includeMarkets(true)
            .includeSettled(true)
            .marketIds("market_ids")
            .openAt(
                InstrumentGetPredictionEventsParams.OpenAt.builder()
                    .gt("gt")
                    .gte("gte")
                    .lt("lt")
                    .lte("lte")
                    .build()
            )
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .search("search")
            .seriesCodes("series_codes")
            .sortBy(InstrumentGetPredictionEventsParams.SortBy.OPEN_AT)
            .sortDirection(InstrumentGetPredictionEventsParams.SortDirection.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetPredictionEventsParams.builder()
                .categories("categories")
                .closeAt(
                    InstrumentGetPredictionEventsParams.CloseAt.builder()
                        .gt("gt")
                        .gte("gte")
                        .lt("lt")
                        .lte("lte")
                        .build()
                )
                .includeMarkets(true)
                .includeSettled(true)
                .marketIds("market_ids")
                .openAt(
                    InstrumentGetPredictionEventsParams.OpenAt.builder()
                        .gt("gt")
                        .gte("gte")
                        .lt("lt")
                        .lte("lte")
                        .build()
                )
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .search("search")
                .seriesCodes("series_codes")
                .sortBy(InstrumentGetPredictionEventsParams.SortBy.OPEN_AT)
                .sortDirection(InstrumentGetPredictionEventsParams.SortDirection.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("categories", "categories")
                    .put("close_at[gt]", "gt")
                    .put("close_at[gte]", "gte")
                    .put("close_at[lt]", "lt")
                    .put("close_at[lte]", "lte")
                    .put("include_markets", "true")
                    .put("include_settled", "true")
                    .put("market_ids", "market_ids")
                    .put("open_at[gt]", "gt")
                    .put("open_at[gte]", "gte")
                    .put("open_at[lt]", "lt")
                    .put("open_at[lte]", "lte")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("search", "search")
                    .put("series_codes", "series_codes")
                    .put("sort_by", "OPEN_AT")
                    .put("sort_direction", "ASC")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentGetPredictionEventsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
