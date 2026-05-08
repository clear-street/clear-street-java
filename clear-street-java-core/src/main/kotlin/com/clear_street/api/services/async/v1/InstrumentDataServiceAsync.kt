// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetAllInstrumentEventsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetAllInstrumentEventsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentAnalystConsensusParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentAnalystConsensusResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentBalanceSheetStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentBalanceSheetStatementsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentCashFlowStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentCashFlowStatementsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentEventsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentEventsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentFundamentalsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentFundamentalsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentIncomeStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentIncomeStatementsResponse
import com.clear_street.api.services.async.v1.instrumentdata.MarketDataServiceAsync
import com.clear_street.api.services.async.v1.instrumentdata.NewsServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
interface InstrumentDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentDataServiceAsync

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    fun marketData(): MarketDataServiceAsync

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    fun news(): NewsServiceAsync

    /**
     * List instrument events across all securities.
     *
     * Retrieves all instrument events grouped by date.
     */
    fun getAllInstrumentEvents(): CompletableFuture<InstrumentDataGetAllInstrumentEventsResponse> =
        getAllInstrumentEvents(InstrumentDataGetAllInstrumentEventsParams.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: InstrumentDataGetAllInstrumentEventsParams =
            InstrumentDataGetAllInstrumentEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetAllInstrumentEventsResponse>

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: InstrumentDataGetAllInstrumentEventsParams =
            InstrumentDataGetAllInstrumentEventsParams.none()
    ): CompletableFuture<InstrumentDataGetAllInstrumentEventsResponse> =
        getAllInstrumentEvents(params, RequestOptions.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentDataGetAllInstrumentEventsResponse> =
        getAllInstrumentEvents(InstrumentDataGetAllInstrumentEventsParams.none(), requestOptions)

    /** Retrieves analyst ratings and price targets for an instrument. */
    fun getInstrumentAnalystConsensus(
        instrumentId: String
    ): CompletableFuture<InstrumentDataGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(
            instrumentId,
            InstrumentDataGetInstrumentAnalystConsensusParams.none(),
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        params: InstrumentDataGetInstrumentAnalystConsensusParams =
            InstrumentDataGetInstrumentAnalystConsensusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        params: InstrumentDataGetInstrumentAnalystConsensusParams =
            InstrumentDataGetInstrumentAnalystConsensusParams.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: InstrumentDataGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentAnalystConsensusResponse>

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: InstrumentDataGetInstrumentAnalystConsensusParams
    ): CompletableFuture<InstrumentDataGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(
            instrumentId,
            InstrumentDataGetInstrumentAnalystConsensusParams.none(),
            requestOptions,
        )

    /**
     * Get balance sheet statements for an instrument.
     *
     * Retrieves quarterly balance sheet statements for a specific instrument, sorted by fiscal
     * period (most recent first).
     *
     * Date range defaults:
     * - `from_date`: None (no lower bound)
     * - `to_date`: None (no upper bound)
     */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String
    ): CompletableFuture<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(
            instrumentId,
            InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
        )

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams =
            InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams =
            InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams
    ): CompletableFuture<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(params, RequestOptions.none())

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(
            instrumentId,
            InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
            requestOptions,
        )

    /**
     * Get cash flow statements for an instrument.
     *
     * Retrieves historical cash flow statements for the specified instrument. Cash flow statements
     * show cash inflows and outflows from operating, investing, and financing activities.
     */
    fun getInstrumentCashFlowStatements(
        instrumentId: String
    ): CompletableFuture<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(
            instrumentId,
            InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
        )

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentCashFlowStatementsParams =
            InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentCashFlowStatementsParams =
            InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: InstrumentDataGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentCashFlowStatementsResponse>

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: InstrumentDataGetInstrumentCashFlowStatementsParams
    ): CompletableFuture<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(
            instrumentId,
            InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
            requestOptions,
        )

    /**
     * Retrieves corporate events (dividends, splits, etc.) for an instrument, grouped by event
     * type.
     *
     * Date range defaults:
     * - `from_date`: today - 365 days
     * - `to_date`: today + 60 days
     */
    fun getInstrumentEvents(
        instrumentId: String
    ): CompletableFuture<InstrumentDataGetInstrumentEventsResponse> =
        getInstrumentEvents(instrumentId, InstrumentDataGetInstrumentEventsParams.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        instrumentId: String,
        params: InstrumentDataGetInstrumentEventsParams =
            InstrumentDataGetInstrumentEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentEventsResponse> =
        getInstrumentEvents(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        instrumentId: String,
        params: InstrumentDataGetInstrumentEventsParams =
            InstrumentDataGetInstrumentEventsParams.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentEventsResponse> =
        getInstrumentEvents(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: InstrumentDataGetInstrumentEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentEventsResponse>

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: InstrumentDataGetInstrumentEventsParams
    ): CompletableFuture<InstrumentDataGetInstrumentEventsResponse> =
        getInstrumentEvents(params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentEventsResponse> =
        getInstrumentEvents(
            instrumentId,
            InstrumentDataGetInstrumentEventsParams.none(),
            requestOptions,
        )

    /** Retrieves supplemental fundamentals and company profile data for an instrument. */
    fun getInstrumentFundamentals(
        instrumentId: String
    ): CompletableFuture<InstrumentDataGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(
            instrumentId,
            InstrumentDataGetInstrumentFundamentalsParams.none(),
        )

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        params: InstrumentDataGetInstrumentFundamentalsParams =
            InstrumentDataGetInstrumentFundamentalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        params: InstrumentDataGetInstrumentFundamentalsParams =
            InstrumentDataGetInstrumentFundamentalsParams.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: InstrumentDataGetInstrumentFundamentalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentFundamentalsResponse>

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: InstrumentDataGetInstrumentFundamentalsParams
    ): CompletableFuture<InstrumentDataGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(
            instrumentId,
            InstrumentDataGetInstrumentFundamentalsParams.none(),
            requestOptions,
        )

    /**
     * Retrieves quarterly income statements for a specific instrument, sorted by fiscal period
     * (most recent first).
     *
     * Date range defaults:
     * - `from_date`: None (no lower bound)
     * - `to_date`: None (no upper bound)
     */
    fun getInstrumentIncomeStatements(
        instrumentId: String
    ): CompletableFuture<InstrumentDataGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(
            instrumentId,
            InstrumentDataGetInstrumentIncomeStatementsParams.none(),
        )

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentIncomeStatementsParams =
            InstrumentDataGetInstrumentIncomeStatementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentIncomeStatementsParams =
            InstrumentDataGetInstrumentIncomeStatementsParams.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: InstrumentDataGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentDataGetInstrumentIncomeStatementsResponse>

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: InstrumentDataGetInstrumentIncomeStatementsParams
    ): CompletableFuture<InstrumentDataGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(
            instrumentId,
            InstrumentDataGetInstrumentIncomeStatementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [InstrumentDataServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentDataServiceAsync.WithRawResponse

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        fun marketData(): MarketDataServiceAsync.WithRawResponse

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        fun news(): NewsServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/events`, but is otherwise the same
         * as [InstrumentDataServiceAsync.getAllInstrumentEvents].
         */
        fun getAllInstrumentEvents():
            CompletableFuture<HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse>> =
            getAllInstrumentEvents(InstrumentDataGetAllInstrumentEventsParams.none())

        /** @see getAllInstrumentEvents */
        fun getAllInstrumentEvents(
            params: InstrumentDataGetAllInstrumentEventsParams =
                InstrumentDataGetAllInstrumentEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse>>

        /** @see getAllInstrumentEvents */
        fun getAllInstrumentEvents(
            params: InstrumentDataGetAllInstrumentEventsParams =
                InstrumentDataGetAllInstrumentEventsParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse>> =
            getAllInstrumentEvents(params, RequestOptions.none())

        /** @see getAllInstrumentEvents */
        fun getAllInstrumentEvents(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse>> =
            getAllInstrumentEvents(
                InstrumentDataGetAllInstrumentEventsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/analyst-reporting`,
         * but is otherwise the same as [InstrumentDataServiceAsync.getInstrumentAnalystConsensus].
         */
        fun getInstrumentAnalystConsensus(
            instrumentId: String
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>> =
            getInstrumentAnalystConsensus(
                instrumentId,
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
            )

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: InstrumentDataGetInstrumentAnalystConsensusParams =
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>> =
            getInstrumentAnalystConsensus(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: InstrumentDataGetInstrumentAnalystConsensusParams =
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>> =
            getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            params: InstrumentDataGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>>

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            params: InstrumentDataGetInstrumentAnalystConsensusParams
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>> =
            getInstrumentAnalystConsensus(params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>> =
            getInstrumentAnalystConsensus(
                instrumentId,
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/balance-sheets`, but
         * is otherwise the same as
         * [InstrumentDataServiceAsync.getInstrumentBalanceSheetStatements].
         */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>
        > =
            getInstrumentBalanceSheetStatements(
                instrumentId,
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
            )

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams =
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>
        > =
            getInstrumentBalanceSheetStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams =
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>
        > = getInstrumentBalanceSheetStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>
        >

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>
        > = getInstrumentBalanceSheetStatements(params, RequestOptions.none())

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>
        > =
            getInstrumentBalanceSheetStatements(
                instrumentId,
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/instruments/{instrument_id}/cash-flow-statements`, but is otherwise the same as
         * [InstrumentDataServiceAsync.getInstrumentCashFlowStatements].
         */
        fun getInstrumentCashFlowStatements(
            instrumentId: String
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>
        > =
            getInstrumentCashFlowStatements(
                instrumentId,
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
            )

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentCashFlowStatementsParams =
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>
        > =
            getInstrumentCashFlowStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentCashFlowStatementsParams =
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>
        > = getInstrumentCashFlowStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            params: InstrumentDataGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>>

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            params: InstrumentDataGetInstrumentCashFlowStatementsParams
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>
        > = getInstrumentCashFlowStatements(params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>
        > =
            getInstrumentCashFlowStatements(
                instrumentId,
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/events`, but is
         * otherwise the same as [InstrumentDataServiceAsync.getInstrumentEvents].
         */
        fun getInstrumentEvents(
            instrumentId: String
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>> =
            getInstrumentEvents(instrumentId, InstrumentDataGetInstrumentEventsParams.none())

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            instrumentId: String,
            params: InstrumentDataGetInstrumentEventsParams =
                InstrumentDataGetInstrumentEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>> =
            getInstrumentEvents(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            instrumentId: String,
            params: InstrumentDataGetInstrumentEventsParams =
                InstrumentDataGetInstrumentEventsParams.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>> =
            getInstrumentEvents(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            params: InstrumentDataGetInstrumentEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>>

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            params: InstrumentDataGetInstrumentEventsParams
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>> =
            getInstrumentEvents(params, RequestOptions.none())

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>> =
            getInstrumentEvents(
                instrumentId,
                InstrumentDataGetInstrumentEventsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/fundamentals`, but
         * is otherwise the same as [InstrumentDataServiceAsync.getInstrumentFundamentals].
         */
        fun getInstrumentFundamentals(
            instrumentId: String
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(
                instrumentId,
                InstrumentDataGetInstrumentFundamentalsParams.none(),
            )

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: InstrumentDataGetInstrumentFundamentalsParams =
                InstrumentDataGetInstrumentFundamentalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: InstrumentDataGetInstrumentFundamentalsParams =
                InstrumentDataGetInstrumentFundamentalsParams.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            params: InstrumentDataGetInstrumentFundamentalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>>

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            params: InstrumentDataGetInstrumentFundamentalsParams
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(
                instrumentId,
                InstrumentDataGetInstrumentFundamentalsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/income-statements`,
         * but is otherwise the same as [InstrumentDataServiceAsync.getInstrumentIncomeStatements].
         */
        fun getInstrumentIncomeStatements(
            instrumentId: String
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>> =
            getInstrumentIncomeStatements(
                instrumentId,
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
            )

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentIncomeStatementsParams =
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>> =
            getInstrumentIncomeStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentIncomeStatementsParams =
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>> =
            getInstrumentIncomeStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            params: InstrumentDataGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>>

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            params: InstrumentDataGetInstrumentIncomeStatementsParams
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>> =
            getInstrumentIncomeStatements(params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>> =
            getInstrumentIncomeStatements(
                instrumentId,
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
                requestOptions,
            )
    }
}
