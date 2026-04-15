// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnalystReportingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentAnalystConsensus() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analystReportingServiceAsync = client.active().v1().instruments().analystReporting()

        val responseFuture =
            analystReportingServiceAsync.getInstrumentAnalystConsensus(
                AnalystReportingGetInstrumentAnalystConsensusParams.builder()
                    .securityIdSource(SecurityIdSource.CMS)
                    .securityId("security_id")
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
