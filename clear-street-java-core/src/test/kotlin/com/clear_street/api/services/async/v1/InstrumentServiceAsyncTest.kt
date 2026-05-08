// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.instruments.ContractType
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentGetOptionContractsParams
import com.clear_street.api.models.v1.instruments.InstrumentSearchInstrumentsParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstrumentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getInstrumentById(
                InstrumentGetInstrumentByIdParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeOptionsExpiryDates(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstruments() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getInstruments(
                InstrumentGetInstrumentsParams.builder()
                    .easyToBorrow(true)
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instrumentType(InstrumentGetInstrumentsParams.InstrumentType.COMMON_STOCK)
                    .isLiquidationOnly(true)
                    .isMarginable(true)
                    .isRestricted(true)
                    .isShortProhibited(true)
                    .isThresholdSecurity(true)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOptionContracts() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getOptionContracts(
                InstrumentGetOptionContractsParams.builder()
                    .contractType(ContractType.CALL)
                    .expiry(LocalDate.parse("2019-12-27"))
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .underlier("underlier")
                    .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchInstruments() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.searchInstruments(
                InstrumentSearchInstrumentsParams.builder()
                    .q("q")
                    .assetClass("asset_class")
                    .country("country")
                    .currency("currency")
                    .includeInactive(true)
                    .includeRestricted(true)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
