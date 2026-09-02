// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyDocumentResourceTest {

    @Test
    fun create() {
        val companyDocumentResource =
            CompanyDocumentResource.builder()
                .documentType(CompanyDocumentType.COMPANY_PROFILE)
                .relation(CompanyDocumentRelation.SUBJECT)
                .title("title")
                .url("url")
                .externalId("external_id")
                .preview(
                    CompanyDocumentPreview.builder()
                        .description("description")
                        .imageUrl("image_url")
                        .build()
                )
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(companyDocumentResource.documentType())
            .isEqualTo(CompanyDocumentType.COMPANY_PROFILE)
        assertThat(companyDocumentResource.relation()).isEqualTo(CompanyDocumentRelation.SUBJECT)
        assertThat(companyDocumentResource.title()).isEqualTo("title")
        assertThat(companyDocumentResource.url()).isEqualTo("url")
        assertThat(companyDocumentResource.externalId()).contains("external_id")
        assertThat(companyDocumentResource.preview())
            .contains(
                CompanyDocumentPreview.builder()
                    .description("description")
                    .imageUrl("image_url")
                    .build()
            )
        assertThat(companyDocumentResource.publishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyDocumentResource =
            CompanyDocumentResource.builder()
                .documentType(CompanyDocumentType.COMPANY_PROFILE)
                .relation(CompanyDocumentRelation.SUBJECT)
                .title("title")
                .url("url")
                .externalId("external_id")
                .preview(
                    CompanyDocumentPreview.builder()
                        .description("description")
                        .imageUrl("image_url")
                        .build()
                )
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCompanyDocumentResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyDocumentResource),
                jacksonTypeRef<CompanyDocumentResource>(),
            )

        assertThat(roundtrippedCompanyDocumentResource).isEqualTo(companyDocumentResource)
    }
}
