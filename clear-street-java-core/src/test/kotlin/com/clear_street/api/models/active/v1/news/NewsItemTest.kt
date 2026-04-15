// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.news

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewsItemTest {

    @Test
    fun create() {
        val newsItem =
            NewsItem.builder()
                .addInstrument(
                    NewsInstrument.builder()
                        .securityId("AAPL")
                        .securityIdSource(SecurityIdSource.CMS)
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .name("Apple Inc.")
                        .symbol("AAPL")
                        .build()
                )
                .addInstrument(
                    NewsInstrument.builder()
                        .securityId("037833100")
                        .securityIdSource(SecurityIdSource.CUSIP)
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .name("name")
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

        assertThat(newsItem.instruments())
            .containsExactly(
                NewsInstrument.builder()
                    .securityId("AAPL")
                    .securityIdSource(SecurityIdSource.CMS)
                    .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .name("Apple Inc.")
                    .symbol("AAPL")
                    .build(),
                NewsInstrument.builder()
                    .securityId("037833100")
                    .securityIdSource(SecurityIdSource.CUSIP)
                    .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .name("name")
                    .symbol("AAPL")
                    .build(),
            )
        assertThat(newsItem.newsType()).isEqualTo(NewsType.NEWS)
        assertThat(newsItem.publishedAt())
            .isEqualTo(OffsetDateTime.parse("2025-01-30T16:30:00.000000000Z"))
        assertThat(newsItem.publisher()).isEqualTo("Business Wire")
        assertThat(newsItem.title()).isEqualTo("Apple reports first quarter results")
        assertThat(newsItem.url())
            .isEqualTo(
                "https://www.businesswire.com/news/home/20250130261281/en/Apple-reports-first-quarter-results/"
            )
        assertThat(newsItem.imageUrl())
            .contains(
                "https://images.financialmodelingprep.com/news/apple-reports-first-quarter-results-20250130.jpg"
            )
        assertThat(newsItem.site()).contains("businesswire.com")
        assertThat(newsItem.text())
            .contains(
                "CUPERTINO, Calif.--(BUSINESS WIRE)--Apple today announced financial results..."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newsItem =
            NewsItem.builder()
                .addInstrument(
                    NewsInstrument.builder()
                        .securityId("AAPL")
                        .securityIdSource(SecurityIdSource.CMS)
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .name("Apple Inc.")
                        .symbol("AAPL")
                        .build()
                )
                .addInstrument(
                    NewsInstrument.builder()
                        .securityId("037833100")
                        .securityIdSource(SecurityIdSource.CUSIP)
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .name("name")
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

        val roundtrippedNewsItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newsItem),
                jacksonTypeRef<NewsItem>(),
            )

        assertThat(roundtrippedNewsItem).isEqualTo(newsItem)
    }
}
