// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderGetOrdersParamsTest {

    @Test
    fun create() {
        OrderGetOrdersParams.builder()
            .accountId(0L)
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .instrumentType(OrderGetOrdersParams.InstrumentType.COMMON_STOCK)
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .addSecurityId("string")
            .addSecurityIdSource("string")
            .addStatus(OrderGetOrdersParams.Status.PENDING_NEW)
            .symbol("symbol")
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = OrderGetOrdersParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            OrderGetOrdersParams.builder()
                .accountId(0L)
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .instrumentType(OrderGetOrdersParams.InstrumentType.COMMON_STOCK)
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .addSecurityId("string")
                .addSecurityIdSource("string")
                .addStatus(OrderGetOrdersParams.Status.PENDING_NEW)
                .symbol("symbol")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("instrument_type", "COMMON_STOCK")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("security_id[0]", "string")
                    .put("security_id_source[0]", "string")
                    .put("status[0]", "PENDING_NEW")
                    .put("symbol", "symbol")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OrderGetOrdersParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
