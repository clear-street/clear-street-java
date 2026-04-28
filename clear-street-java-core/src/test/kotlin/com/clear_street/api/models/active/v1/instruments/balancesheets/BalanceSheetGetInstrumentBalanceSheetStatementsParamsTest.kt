// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.balancesheets

import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.active.v1.SecurityIdSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceSheetGetInstrumentBalanceSheetStatementsParamsTest {

    @Test
    fun create() {
        BalanceSheetGetInstrumentBalanceSheetStatementsParams.builder()
            .securityIdSource(SecurityIdSource.CMS)
            .securityId("security_id")
            .fromDate("from_date")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .toDate("to_date")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceSheetGetInstrumentBalanceSheetStatementsParams.builder()
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
            BalanceSheetGetInstrumentBalanceSheetStatementsParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .fromDate("from_date")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from_date", "from_date")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceSheetGetInstrumentBalanceSheetStatementsParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
