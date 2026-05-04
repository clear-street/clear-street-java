// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnalystReportingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentAnalystConsensus() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analystReportingServiceAsync = client.v1().instruments().analystReporting()

        val responseFuture =
            analystReportingServiceAsync.getInstrumentAnalystConsensus(
                AnalystReportingGetInstrumentAnalystConsensusParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
