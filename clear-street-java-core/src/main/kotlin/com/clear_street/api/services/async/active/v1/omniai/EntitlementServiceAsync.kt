// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementCreateEntitlementsResponse
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementDeleteEntitlementParams
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementDeleteEntitlementResponse
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementListEntitlementsParams
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementListEntitlementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
interface EntitlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementServiceAsync

    /** Record consent and upsert one-or-more active grants. */
    fun createEntitlements(
        params: EntitlementCreateEntitlementsParams
    ): CompletableFuture<EntitlementCreateEntitlementsResponse> =
        createEntitlements(params, RequestOptions.none())

    /** @see createEntitlements */
    fun createEntitlements(
        params: EntitlementCreateEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementCreateEntitlementsResponse>

    /** Revoke one entitlement grant by id. */
    fun deleteEntitlement(
        entitlementId: String
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(params.toBuilder().entitlementId(entitlementId).build(), requestOptions)

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(entitlementId, params, RequestOptions.none())

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementDeleteEntitlementResponse>

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(params, RequestOptions.none())

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        entitlementId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none(), requestOptions)

    /** List caller's active entitlement grants. */
    fun listEntitlements(): CompletableFuture<EntitlementListEntitlementsResponse> =
        listEntitlements(EntitlementListEntitlementsParams.none())

    /** @see listEntitlements */
    fun listEntitlements(
        params: EntitlementListEntitlementsParams = EntitlementListEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementListEntitlementsResponse>

    /** @see listEntitlements */
    fun listEntitlements(
        params: EntitlementListEntitlementsParams = EntitlementListEntitlementsParams.none()
    ): CompletableFuture<EntitlementListEntitlementsResponse> =
        listEntitlements(params, RequestOptions.none())

    /** @see listEntitlements */
    fun listEntitlements(
        requestOptions: RequestOptions
    ): CompletableFuture<EntitlementListEntitlementsResponse> =
        listEntitlements(EntitlementListEntitlementsParams.none(), requestOptions)

    /**
     * A view of [EntitlementServiceAsync] that provides access to raw HTTP responses for each
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
        ): EntitlementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/omni-ai/entitlements`, but is otherwise
         * the same as [EntitlementServiceAsync.createEntitlements].
         */
        fun createEntitlements(
            params: EntitlementCreateEntitlementsParams
        ): CompletableFuture<HttpResponseFor<EntitlementCreateEntitlementsResponse>> =
            createEntitlements(params, RequestOptions.none())

        /** @see createEntitlements */
        fun createEntitlements(
            params: EntitlementCreateEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementCreateEntitlementsResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /active/v1/omni-ai/entitlements/{entitlement_id}`, but is otherwise the same as
         * [EntitlementServiceAsync.deleteEntitlement].
         */
        fun deleteEntitlement(
            entitlementId: String
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

        /** @see deleteEntitlement */
        fun deleteEntitlement(
            entitlementId: String,
            params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(
                params.toBuilder().entitlementId(entitlementId).build(),
                requestOptions,
            )

        /** @see deleteEntitlement */
        fun deleteEntitlement(
            entitlementId: String,
            params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(entitlementId, params, RequestOptions.none())

        /** @see deleteEntitlement */
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>>

        /** @see deleteEntitlement */
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(params, RequestOptions.none())

        /** @see deleteEntitlement */
        fun deleteEntitlement(
            entitlementId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(
                entitlementId,
                EntitlementDeleteEntitlementParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/entitlements`, but is otherwise
         * the same as [EntitlementServiceAsync.listEntitlements].
         */
        fun listEntitlements():
            CompletableFuture<HttpResponseFor<EntitlementListEntitlementsResponse>> =
            listEntitlements(EntitlementListEntitlementsParams.none())

        /** @see listEntitlements */
        fun listEntitlements(
            params: EntitlementListEntitlementsParams = EntitlementListEntitlementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListEntitlementsResponse>>

        /** @see listEntitlements */
        fun listEntitlements(
            params: EntitlementListEntitlementsParams = EntitlementListEntitlementsParams.none()
        ): CompletableFuture<HttpResponseFor<EntitlementListEntitlementsResponse>> =
            listEntitlements(params, RequestOptions.none())

        /** @see listEntitlements */
        fun listEntitlements(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntitlementListEntitlementsResponse>> =
            listEntitlements(EntitlementListEntitlementsParams.none(), requestOptions)
    }
}
