// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionResponse
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionsParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionsResponse
import com.clear_street.api.models.active.v1.accounts.positions.PositionGetPositionsParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionGetPositionsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** View account positions. */
interface PositionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionServiceAsync

    /**
     * Delete a position within an account for an instrument.
     *
     * Retrieves all positions for the specified trading account.
     */
    fun closePosition(
        securityId: String,
        params: PositionClosePositionParams,
    ): CompletableFuture<PositionClosePositionResponse> =
        closePosition(securityId, params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        securityId: String,
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionResponse> =
        closePosition(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see closePosition */
    fun closePosition(
        params: PositionClosePositionParams
    ): CompletableFuture<PositionClosePositionResponse> =
        closePosition(params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionResponse>

    /**
     * Delete all positions within an account.
     *
     * Closes all positions for the specified trading account.
     */
    fun closePositions(accountId: Long): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(accountId, PositionClosePositionsParams.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(accountId, params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        params: PositionClosePositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionsResponse>

    /** @see closePositions */
    fun closePositions(
        params: PositionClosePositionsParams
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

    /** Retrieves all positions for the specified trading account. */
    fun getPositions(accountId: Long): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(accountId, PositionGetPositionsParams.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
    ): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(accountId, params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionGetPositionsResponse>

    /** @see getPositions */
    fun getPositions(
        params: PositionGetPositionsParams
    ): CompletableFuture<PositionGetPositionsResponse> = getPositions(params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)

    /**
     * A view of [PositionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PositionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /active/v1/accounts/{account_id}/positions/{security_id_source}/{security_id}`, but is
         * otherwise the same as [PositionServiceAsync.closePosition].
         */
        fun closePosition(
            securityId: String,
            params: PositionClosePositionParams,
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> =
            closePosition(securityId, params, RequestOptions.none())

        /** @see closePosition */
        fun closePosition(
            securityId: String,
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> =
            closePosition(params.toBuilder().securityId(securityId).build(), requestOptions)

        /** @see closePosition */
        fun closePosition(
            params: PositionClosePositionParams
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> =
            closePosition(params, RequestOptions.none())

        /** @see closePosition */
        fun closePosition(
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>>

        /**
         * Returns a raw HTTP response for `delete /active/v1/accounts/{account_id}/positions`, but
         * is otherwise the same as [PositionServiceAsync.closePositions].
         */
        fun closePositions(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(accountId, PositionClosePositionsParams.none())

        /** @see closePositions */
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see closePositions */
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(accountId, params, RequestOptions.none())

        /** @see closePositions */
        fun closePositions(
            params: PositionClosePositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>>

        /** @see closePositions */
        fun closePositions(
            params: PositionClosePositionsParams
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(params, RequestOptions.none())

        /** @see closePositions */
        fun closePositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/positions`, but is
         * otherwise the same as [PositionServiceAsync.getPositions].
         */
        fun getPositions(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(accountId, PositionGetPositionsParams.none())

        /** @see getPositions */
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPositions */
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(accountId, params, RequestOptions.none())

        /** @see getPositions */
        fun getPositions(
            params: PositionGetPositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>>

        /** @see getPositions */
        fun getPositions(
            params: PositionGetPositionsParams
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(params, RequestOptions.none())

        /** @see getPositions */
        fun getPositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)
    }
}
