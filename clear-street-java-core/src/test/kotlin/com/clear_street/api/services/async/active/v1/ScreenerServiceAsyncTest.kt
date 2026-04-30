// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
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
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerSearchScreenerParams
import com.clear_street.api.models.active.v1.screener.SearchFilter
import com.clear_street.api.models.active.v1.screener.Variable
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScreenerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val screenerServiceAsync = client.active().v1().screener()

        val responseFuture =
            screenerServiceAsync.getScreener(
                ScreenerGetScreenerParams.builder()
                    .addFieldFilter("string")
                    .filter(
                        ScreenerGetScreenerParams.Filter.builder()
                            .putAdditionalProperty("foo", "string")
                            .build()
                    )
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .sortBy("sort_by")
                    .sortDirection(ScreenerGetScreenerParams.SortDirection.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val screenerServiceAsync = client.active().v1().screener()

        val responseFuture =
            screenerServiceAsync.searchScreener(
                ScreenerSearchScreenerParams.builder()
                    .fieldFilter(
                        listOf(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build(),
                            FieldRef.builder()
                                .name("price")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build(),
                            FieldRef.builder()
                                .name("volume")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build(),
                        )
                    )
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
                    .pageSize(25L)
                    .pageToken("page_token")
                    .sortBy(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_WEEK)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .sortCaseSensitive(true)
                    .sortDirection(ScreenerSearchScreenerParams.SortDirection.ASC)
                    .addSort(
                        ScreenerSearchScreenerParams.Sort.builder()
                            .field(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_WEEK)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .direction(ScreenerSearchScreenerParams.Sort.Direction.DESC)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
