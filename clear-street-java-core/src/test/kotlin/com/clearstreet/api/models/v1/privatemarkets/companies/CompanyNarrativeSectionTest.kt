// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyNarrativeSectionTest {

    @Test
    fun create() {
        val companyNarrativeSection =
            CompanyNarrativeSection.builder()
                .body("body")
                .displayOrder(0)
                .title("title")
                .addCitationId("string")
                .build()

        assertThat(companyNarrativeSection.body()).isEqualTo("body")
        assertThat(companyNarrativeSection.displayOrder()).isEqualTo(0)
        assertThat(companyNarrativeSection.title()).isEqualTo("title")
        assertThat(companyNarrativeSection.citationIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyNarrativeSection =
            CompanyNarrativeSection.builder()
                .body("body")
                .displayOrder(0)
                .title("title")
                .addCitationId("string")
                .build()

        val roundtrippedCompanyNarrativeSection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyNarrativeSection),
                jacksonTypeRef<CompanyNarrativeSection>(),
            )

        assertThat(roundtrippedCompanyNarrativeSection).isEqualTo(companyNarrativeSection)
    }
}
