// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.watchlist

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistGetWatchlistsParamsTest {

    @Test
    fun create() {
        WatchlistGetWatchlistsParams.builder()
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WatchlistGetWatchlistsParams.builder()
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WatchlistGetWatchlistsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
