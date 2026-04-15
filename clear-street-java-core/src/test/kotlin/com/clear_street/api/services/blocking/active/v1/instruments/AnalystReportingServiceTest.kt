// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnalystReportingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentAnalystConsensus() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val analystReportingService = client.active().v1().instruments().analystReporting()

        val response =
            analystReportingService.getInstrumentAnalystConsensus(
                AnalystReportingGetInstrumentAnalystConsensusParams.builder()
                    .securityIdSource(SecurityIdSource.CMS)
                    .securityId("security_id")
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
