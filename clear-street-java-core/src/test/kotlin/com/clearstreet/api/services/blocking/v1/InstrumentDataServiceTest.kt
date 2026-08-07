// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.instrumentdata.AllEventsEventType
import com.clearstreet.api.models.v1.instrumentdata.InstrumentDataGetAllInstrumentEventsParams
import com.clearstreet.api.models.v1.instrumentdata.InstrumentDataGetInstrumentAnalystConsensusParams
import com.clearstreet.api.models.v1.instrumentdata.InstrumentDataGetInstrumentBalanceSheetStatementsParams
import com.clearstreet.api.models.v1.instrumentdata.InstrumentDataGetInstrumentCashFlowStatementsParams
import com.clearstreet.api.models.v1.instrumentdata.InstrumentDataGetInstrumentEventsParams
import com.clearstreet.api.models.v1.instrumentdata.InstrumentDataGetInstrumentIncomeStatementsParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InstrumentDataServiceTest {

    @Test
    fun getAllInstrumentEvents() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentDataService = client.v1().instrumentData()

        val response =
            instrumentDataService.getAllInstrumentEvents(
                InstrumentDataGetAllInstrumentEventsParams.builder()
                    .addEventType(AllEventsEventType.EARNINGS)
                    .fromDate("from_date")
                    .addInstrumentId("x")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Test
    fun getInstrumentAnalystConsensus() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentDataService = client.v1().instrumentData()

        val response =
            instrumentDataService.getInstrumentAnalystConsensus(
                InstrumentDataGetInstrumentAnalystConsensusParams.builder()
                    .instrumentId("x")
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }

    @Test
    fun getInstrumentBalanceSheetStatements() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentDataService = client.v1().instrumentData()

        val response =
            instrumentDataService.getInstrumentBalanceSheetStatements(
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.builder()
                    .instrumentId("x")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Test
    fun getInstrumentCashFlowStatements() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentDataService = client.v1().instrumentData()

        val response =
            instrumentDataService.getInstrumentCashFlowStatements(
                InstrumentDataGetInstrumentCashFlowStatementsParams.builder()
                    .instrumentId("x")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Test
    fun getInstrumentEvents() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentDataService = client.v1().instrumentData()

        val response =
            instrumentDataService.getInstrumentEvents(
                InstrumentDataGetInstrumentEventsParams.builder()
                    .instrumentId("x")
                    .addEventType(AllEventsEventType.EARNINGS)
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Test
    fun getInstrumentFundamentals() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentDataService = client.v1().instrumentData()

        val response = instrumentDataService.getInstrumentFundamentals("x")

        response.validate()
    }

    @Test
    fun getInstrumentIncomeStatements() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instrumentDataService = client.v1().instrumentData()

        val response =
            instrumentDataService.getInstrumentIncomeStatements(
                InstrumentDataGetInstrumentIncomeStatementsParams.builder()
                    .instrumentId("x")
                    .fromDate("from_date")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }
}
