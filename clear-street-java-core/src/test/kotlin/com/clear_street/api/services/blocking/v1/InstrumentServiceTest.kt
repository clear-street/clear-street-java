// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstrumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val instrumentService = client.v1().instruments()

        val response =
            instrumentService.getInstrumentById(
                InstrumentGetInstrumentByIdParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeOptionsExpiryDates(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstruments() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val instrumentService = client.v1().instruments()

        val response =
            instrumentService.getInstruments(
                InstrumentGetInstrumentsParams.builder()
                    .easyToBorrow(true)
                    .idFilter("id_filter")
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val instrumentService = client.v1().instruments()

        val response =
            instrumentService.search(
                InstrumentSearchParams.builder()
                    .q("q")
                    .assetClass("asset_class")
                    .country("country")
                    .currency("currency")
                    .cursor("cursor")
                    .includeInactive(true)
                    .includeRestricted(true)
                    .limit(0L)
                    .build()
            )

        response.validate()
    }
}
