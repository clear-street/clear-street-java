// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyDocumentPreviewTest {

    @Test
    fun create() {
        val companyDocumentPreview =
            CompanyDocumentPreview.builder()
                .description("description")
                .imageUrl("image_url")
                .build()

        assertThat(companyDocumentPreview.description()).contains("description")
        assertThat(companyDocumentPreview.imageUrl()).contains("image_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyDocumentPreview =
            CompanyDocumentPreview.builder()
                .description("description")
                .imageUrl("image_url")
                .build()

        val roundtrippedCompanyDocumentPreview =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyDocumentPreview),
                jacksonTypeRef<CompanyDocumentPreview>(),
            )

        assertThat(roundtrippedCompanyDocumentPreview).isEqualTo(companyDocumentPreview)
    }
}
