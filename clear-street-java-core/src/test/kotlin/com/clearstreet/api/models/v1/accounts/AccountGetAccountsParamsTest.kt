// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetAccountsParamsTest {

    @Test
    fun create() {
        AccountGetAccountsParams.builder()
            .accountId("account_id")
            .accountName("account_name")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountGetAccountsParams.builder()
                .accountId("account_id")
                .accountName("account_name")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("account_name", "account_name")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountGetAccountsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
