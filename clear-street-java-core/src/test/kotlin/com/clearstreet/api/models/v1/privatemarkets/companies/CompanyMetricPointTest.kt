// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricValueType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyMetricPointTest {

    @Test
    fun create() {
        val companyMetricPoint =
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

        assertThat(companyMetricPoint.observedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(companyMetricPoint.value()).isEqualTo("0.42")
        assertThat(companyMetricPoint.valueType()).isEqualTo(MetricValueType.HISTORICAL)
        assertThat(companyMetricPoint.citationIds().getOrNull()).containsExactly("string")
        assertThat(companyMetricPoint.sourceEventId()).contains("source_event_id")
        assertThat(companyMetricPoint.sourceMetadata())
            .contains(
                CompanyMetricPoint.SourceMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyMetricPoint =
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

        val roundtrippedCompanyMetricPoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyMetricPoint),
                jacksonTypeRef<CompanyMetricPoint>(),
            )

        assertThat(roundtrippedCompanyMetricPoint).isEqualTo(companyMetricPoint)
    }
}
