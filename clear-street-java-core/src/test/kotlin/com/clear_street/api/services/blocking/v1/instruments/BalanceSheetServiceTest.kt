// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BalanceSheetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentBalanceSheetStatements() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val balanceSheetService = client.v1().instruments().balanceSheets()

        val response =
            balanceSheetService.getInstrumentBalanceSheetStatements(
                BalanceSheetGetInstrumentBalanceSheetStatementsParams.builder()
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
