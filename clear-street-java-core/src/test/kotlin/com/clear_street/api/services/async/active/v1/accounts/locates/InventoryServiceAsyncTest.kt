// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts.locates

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.accounts.locates.inventory.InventoryGetLocateInventoryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InventoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocateInventory() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inventoryServiceAsync = client.active().v1().accounts().locates().inventory()

        val responseFuture =
            inventoryServiceAsync.getLocateInventory(
                InventoryGetLocateInventoryParams.builder().accountId(0L).symbol("symbol").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
