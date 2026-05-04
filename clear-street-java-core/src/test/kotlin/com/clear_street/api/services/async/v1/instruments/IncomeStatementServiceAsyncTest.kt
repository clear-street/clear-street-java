// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IncomeStatementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentIncomeStatements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val incomeStatementServiceAsync = client.v1().instruments().incomeStatements()

        val responseFuture =
            incomeStatementServiceAsync.getInstrumentIncomeStatements(
                IncomeStatementGetInstrumentIncomeStatementsParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
