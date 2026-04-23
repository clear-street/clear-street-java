// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts.locates

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.accounts.locates.inventory.InventoryGetLocateInventoryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InventoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocateInventory() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val inventoryService = client.active().v1().accounts().locates().inventory()

        val response =
            inventoryService.getLocateInventory(
                InventoryGetLocateInventoryParams.builder().accountId(0L).symbol("symbol").build()
            )

        response.validate()
    }
}
