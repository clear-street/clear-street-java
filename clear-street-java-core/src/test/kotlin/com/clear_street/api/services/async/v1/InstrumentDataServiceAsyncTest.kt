// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.instrumentdata.AllEventsEventType
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetAllInstrumentEventsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentAnalystConsensusParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentBalanceSheetStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentCashFlowStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentEventsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentIncomeStatementsParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstrumentDataServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAllInstrumentEvents() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentDataServiceAsync = client.v1().instrumentData()

        val responseFuture =
            instrumentDataServiceAsync.getAllInstrumentEvents(
                InstrumentDataGetAllInstrumentEventsParams.builder()
                    .addEventType(AllEventsEventType.EARNINGS)
                    .fromDate("from_date")
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentAnalystConsensus() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentDataServiceAsync = client.v1().instrumentData()

        val responseFuture =
            instrumentDataServiceAsync.getInstrumentAnalystConsensus(
                InstrumentDataGetInstrumentAnalystConsensusParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentBalanceSheetStatements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentDataServiceAsync = client.v1().instrumentData()

        val responseFuture =
            instrumentDataServiceAsync.getInstrumentBalanceSheetStatements(
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentCashFlowStatements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentDataServiceAsync = client.v1().instrumentData()

        val responseFuture =
            instrumentDataServiceAsync.getInstrumentCashFlowStatements(
                InstrumentDataGetInstrumentCashFlowStatementsParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentEvents() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentDataServiceAsync = client.v1().instrumentData()

        val responseFuture =
            instrumentDataServiceAsync.getInstrumentEvents(
                InstrumentDataGetInstrumentEventsParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentFundamentals() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentDataServiceAsync = client.v1().instrumentData()

        val responseFuture =
            instrumentDataServiceAsync.getInstrumentFundamentals(
                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentIncomeStatements() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instrumentDataServiceAsync = client.v1().instrumentData()

        val responseFuture =
            instrumentDataServiceAsync.getInstrumentIncomeStatements(
                InstrumentDataGetInstrumentIncomeStatementsParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
