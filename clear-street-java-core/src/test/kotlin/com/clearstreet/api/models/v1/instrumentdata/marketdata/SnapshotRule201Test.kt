// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotRule201Test {

    @Test
    fun create() {
        val snapshotRule201 = SnapshotRule201.builder().state(Rule201State.RESTRICTED).build()

        assertThat(snapshotRule201.state()).isEqualTo(Rule201State.RESTRICTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotRule201 = SnapshotRule201.builder().state(Rule201State.RESTRICTED).build()

        val roundtrippedSnapshotRule201 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotRule201),
                jacksonTypeRef<SnapshotRule201>(),
            )

        assertThat(roundtrippedSnapshotRule201).isEqualTo(snapshotRule201)
    }
}
