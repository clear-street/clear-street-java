// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerFilter
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SavedScreenerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture =
            savedScreenerServiceAsync.createScreener(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val future =
            savedScreenerServiceAsync.deleteScreener("550e8400-e29b-41d4-a716-446655440000")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScreenerById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture =
            savedScreenerServiceAsync.getScreenerById("550e8400-e29b-41d4-a716-446655440000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScreeners() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture = savedScreenerServiceAsync.getScreeners()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture =
            savedScreenerServiceAsync.replaceScreener(
                SavedScreenerReplaceScreenerParams.builder()
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
                    .sortDirection(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
