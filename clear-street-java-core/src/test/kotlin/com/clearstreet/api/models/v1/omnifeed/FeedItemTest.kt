// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omnifeed

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedItemTest {

    @Test
    fun create() {
        val feedItem =
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

        assertThat(feedItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(feedItem.headline()).isEqualTo("headline")
        assertThat(feedItem.kind()).isEqualTo(FeedItemKind.EARNINGS)
        assertThat(feedItem.publishedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedItem.summary()).isEqualTo("summary")
        assertThat(feedItem.metric())
            .contains(
                FeedItemMetric.builder().type(FeedMetricType.EPS_ESTIMATE).value("value").build()
            )
        assertThat(feedItem.occursAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedItem =
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

        val roundtrippedFeedItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedItem),
                jacksonTypeRef<FeedItem>(),
            )

        assertThat(roundtrippedFeedItem).isEqualTo(feedItem)
    }
}
