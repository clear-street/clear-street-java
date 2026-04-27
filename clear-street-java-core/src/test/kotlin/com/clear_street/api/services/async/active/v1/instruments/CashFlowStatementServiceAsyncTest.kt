// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CashFlowStatementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentCashFlowStatements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cashFlowStatementServiceAsync = client.active().v1().instruments().cashFlowStatements()

        val responseFuture =
            cashFlowStatementServiceAsync.getInstrumentCashFlowStatements(
                CashFlowStatementGetInstrumentCashFlowStatementsParams.builder()
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
