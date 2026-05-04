// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsParams
import com.clear_street.api.models.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface BalanceSheetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceSheetServiceAsync

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
    ): CompletableFuture<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(
            instrumentId,
            BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
        )

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        params: BalanceSheetGetInstrumentBalanceSheetStatementsParams =
            BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        params: BalanceSheetGetInstrumentBalanceSheetStatementsParams =
            BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
    ): CompletableFuture<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        params: BalanceSheetGetInstrumentBalanceSheetStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        params: BalanceSheetGetInstrumentBalanceSheetStatementsParams
    ): CompletableFuture<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(params, RequestOptions.none())

    /** @see getInstrumentBalanceSheetStatements */
    fun getInstrumentBalanceSheetStatements(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> =
        getInstrumentBalanceSheetStatements(
            instrumentId,
            BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [BalanceSheetServiceAsync] that provides access to raw HTTP responses for each
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
        ): BalanceSheetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/balance-sheets`, but
         * is otherwise the same as [BalanceSheetServiceAsync.getInstrumentBalanceSheetStatements].
         */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String
        ): CompletableFuture<
            HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>
        > =
            getInstrumentBalanceSheetStatements(
                instrumentId,
                BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
            )

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            params: BalanceSheetGetInstrumentBalanceSheetStatementsParams =
                BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>
        > =
            getInstrumentBalanceSheetStatements(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            params: BalanceSheetGetInstrumentBalanceSheetStatementsParams =
                BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
        ): CompletableFuture<
            HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>
        > = getInstrumentBalanceSheetStatements(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            params: BalanceSheetGetInstrumentBalanceSheetStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>
        >

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            params: BalanceSheetGetInstrumentBalanceSheetStatementsParams
        ): CompletableFuture<
            HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>
        > = getInstrumentBalanceSheetStatements(params, RequestOptions.none())

        /** @see getInstrumentBalanceSheetStatements */
        fun getInstrumentBalanceSheetStatements(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>
        > =
            getInstrumentBalanceSheetStatements(
                instrumentId,
                BalanceSheetGetInstrumentBalanceSheetStatementsParams.none(),
                requestOptions,
            )
    }
}
