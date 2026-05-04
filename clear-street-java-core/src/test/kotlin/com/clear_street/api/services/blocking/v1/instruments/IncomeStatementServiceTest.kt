// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IncomeStatementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentIncomeStatements() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val incomeStatementService = client.v1().instruments().incomeStatements()

        val response =
            incomeStatementService.getInstrumentIncomeStatements(
                IncomeStatementGetInstrumentIncomeStatementsParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }
}
