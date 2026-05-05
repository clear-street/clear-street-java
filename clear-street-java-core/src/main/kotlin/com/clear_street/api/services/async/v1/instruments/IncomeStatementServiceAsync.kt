// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsParams
import com.clear_street.api.models.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface IncomeStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IncomeStatementServiceAsync

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
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(
            instrumentId,
            IncomeStatementGetInstrumentIncomeStatementsParams.none(),
        )

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        params: IncomeStatementGetInstrumentIncomeStatementsParams =
            IncomeStatementGetInstrumentIncomeStatementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        params: IncomeStatementGetInstrumentIncomeStatementsParams =
            IncomeStatementGetInstrumentIncomeStatementsParams.none(),
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: IncomeStatementGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse>

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: IncomeStatementGetInstrumentIncomeStatementsParams
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(
            instrumentId,
            IncomeStatementGetInstrumentIncomeStatementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [IncomeStatementServiceAsync] that provides access to raw HTTP responses for each
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
        ): IncomeStatementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/income-statements`,
         * but is otherwise the same as [IncomeStatementServiceAsync.getInstrumentIncomeStatements].
         */
        fun getInstrumentIncomeStatements(
            instrumentId: String
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > =
            getInstrumentIncomeStatements(
                instrumentId,
                IncomeStatementGetInstrumentIncomeStatementsParams.none(),
            )

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            params: IncomeStatementGetInstrumentIncomeStatementsParams =
                IncomeStatementGetInstrumentIncomeStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > =
            getInstrumentIncomeStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            params: IncomeStatementGetInstrumentIncomeStatementsParams =
                IncomeStatementGetInstrumentIncomeStatementsParams.none(),
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > = getInstrumentIncomeStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>>

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            params: IncomeStatementGetInstrumentIncomeStatementsParams
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > = getInstrumentIncomeStatements(params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > =
            getInstrumentIncomeStatements(
                instrumentId,
                IncomeStatementGetInstrumentIncomeStatementsParams.none(),
                requestOptions,
            )
    }
}
