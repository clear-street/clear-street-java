// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.iris.threads

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadListThreadsDeprecatedParamsTest {

    @Test
    fun create() {
        ThreadListThreadsDeprecatedParams.builder()
            .accountId("account_id")
            .pageSize(0)
            .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ThreadListThreadsDeprecatedParams.builder()
                .accountId("account_id")
                .pageSize(0)
                .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("page_size", "0")
                    .put("page_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ThreadListThreadsDeprecatedParams.builder().accountId("account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("account_id", "account_id").build())
    }
}
