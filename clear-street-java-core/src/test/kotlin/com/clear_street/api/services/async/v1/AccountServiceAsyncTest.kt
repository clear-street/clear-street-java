// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.accounts.AccountGetAccountsParams
import com.clear_street.api.models.v1.accounts.AccountPatchAccountByIdParams
import com.clear_street.api.models.v1.accounts.RiskSettings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAccountById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.v1().accounts()

        val responseFuture = accountServiceAsync.getAccountById(0L)

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAccounts() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.v1().accounts()

        val responseFuture =
            accountServiceAsync.getAccounts(
                AccountGetAccountsParams.builder()
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAccountById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.v1().accounts()

        val responseFuture =
            accountServiceAsync.patchAccountById(
                AccountPatchAccountByIdParams.builder()
                    .accountId(0L)
                    .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
