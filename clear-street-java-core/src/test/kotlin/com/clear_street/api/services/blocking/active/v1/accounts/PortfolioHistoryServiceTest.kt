// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PortfolioHistoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPortfolioHistory() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val portfolioHistoryService = client.active().v1().accounts().portfolioHistory()

        val response =
            portfolioHistoryService.getPortfolioHistory(
                PortfolioHistoryGetPortfolioHistoryParams.builder()
                    .accountId(0L)
                    .startDate(LocalDate.parse("2019-12-27"))
                    .endDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
