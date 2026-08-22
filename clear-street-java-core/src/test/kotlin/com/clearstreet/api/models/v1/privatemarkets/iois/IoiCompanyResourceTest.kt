// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IoiCompanyResourceTest {

    @Test
    fun create() {
        val ioiCompanyResource =
            IoiCompanyResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        assertThat(ioiCompanyResource.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ioiCompanyResource.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ioiCompanyResource =
            IoiCompanyResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        val roundtrippedIoiCompanyResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ioiCompanyResource),
                jacksonTypeRef<IoiCompanyResource>(),
            )

        assertThat(roundtrippedIoiCompanyResource).isEqualTo(ioiCompanyResource)
    }
}
