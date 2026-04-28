// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsParams
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface CashFlowStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CashFlowStatementService

    /**
     * Get cash flow statements for an instrument.
     *
     * Retrieves historical cash flow statements for the specified instrument. Cash flow statements
     * show cash inflows and outflows from operating, investing, and financing activities.
     */
    fun getInstrumentCashFlowStatements(
        securityId: String,
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
    ): CashFlowStatementGetInstrumentCashFlowStatementsResponse =
        getInstrumentCashFlowStatements(securityId, params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        securityId: String,
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CashFlowStatementGetInstrumentCashFlowStatementsResponse =
        getInstrumentCashFlowStatements(
            params.toBuilder().securityId(securityId).build(),
            requestOptions,
        )

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams
    ): CashFlowStatementGetInstrumentCashFlowStatementsResponse =
        getInstrumentCashFlowStatements(params, RequestOptions.none())

    /** @see getInstrumentCashFlowStatements */
    fun getInstrumentCashFlowStatements(
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CashFlowStatementGetInstrumentCashFlowStatementsResponse

    /**
     * A view of [CashFlowStatementService] that provides access to raw HTTP responses for each
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
        ): CashFlowStatementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/cash-flow-statements`, but is
         * otherwise the same as [CashFlowStatementService.getInstrumentCashFlowStatements].
         */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            securityId: String,
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        ): HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(securityId, params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            securityId: String,
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams
        ): HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
            getInstrumentCashFlowStatements(params, RequestOptions.none())

        /** @see getInstrumentCashFlowStatements */
        @MustBeClosed
        fun getInstrumentCashFlowStatements(
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse>
    }
}
