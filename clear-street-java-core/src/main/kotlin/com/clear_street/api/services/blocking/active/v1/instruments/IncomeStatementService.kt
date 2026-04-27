// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsParams
import com.clear_street.api.models.active.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface IncomeStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IncomeStatementService

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
    ): IncomeStatementGetInstrumentIncomeStatementsResponse =
        getInstrumentIncomeStatements(securityId, params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        securityId: String,
        params: IncomeStatementGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomeStatementGetInstrumentIncomeStatementsResponse =
        getInstrumentIncomeStatements(
            params.toBuilder().securityId(securityId).build(),
            requestOptions,
        )

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: IncomeStatementGetInstrumentIncomeStatementsParams
    ): IncomeStatementGetInstrumentIncomeStatementsResponse =
        getInstrumentIncomeStatements(params, RequestOptions.none())

    /** @see getInstrumentIncomeStatements */
    fun getInstrumentIncomeStatements(
        params: IncomeStatementGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomeStatementGetInstrumentIncomeStatementsResponse

    /**
     * A view of [IncomeStatementService] that provides access to raw HTTP responses for each
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
        ): IncomeStatementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/income-statements`, but is
         * otherwise the same as [IncomeStatementService.getInstrumentIncomeStatements].
         */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            securityId: String,
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
        ): HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(securityId, params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            securityId: String,
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            params: IncomeStatementGetInstrumentIncomeStatementsParams
        ): HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse> =
            getInstrumentIncomeStatements(params, RequestOptions.none())

        /** @see getInstrumentIncomeStatements */
        @MustBeClosed
        fun getInstrumentIncomeStatements(
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
    }
}
