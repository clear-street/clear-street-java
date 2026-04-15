// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionsParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionGetPositionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PositionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun closePosition() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.active().v1().accounts().positions()

        val responseFuture =
            positionServiceAsync.closePosition(
                PositionClosePositionParams.builder()
                    .accountId(0L)
                    .securityIdSource(SecurityIdSource.CMS)
                    .securityId("security_id")
                    .cancelOrders(false)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun closePositions() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.active().v1().accounts().positions()

        val responseFuture =
            positionServiceAsync.closePositions(
                PositionClosePositionsParams.builder().accountId(0L).cancelOrders(false).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPositions() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val positionServiceAsync = client.active().v1().accounts().positions()

        val responseFuture =
            positionServiceAsync.getPositions(
                PositionGetPositionsParams.builder()
                    .accountId(0L)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .sortBy(PositionGetPositionsParams.SortBy.SYMBOL)
                    .sortDirection(PositionGetPositionsParams.SortDirection.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
