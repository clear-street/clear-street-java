// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCitationTest {

    @Test
    fun create() {
        val companyCitation =
            CompanyCitation.builder()
                .id("id")
                .source("source")
                .title("title")
                .url("url")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(companyCitation.id()).isEqualTo("id")
        assertThat(companyCitation.source()).isEqualTo("source")
        assertThat(companyCitation.title()).isEqualTo("title")
        assertThat(companyCitation.url()).isEqualTo("url")
        assertThat(companyCitation.publishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyCitation =
            CompanyCitation.builder()
                .id("id")
                .source("source")
                .title("title")
                .url("url")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCompanyCitation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyCitation),
                jacksonTypeRef<CompanyCitation>(),
            )

        assertThat(roundtrippedCompanyCitation).isEqualTo(companyCitation)
    }
}
