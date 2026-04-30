// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerParams
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
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SavedScreenerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture =
            savedScreenerServiceAsync.createScreener(
                SavedScreenerCreateScreenerParams.builder()
                    .addFieldFilter(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_WEEK)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
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
                    .name("name")
                    .sortBy(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_WEEK)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .sortDirection(SavedScreenerCreateScreenerParams.SortDirection.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val future =
            savedScreenerServiceAsync.deleteScreener("550e8400-e29b-41d4-a716-446655440000")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScreenerById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture =
            savedScreenerServiceAsync.getScreenerById("550e8400-e29b-41d4-a716-446655440000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScreeners() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture = savedScreenerServiceAsync.getScreeners()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceScreener() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val savedScreenerServiceAsync = client.active().v1().savedScreeners()

        val responseFuture =
            savedScreenerServiceAsync.replaceScreener(
                SavedScreenerReplaceScreenerParams.builder()
                    .screenerId("550e8400-e29b-41d4-a716-446655440000")
                    .addFieldFilter(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_WEEK)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
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
                    .name("name")
                    .sortBy(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_WEEK)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .sortDirection(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
