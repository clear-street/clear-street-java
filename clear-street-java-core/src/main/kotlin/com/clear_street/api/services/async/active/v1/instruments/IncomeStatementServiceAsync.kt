// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsParams
import com.clear_street.api.models.active.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsResponse
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
        securityId: String,
        params: IncomeStatementGetInstrumentIncomeStatementsParams,
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(securityId, params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        securityId: String,
        params: IncomeStatementGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(
            params.toBuilder().securityId(securityId).build(),
            requestOptions,
        )

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: IncomeStatementGetInstrumentIncomeStatementsParams
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        getInstrumentIncomeStatements(params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: IncomeStatementGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse>

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
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/income-statements`, but is
         * otherwise the same as [IncomeStatementServiceAsync.getInstrumentIncomeStatements].
         */
        fun getInstrumentIncomeStatements(
            securityId: String,
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > = getInstrumentIncomeStatements(securityId, params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            securityId: String,
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > =
            getInstrumentIncomeStatements(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            params: IncomeStatementGetInstrumentIncomeStatementsParams
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > = getInstrumentIncomeStatements(params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        fun getInstrumentIncomeStatements(
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>>
    }
}
