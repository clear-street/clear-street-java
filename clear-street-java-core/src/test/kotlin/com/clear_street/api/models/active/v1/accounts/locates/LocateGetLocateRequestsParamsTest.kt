// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocateRequestsParamsTest {

    @Test
    fun create() {
        LocateGetLocateRequestsParams.builder()
            .accountId(0L)
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .referenceId("reference_id")
            .status(LocateOrderStatus.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LocateGetLocateRequestsParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LocateGetLocateRequestsParams.builder()
                .accountId(0L)
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .referenceId("reference_id")
                .status(LocateOrderStatus.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("reference_id", "reference_id")
                    .put("status", "PENDING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LocateGetLocateRequestsParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
