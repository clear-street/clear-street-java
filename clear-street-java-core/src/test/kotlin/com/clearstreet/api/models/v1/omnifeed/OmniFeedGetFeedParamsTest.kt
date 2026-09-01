// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omnifeed

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OmniFeedGetFeedParamsTest {

    @Test
    fun create() {
        OmniFeedGetFeedParams.builder()
            .accountId(0L)
            .cursor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OmniFeedGetFeedParams.builder()
                .accountId(0L)
                .cursor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "0")
                    .put("cursor", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OmniFeedGetFeedParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
