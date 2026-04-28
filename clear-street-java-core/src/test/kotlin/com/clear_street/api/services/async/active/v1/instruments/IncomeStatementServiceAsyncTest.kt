// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IncomeStatementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentIncomeStatements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val incomeStatementServiceAsync = client.active().v1().instruments().incomeStatements()

        val responseFuture =
            incomeStatementServiceAsync.getInstrumentIncomeStatements(
                IncomeStatementGetInstrumentIncomeStatementsParams.builder()
                    .securityIdSource(SecurityIdSource.CMS)
                    .securityId("security_id")
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
