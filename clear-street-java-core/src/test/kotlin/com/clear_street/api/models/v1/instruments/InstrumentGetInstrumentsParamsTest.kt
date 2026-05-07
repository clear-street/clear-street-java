// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetInstrumentsParamsTest {

    @Test
    fun create() {
        InstrumentGetInstrumentsParams.builder()
            .easyToBorrow(true)
            .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .instrumentType(InstrumentGetInstrumentsParams.InstrumentType.COMMON_STOCK)
            .isLiquidationOnly(true)
            .isMarginable(true)
            .isRestricted(true)
            .isShortProhibited(true)
            .isThresholdSecurity(true)
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetInstrumentsParams.builder()
                .easyToBorrow(true)
                .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instrumentType(InstrumentGetInstrumentsParams.InstrumentType.COMMON_STOCK)
                .isLiquidationOnly(true)
                .isMarginable(true)
                .isRestricted(true)
                .isShortProhibited(true)
                .isThresholdSecurity(true)
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("easy_to_borrow", "true")
                    .put("instrument_ids[0]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("instrument_type", "COMMON_STOCK")
                    .put("is_liquidation_only", "true")
                    .put("is_marginable", "true")
                    .put("is_restricted", "true")
                    .put("is_short_prohibited", "true")
                    .put("is_threshold_security", "true")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentGetInstrumentsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
