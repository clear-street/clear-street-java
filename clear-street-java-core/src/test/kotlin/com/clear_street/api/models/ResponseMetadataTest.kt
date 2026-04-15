// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseMetadataTest {

    @Test
    fun create() {
        val responseMetadata =
            ResponseMetadata.builder()
                .requestId("request_id")
                .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                .pageNumber(0)
                .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                .totalItems(0L)
                .totalPages(0)
                .build()

        assertThat(responseMetadata.requestId()).isEqualTo("request_id")
        assertThat(responseMetadata.nextPageToken()).contains("U3RhaW5sZXNzIHJvY2tz")
        assertThat(responseMetadata.pageNumber()).contains(0)
        assertThat(responseMetadata.previousPageToken()).contains("U3RhaW5sZXNzIHJvY2tz")
        assertThat(responseMetadata.totalItems()).contains(0L)
        assertThat(responseMetadata.totalPages()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseMetadata =
            ResponseMetadata.builder()
                .requestId("request_id")
                .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                .pageNumber(0)
                .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                .totalItems(0L)
                .totalPages(0)
                .build()

        val roundtrippedResponseMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseMetadata),
                jacksonTypeRef<ResponseMetadata>(),
            )

        assertThat(roundtrippedResponseMetadata).isEqualTo(responseMetadata)
    }
}
