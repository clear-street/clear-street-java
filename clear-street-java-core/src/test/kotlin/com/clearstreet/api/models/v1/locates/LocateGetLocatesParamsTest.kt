// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocatesParamsTest {

    @Test
    fun create() {
        LocateGetLocatesParams.builder()
            .accountId(0L)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .addInstrumentId("x")
            .addStatus(LocateGetLocatesParams.Status.REQUESTED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LocateGetLocatesParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LocateGetLocatesParams.builder()
                .accountId(0L)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .addInstrumentId("x")
                .addStatus(LocateGetLocatesParams.Status.REQUESTED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("effective_date", "2019-12-27")
                    .put("instrument_ids", listOf("x").joinToString(","))
                    .put("status", listOf("REQUESTED").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LocateGetLocatesParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
