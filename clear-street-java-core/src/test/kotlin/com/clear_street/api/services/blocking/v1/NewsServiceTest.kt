// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.news.NewsGetNewsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NewsServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNews() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val newsService = client.v1().news()

        val response =
            newsService.getNews(
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
                    .to("to")
                    .build()
            )

        response.validate()
    }
}
