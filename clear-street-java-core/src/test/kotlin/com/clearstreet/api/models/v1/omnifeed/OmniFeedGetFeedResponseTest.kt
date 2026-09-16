// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omnifeed

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OmniFeedGetFeedResponseTest {

    @Test
    fun create() {
        val omniFeedGetFeedResponse =
            OmniFeedGetFeedResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
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
                .data(
                    FeedPage.builder()
                        .addItem(
                            FeedItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .headline("headline")
                                .kind(FeedItemKind.EARNINGS)
                                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .summary("summary")
                                .metric(
                                    FeedItemMetric.builder()
                                        .type(FeedMetricType.EPS_ESTIMATE)
                                        .value("value")
                                        .build()
                                )
                                .occursAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .nextCursor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(omniFeedGetFeedResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(1)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(42L)
                    .totalPages(5)
                    .build()
            )
        assertThat(omniFeedGetFeedResponse.error())
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
        assertThat(omniFeedGetFeedResponse.data())
            .isEqualTo(
                FeedPage.builder()
                    .addItem(
                        FeedItem.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .headline("headline")
                            .kind(FeedItemKind.EARNINGS)
                            .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .summary("summary")
                            .metric(
                                FeedItemMetric.builder()
                                    .type(FeedMetricType.EPS_ESTIMATE)
                                    .value("value")
                                    .build()
                            )
                            .occursAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .nextCursor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val omniFeedGetFeedResponse =
            OmniFeedGetFeedResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
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
                .data(
                    FeedPage.builder()
                        .addItem(
                            FeedItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .headline("headline")
                                .kind(FeedItemKind.EARNINGS)
                                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .summary("summary")
                                .metric(
                                    FeedItemMetric.builder()
                                        .type(FeedMetricType.EPS_ESTIMATE)
                                        .value("value")
                                        .build()
                                )
                                .occursAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .nextCursor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedOmniFeedGetFeedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(omniFeedGetFeedResponse),
                jacksonTypeRef<OmniFeedGetFeedResponse>(),
            )

        assertThat(roundtrippedOmniFeedGetFeedResponse).isEqualTo(omniFeedGetFeedResponse)
    }
}
