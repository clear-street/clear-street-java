// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyPersonTest {

    @Test
    fun create() {
        val companyPerson =
            CompanyPerson.builder()
                .name("name")
                .externalId("external_id")
                .addRole(CompanyPersonRole.FOUNDER)
                .build()

        assertThat(companyPerson.name()).isEqualTo("name")
        assertThat(companyPerson.externalId()).contains("external_id")
        assertThat(companyPerson.roles().getOrNull()).containsExactly(CompanyPersonRole.FOUNDER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyPerson =
            CompanyPerson.builder()
                .name("name")
                .externalId("external_id")
                .addRole(CompanyPersonRole.FOUNDER)
                .build()

        val roundtrippedCompanyPerson =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyPerson),
                jacksonTypeRef<CompanyPerson>(),
            )

        assertThat(roundtrippedCompanyPerson).isEqualTo(companyPerson)
    }
}
