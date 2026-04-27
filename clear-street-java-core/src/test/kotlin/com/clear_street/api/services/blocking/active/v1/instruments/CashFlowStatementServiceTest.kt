// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CashFlowStatementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentCashFlowStatements() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val cashFlowStatementService = client.active().v1().instruments().cashFlowStatements()

        val response =
            cashFlowStatementService.getInstrumentCashFlowStatements(
                CashFlowStatementGetInstrumentCashFlowStatementsParams.builder()
                    .securityIdSource(SecurityIdSource.CMS)
                    .securityId("security_id")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }
}
