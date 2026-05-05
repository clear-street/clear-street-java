// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionParams
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionsParams
import com.clear_street.api.models.v1.accounts.positions.PositionGetPositionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PositionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun closePosition() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val positionService = client.v1().accounts().positions()

        val response =
            positionService.closePosition(
                PositionClosePositionParams.builder()
                    .accountId(0L)
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cancelOrders(false)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun closePositions() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val positionService = client.v1().accounts().positions()

        val response =
            positionService.closePositions(
                PositionClosePositionsParams.builder().accountId(0L).cancelOrders(false).build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPositions() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val positionService = client.v1().accounts().positions()

        val response =
            positionService.getPositions(
                PositionGetPositionsParams.builder()
                    .accountId(0L)
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .sortBy(PositionGetPositionsParams.SortBy.SYMBOL)
                    .sortDirection(PositionGetPositionsParams.SortDirection.ASC)
                    .build()
            )

        response.validate()
    }
}
