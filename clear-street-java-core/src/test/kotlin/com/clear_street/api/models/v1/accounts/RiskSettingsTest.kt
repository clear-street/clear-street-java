// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RiskSettingsTest {

    @Test
    fun create() {
        val riskSettings = RiskSettings.builder().maxNotional("1000000.00").build()

        assertThat(riskSettings.maxNotional()).contains("1000000.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val riskSettings = RiskSettings.builder().maxNotional("1000000.00").build()

        val roundtrippedRiskSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(riskSettings),
                jacksonTypeRef<RiskSettings>(),
            )

        assertThat(roundtrippedRiskSettings).isEqualTo(riskSettings)
    }
}
