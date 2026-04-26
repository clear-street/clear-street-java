// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.options

import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.ContractType
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionContractsParamsTest {

    @Test
    fun create() {
        OptionContractsParams.builder()
            .contractType(ContractType.CALL)
            .expiry(LocalDate.parse("2019-12-27"))
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .underlier("underlier")
            .underlierInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .underlierSecurityId("underlier_security_id")
            .underlierSecurityIdSource(SecurityIdSource.CMS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OptionContractsParams.builder()
                .contractType(ContractType.CALL)
                .expiry(LocalDate.parse("2019-12-27"))
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .underlier("underlier")
                .underlierInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .underlierSecurityId("underlier_security_id")
                .underlierSecurityIdSource(SecurityIdSource.CMS)
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
                    .put("underlier_instrument_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("underlier_security_id", "underlier_security_id")
                    .put("underlier_security_id_source", "CMS")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OptionContractsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
