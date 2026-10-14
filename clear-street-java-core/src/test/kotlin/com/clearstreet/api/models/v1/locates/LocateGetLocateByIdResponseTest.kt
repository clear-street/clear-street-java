// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocateByIdResponseTest {

    @Test
    fun create() {
        val locateGetLocateByIdResponse =
            LocateGetLocateByIdResponse.builder()
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
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
                    Locate.builder()
                        .accountId(0L)
                        .clientRequestId("client_request_id")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .locateRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requestedQuantity(0L)
                        .status(LocateStatus.REQUESTED)
                        .locateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .quantity(0L)
                        .relatedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .reservedQuantity(0L)
                        .usedQuantity(0L)
                        .build()
                )
                .build()

        assertThat(locateGetLocateByIdResponse.metadata())
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
        assertThat(locateGetLocateByIdResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(locateGetLocateByIdResponse.data())
            .isEqualTo(
                Locate.builder()
                    .accountId(0L)
                    .clientRequestId("client_request_id")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .locateRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requestedQuantity(0L)
                    .status(LocateStatus.REQUESTED)
                    .locateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .quantity(0L)
                    .relatedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reservedQuantity(0L)
                    .usedQuantity(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locateGetLocateByIdResponse =
            LocateGetLocateByIdResponse.builder()
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
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
                    Locate.builder()
                        .accountId(0L)
                        .clientRequestId("client_request_id")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .locateRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requestedQuantity(0L)
                        .status(LocateStatus.REQUESTED)
                        .locateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .quantity(0L)
                        .relatedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .reservedQuantity(0L)
                        .usedQuantity(0L)
                        .build()
                )
                .build()

        val roundtrippedLocateGetLocateByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateGetLocateByIdResponse),
                jacksonTypeRef<LocateGetLocateByIdResponse>(),
            )

        assertThat(roundtrippedLocateGetLocateByIdResponse).isEqualTo(locateGetLocateByIdResponse)
    }
}
