// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingHighlightTest {

    @Test
    fun create() {
        val offeringHighlight =
            OfferingHighlight.builder()
                .label("label")
                .metricKey("metric_key")
                .unit(MetricUnit.USD)
                .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value("0.42")
                .valueType(MetricValueType.HISTORICAL)
                .build()

        assertThat(offeringHighlight.label()).isEqualTo("label")
        assertThat(offeringHighlight.metricKey()).isEqualTo("metric_key")
        assertThat(offeringHighlight.unit()).isEqualTo(MetricUnit.USD)
        assertThat(offeringHighlight.observedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(offeringHighlight.value()).contains("0.42")
        assertThat(offeringHighlight.valueType()).contains(MetricValueType.HISTORICAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringHighlight =
            OfferingHighlight.builder()
                .label("label")
                .metricKey("metric_key")
                .unit(MetricUnit.USD)
                .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value("0.42")
                .valueType(MetricValueType.HISTORICAL)
                .build()

        val roundtrippedOfferingHighlight =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringHighlight),
                jacksonTypeRef<OfferingHighlight>(),
            )

        assertThat(roundtrippedOfferingHighlight).isEqualTo(offeringHighlight)
    }
}
