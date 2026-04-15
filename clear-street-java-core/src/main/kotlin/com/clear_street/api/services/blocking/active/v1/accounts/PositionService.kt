// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionResponse
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionsParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionsResponse
import com.clear_street.api.models.active.v1.accounts.positions.PositionGetPositionsParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionGetPositionsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** View account positions. */
interface PositionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionService

    /** Retrieves all positions for the specified trading account. */
    fun closePosition(
        securityId: String,
        params: PositionClosePositionParams,
    ): PositionClosePositionResponse = closePosition(securityId, params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        securityId: String,
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionResponse =
        closePosition(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see closePosition */
    fun closePosition(params: PositionClosePositionParams): PositionClosePositionResponse =
        closePosition(params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionResponse

    /** Closes all positions for the specified trading account. */
    fun closePositions(accountId: Long): PositionClosePositionsResponse =
        closePositions(accountId, PositionClosePositionsParams.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionsResponse =
        closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
    ): PositionClosePositionsResponse = closePositions(accountId, params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        params: PositionClosePositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionsResponse

    /** @see closePositions */
    fun closePositions(params: PositionClosePositionsParams): PositionClosePositionsResponse =
        closePositions(params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): PositionClosePositionsResponse =
        closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

    /** Retrieves all positions for the specified trading account. */
    fun getPositions(accountId: Long): PositionGetPositionsResponse =
        getPositions(accountId, PositionGetPositionsParams.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionGetPositionsResponse =
        getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
    ): PositionGetPositionsResponse = getPositions(accountId, params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionGetPositionsResponse

    /** @see getPositions */
    fun getPositions(params: PositionGetPositionsParams): PositionGetPositionsResponse =
        getPositions(params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): PositionGetPositionsResponse =
        getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)

    /** A view of [PositionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /active/v1/accounts/{account_id}/positions/{security_id_source}/{security_id}`, but is
         * otherwise the same as [PositionService.closePosition].
         */
        @MustBeClosed
        fun closePosition(
            securityId: String,
            params: PositionClosePositionParams,
        ): HttpResponseFor<PositionClosePositionResponse> =
            closePosition(securityId, params, RequestOptions.none())

        /** @see closePosition */
        @MustBeClosed
        fun closePosition(
            securityId: String,
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionResponse> =
            closePosition(params.toBuilder().securityId(securityId).build(), requestOptions)

        /** @see closePosition */
        @MustBeClosed
        fun closePosition(
            params: PositionClosePositionParams
        ): HttpResponseFor<PositionClosePositionResponse> =
            closePosition(params, RequestOptions.none())

        /** @see closePosition */
        @MustBeClosed
        fun closePosition(
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionResponse>

        /**
         * Returns a raw HTTP response for `delete /active/v1/accounts/{account_id}/positions`, but
         * is otherwise the same as [PositionService.closePositions].
         */
        @MustBeClosed
        fun closePositions(accountId: Long): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(accountId, PositionClosePositionsParams.none())

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(accountId, params, RequestOptions.none())

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            params: PositionClosePositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionsResponse>

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            params: PositionClosePositionsParams
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(params, RequestOptions.none())

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/positions`, but is
         * otherwise the same as [PositionService.getPositions].
         */
        @MustBeClosed
        fun getPositions(accountId: Long): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(accountId, PositionGetPositionsParams.none())

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(accountId, params, RequestOptions.none())

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            params: PositionGetPositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionGetPositionsResponse>

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            params: PositionGetPositionsParams
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(params, RequestOptions.none())

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)
    }
}
