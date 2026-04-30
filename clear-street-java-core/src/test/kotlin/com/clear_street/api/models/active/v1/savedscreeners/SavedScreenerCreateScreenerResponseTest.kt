// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.screener.FieldLookback
import com.clear_street.api.models.active.v1.screener.FieldPeriod
import com.clear_street.api.models.active.v1.screener.FieldRef
import com.clear_street.api.models.active.v1.screener.FieldType
import com.clear_street.api.models.active.v1.screener.FilterOpSpec
import com.clear_street.api.models.active.v1.screener.FilterOperator
import com.clear_street.api.models.active.v1.screener.FilterValue
import com.clear_street.api.models.active.v1.screener.Modifier
import com.clear_street.api.models.active.v1.screener.ModifierOp
import com.clear_street.api.models.active.v1.screener.OperatorArg
import com.clear_street.api.models.active.v1.screener.SearchFilter
import com.clear_street.api.models.active.v1.screener.Variable
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SavedScreenerCreateScreenerResponseTest {

    @Test
    fun create() {
        val savedScreenerCreateScreenerResponse =
            SavedScreenerCreateScreenerResponse.builder()
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
                .data(
                    ScreenerEntry.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            SearchFilter.builder()
                                .left(
                                    FieldRef.builder()
                                        .name("market_cap")
                                        .lookback(FieldLookback.ONE_WEEK)
                                        .period(FieldPeriod.QUARTER)
                                        .valueType(FieldType.DECIMAL)
                                        .build()
                                )
                                .op(
                                    FilterOpSpec.builder()
                                        .name(FilterOperator.GTE)
                                        .addArg(OperatorArg.LEFT_INCLUSIVE)
                                        .build()
                                )
                                .addRight(
                                    FilterValue.builder()
                                        .value(1000000000.0)
                                        .variable(
                                            Variable.builder()
                                                .name("today")
                                                .lookback(FieldLookback.ONE_WEEK)
                                                .modifier(
                                                    Modifier.builder()
                                                        .addArg(30.0)
                                                        .addArg("DAY")
                                                        .name(ModifierOp.SUB)
                                                        .build()
                                                )
                                                .period(FieldPeriod.QUARTER)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFieldFilter(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .sortBy(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .sortDirection("sort_direction")
                        .build()
                )
                .build()

        assertThat(savedScreenerCreateScreenerResponse.metadata())
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
        assertThat(savedScreenerCreateScreenerResponse.error())
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
        assertThat(savedScreenerCreateScreenerResponse.data())
            .isEqualTo(
                ScreenerEntry.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFilter(
                        SearchFilter.builder()
                            .left(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_WEEK)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .op(
                                FilterOpSpec.builder()
                                    .name(FilterOperator.GTE)
                                    .addArg(OperatorArg.LEFT_INCLUSIVE)
                                    .build()
                            )
                            .addRight(
                                FilterValue.builder()
                                    .value(1000000000.0)
                                    .variable(
                                        Variable.builder()
                                            .name("today")
                                            .lookback(FieldLookback.ONE_WEEK)
                                            .modifier(
                                                Modifier.builder()
                                                    .addArg(30.0)
                                                    .addArg("DAY")
                                                    .name(ModifierOp.SUB)
                                                    .build()
                                            )
                                            .period(FieldPeriod.QUARTER)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFieldFilter(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_WEEK)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .sortBy(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_WEEK)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .sortDirection("sort_direction")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val savedScreenerCreateScreenerResponse =
            SavedScreenerCreateScreenerResponse.builder()
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
                .data(
                    ScreenerEntry.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            SearchFilter.builder()
                                .left(
                                    FieldRef.builder()
                                        .name("market_cap")
                                        .lookback(FieldLookback.ONE_WEEK)
                                        .period(FieldPeriod.QUARTER)
                                        .valueType(FieldType.DECIMAL)
                                        .build()
                                )
                                .op(
                                    FilterOpSpec.builder()
                                        .name(FilterOperator.GTE)
                                        .addArg(OperatorArg.LEFT_INCLUSIVE)
                                        .build()
                                )
                                .addRight(
                                    FilterValue.builder()
                                        .value(1000000000.0)
                                        .variable(
                                            Variable.builder()
                                                .name("today")
                                                .lookback(FieldLookback.ONE_WEEK)
                                                .modifier(
                                                    Modifier.builder()
                                                        .addArg(30.0)
                                                        .addArg("DAY")
                                                        .name(ModifierOp.SUB)
                                                        .build()
                                                )
                                                .period(FieldPeriod.QUARTER)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFieldFilter(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .sortBy(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .sortDirection("sort_direction")
                        .build()
                )
                .build()

        val roundtrippedSavedScreenerCreateScreenerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(savedScreenerCreateScreenerResponse),
                jacksonTypeRef<SavedScreenerCreateScreenerResponse>(),
            )

        assertThat(roundtrippedSavedScreenerCreateScreenerResponse)
            .isEqualTo(savedScreenerCreateScreenerResponse)
    }
}
