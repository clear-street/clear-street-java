// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCategoryTest {

    @Test
    fun create() {
        val companyCategory = CompanyCategory.builder().name("name").slug("slug").build()

        assertThat(companyCategory.name()).isEqualTo("name")
        assertThat(companyCategory.slug()).isEqualTo("slug")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyCategory = CompanyCategory.builder().name("name").slug("slug").build()

        val roundtrippedCompanyCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyCategory),
                jacksonTypeRef<CompanyCategory>(),
            )

        assertThat(roundtrippedCompanyCategory).isEqualTo(companyCategory)
    }
}
