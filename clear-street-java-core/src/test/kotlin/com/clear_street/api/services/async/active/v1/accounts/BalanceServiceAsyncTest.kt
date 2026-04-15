// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.accounts.balances.BalanceGetAccountBalancesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BalanceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAccountBalances() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val balanceServiceAsync = client.active().v1().accounts().balances()

        val responseFuture =
            balanceServiceAsync.getAccountBalances(
                BalanceGetAccountBalancesParams.builder()
                    .accountId(0L)
                    .topMarginContributorsLimit(1)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
