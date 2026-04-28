// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BalanceSheetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentBalanceSheetStatements() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val balanceSheetService = client.active().v1().instruments().balanceSheets()

        val response =
            balanceSheetService.getInstrumentBalanceSheetStatements(
                BalanceSheetGetInstrumentBalanceSheetStatementsParams.builder()
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
