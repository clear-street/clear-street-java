// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyLegalEntityTest {

    @Test
    fun create() {
        val companyLegalEntity =
            CompanyLegalEntity.builder().country("country").name("name").build()

        assertThat(companyLegalEntity.country()).isEqualTo("country")
        assertThat(companyLegalEntity.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyLegalEntity =
            CompanyLegalEntity.builder().country("country").name("name").build()

        val roundtrippedCompanyLegalEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyLegalEntity),
                jacksonTypeRef<CompanyLegalEntity>(),
            )

        assertThat(roundtrippedCompanyLegalEntity).isEqualTo(companyLegalEntity)
    }
}
