// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.ContractType
import com.clear_street.api.models.active.v1.instruments.options.OptionContractsParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun contracts() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val optionService = client.active().v1().instruments().options()

        val response =
            optionService.contracts(
                OptionContractsParams.builder()
                    .contractType(ContractType.CALL)
                    .expiry(LocalDate.parse("2019-12-27"))
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .underlier("underlier")
                    .underlierInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .underlierSecurityId("underlier_security_id")
                    .underlierSecurityIdSource(SecurityIdSource.CMS)
                    .build()
            )

        response.validate()
    }
}
