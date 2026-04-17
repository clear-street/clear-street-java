// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.news.NewsGetNewsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NewsServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNews() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val newsServiceAsync = client.active().v1().news()

        val responseFuture =
            newsServiceAsync.getNews(
                NewsGetNewsParams.builder()
                    .excludePublishers("exclude_publishers")
                    .from("from")
                    .includePublishers("include_publishers")
                    .addInstrumentId("string")
                    .newsType(NewsGetNewsParams.NewsType.NEWS)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .searchQuery("search_query")
                    .addSector(NewsGetNewsParams.Sector.BASIC_MATERIALS)
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .to("to")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
