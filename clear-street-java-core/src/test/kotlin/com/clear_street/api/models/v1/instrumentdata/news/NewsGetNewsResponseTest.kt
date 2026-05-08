// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.news

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewsGetNewsResponseTest {

    @Test
    fun create() {
        val newsGetNewsResponse =
            NewsGetNewsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
                    NewsItem.builder()
                        .addInstrument(
                            NewsInstrument.builder()
                                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                                .name("Apple Inc.")
                                .symbol("AAPL")
                                .build()
                        )
                        .newsType(NewsType.NEWS)
                        .publishedAt(OffsetDateTime.parse("2025-01-30T16:30:00.000000000Z"))
                        .publisher("Business Wire")
                        .title("Apple reports first quarter results")
                        .url(
                            "https://www.businesswire.com/news/home/20250130261281/en/Apple-reports-first-quarter-results/"
                        )
                        .imageUrl(
                            "https://images.financialmodelingprep.com/news/apple-reports-first-quarter-results-20250130.jpg"
                        )
                        .site("businesswire.com")
                        .text(
                            "CUPERTINO, Calif.--(BUSINESS WIRE)--Apple today announced financial results..."
                        )
                        .build()
                )
                .build()

        assertThat(newsGetNewsResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(newsGetNewsResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(newsGetNewsResponse.data())
            .containsExactly(
                NewsItem.builder()
                    .addInstrument(
                        NewsInstrument.builder()
                            .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                            .name("Apple Inc.")
                            .symbol("AAPL")
                            .build()
                    )
                    .newsType(NewsType.NEWS)
                    .publishedAt(OffsetDateTime.parse("2025-01-30T16:30:00.000000000Z"))
                    .publisher("Business Wire")
                    .title("Apple reports first quarter results")
                    .url(
                        "https://www.businesswire.com/news/home/20250130261281/en/Apple-reports-first-quarter-results/"
                    )
                    .imageUrl(
                        "https://images.financialmodelingprep.com/news/apple-reports-first-quarter-results-20250130.jpg"
                    )
                    .site("businesswire.com")
                    .text(
                        "CUPERTINO, Calif.--(BUSINESS WIRE)--Apple today announced financial results..."
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newsGetNewsResponse =
            NewsGetNewsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
                    NewsItem.builder()
                        .addInstrument(
                            NewsInstrument.builder()
                                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                                .name("Apple Inc.")
                                .symbol("AAPL")
                                .build()
                        )
                        .newsType(NewsType.NEWS)
                        .publishedAt(OffsetDateTime.parse("2025-01-30T16:30:00.000000000Z"))
                        .publisher("Business Wire")
                        .title("Apple reports first quarter results")
                        .url(
                            "https://www.businesswire.com/news/home/20250130261281/en/Apple-reports-first-quarter-results/"
                        )
                        .imageUrl(
                            "https://images.financialmodelingprep.com/news/apple-reports-first-quarter-results-20250130.jpg"
                        )
                        .site("businesswire.com")
                        .text(
                            "CUPERTINO, Calif.--(BUSINESS WIRE)--Apple today announced financial results..."
                        )
                        .build()
                )
                .build()

        val roundtrippedNewsGetNewsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newsGetNewsResponse),
                jacksonTypeRef<NewsGetNewsResponse>(),
            )

        assertThat(roundtrippedNewsGetNewsResponse).isEqualTo(newsGetNewsResponse)
    }
}
