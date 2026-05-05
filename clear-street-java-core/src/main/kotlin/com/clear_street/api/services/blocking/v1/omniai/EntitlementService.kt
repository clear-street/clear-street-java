// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsResponse
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementDeleteEntitlementParams
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementDeleteEntitlementResponse
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementGetEntitlementsParams
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementGetEntitlementsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
interface EntitlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementService

    /** Record consent and upsert one-or-more active grants. */
    fun createEntitlements(
        params: EntitlementCreateEntitlementsParams
    ): EntitlementCreateEntitlementsResponse = createEntitlements(params, RequestOptions.none())

    /** @see createEntitlements */
    fun createEntitlements(
        params: EntitlementCreateEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementCreateEntitlementsResponse

    /** Revoke one entitlement grant by id. */
    fun deleteEntitlement(entitlementId: String): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(params.toBuilder().entitlementId(entitlementId).build(), requestOptions)

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
    ): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(entitlementId, params, RequestOptions.none())

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementDeleteEntitlementResponse

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams
    ): EntitlementDeleteEntitlementResponse = deleteEntitlement(params, RequestOptions.none())

    /** @see deleteEntitlement */
    fun deleteEntitlement(
        entitlementId: String,
        requestOptions: RequestOptions,
    ): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none(), requestOptions)

    /** List caller's active entitlement grants. */
    fun getEntitlements(): EntitlementGetEntitlementsResponse =
        getEntitlements(EntitlementGetEntitlementsParams.none())

    /** @see getEntitlements */
    fun getEntitlements(
        params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGetEntitlementsResponse

    /** @see getEntitlements */
    fun getEntitlements(
        params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none()
    ): EntitlementGetEntitlementsResponse = getEntitlements(params, RequestOptions.none())

    /** @see getEntitlements */
    fun getEntitlements(requestOptions: RequestOptions): EntitlementGetEntitlementsResponse =
        getEntitlements(EntitlementGetEntitlementsParams.none(), requestOptions)

    /**
     * A view of [EntitlementService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/entitlements`, but is otherwise the
         * same as [EntitlementService.createEntitlements].
         */
        @MustBeClosed
        fun createEntitlements(
            params: EntitlementCreateEntitlementsParams
        ): HttpResponseFor<EntitlementCreateEntitlementsResponse> =
            createEntitlements(params, RequestOptions.none())

        /** @see createEntitlements */
        @MustBeClosed
        fun createEntitlements(
            params: EntitlementCreateEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementCreateEntitlementsResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/omni-ai/entitlements/{entitlement_id}`, but
         * is otherwise the same as [EntitlementService.deleteEntitlement].
         */
        @MustBeClosed
        fun deleteEntitlement(
            entitlementId: String
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

        /** @see deleteEntitlement */
        @MustBeClosed
        fun deleteEntitlement(
            entitlementId: String,
            params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(
                params.toBuilder().entitlementId(entitlementId).build(),
                requestOptions,
            )

        /** @see deleteEntitlement */
        @MustBeClosed
        fun deleteEntitlement(
            entitlementId: String,
            params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(entitlementId, params, RequestOptions.none())

        /** @see deleteEntitlement */
        @MustBeClosed
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse>

        /** @see deleteEntitlement */
        @MustBeClosed
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(params, RequestOptions.none())

        /** @see deleteEntitlement */
        @MustBeClosed
        fun deleteEntitlement(
            entitlementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(
                entitlementId,
                EntitlementDeleteEntitlementParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlements`, but is otherwise the same
         * as [EntitlementService.getEntitlements].
         */
        @MustBeClosed
        fun getEntitlements(): HttpResponseFor<EntitlementGetEntitlementsResponse> =
            getEntitlements(EntitlementGetEntitlementsParams.none())

        /** @see getEntitlements */
        @MustBeClosed
        fun getEntitlements(
            params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGetEntitlementsResponse>

        /** @see getEntitlements */
        @MustBeClosed
        fun getEntitlements(
            params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none()
        ): HttpResponseFor<EntitlementGetEntitlementsResponse> =
            getEntitlements(params, RequestOptions.none())

        /** @see getEntitlements */
        @MustBeClosed
        fun getEntitlements(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntitlementGetEntitlementsResponse> =
            getEntitlements(EntitlementGetEntitlementsParams.none(), requestOptions)
    }
}
