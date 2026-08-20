// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FieldColumnsTest {

    @Test
    fun create() {
        val fieldColumns =
            FieldColumns.builder()
                .addDescription("string")
                .addDisplayName("string")
                .addKind(0)
                .addName("string")
                .build()

        assertThat(fieldColumns.description()).containsExactly("string")
        assertThat(fieldColumns.displayName()).containsExactly("string")
        assertThat(fieldColumns.kind()).containsExactly(0)
        assertThat(fieldColumns.name()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fieldColumns =
            FieldColumns.builder()
                .addDescription("string")
                .addDisplayName("string")
                .addKind(0)
                .addName("string")
                .build()

        val roundtrippedFieldColumns =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fieldColumns),
                jacksonTypeRef<FieldColumns>(),
            )

        assertThat(roundtrippedFieldColumns).isEqualTo(fieldColumns)
    }
}
