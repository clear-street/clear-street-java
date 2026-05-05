// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.options

import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.v1.instruments.ContractType
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionGetOptionContractsParamsTest {

    @Test
    fun create() {
        OptionGetOptionContractsParams.builder()
            .contractType(ContractType.CALL)
            .expiry(LocalDate.parse("2019-12-27"))
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .underlier("underlier")
            .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OptionGetOptionContractsParams.builder()
                .contractType(ContractType.CALL)
                .expiry(LocalDate.parse("2019-12-27"))
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .underlier("underlier")
                .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("contract_type", "CALL")
                    .put("expiry", "2019-12-27")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("underlier", "underlier")
                    .put("underlying_instrument_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OptionGetOptionContractsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
