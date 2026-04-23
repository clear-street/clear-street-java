// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestResponse
import com.clear_street.api.services.async.active.v1.accounts.locates.InventoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage locate requests for short selling. */
interface LocateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateServiceAsync

    /** Manage locate requests for short selling. */
    fun inventory(): InventoryServiceAsync

    /** Submits a new short stock locate request. */
    fun createLocateRequest(
        accountId: Long,
        params: LocateCreateLocateRequestParams,
    ): CompletableFuture<LocateCreateLocateRequestResponse> =
        createLocateRequest(accountId, params, RequestOptions.none())

    /** @see createLocateRequest */
    fun createLocateRequest(
        accountId: Long,
        params: LocateCreateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocateCreateLocateRequestResponse> =
        createLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see createLocateRequest */
    fun createLocateRequest(
        params: LocateCreateLocateRequestParams
    ): CompletableFuture<LocateCreateLocateRequestResponse> =
        createLocateRequest(params, RequestOptions.none())

    /** @see createLocateRequest */
    fun createLocateRequest(
        params: LocateCreateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocateCreateLocateRequestResponse>

    /** Retrieves all locate requests for the specified account. */
    fun getLocateRequests(accountId: Long): CompletableFuture<LocateGetLocateRequestsResponse> =
        getLocateRequests(accountId, LocateGetLocateRequestsParams.none())

    /** @see getLocateRequests */
    fun getLocateRequests(
        accountId: Long,
        params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocateGetLocateRequestsResponse> =
        getLocateRequests(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getLocateRequests */
    fun getLocateRequests(
        accountId: Long,
        params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
    ): CompletableFuture<LocateGetLocateRequestsResponse> =
        getLocateRequests(accountId, params, RequestOptions.none())

    /** @see getLocateRequests */
    fun getLocateRequests(
        params: LocateGetLocateRequestsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocateGetLocateRequestsResponse>

    /** @see getLocateRequests */
    fun getLocateRequests(
        params: LocateGetLocateRequestsParams
    ): CompletableFuture<LocateGetLocateRequestsResponse> =
        getLocateRequests(params, RequestOptions.none())

    /** @see getLocateRequests */
    fun getLocateRequests(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocateGetLocateRequestsResponse> =
        getLocateRequests(accountId, LocateGetLocateRequestsParams.none(), requestOptions)

    /** Modifies an existing locate request. */
    fun updateLocateRequest(
        accountId: Long,
        params: LocateUpdateLocateRequestParams,
    ): CompletableFuture<LocateUpdateLocateRequestResponse> =
        updateLocateRequest(accountId, params, RequestOptions.none())

    /** @see updateLocateRequest */
    fun updateLocateRequest(
        accountId: Long,
        params: LocateUpdateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocateUpdateLocateRequestResponse> =
        updateLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see updateLocateRequest */
    fun updateLocateRequest(
        params: LocateUpdateLocateRequestParams
    ): CompletableFuture<LocateUpdateLocateRequestResponse> =
        updateLocateRequest(params, RequestOptions.none())

    /** @see updateLocateRequest */
    fun updateLocateRequest(
        params: LocateUpdateLocateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocateUpdateLocateRequestResponse>

    /**
     * A view of [LocateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocateServiceAsync.WithRawResponse

        /** Manage locate requests for short selling. */
        fun inventory(): InventoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/accounts/{account_id}/locates`, but is
         * otherwise the same as [LocateServiceAsync.createLocateRequest].
         */
        fun createLocateRequest(
            accountId: Long,
            params: LocateCreateLocateRequestParams,
        ): CompletableFuture<HttpResponseFor<LocateCreateLocateRequestResponse>> =
            createLocateRequest(accountId, params, RequestOptions.none())

        /** @see createLocateRequest */
        fun createLocateRequest(
            accountId: Long,
            params: LocateCreateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocateCreateLocateRequestResponse>> =
            createLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see createLocateRequest */
        fun createLocateRequest(
            params: LocateCreateLocateRequestParams
        ): CompletableFuture<HttpResponseFor<LocateCreateLocateRequestResponse>> =
            createLocateRequest(params, RequestOptions.none())

        /** @see createLocateRequest */
        fun createLocateRequest(
            params: LocateCreateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocateCreateLocateRequestResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/locates`, but is
         * otherwise the same as [LocateServiceAsync.getLocateRequests].
         */
        fun getLocateRequests(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRequestsResponse>> =
            getLocateRequests(accountId, LocateGetLocateRequestsParams.none())

        /** @see getLocateRequests */
        fun getLocateRequests(
            accountId: Long,
            params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRequestsResponse>> =
            getLocateRequests(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getLocateRequests */
        fun getLocateRequests(
            accountId: Long,
            params: LocateGetLocateRequestsParams = LocateGetLocateRequestsParams.none(),
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRequestsResponse>> =
            getLocateRequests(accountId, params, RequestOptions.none())

        /** @see getLocateRequests */
        fun getLocateRequests(
            params: LocateGetLocateRequestsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRequestsResponse>>

        /** @see getLocateRequests */
        fun getLocateRequests(
            params: LocateGetLocateRequestsParams
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRequestsResponse>> =
            getLocateRequests(params, RequestOptions.none())

        /** @see getLocateRequests */
        fun getLocateRequests(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRequestsResponse>> =
            getLocateRequests(accountId, LocateGetLocateRequestsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /active/v1/accounts/{account_id}/locates`, but is
         * otherwise the same as [LocateServiceAsync.updateLocateRequest].
         */
        fun updateLocateRequest(
            accountId: Long,
            params: LocateUpdateLocateRequestParams,
        ): CompletableFuture<HttpResponseFor<LocateUpdateLocateRequestResponse>> =
            updateLocateRequest(accountId, params, RequestOptions.none())

        /** @see updateLocateRequest */
        fun updateLocateRequest(
            accountId: Long,
            params: LocateUpdateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocateUpdateLocateRequestResponse>> =
            updateLocateRequest(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see updateLocateRequest */
        fun updateLocateRequest(
            params: LocateUpdateLocateRequestParams
        ): CompletableFuture<HttpResponseFor<LocateUpdateLocateRequestResponse>> =
            updateLocateRequest(params, RequestOptions.none())

        /** @see updateLocateRequest */
        fun updateLocateRequest(
            params: LocateUpdateLocateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocateUpdateLocateRequestResponse>>
    }
}
