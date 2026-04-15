// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestResponse
import com.clear_street.api.services.blocking.active.v1.accounts.locates.InventoryService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage locate requests for short selling. */
interface LocateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateService

    /** Manage locate requests for short selling. */
    fun inventory(): InventoryService

    /** Submits a new short stock locate request. */
    fun createLocateRequest(
        accountId: Long,
        params: LocateCreateLocateRequestParams,
    ): LocateCreateLocateRequestResponse =
        createLocateRequest(accountId, params, RequestOptions.none())

    /** @see createLocateRequest */
    fun createLocateRequest(
        accountId: Long,
        params: LocateCreateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateCreateLocateRequestResponse =
        createLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see createLocateRequest */
    fun createLocateRequest(
        params: LocateCreateLocateRequestParams
    ): LocateCreateLocateRequestResponse = createLocateRequest(params, RequestOptions.none())

    /** @see createLocateRequest */
    fun createLocateRequest(
        params: LocateCreateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateCreateLocateRequestResponse

    /** Retrieves all locate requests for the specified account. */
    fun getLocateRequests(accountId: Long): LocateGetLocateRequestsResponse =
        getLocateRequests(accountId, LocateGetLocateRequestsParams.none())

    /** @see getLocateRequests */
    fun getLocateRequests(
        accountId: Long,
        params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateGetLocateRequestsResponse =
        getLocateRequests(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getLocateRequests */
    fun getLocateRequests(
        accountId: Long,
        params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
    ): LocateGetLocateRequestsResponse = getLocateRequests(accountId, params, RequestOptions.none())

    /** @see getLocateRequests */
    fun getLocateRequests(
        params: LocateGetLocateRequestsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateGetLocateRequestsResponse

    /** @see getLocateRequests */
    fun getLocateRequests(params: LocateGetLocateRequestsParams): LocateGetLocateRequestsResponse =
        getLocateRequests(params, RequestOptions.none())

    /** @see getLocateRequests */
    fun getLocateRequests(
        accountId: Long,
        requestOptions: RequestOptions,
    ): LocateGetLocateRequestsResponse =
        getLocateRequests(accountId, LocateGetLocateRequestsParams.none(), requestOptions)

    /** Modifies an existing locate request. */
    fun updateLocateRequest(
        accountId: Long,
        params: LocateUpdateLocateRequestParams,
    ): LocateUpdateLocateRequestResponse =
        updateLocateRequest(accountId, params, RequestOptions.none())

    /** @see updateLocateRequest */
    fun updateLocateRequest(
        accountId: Long,
        params: LocateUpdateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateUpdateLocateRequestResponse =
        updateLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see updateLocateRequest */
    fun updateLocateRequest(
        params: LocateUpdateLocateRequestParams
    ): LocateUpdateLocateRequestResponse = updateLocateRequest(params, RequestOptions.none())

    /** @see updateLocateRequest */
    fun updateLocateRequest(
        params: LocateUpdateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateUpdateLocateRequestResponse

    /** A view of [LocateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateService.WithRawResponse

        /** Manage locate requests for short selling. */
        fun inventory(): InventoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/accounts/{account_id}/locates`, but is
         * otherwise the same as [LocateService.createLocateRequest].
         */
        @MustBeClosed
        fun createLocateRequest(
            accountId: Long,
            params: LocateCreateLocateRequestParams,
        ): HttpResponseFor<LocateCreateLocateRequestResponse> =
            createLocateRequest(accountId, params, RequestOptions.none())

        /** @see createLocateRequest */
        @MustBeClosed
        fun createLocateRequest(
            accountId: Long,
            params: LocateCreateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateCreateLocateRequestResponse> =
            createLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see createLocateRequest */
        @MustBeClosed
        fun createLocateRequest(
            params: LocateCreateLocateRequestParams
        ): HttpResponseFor<LocateCreateLocateRequestResponse> =
            createLocateRequest(params, RequestOptions.none())

        /** @see createLocateRequest */
        @MustBeClosed
        fun createLocateRequest(
            params: LocateCreateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateCreateLocateRequestResponse>

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/locates`, but is
         * otherwise the same as [LocateService.getLocateRequests].
         */
        @MustBeClosed
        fun getLocateRequests(accountId: Long): HttpResponseFor<LocateGetLocateRequestsResponse> =
            getLocateRequests(accountId, LocateGetLocateRequestsParams.none())

        /** @see getLocateRequests */
        @MustBeClosed
        fun getLocateRequests(
            accountId: Long,
            params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateGetLocateRequestsResponse> =
            getLocateRequests(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getLocateRequests */
        @MustBeClosed
        fun getLocateRequests(
            accountId: Long,
            params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
        ): HttpResponseFor<LocateGetLocateRequestsResponse> =
            getLocateRequests(accountId, params, RequestOptions.none())

        /** @see getLocateRequests */
        @MustBeClosed
        fun getLocateRequests(
            params: LocateGetLocateRequestsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateGetLocateRequestsResponse>

        /** @see getLocateRequests */
        @MustBeClosed
        fun getLocateRequests(
            params: LocateGetLocateRequestsParams
        ): HttpResponseFor<LocateGetLocateRequestsResponse> =
            getLocateRequests(params, RequestOptions.none())

        /** @see getLocateRequests */
        @MustBeClosed
        fun getLocateRequests(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateGetLocateRequestsResponse> =
            getLocateRequests(accountId, LocateGetLocateRequestsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /active/v1/accounts/{account_id}/locates`, but is
         * otherwise the same as [LocateService.updateLocateRequest].
         */
        @MustBeClosed
        fun updateLocateRequest(
            accountId: Long,
            params: LocateUpdateLocateRequestParams,
        ): HttpResponseFor<LocateUpdateLocateRequestResponse> =
            updateLocateRequest(accountId, params, RequestOptions.none())

        /** @see updateLocateRequest */
        @MustBeClosed
        fun updateLocateRequest(
            accountId: Long,
            params: LocateUpdateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateUpdateLocateRequestResponse> =
            updateLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see updateLocateRequest */
        @MustBeClosed
        fun updateLocateRequest(
            params: LocateUpdateLocateRequestParams
        ): HttpResponseFor<LocateUpdateLocateRequestResponse> =
            updateLocateRequest(params, RequestOptions.none())

        /** @see updateLocateRequest */
        @MustBeClosed
        fun updateLocateRequest(
            params: LocateUpdateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateUpdateLocateRequestResponse>
    }
}
