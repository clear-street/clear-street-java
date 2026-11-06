// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetNonTradeActivitiesResponseTest {

    @Test
    fun create() {
        val accountGetNonTradeActivitiesResponse =
            AccountGetNonTradeActivitiesResponse.builder()
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
                .addData(
                    NonTradeActivity.builder()
                        .id("01a08544-f495-77f4-9718-5a470a0d7b56")
                        .accountId("122503")
                        .activitySubtype("ach_transfer")
                        .activityType(ActivityType.MONEY_MOVEMENT)
                        .amount("42")
                        .createdAt(OffsetDateTime.parse("2026-09-09T14:30:00.000000000Z"))
                        .currency("USD")
                        .effectiveDate(LocalDate.parse("2026-09-09"))
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .memo("FUNDS WIRED IN")
                        .qty("100")
                        .state(ActivityState.SETTLED)
                        .cancelledReferenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .referenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                        .symbol("AAPL")
                        .build()
                )
                .build()

        assertThat(accountGetNonTradeActivitiesResponse.metadata())
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
        assertThat(accountGetNonTradeActivitiesResponse.error())
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
        assertThat(accountGetNonTradeActivitiesResponse.data())
            .containsExactly(
                NonTradeActivity.builder()
                    .id("01a08544-f495-77f4-9718-5a470a0d7b56")
                    .accountId("122503")
                    .activitySubtype("ach_transfer")
                    .activityType(ActivityType.MONEY_MOVEMENT)
                    .amount("42")
                    .createdAt(OffsetDateTime.parse("2026-09-09T14:30:00.000000000Z"))
                    .currency("USD")
                    .effectiveDate(LocalDate.parse("2026-09-09"))
                    .instrumentType(SecurityType.COMMON_STOCK)
                    .memo("FUNDS WIRED IN")
                    .qty("100")
                    .state(ActivityState.SETTLED)
                    .cancelledReferenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                    .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .referenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                    .symbol("AAPL")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGetNonTradeActivitiesResponse =
            AccountGetNonTradeActivitiesResponse.builder()
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
                .addData(
                    NonTradeActivity.builder()
                        .id("01a08544-f495-77f4-9718-5a470a0d7b56")
                        .accountId("122503")
                        .activitySubtype("ach_transfer")
                        .activityType(ActivityType.MONEY_MOVEMENT)
                        .amount("42")
                        .createdAt(OffsetDateTime.parse("2026-09-09T14:30:00.000000000Z"))
                        .currency("USD")
                        .effectiveDate(LocalDate.parse("2026-09-09"))
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .memo("FUNDS WIRED IN")
                        .qty("100")
                        .state(ActivityState.SETTLED)
                        .cancelledReferenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .referenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                        .symbol("AAPL")
                        .build()
                )
                .build()

        val roundtrippedAccountGetNonTradeActivitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGetNonTradeActivitiesResponse),
                jacksonTypeRef<AccountGetNonTradeActivitiesResponse>(),
            )

        assertThat(roundtrippedAccountGetNonTradeActivitiesResponse)
            .isEqualTo(accountGetNonTradeActivitiesResponse)
    }
}
