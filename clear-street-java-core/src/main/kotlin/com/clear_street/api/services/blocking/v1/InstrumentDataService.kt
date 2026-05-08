// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.clear_street.api.services.blocking.v1.instrumentdata.MarketDataService
import com.clear_street.api.services.blocking.v1.instrumentdata.NewsService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
interface InstrumentDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentDataService

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    fun marketData(): MarketDataService

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    fun news(): NewsService

    /**
     * List instrument events across all securities.
     *
     * Retrieves all instrument events grouped by date.
     */
    fun getAllInstrumentEvents(): InstrumentDataGetAllInstrumentEventsResponse =
        getAllInstrumentEvents(InstrumentDataGetAllInstrumentEventsParams.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: InstrumentDataGetAllInstrumentEventsParams =
            InstrumentDataGetAllInstrumentEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetAllInstrumentEventsResponse

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: InstrumentDataGetAllInstrumentEventsParams =
            InstrumentDataGetAllInstrumentEventsParams.none()
    ): InstrumentDataGetAllInstrumentEventsResponse =
        getAllInstrumentEvents(params, RequestOptions.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        requestOptions: RequestOptions
    ): InstrumentDataGetAllInstrumentEventsResponse =
        getAllInstrumentEvents(InstrumentDataGetAllInstrumentEventsParams.none(), requestOptions)

    /** Retrieves analyst ratings and price targets for an instrument. */
    fun getInstrumentAnalystConsensus(
        instrumentId: String
    ): InstrumentDataGetInstrumentAnalystConsensusResponse =
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
    ): InstrumentDataGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        params: InstrumentDataGetInstrumentAnalystConsensusParams =
            InstrumentDataGetInstrumentAnalystConsensusParams.none(),
    ): InstrumentDataGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: InstrumentDataGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetInstrumentAnalystConsensusResponse

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: InstrumentDataGetInstrumentAnalystConsensusParams
    ): InstrumentDataGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentAnalystConsensusResponse =
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
    ): InstrumentDataGetInstrumentBalanceSheetStatementsResponse =
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
    ): InstrumentDataGetInstrumentBalanceSheetStatementsResponse =
        getInstrumentBalanceSheetStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams =
            InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
    ): InstrumentDataGetInstrumentBalanceSheetStatementsResponse =
        getInstrumentBalanceSheetStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetInstrumentBalanceSheetStatementsResponse

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams
    ): InstrumentDataGetInstrumentBalanceSheetStatementsResponse =
        getInstrumentBalanceSheetStatements(params, RequestOptions.none())

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentBalanceSheetStatementsResponse =
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
    ): InstrumentDataGetInstrumentCashFlowStatementsResponse =
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
    ): InstrumentDataGetInstrumentCashFlowStatementsResponse =
        getInstrumentCashFlowStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentCashFlowStatementsParams =
            InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
    ): InstrumentDataGetInstrumentCashFlowStatementsResponse =
        getInstrumentCashFlowStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: InstrumentDataGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetInstrumentCashFlowStatementsResponse

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: InstrumentDataGetInstrumentCashFlowStatementsParams
    ): InstrumentDataGetInstrumentCashFlowStatementsResponse =
        getInstrumentCashFlowStatements(params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentCashFlowStatementsResponse =
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
    fun getInstrumentEvents(instrumentId: String): InstrumentDataGetInstrumentEventsResponse =
        getInstrumentEvents(instrumentId, InstrumentDataGetInstrumentEventsParams.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        instrumentId: String,
        params: InstrumentDataGetInstrumentEventsParams =
            InstrumentDataGetInstrumentEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetInstrumentEventsResponse =
        getInstrumentEvents(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        instrumentId: String,
        params: InstrumentDataGetInstrumentEventsParams =
            InstrumentDataGetInstrumentEventsParams.none(),
    ): InstrumentDataGetInstrumentEventsResponse =
        getInstrumentEvents(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: InstrumentDataGetInstrumentEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetInstrumentEventsResponse

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: InstrumentDataGetInstrumentEventsParams
    ): InstrumentDataGetInstrumentEventsResponse =
        getInstrumentEvents(params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentEventsResponse =
        getInstrumentEvents(
            instrumentId,
            InstrumentDataGetInstrumentEventsParams.none(),
            requestOptions,
        )

    /** Retrieves supplemental fundamentals and company profile data for an instrument. */
    fun getInstrumentFundamentals(
        instrumentId: String
    ): InstrumentDataGetInstrumentFundamentalsResponse =
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
    ): InstrumentDataGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        params: InstrumentDataGetInstrumentFundamentalsParams =
            InstrumentDataGetInstrumentFundamentalsParams.none(),
    ): InstrumentDataGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: InstrumentDataGetInstrumentFundamentalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetInstrumentFundamentalsResponse

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: InstrumentDataGetInstrumentFundamentalsParams
    ): InstrumentDataGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentFundamentalsResponse =
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
    ): InstrumentDataGetInstrumentIncomeStatementsResponse =
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
    ): InstrumentDataGetInstrumentIncomeStatementsResponse =
        getInstrumentIncomeStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        params: InstrumentDataGetInstrumentIncomeStatementsParams =
            InstrumentDataGetInstrumentIncomeStatementsParams.none(),
    ): InstrumentDataGetInstrumentIncomeStatementsResponse =
        getInstrumentIncomeStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: InstrumentDataGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentDataGetInstrumentIncomeStatementsResponse

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: InstrumentDataGetInstrumentIncomeStatementsParams
    ): InstrumentDataGetInstrumentIncomeStatementsResponse =
        getInstrumentIncomeStatements(params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentIncomeStatementsResponse =
        getInstrumentIncomeStatements(
            instrumentId,
            InstrumentDataGetInstrumentIncomeStatementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [InstrumentDataService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentDataService.WithRawResponse

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        fun marketData(): MarketDataService.WithRawResponse

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        fun news(): NewsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/events`, but is otherwise the same
         * as [InstrumentDataService.getAllInstrumentEvents].
         */
        @MustBeClosed
        fun getAllInstrumentEvents():
            HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse> =
            getAllInstrumentEvents(InstrumentDataGetAllInstrumentEventsParams.none())

        /** @see getAllInstrumentEvents */
        @MustBeClosed
        fun getAllInstrumentEvents(
            params: InstrumentDataGetAllInstrumentEventsParams =
                InstrumentDataGetAllInstrumentEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse>

        /** @see getAllInstrumentEvents */
        @MustBeClosed
        fun getAllInstrumentEvents(
            params: InstrumentDataGetAllInstrumentEventsParams =
                InstrumentDataGetAllInstrumentEventsParams.none()
        ): HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse> =
            getAllInstrumentEvents(params, RequestOptions.none())

        /** @see getAllInstrumentEvents */
        @MustBeClosed
        fun getAllInstrumentEvents(
            requestOptions: RequestOptions
        ): HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse> =
            getAllInstrumentEvents(
                InstrumentDataGetAllInstrumentEventsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/analyst-reporting`,
         * but is otherwise the same as [InstrumentDataService.getInstrumentAnalystConsensus].
         */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String
        ): HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(
                instrumentId,
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
            )

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: InstrumentDataGetInstrumentAnalystConsensusParams =
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: InstrumentDataGetInstrumentAnalystConsensusParams =
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            params: InstrumentDataGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            params: InstrumentDataGetInstrumentAnalystConsensusParams
        ): HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(
                instrumentId,
                InstrumentDataGetInstrumentAnalystConsensusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/balance-sheets`, but
         * is otherwise the same as [InstrumentDataService.getInstrumentBalanceSheetStatements].
         */
        @MustBeClosed
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String
        ): HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
            getInstrumentBalanceSheetStatements(
                instrumentId,
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
            )

        /** @see getInstrumentBalanceSheetStatements */
        @MustBeClosed
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams =
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
            getInstrumentBalanceSheetStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentBalanceSheetStatements */
        @MustBeClosed
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams =
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
            getInstrumentBalanceSheetStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentBalanceSheetStatements */
        @MustBeClosed
        fun getInstrumentBalanceSheetStatements(
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>

        /** @see getInstrumentBalanceSheetStatements */
        @MustBeClosed
        fun getInstrumentBalanceSheetStatements(
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams
        ): HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
            getInstrumentBalanceSheetStatements(params, RequestOptions.none())

        /** @see getInstrumentBalanceSheetStatements */
        @MustBeClosed
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
            getInstrumentBalanceSheetStatements(
                instrumentId,
                InstrumentDataGetInstrumentBalanceSheetStatementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/instruments/{instrument_id}/cash-flow-statements`, but is otherwise the same as
         * [InstrumentDataService.getInstrumentCashFlowStatements].
         */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            instrumentId: String
        ): HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(
                instrumentId,
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
            )

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentCashFlowStatementsParams =
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentCashFlowStatementsParams =
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            params: InstrumentDataGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            params: InstrumentDataGetInstrumentCashFlowStatementsParams
        ): HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(
                instrumentId,
                InstrumentDataGetInstrumentCashFlowStatementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/events`, but is
         * otherwise the same as [InstrumentDataService.getInstrumentEvents].
         */
        @MustBeClosed
        fun getInstrumentEvents(
            instrumentId: String
        ): HttpResponseFor<InstrumentDataGetInstrumentEventsResponse> =
            getInstrumentEvents(instrumentId, InstrumentDataGetInstrumentEventsParams.none())

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            instrumentId: String,
            params: InstrumentDataGetInstrumentEventsParams =
                InstrumentDataGetInstrumentEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentEventsResponse> =
            getInstrumentEvents(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            instrumentId: String,
            params: InstrumentDataGetInstrumentEventsParams =
                InstrumentDataGetInstrumentEventsParams.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentEventsResponse> =
            getInstrumentEvents(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            params: InstrumentDataGetInstrumentEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            params: InstrumentDataGetInstrumentEventsParams
        ): HttpResponseFor<InstrumentDataGetInstrumentEventsResponse> =
            getInstrumentEvents(params, RequestOptions.none())

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetInstrumentEventsResponse> =
            getInstrumentEvents(
                instrumentId,
                InstrumentDataGetInstrumentEventsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/fundamentals`, but
         * is otherwise the same as [InstrumentDataService.getInstrumentFundamentals].
         */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String
        ): HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(
                instrumentId,
                InstrumentDataGetInstrumentFundamentalsParams.none(),
            )

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: InstrumentDataGetInstrumentFundamentalsParams =
                InstrumentDataGetInstrumentFundamentalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: InstrumentDataGetInstrumentFundamentalsParams =
                InstrumentDataGetInstrumentFundamentalsParams.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            params: InstrumentDataGetInstrumentFundamentalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            params: InstrumentDataGetInstrumentFundamentalsParams
        ): HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(
                instrumentId,
                InstrumentDataGetInstrumentFundamentalsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/income-statements`,
         * but is otherwise the same as [InstrumentDataService.getInstrumentIncomeStatements].
         */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            instrumentId: String
        ): HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(
                instrumentId,
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
            )

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentIncomeStatementsParams =
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            params: InstrumentDataGetInstrumentIncomeStatementsParams =
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            params: InstrumentDataGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            params: InstrumentDataGetInstrumentIncomeStatementsParams
        ): HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(
                instrumentId,
                InstrumentDataGetInstrumentIncomeStatementsParams.none(),
                requestOptions,
            )
    }
}
