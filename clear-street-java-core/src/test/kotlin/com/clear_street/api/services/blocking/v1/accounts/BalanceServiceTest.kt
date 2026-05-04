// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.accounts.balances.BalanceGetAccountBalancesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BalanceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAccountBalances() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val balanceService = client.v1().accounts().balances()

        val response =
            balanceService.getAccountBalances(
                BalanceGetAccountBalancesParams.builder()
                    .accountId(0L)
                    .topMarginContributorsLimit(1)
                    .build()
            )

        response.validate()
    }
}
