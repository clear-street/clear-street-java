// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentAnalystConsensusParamsTest {

    @Test
    fun create() {
        InstrumentDataGetInstrumentAnalystConsensusParams.builder()
            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .from(LocalDate.parse("2019-12-27"))
            .to(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InstrumentDataGetInstrumentAnalystConsensusParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentDataGetInstrumentAnalystConsensusParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
            InstrumentDataGetInstrumentAnalystConsensusParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
