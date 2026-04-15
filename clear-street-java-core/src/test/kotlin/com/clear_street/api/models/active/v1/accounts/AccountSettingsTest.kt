// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountSettingsTest {

    @Test
    fun create() {
        val accountSettings =
            AccountSettings.builder()
                .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                .build()

        assertThat(accountSettings.risk())
            .contains(RiskSettings.builder().maxNotional("5000000.00").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountSettings =
            AccountSettings.builder()
                .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                .build()

        val roundtrippedAccountSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountSettings),
                jacksonTypeRef<AccountSettings>(),
            )

        assertThat(roundtrippedAccountSettings).isEqualTo(accountSettings)
    }
}
