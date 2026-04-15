// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.mergersacquisitions

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MergersAcquisitionGetMergersAndAcquisitionsCalendarResponseTest {

    @Test
    fun create() {
        val mergersAcquisitionGetMergersAndAcquisitionsCalendarResponse =
            MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse.builder()
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
                    MergersAcquisitionsEvent.builder()
                        .acquirerSymbol("AMZN")
                        .targetSymbol("ZM")
                        .transactionDate(LocalDate.parse("2025-07-15"))
                        .acceptedAt(OffsetDateTime.parse("2025-10-31T00:00:00.000000000Z"))
                        .acquirerCik("0001018724")
                        .acquirerName("Amazon.com, Inc.")
                        .link(
                            "https://www.sec.gov/Archives/edgar/data/849399/000114036125002752/ny20039778x6_s4.htm"
                        )
                        .targetCik("0001585521")
                        .build()
                )
                .build()

        assertThat(mergersAcquisitionGetMergersAndAcquisitionsCalendarResponse.metadata())
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
        assertThat(mergersAcquisitionGetMergersAndAcquisitionsCalendarResponse.error())
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
        assertThat(mergersAcquisitionGetMergersAndAcquisitionsCalendarResponse.data())
            .containsExactly(
                MergersAcquisitionsEvent.builder()
                    .acquirerSymbol("AMZN")
                    .targetSymbol("ZM")
                    .transactionDate(LocalDate.parse("2025-07-15"))
                    .acceptedAt(OffsetDateTime.parse("2025-10-31T00:00:00.000000000Z"))
                    .acquirerCik("0001018724")
                    .acquirerName("Amazon.com, Inc.")
                    .link(
                        "https://www.sec.gov/Archives/edgar/data/849399/000114036125002752/ny20039778x6_s4.htm"
                    )
                    .targetCik("0001585521")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mergersAcquisitionGetMergersAndAcquisitionsCalendarResponse =
            MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse.builder()
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
                    MergersAcquisitionsEvent.builder()
                        .acquirerSymbol("AMZN")
                        .targetSymbol("ZM")
                        .transactionDate(LocalDate.parse("2025-07-15"))
                        .acceptedAt(OffsetDateTime.parse("2025-10-31T00:00:00.000000000Z"))
                        .acquirerCik("0001018724")
                        .acquirerName("Amazon.com, Inc.")
                        .link(
                            "https://www.sec.gov/Archives/edgar/data/849399/000114036125002752/ny20039778x6_s4.htm"
                        )
                        .targetCik("0001585521")
                        .build()
                )
                .build()

        val roundtrippedMergersAcquisitionGetMergersAndAcquisitionsCalendarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    mergersAcquisitionGetMergersAndAcquisitionsCalendarResponse
                ),
                jacksonTypeRef<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>(),
            )

        assertThat(roundtrippedMergersAcquisitionGetMergersAndAcquisitionsCalendarResponse)
            .isEqualTo(mergersAcquisitionGetMergersAndAcquisitionsCalendarResponse)
    }
}
