// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsParams
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsResponse
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
        securityId: String,
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(securityId, params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        securityId: String,
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(
            params.toBuilder().securityId(securityId).build(),
            requestOptions,
        )

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
        getInstrumentCashFlowStatements(params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CashFlowStatementGetInstrumentCashFlowStatementsResponse>

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
         * /active/v1/instruments/{security_id_source}/{security_id}/cash-flow-statements`, but is
         * otherwise the same as [CashFlowStatementServiceAsync.getInstrumentCashFlowStatements].
         */
        fun getInstrumentCashFlowStatements(
            securityId: String,
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > = getInstrumentCashFlowStatements(securityId, params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            securityId: String,
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > =
            getInstrumentCashFlowStatements(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        > = getInstrumentCashFlowStatements(params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        fun getInstrumentCashFlowStatements(
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
        >
    }
}
