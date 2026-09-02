// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricUnit
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricValueType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyMetricSeriesTest {

    @Test
    fun create() {
        val companyMetricSeries =
            CompanyMetricSeries.builder()
                .frequency(MetricFrequency.YEAR)
                .label("label")
                .metricKey(MetricKey.ANNUALIZED_REVENUE)
                .source("source")
                .unit(MetricUnit.USD)
                .externalId("external_id")
                .addPoint(
                    CompanyMetricPoint.builder()
                        .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("0.42")
                        .valueType(MetricValueType.HISTORICAL)
                        .addCitationId("string")
                        .sourceEventId("source_event_id")
                        .sourceMetadata(
                            CompanyMetricPoint.SourceMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .sourceUrl("source_url")
                .build()

        assertThat(companyMetricSeries.frequency()).isEqualTo(MetricFrequency.YEAR)
        assertThat(companyMetricSeries.label()).isEqualTo("label")
        assertThat(companyMetricSeries.metricKey()).isEqualTo(MetricKey.ANNUALIZED_REVENUE)
        assertThat(companyMetricSeries.source()).isEqualTo("source")
        assertThat(companyMetricSeries.unit()).isEqualTo(MetricUnit.USD)
        assertThat(companyMetricSeries.externalId()).contains("external_id")
        assertThat(companyMetricSeries.points().getOrNull())
            .containsExactly(
                CompanyMetricPoint.builder()
                    .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value("0.42")
                    .valueType(MetricValueType.HISTORICAL)
                    .addCitationId("string")
                    .sourceEventId("source_event_id")
                    .sourceMetadata(
                        CompanyMetricPoint.SourceMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(companyMetricSeries.sourceUrl()).contains("source_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyMetricSeries =
            CompanyMetricSeries.builder()
                .frequency(MetricFrequency.YEAR)
                .label("label")
                .metricKey(MetricKey.ANNUALIZED_REVENUE)
                .source("source")
                .unit(MetricUnit.USD)
                .externalId("external_id")
                .addPoint(
                    CompanyMetricPoint.builder()
                        .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("0.42")
                        .valueType(MetricValueType.HISTORICAL)
                        .addCitationId("string")
                        .sourceEventId("source_event_id")
                        .sourceMetadata(
                            CompanyMetricPoint.SourceMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .sourceUrl("source_url")
                .build()

        val roundtrippedCompanyMetricSeries =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyMetricSeries),
                jacksonTypeRef<CompanyMetricSeries>(),
            )

        assertThat(roundtrippedCompanyMetricSeries).isEqualTo(companyMetricSeries)
    }
}
