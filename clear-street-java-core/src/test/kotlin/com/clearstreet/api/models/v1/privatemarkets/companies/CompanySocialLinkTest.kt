// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanySocialLinkTest {

    @Test
    fun create() {
        val companySocialLink =
            CompanySocialLink.builder().type(CompanySocialType.WEBSITE).url("url").build()

        assertThat(companySocialLink.type()).isEqualTo(CompanySocialType.WEBSITE)
        assertThat(companySocialLink.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companySocialLink =
            CompanySocialLink.builder().type(CompanySocialType.WEBSITE).url("url").build()

        val roundtrippedCompanySocialLink =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companySocialLink),
                jacksonTypeRef<CompanySocialLink>(),
            )

        assertThat(roundtrippedCompanySocialLink).isEqualTo(companySocialLink)
    }
}
