// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScreenerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val screenerServiceAsync = client.active().v1().screener()

        val responseFuture =
            screenerServiceAsync.getScreener(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
