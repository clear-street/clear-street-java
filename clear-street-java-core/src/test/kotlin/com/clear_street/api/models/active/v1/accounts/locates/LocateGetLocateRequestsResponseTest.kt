// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocateRequestsResponseTest {

    @Test
    fun create() {
        val locateGetLocateRequestsResponse =
            LocateGetLocateRequestsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                .addData(
                    LocateOrder.builder()
                        .locateOrderId("loc_2af0305ffa5b4c91ba4e7ab45e2d8e4e")
                        .locatedQuantity(1000L)
                        .mpid("CLST")
                        .requestedAt(OffsetDateTime.parse("2025-10-31T13:00:00.000000000Z"))
                        .requestedQuantity(1000L)
                        .status(LocateOrderStatus.OFFERED)
                        .symbol("TSLA")
                        .borrowRate("0.23")
                        .deskComment("Offer for locate of 1000 TSLA shares")
                        .expiresAt(OffsetDateTime.parse("2025-10-31T13:15:00.000000000Z"))
                        .locateId("19dd51b8a64d953955c5c202")
                        .locatedAt(OffsetDateTime.parse("2025-10-31T13:05:00.000000000Z"))
                        .referenceId("my-locate-ref-001")
                        .totalCost("123.99")
                        .traderComment("Request for 1000 TSLA shares for short strategy")
                        .build()
                )
                .build()

        assertThat(locateGetLocateRequestsResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(locateGetLocateRequestsResponse.error())
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
        assertThat(locateGetLocateRequestsResponse.data())
            .containsExactly(
                LocateOrder.builder()
                    .locateOrderId("loc_2af0305ffa5b4c91ba4e7ab45e2d8e4e")
                    .locatedQuantity(1000L)
                    .mpid("CLST")
                    .requestedAt(OffsetDateTime.parse("2025-10-31T13:00:00.000000000Z"))
                    .requestedQuantity(1000L)
                    .status(LocateOrderStatus.OFFERED)
                    .symbol("TSLA")
                    .borrowRate("0.23")
                    .deskComment("Offer for locate of 1000 TSLA shares")
                    .expiresAt(OffsetDateTime.parse("2025-10-31T13:15:00.000000000Z"))
                    .locateId("19dd51b8a64d953955c5c202")
                    .locatedAt(OffsetDateTime.parse("2025-10-31T13:05:00.000000000Z"))
                    .referenceId("my-locate-ref-001")
                    .totalCost("123.99")
                    .traderComment("Request for 1000 TSLA shares for short strategy")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locateGetLocateRequestsResponse =
            LocateGetLocateRequestsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                .addData(
                    LocateOrder.builder()
                        .locateOrderId("loc_2af0305ffa5b4c91ba4e7ab45e2d8e4e")
                        .locatedQuantity(1000L)
                        .mpid("CLST")
                        .requestedAt(OffsetDateTime.parse("2025-10-31T13:00:00.000000000Z"))
                        .requestedQuantity(1000L)
                        .status(LocateOrderStatus.OFFERED)
                        .symbol("TSLA")
                        .borrowRate("0.23")
                        .deskComment("Offer for locate of 1000 TSLA shares")
                        .expiresAt(OffsetDateTime.parse("2025-10-31T13:15:00.000000000Z"))
                        .locateId("19dd51b8a64d953955c5c202")
                        .locatedAt(OffsetDateTime.parse("2025-10-31T13:05:00.000000000Z"))
                        .referenceId("my-locate-ref-001")
                        .totalCost("123.99")
                        .traderComment("Request for 1000 TSLA shares for short strategy")
                        .build()
                )
                .build()

        val roundtrippedLocateGetLocateRequestsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateGetLocateRequestsResponse),
                jacksonTypeRef<LocateGetLocateRequestsResponse>(),
            )

        assertThat(roundtrippedLocateGetLocateRequestsResponse)
            .isEqualTo(locateGetLocateRequestsResponse)
    }
}
