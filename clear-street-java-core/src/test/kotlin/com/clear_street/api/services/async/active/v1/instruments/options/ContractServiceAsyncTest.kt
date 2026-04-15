// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments.options

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.ContractType
import com.clear_street.api.models.active.v1.instruments.options.contracts.ContractGetOptionContractsParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContractServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOptionContracts() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contractServiceAsync = client.active().v1().instruments().options().contracts()

        val responseFuture =
            contractServiceAsync.getOptionContracts(
                ContractGetOptionContractsParams.builder()
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

        val response = responseFuture.get()
        response.validate()
    }
}
