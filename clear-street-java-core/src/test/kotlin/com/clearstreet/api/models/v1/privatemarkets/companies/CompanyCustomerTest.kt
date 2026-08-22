// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCustomerTest {

    @Test
    fun create() {
        val companyCustomer = CompanyCustomer.builder().name("name").logoUrl("logo_url").build()

        assertThat(companyCustomer.name()).isEqualTo("name")
        assertThat(companyCustomer.logoUrl()).contains("logo_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyCustomer = CompanyCustomer.builder().name("name").logoUrl("logo_url").build()

        val roundtrippedCompanyCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyCustomer),
                jacksonTypeRef<CompanyCustomer>(),
            )

        assertThat(roundtrippedCompanyCustomer).isEqualTo(companyCustomer)
    }
}
