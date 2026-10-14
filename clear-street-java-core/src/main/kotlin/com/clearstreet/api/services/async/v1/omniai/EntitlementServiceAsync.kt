// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.omniai

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsResponse
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementDeleteEntitlementParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementDeleteEntitlementResponse
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementAgreementsParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementAgreementsResponse
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementStatusParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementStatusResponse
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementsParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementGetEntitlementsResponse
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementOptOutEntitlementsParams
import com.clearstreet.api.models.v1.omniai.entitlements.EntitlementOptOutEntitlementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use account_ids.
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

    /**
     * Revoke one entitlement grant by id.
     *
     * Deprecated -- use `POST /omni-ai/entitlements/opt-out`.
     */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        entitlementId: String
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(params.toBuilder().entitlementId(entitlementId).build(), requestOptions)

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(entitlementId, params, RequestOptions.none())

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementDeleteEntitlementResponse>

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(params, RequestOptions.none())

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        entitlementId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none(), requestOptions)

    /** List current signable entitlement agreements for consent UX. */
    fun getEntitlementAgreements(): CompletableFuture<EntitlementGetEntitlementAgreementsResponse> =
        getEntitlementAgreements(EntitlementGetEntitlementAgreementsParams.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementGetEntitlementAgreementsParams =
            EntitlementGetEntitlementAgreementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementGetEntitlementAgreementsResponse>

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementGetEntitlementAgreementsParams =
            EntitlementGetEntitlementAgreementsParams.none()
    ): CompletableFuture<EntitlementGetEntitlementAgreementsResponse> =
        getEntitlementAgreements(params, RequestOptions.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        requestOptions: RequestOptions
    ): CompletableFuture<EntitlementGetEntitlementAgreementsResponse> =
        getEntitlementAgreements(EntitlementGetEntitlementAgreementsParams.none(), requestOptions)

    /**
     * Whether each entitlement is enabled, per account. Accounts with no recorded choice are
     * enabled by default. Without `account_id`, covers every account the caller can access.
     */
    fun getEntitlementStatus(): CompletableFuture<EntitlementGetEntitlementStatusResponse> =
        getEntitlementStatus(EntitlementGetEntitlementStatusParams.none())

    /** @see getEntitlementStatus */
    fun getEntitlementStatus(
        params: EntitlementGetEntitlementStatusParams =
            EntitlementGetEntitlementStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementGetEntitlementStatusResponse>

    /** @see getEntitlementStatus */
    fun getEntitlementStatus(
        params: EntitlementGetEntitlementStatusParams = EntitlementGetEntitlementStatusParams.none()
    ): CompletableFuture<EntitlementGetEntitlementStatusResponse> =
        getEntitlementStatus(params, RequestOptions.none())

    /** @see getEntitlementStatus */
    fun getEntitlementStatus(
        requestOptions: RequestOptions
    ): CompletableFuture<EntitlementGetEntitlementStatusResponse> =
        getEntitlementStatus(EntitlementGetEntitlementStatusParams.none(), requestOptions)

    /**
     * List caller's active entitlement grants.
     *
     * Deprecated -- use `GET /omni-ai/entitlement-status`; this lists explicit grants only and
     * omits accounts that are enabled by default.
     */
    @Deprecated("deprecated")
    fun getEntitlements(): CompletableFuture<EntitlementGetEntitlementsResponse> =
        getEntitlements(EntitlementGetEntitlementsParams.none())

    /** @see getEntitlements */
    @Deprecated("deprecated")
    fun getEntitlements(
        params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementGetEntitlementsResponse>

    /** @see getEntitlements */
    @Deprecated("deprecated")
    fun getEntitlements(
        params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none()
    ): CompletableFuture<EntitlementGetEntitlementsResponse> =
        getEntitlements(params, RequestOptions.none())

    /** @see getEntitlements */
    @Deprecated("deprecated")
    fun getEntitlements(
        requestOptions: RequestOptions
    ): CompletableFuture<EntitlementGetEntitlementsResponse> =
        getEntitlements(EntitlementGetEntitlementsParams.none(), requestOptions)

    /**
     * Turn off one-or-more entitlements for the given accounts. Idempotent: accounts that are
     * already opted out are left as they are. To turn an entitlement back on, sign the agreement
     * with `POST /omni-ai/entitlements`.
     */
    fun optOutEntitlements(
        params: EntitlementOptOutEntitlementsParams
    ): CompletableFuture<EntitlementOptOutEntitlementsResponse> =
        optOutEntitlements(params, RequestOptions.none())

    /** @see optOutEntitlements */
    fun optOutEntitlements(
        params: EntitlementOptOutEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementOptOutEntitlementsResponse>

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
         * Returns a raw HTTP response for `post /v1/omni-ai/entitlements`, but is otherwise the
         * same as [EntitlementServiceAsync.createEntitlements].
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
         * Returns a raw HTTP response for `delete /v1/omni-ai/entitlements/{entitlement_id}`, but
         * is otherwise the same as [EntitlementServiceAsync.deleteEntitlement].
         */
        @Deprecated("deprecated")
        fun deleteEntitlement(
            entitlementId: String
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        fun deleteEntitlement(
            entitlementId: String,
            params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(entitlementId, params, RequestOptions.none())

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>>

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> =
            deleteEntitlement(params, RequestOptions.none())

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
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
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlement-agreements`, but is
         * otherwise the same as [EntitlementServiceAsync.getEntitlementAgreements].
         */
        fun getEntitlementAgreements():
            CompletableFuture<HttpResponseFor<EntitlementGetEntitlementAgreementsResponse>> =
            getEntitlementAgreements(EntitlementGetEntitlementAgreementsParams.none())

        /** @see getEntitlementAgreements */
        fun getEntitlementAgreements(
            params: EntitlementGetEntitlementAgreementsParams =
                EntitlementGetEntitlementAgreementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementAgreementsResponse>>

        /** @see getEntitlementAgreements */
        fun getEntitlementAgreements(
            params: EntitlementGetEntitlementAgreementsParams =
                EntitlementGetEntitlementAgreementsParams.none()
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementAgreementsResponse>> =
            getEntitlementAgreements(params, RequestOptions.none())

        /** @see getEntitlementAgreements */
        fun getEntitlementAgreements(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementAgreementsResponse>> =
            getEntitlementAgreements(
                EntitlementGetEntitlementAgreementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlement-status`, but is otherwise
         * the same as [EntitlementServiceAsync.getEntitlementStatus].
         */
        fun getEntitlementStatus():
            CompletableFuture<HttpResponseFor<EntitlementGetEntitlementStatusResponse>> =
            getEntitlementStatus(EntitlementGetEntitlementStatusParams.none())

        /** @see getEntitlementStatus */
        fun getEntitlementStatus(
            params: EntitlementGetEntitlementStatusParams =
                EntitlementGetEntitlementStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementStatusResponse>>

        /** @see getEntitlementStatus */
        fun getEntitlementStatus(
            params: EntitlementGetEntitlementStatusParams =
                EntitlementGetEntitlementStatusParams.none()
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementStatusResponse>> =
            getEntitlementStatus(params, RequestOptions.none())

        /** @see getEntitlementStatus */
        fun getEntitlementStatus(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementStatusResponse>> =
            getEntitlementStatus(EntitlementGetEntitlementStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlements`, but is otherwise the same
         * as [EntitlementServiceAsync.getEntitlements].
         */
        @Deprecated("deprecated")
        fun getEntitlements():
            CompletableFuture<HttpResponseFor<EntitlementGetEntitlementsResponse>> =
            getEntitlements(EntitlementGetEntitlementsParams.none())

        /** @see getEntitlements */
        @Deprecated("deprecated")
        fun getEntitlements(
            params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementsResponse>>

        /** @see getEntitlements */
        @Deprecated("deprecated")
        fun getEntitlements(
            params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none()
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementsResponse>> =
            getEntitlements(params, RequestOptions.none())

        /** @see getEntitlements */
        @Deprecated("deprecated")
        fun getEntitlements(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntitlementGetEntitlementsResponse>> =
            getEntitlements(EntitlementGetEntitlementsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/entitlements/opt-out`, but is otherwise
         * the same as [EntitlementServiceAsync.optOutEntitlements].
         */
        fun optOutEntitlements(
            params: EntitlementOptOutEntitlementsParams
        ): CompletableFuture<HttpResponseFor<EntitlementOptOutEntitlementsResponse>> =
            optOutEntitlements(params, RequestOptions.none())

        /** @see optOutEntitlements */
        fun optOutEntitlements(
            params: EntitlementOptOutEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementOptOutEntitlementsResponse>>
    }
}
