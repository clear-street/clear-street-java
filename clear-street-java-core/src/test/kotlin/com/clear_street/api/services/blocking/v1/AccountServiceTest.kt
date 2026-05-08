// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.accounts.AccountGetAccountBalancesParams
import com.clear_street.api.models.v1.accounts.AccountGetAccountsParams
import com.clear_street.api.models.v1.accounts.AccountGetPortfolioHistoryParams
import com.clear_street.api.models.v1.accounts.AccountPatchAccountByIdParams
import com.clear_street.api.models.v1.accounts.RiskSettings
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAccountBalances() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.v1().accounts()

        val response =
            accountService.getAccountBalances(
                AccountGetAccountBalancesParams.builder()
                    .accountId(0L)
                    .topMarginContributorsLimit(1)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAccountById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.v1().accounts()

        val response = accountService.getAccountById(0L)

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAccounts() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.v1().accounts()

        val response =
            accountService.getAccounts(
                AccountGetAccountsParams.builder()
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPortfolioHistory() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.v1().accounts()

        val response =
            accountService.getPortfolioHistory(
                AccountGetPortfolioHistoryParams.builder()
                    .accountId(0L)
                    .startDate(LocalDate.parse("2019-12-27"))
                    .endDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAccountById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.v1().accounts()

        val response =
            accountService.patchAccountById(
                AccountPatchAccountByIdParams.builder()
                    .accountId(0L)
                    .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                    .build()
            )

        response.validate()
    }
}
