// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.apiversion

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionTest {

    @Test
    fun create() {
        val version = Version.builder().version("version").build()

        assertThat(version.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val version = Version.builder().version("version").build()

        val roundtrippedVersion =
            jsonMapper.readValue(jsonMapper.writeValueAsString(version), jacksonTypeRef<Version>())

        assertThat(roundtrippedVersion).isEqualTo(version)
    }
}
