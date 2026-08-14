// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingKeyRiskTest {

    @Test
    fun create() {
        val offeringKeyRisk =
            OfferingKeyRisk.builder().body("body").title("title").addCitationId("string").build()

        assertThat(offeringKeyRisk.body()).isEqualTo("body")
        assertThat(offeringKeyRisk.title()).isEqualTo("title")
        assertThat(offeringKeyRisk.citationIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringKeyRisk =
            OfferingKeyRisk.builder().body("body").title("title").addCitationId("string").build()

        val roundtrippedOfferingKeyRisk =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringKeyRisk),
                jacksonTypeRef<OfferingKeyRisk>(),
            )

        assertThat(roundtrippedOfferingKeyRisk).isEqualTo(offeringKeyRisk)
    }
}
