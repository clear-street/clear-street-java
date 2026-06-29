// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.SortDirection
import com.clearstreet.api.models.v1.screener.FieldLookback
import com.clearstreet.api.models.v1.screener.FieldPeriod
import com.clearstreet.api.models.v1.screener.FieldRef
import com.clearstreet.api.models.v1.screener.FieldType
import com.clearstreet.api.models.v1.screener.FilterOpSpec
import com.clearstreet.api.models.v1.screener.FilterOperator
import com.clearstreet.api.models.v1.screener.FilterValue
import com.clearstreet.api.models.v1.screener.Modifier
import com.clearstreet.api.models.v1.screener.ModifierOp
import com.clearstreet.api.models.v1.screener.OperatorArg
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerParams
import com.clearstreet.api.models.v1.screener.SearchFilter
import com.clearstreet.api.models.v1.screener.SortSpec
import com.clearstreet.api.models.v1.screener.Variable
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScreenerServiceTest {

    @Test
    fun createScreener() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val screenerService = client.v1().screener()

        val response =
            screenerService.createScreener(
                ScreenerCreateScreenerParams.builder()
                    .addColumn(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_DAY)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .addFilter(
                        SearchFilter.builder()
                            .left(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_DAY)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .op(
                                FilterOpSpec.builder()
                                    .name(FilterOperator.GREATER_OR_EQUAL)
                                    .addArg(OperatorArg.LEFT_INCLUSIVE)
                                    .build()
                            )
                            .addRight(
                                FilterValue.builder()
                                    .value(1000000000.0)
                                    .variable(
                                        Variable.builder()
                                            .name("today")
                                            .lookback(FieldLookback.ONE_DAY)
                                            .modifier(
                                                Modifier.builder()
                                                    .addArg(30.0)
                                                    .addArg("DAY")
                                                    .name(ModifierOp.SUBTRACT)
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
                    .addSort(
                        SortSpec.builder()
                            .field(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_DAY)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .direction(SortDirection.DESC)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun deleteScreener() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val screenerService = client.v1().screener()

        screenerService.deleteScreener("550e8400-e29b-41d4-a716-446655440000")
    }

    @Test
    fun getScreenerById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val screenerService = client.v1().screener()

        val response = screenerService.getScreenerById("550e8400-e29b-41d4-a716-446655440000")

        response.validate()
    }

    @Test
    fun getScreeners() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val screenerService = client.v1().screener()

        val response = screenerService.getScreeners()

        response.validate()
    }

    @Test
    fun replaceScreener() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val screenerService = client.v1().screener()

        val response =
            screenerService.replaceScreener(
                ScreenerReplaceScreenerParams.builder()
                    .screenerId("550e8400-e29b-41d4-a716-446655440000")
                    .addColumn(
                        FieldRef.builder()
                            .name("market_cap")
                            .lookback(FieldLookback.ONE_DAY)
                            .period(FieldPeriod.QUARTER)
                            .valueType(FieldType.DECIMAL)
                            .build()
                    )
                    .addFilter(
                        SearchFilter.builder()
                            .left(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_DAY)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .op(
                                FilterOpSpec.builder()
                                    .name(FilterOperator.GREATER_OR_EQUAL)
                                    .addArg(OperatorArg.LEFT_INCLUSIVE)
                                    .build()
                            )
                            .addRight(
                                FilterValue.builder()
                                    .value(1000000000.0)
                                    .variable(
                                        Variable.builder()
                                            .name("today")
                                            .lookback(FieldLookback.ONE_DAY)
                                            .modifier(
                                                Modifier.builder()
                                                    .addArg(30.0)
                                                    .addArg("DAY")
                                                    .name(ModifierOp.SUBTRACT)
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
                    .addSort(
                        SortSpec.builder()
                            .field(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_DAY)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .direction(SortDirection.DESC)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun searchScreener() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val screenerService = client.v1().screener()

        val response =
            screenerService.searchScreener(
                ScreenerSearchScreenerParams.builder()
                    .columns(
                        listOf(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build(),
                            FieldRef.builder()
                                .name("price")
                                .lookback(FieldLookback.ONE_DAY)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build(),
                            FieldRef.builder()
                                .name("volume")
                                .lookback(FieldLookback.ONE_DAY)
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
                                    .lookback(FieldLookback.ONE_DAY)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .op(
                                FilterOpSpec.builder()
                                    .name(FilterOperator.GREATER_OR_EQUAL)
                                    .addArg(OperatorArg.LEFT_INCLUSIVE)
                                    .build()
                            )
                            .addRight(
                                FilterValue.builder()
                                    .value(1000000000.0)
                                    .variable(
                                        Variable.builder()
                                            .name("today")
                                            .lookback(FieldLookback.ONE_DAY)
                                            .modifier(
                                                Modifier.builder()
                                                    .addArg(30.0)
                                                    .addArg("DAY")
                                                    .name(ModifierOp.SUBTRACT)
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
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .sortCaseSensitive(true)
                    .addSort(
                        SortSpec.builder()
                            .field(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_DAY)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .direction(SortDirection.DESC)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
