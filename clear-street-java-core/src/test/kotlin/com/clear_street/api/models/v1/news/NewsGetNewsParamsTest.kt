// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.news

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewsGetNewsParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("exclude_publishers", "exclude_publishers")
                    .put("from", "from")
                    .put("include_publishers", "include_publishers")
                    .put("instrument_ids[0]", "string")
                    .put("news_type", "NEWS")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("search_query", "search_query")
                    .put("sectors[0]", "BASIC_MATERIALS")
                    .put("to", "to")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NewsGetNewsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
