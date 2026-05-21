// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetPortfolioHistoryParamsTest {

    @Test
    fun create() {
        AccountGetPortfolioHistoryParams.builder()
            .accountId(0L)
            .startDate(LocalDate.parse("2019-12-27"))
            .endDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountGetPortfolioHistoryParams.builder()
                .accountId(0L)
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AccountGetPortfolioHistoryParams.builder()
                .accountId(0L)
                .startDate(LocalDate.parse("2019-12-27"))
                .endDate(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("start_date", "2019-12-27")
                    .put("end_date", "2019-12-27")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AccountGetPortfolioHistoryParams.builder()
                .accountId(0L)
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("start_date", "2019-12-27").build())
    }
}
