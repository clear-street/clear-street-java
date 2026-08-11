// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetOptionContractsParamsTest {

    @Test
    fun create() {
        InstrumentGetOptionContractsParams.builder()
            .addContractId("x")
            .contractType(InstrumentGetOptionContractsParams.ContractType.CALL)
            .expiry(LocalDate.parse("2019-12-27"))
            .isSettleOnOpen(true)
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .underlier("underlier")
            .underlyingInstrumentId("x")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetOptionContractsParams.builder()
                .addContractId("x")
                .contractType(InstrumentGetOptionContractsParams.ContractType.CALL)
                .expiry(LocalDate.parse("2019-12-27"))
                .isSettleOnOpen(true)
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .underlier("underlier")
                .underlyingInstrumentId("x")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("contract_ids", listOf("x").joinToString(","))
                    .put("contract_type", "CALL")
                    .put("expiry", "2019-12-27")
                    .put("is_settle_on_open", "true")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("underlier", "underlier")
                    .put("underlying_instrument_id", "x")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentGetOptionContractsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
