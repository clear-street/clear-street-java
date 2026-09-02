// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyHeadquartersTest {

    @Test
    fun create() {
        val companyHeadquarters =
            CompanyHeadquarters.builder().city("city").country("country").build()

        assertThat(companyHeadquarters.city()).isEqualTo("city")
        assertThat(companyHeadquarters.country()).isEqualTo("country")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyHeadquarters =
            CompanyHeadquarters.builder().city("city").country("country").build()

        val roundtrippedCompanyHeadquarters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyHeadquarters),
                jacksonTypeRef<CompanyHeadquarters>(),
            )

        assertThat(roundtrippedCompanyHeadquarters).isEqualTo(companyHeadquarters)
    }
}
