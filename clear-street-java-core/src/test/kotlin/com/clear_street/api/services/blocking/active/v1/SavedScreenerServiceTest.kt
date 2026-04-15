// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerFilter
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerUpdateScreenerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SavedScreenerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createScreener() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val savedScreenerService = client.active().v1().savedScreeners()

        val response =
            savedScreenerService.createScreener(
                SavedScreenerCreateScreenerParams.builder()
                    .addFieldFilter("string")
                    .addFilter(
                        SavedScreenerFilter.builder()
                            .fieldName("field_name")
                            .operation("operation")
                            .value("value")
                            .build()
                    )
                    .name("name")
                    .sortBy("sort_by")
                    .sortDirection(SavedScreenerCreateScreenerParams.SortDirection.ASC)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteScreener() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val savedScreenerService = client.active().v1().savedScreeners()

        savedScreenerService.deleteScreener("550e8400-e29b-41d4-a716-446655440000")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScreenerById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val savedScreenerService = client.active().v1().savedScreeners()

        val response = savedScreenerService.getScreenerById("550e8400-e29b-41d4-a716-446655440000")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listScreeners() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val savedScreenerService = client.active().v1().savedScreeners()

        val response = savedScreenerService.listScreeners()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateScreener() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val savedScreenerService = client.active().v1().savedScreeners()

        val response =
            savedScreenerService.updateScreener(
                SavedScreenerUpdateScreenerParams.builder()
                    .screenerId("550e8400-e29b-41d4-a716-446655440000")
                    .addFieldFilter("string")
                    .addFilter(
                        SavedScreenerFilter.builder()
                            .fieldName("field_name")
                            .operation("operation")
                            .value("value")
                            .build()
                    )
                    .name("name")
                    .sortBy("sort_by")
                    .sortDirection(SavedScreenerUpdateScreenerParams.SortDirection.ASC)
                    .build()
            )

        response.validate()
    }
}
