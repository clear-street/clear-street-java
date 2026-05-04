// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsParams
import com.clear_street.api.models.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface CashFlowStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CashFlowStatementServiceAsync

    /**
     * Get cash flow statements for an instrument.
     *
     * Retrieves historical cash flow statements for the specified instrument. Cash flow statements
     * show cash inflows and outflows from operating, investing, and financing activities.
     */
    fun getInstrumentCashFlowStatements(
        instrumentId: String
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(
            instrumentId,
            CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
        )

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams =
            CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams =
            CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse>

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(
            instrumentId,
            CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [CashFlowStatementServiceAsync] that provides access to raw HTTP responses for each
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
        ): CashFlowStatementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/instruments/{instrument_id}/cash-flow-statements`, but is otherwise the same as
         * [CashFlowStatementServiceAsync.getInstrumentCashFlowStatements].
         */
        fun getInstrumentCashFlowStatements(
            instrumentId: String
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > =
            getInstrumentCashFlowStatements(
                instrumentId,
                CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
            )

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams =
                CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > =
            getInstrumentCashFlowStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams =
                CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > = getInstrumentCashFlowStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        >

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > = getInstrumentCashFlowStatements(params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > =
            getInstrumentCashFlowStatements(
                instrumentId,
                CashFlowStatementGetInstrumentCashFlowStatementsParams.none(),
                requestOptions,
            )
    }
}
