// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.venues

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VenueGetVenuesResponseTest {

    @Test
    fun create() {
        val venueGetVenuesResponse =
            VenueGetVenuesResponse.builder()
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
                    Venue.builder()
                        .country("US")
                        .displayType(DisplayType.LIT)
                        .gtdAccepts(GtdAccepts.builder().date(true).timestamp(true).build())
                        .lotSize(100L)
                        .mic("XNMS")
                        .name("Nasdaq")
                        .addSession(
                            VenueSession.builder()
                                .endLocal("16:00")
                                .name("CONTINUOUS")
                                .startLocal("09:30")
                                .build()
                        )
                        .supportedOrderTypes(listOf("MARKET", "LIMIT", "STOP", "STOP_LIMIT"))
                        .supportedTifs(
                            listOf("DAY", "GOOD_TILL_CANCEL", "IMMEDIATE_OR_CANCEL", "FILL_OR_KILL")
                        )
                        .tickSize("tick_size")
                        .timezone("America/New_York")
                        .build()
                )
                .build()

        assertThat(venueGetVenuesResponse.metadata())
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
        assertThat(venueGetVenuesResponse.error())
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
        assertThat(venueGetVenuesResponse.data())
            .containsExactly(
                Venue.builder()
                    .country("US")
                    .displayType(DisplayType.LIT)
                    .gtdAccepts(GtdAccepts.builder().date(true).timestamp(true).build())
                    .lotSize(100L)
                    .mic("XNMS")
                    .name("Nasdaq")
                    .addSession(
                        VenueSession.builder()
                            .endLocal("16:00")
                            .name("CONTINUOUS")
                            .startLocal("09:30")
                            .build()
                    )
                    .supportedOrderTypes(listOf("MARKET", "LIMIT", "STOP", "STOP_LIMIT"))
                    .supportedTifs(
                        listOf("DAY", "GOOD_TILL_CANCEL", "IMMEDIATE_OR_CANCEL", "FILL_OR_KILL")
                    )
                    .tickSize("tick_size")
                    .timezone("America/New_York")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val venueGetVenuesResponse =
            VenueGetVenuesResponse.builder()
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
                    Venue.builder()
                        .country("US")
                        .displayType(DisplayType.LIT)
                        .gtdAccepts(GtdAccepts.builder().date(true).timestamp(true).build())
                        .lotSize(100L)
                        .mic("XNMS")
                        .name("Nasdaq")
                        .addSession(
                            VenueSession.builder()
                                .endLocal("16:00")
                                .name("CONTINUOUS")
                                .startLocal("09:30")
                                .build()
                        )
                        .supportedOrderTypes(listOf("MARKET", "LIMIT", "STOP", "STOP_LIMIT"))
                        .supportedTifs(
                            listOf("DAY", "GOOD_TILL_CANCEL", "IMMEDIATE_OR_CANCEL", "FILL_OR_KILL")
                        )
                        .tickSize("tick_size")
                        .timezone("America/New_York")
                        .build()
                )
                .build()

        val roundtrippedVenueGetVenuesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(venueGetVenuesResponse),
                jacksonTypeRef<VenueGetVenuesResponse>(),
            )

        assertThat(roundtrippedVenueGetVenuesResponse).isEqualTo(venueGetVenuesResponse)
    }
}
