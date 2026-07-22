// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .city("New York")
                .country("USA")
                .line1("4 World Trade Center")
                .postalCode("10007")
                .line2("150 Greenwich Street, Floor 45")
                .state("NY")
                .build()

        assertThat(address.city()).isEqualTo("New York")
        assertThat(address.country()).isEqualTo("USA")
        assertThat(address.line1()).isEqualTo("4 World Trade Center")
        assertThat(address.postalCode()).isEqualTo("10007")
        assertThat(address.line2()).contains("150 Greenwich Street, Floor 45")
        assertThat(address.state()).contains("NY")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .city("New York")
                .country("USA")
                .line1("4 World Trade Center")
                .postalCode("10007")
                .line2("150 Greenwich Street, Floor 45")
                .state("NY")
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
