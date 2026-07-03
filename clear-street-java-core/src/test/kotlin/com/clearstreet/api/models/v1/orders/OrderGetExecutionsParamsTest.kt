// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderGetExecutionsParamsTest {

    @Test
    fun create() {
        OrderGetExecutionsParams.builder()
            .accountId(0L)
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = OrderGetExecutionsParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            OrderGetExecutionsParams.builder()
                .accountId(0L)
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put(
                        "instrument_ids",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OrderGetExecutionsParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
