// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omnifeed

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedItemMetricTest {

    @Test
    fun create() {
        val feedItemMetric =
            FeedItemMetric.builder().type(FeedMetricType.EPS_ESTIMATE).value("value").build()

        assertThat(feedItemMetric.type()).isEqualTo(FeedMetricType.EPS_ESTIMATE)
        assertThat(feedItemMetric.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedItemMetric =
            FeedItemMetric.builder().type(FeedMetricType.EPS_ESTIMATE).value("value").build()

        val roundtrippedFeedItemMetric =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedItemMetric),
                jacksonTypeRef<FeedItemMetric>(),
            )

        assertThat(roundtrippedFeedItemMetric).isEqualTo(feedItemMetric)
    }
}
