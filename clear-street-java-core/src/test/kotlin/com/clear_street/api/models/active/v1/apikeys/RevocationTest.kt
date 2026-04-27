// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.apikeys

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RevocationTest {

    @Test
    fun create() {
        val revocation =
            Revocation.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(revocation.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(revocation.revokedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val revocation =
            Revocation.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRevocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(revocation),
                jacksonTypeRef<Revocation>(),
            )

        assertThat(roundtrippedRevocation).isEqualTo(revocation)
    }
}
