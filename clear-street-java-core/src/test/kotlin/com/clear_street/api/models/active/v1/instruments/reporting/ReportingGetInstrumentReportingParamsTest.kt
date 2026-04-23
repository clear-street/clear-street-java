// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.reporting

import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.active.v1.SecurityIdSource
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportingGetInstrumentReportingParamsTest {

    @Test
    fun create() {
        ReportingGetInstrumentReportingParams.builder()
            .securityIdSource(SecurityIdSource.CMS)
            .securityId("security_id")
            .from(LocalDate.parse("2019-12-27"))
            .to(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReportingGetInstrumentReportingParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("CMS")
        assertThat(params._pathParam(1)).isEqualTo("security_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ReportingGetInstrumentReportingParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .from(LocalDate.parse("2019-12-27"))
                .to(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("from", "2019-12-27").put("to", "2019-12-27").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ReportingGetInstrumentReportingParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
