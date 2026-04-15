// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PortfolioHistoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPortfolioHistory() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portfolioHistoryServiceAsync = client.active().v1().accounts().portfolioHistory()

        val responseFuture =
            portfolioHistoryServiceAsync.getPortfolioHistory(
                PortfolioHistoryGetPortfolioHistoryParams.builder()
                    .accountId(0L)
                    .endDate(LocalDate.parse("2019-12-27"))
                    .startDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
