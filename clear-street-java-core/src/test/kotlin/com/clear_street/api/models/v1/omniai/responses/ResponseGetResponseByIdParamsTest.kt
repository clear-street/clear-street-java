// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.responses

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseGetResponseByIdParamsTest {

    @Test
    fun create() {
        ResponseGetResponseByIdParams.builder()
            .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountId(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ResponseGetResponseByIdParams.builder()
                .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ResponseGetResponseByIdParams.builder()
                .responseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("account_id", "0").build())
    }
}
