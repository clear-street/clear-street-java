// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IoiOfferingResourceTest {

    @Test
    fun create() {
        val ioiOfferingResource =
            IoiOfferingResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headline("headline")
                .build()

        assertThat(ioiOfferingResource.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ioiOfferingResource.headline()).isEqualTo("headline")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ioiOfferingResource =
            IoiOfferingResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headline("headline")
                .build()

        val roundtrippedIoiOfferingResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ioiOfferingResource),
                jacksonTypeRef<IoiOfferingResource>(),
            )

        assertThat(roundtrippedIoiOfferingResource).isEqualTo(ioiOfferingResource)
    }
}
