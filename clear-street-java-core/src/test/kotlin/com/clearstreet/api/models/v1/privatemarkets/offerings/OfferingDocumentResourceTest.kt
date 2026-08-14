// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingDocumentResourceTest {

    @Test
    fun create() {
        val offeringDocumentResource =
            OfferingDocumentResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayOrder(0)
                .documentType(OfferingDocumentType.TEARSHEET)
                .title("title")
                .objectKey("object_key")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .source("source")
                .sourceUrl("source_url")
                .url("url")
                .build()

        assertThat(offeringDocumentResource.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offeringDocumentResource.displayOrder()).isEqualTo(0)
        assertThat(offeringDocumentResource.documentType())
            .isEqualTo(OfferingDocumentType.TEARSHEET)
        assertThat(offeringDocumentResource.title()).isEqualTo("title")
        assertThat(offeringDocumentResource.objectKey()).contains("object_key")
        assertThat(offeringDocumentResource.publishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(offeringDocumentResource.source()).contains("source")
        assertThat(offeringDocumentResource.sourceUrl()).contains("source_url")
        assertThat(offeringDocumentResource.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringDocumentResource =
            OfferingDocumentResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayOrder(0)
                .documentType(OfferingDocumentType.TEARSHEET)
                .title("title")
                .objectKey("object_key")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .source("source")
                .sourceUrl("source_url")
                .url("url")
                .build()

        val roundtrippedOfferingDocumentResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringDocumentResource),
                jacksonTypeRef<OfferingDocumentResource>(),
            )

        assertThat(roundtrippedOfferingDocumentResource).isEqualTo(offeringDocumentResource)
    }
}
