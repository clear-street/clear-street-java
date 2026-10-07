// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.UnnamedSchemaWithArrayParent0
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateRateResultTest {

    @Test
    fun create() {
        val locateRateResult =
            LocateRateResult.builder()
                .instrument("AAPL")
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            UnnamedSchemaWithArrayParent0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .rate(
                    LocateRate.builder()
                        .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                        .rate("0.037012")
                        .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                        .build()
                )
                .build()

        assertThat(locateRateResult.instrument()).isEqualTo("AAPL")
        assertThat(locateRateResult.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        UnnamedSchemaWithArrayParent0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(locateRateResult.rate())
            .contains(
                LocateRate.builder()
                    .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                    .rate("0.037012")
                    .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locateRateResult =
            LocateRateResult.builder()
                .instrument("AAPL")
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            UnnamedSchemaWithArrayParent0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .rate(
                    LocateRate.builder()
                        .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                        .rate("0.037012")
                        .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                        .build()
                )
                .build()

        val roundtrippedLocateRateResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateRateResult),
                jacksonTypeRef<LocateRateResult>(),
            )

        assertThat(roundtrippedLocateRateResult).isEqualTo(locateRateResult)
    }
}
