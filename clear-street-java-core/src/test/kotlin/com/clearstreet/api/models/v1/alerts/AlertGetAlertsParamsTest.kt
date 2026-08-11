// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertGetAlertsParamsTest {

    @Test
    fun create() {
        AlertGetAlertsParams.builder()
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AlertGetAlertsParams.builder()
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AlertGetAlertsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
