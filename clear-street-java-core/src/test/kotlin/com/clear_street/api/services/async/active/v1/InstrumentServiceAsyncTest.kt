// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.active.v1.instruments.InstrumentSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstrumentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentServiceAsync = client.active().v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getInstrumentById(
                InstrumentGetInstrumentByIdParams.builder()
                    .securityIdSource(SecurityIdSource.CMS)
                    .securityId("security_id")
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
        val instrumentServiceAsync = client.active().v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getInstruments(
                InstrumentGetInstrumentsParams.builder()
                    .easyToBorrow(true)
                    .idFilter("id_filter")
                    .instrumentType(InstrumentGetInstrumentsParams.InstrumentType.COMMON_STOCK)
                    .isLiquidationOnly(true)
                    .isMarginable(true)
                    .isRestricted(true)
                    .isShortProhibited(true)
                    .isThresholdSecurity(true)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentServiceAsync = client.active().v1().instruments()

        val responseFuture =
            instrumentServiceAsync.search(
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

        val response = responseFuture.get()
        response.validate()
    }
}
