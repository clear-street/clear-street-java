// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingCompanyTest {

    @Test
    fun create() {
        val offeringCompany =
            OfferingCompany.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .shortDescription("short_description")
                .slug("slug")
                .logoUrl("logo_url")
                .primaryDomain("primary_domain")
                .build()

        assertThat(offeringCompany.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offeringCompany.name()).isEqualTo("name")
        assertThat(offeringCompany.shortDescription()).isEqualTo("short_description")
        assertThat(offeringCompany.slug()).isEqualTo("slug")
        assertThat(offeringCompany.logoUrl()).contains("logo_url")
        assertThat(offeringCompany.primaryDomain()).contains("primary_domain")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringCompany =
            OfferingCompany.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .shortDescription("short_description")
                .slug("slug")
                .logoUrl("logo_url")
                .primaryDomain("primary_domain")
                .build()

        val roundtrippedOfferingCompany =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringCompany),
                jacksonTypeRef<OfferingCompany>(),
            )

        assertThat(roundtrippedOfferingCompany).isEqualTo(offeringCompany)
    }
}
