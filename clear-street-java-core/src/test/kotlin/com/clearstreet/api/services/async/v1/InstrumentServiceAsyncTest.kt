// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetOptionContractsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionEventsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionMarketsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionSeriesParams
import com.clearstreet.api.models.v1.instruments.InstrumentSearchInstrumentsParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InstrumentServiceAsyncTest {

    @Test
    fun getInstrumentById() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getInstrumentById(
                InstrumentGetInstrumentByIdParams.builder()
                    .instrumentId("x")
                    .includeOptionsExpiryDates(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getInstruments() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getInstruments(
                InstrumentGetInstrumentsParams.builder()
                    .easyToBorrow(true)
                    .addInstrumentId("x")
                    .instrumentType(InstrumentGetInstrumentsParams.InstrumentType.COMMON_STOCK)
                    .isLiquidationOnly(true)
                    .isMarginable(true)
                    .isPtp(true)
                    .isShortProhibited(true)
                    .isThresholdSecurity(true)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getOptionContracts() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getOptionContracts(
                InstrumentGetOptionContractsParams.builder()
                    .addContractId("x")
                    .contractType(InstrumentGetOptionContractsParams.ContractType.CALL)
                    .expiry(LocalDate.parse("2019-12-27"))
                    .isSettleOnOpen(true)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .root("root")
                    .underlier("underlier")
                    .underlyingInstrumentId("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPredictionCategories() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture = instrumentServiceAsync.getPredictionCategories()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPredictionEvents() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getPredictionEvents(
                InstrumentGetPredictionEventsParams.builder()
                    .categories("categories")
                    .closeAt(
                        InstrumentGetPredictionEventsParams.CloseAt.builder()
                            .gt("gt")
                            .gte("gte")
                            .lt("lt")
                            .lte("lte")
                            .build()
                    )
                    .includeMarkets(true)
                    .includeSettled(true)
                    .marketIds("market_ids")
                    .openAt(
                        InstrumentGetPredictionEventsParams.OpenAt.builder()
                            .gt("gt")
                            .gte("gte")
                            .lt("lt")
                            .lte("lte")
                            .build()
                    )
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .search("search")
                    .seriesCodes("series_codes")
                    .sortBy(InstrumentGetPredictionEventsParams.SortBy.OPEN_AT)
                    .sortDirection(InstrumentGetPredictionEventsParams.SortDirection.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPredictionMarkets() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getPredictionMarkets(
                InstrumentGetPredictionMarketsParams.builder()
                    .eventCode("event_code")
                    .marketIds("market_ids")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .statuses("statuses")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPredictionSeries() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.getPredictionSeries(
                InstrumentGetPredictionSeriesParams.builder()
                    .categories("categories")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun searchInstruments() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentServiceAsync = client.v1().instruments()

        val responseFuture =
            instrumentServiceAsync.searchInstruments(
                InstrumentSearchInstrumentsParams.builder()
                    .q("q")
                    .assetClass("asset_class")
                    .country("country")
                    .currency("currency")
                    .includeInactive(true)
                    .includePtp(true)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
