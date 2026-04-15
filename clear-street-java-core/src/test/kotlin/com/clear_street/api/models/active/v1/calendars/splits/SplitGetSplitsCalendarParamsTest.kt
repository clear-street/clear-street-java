// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.splits

import com.clear_street.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitGetSplitsCalendarParamsTest {

    @Test
    fun create() {
        SplitGetSplitsCalendarParams.builder()
            .from(LocalDate.parse("2019-12-27"))
            .to(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SplitGetSplitsCalendarParams.builder()
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
        val params = SplitGetSplitsCalendarParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
