// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.UnnamedSchemaWithArrayParent0
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocateRateByIdResponseTest {

    @Test
    fun create() {
        val locateGetLocateRateByIdResponse =
            LocateGetLocateRateByIdResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
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
                .data(
                    LocateRate.builder()
                        .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                        .rate("0.037012")
                        .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                        .build()
                )
                .build()

        assertThat(locateGetLocateRateByIdResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(1)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(42L)
                    .totalPages(5)
                    .build()
            )
        assertThat(locateGetLocateRateByIdResponse.error())
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
        assertThat(locateGetLocateRateByIdResponse.data())
            .isEqualTo(
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
        val locateGetLocateRateByIdResponse =
            LocateGetLocateRateByIdResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
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
                .data(
                    LocateRate.builder()
                        .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                        .rate("0.037012")
                        .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                        .build()
                )
                .build()

        val roundtrippedLocateGetLocateRateByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateGetLocateRateByIdResponse),
                jacksonTypeRef<LocateGetLocateRateByIdResponse>(),
            )

        assertThat(roundtrippedLocateGetLocateRateByIdResponse)
            .isEqualTo(locateGetLocateRateByIdResponse)
    }
}
