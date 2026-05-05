// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.instruments.ContractType
import com.clear_street.api.models.v1.instruments.options.OptionGetOptionContractsParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOptionContracts() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val optionService = client.v1().instruments().options()

        val response =
            optionService.getOptionContracts(
                OptionGetOptionContractsParams.builder()
                    .contractType(ContractType.CALL)
                    .expiry(LocalDate.parse("2019-12-27"))
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .underlier("underlier")
                    .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
