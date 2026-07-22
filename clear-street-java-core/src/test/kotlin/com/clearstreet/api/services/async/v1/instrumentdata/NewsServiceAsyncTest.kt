// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.instrumentdata

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.instrumentdata.news.NewsGetNewsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NewsServiceAsyncTest {

    @Test
    fun getNews() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val newsServiceAsync = client.v1().instrumentData().news()

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
                    .to("to")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
