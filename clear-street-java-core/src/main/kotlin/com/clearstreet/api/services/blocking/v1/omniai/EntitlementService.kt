// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.omniai

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use account_ids.
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

    /**
     * Revoke one entitlement grant by id.
     *
     * Deprecated -- use `POST /omni-ai/entitlements/opt-out`.
     */
    @Deprecated("deprecated")
    fun deleteEntitlement(entitlementId: String): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(params.toBuilder().entitlementId(entitlementId).build(), requestOptions)

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        entitlementId: String,
        params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
    ): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(entitlementId, params, RequestOptions.none())

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementDeleteEntitlementResponse

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams
    ): EntitlementDeleteEntitlementResponse = deleteEntitlement(params, RequestOptions.none())

    /** @see deleteEntitlement */
    @Deprecated("deprecated")
    fun deleteEntitlement(
        entitlementId: String,
        requestOptions: RequestOptions,
    ): EntitlementDeleteEntitlementResponse =
        deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none(), requestOptions)

    /** List current signable entitlement agreements for consent UX. */
    fun getEntitlementAgreements(): EntitlementGetEntitlementAgreementsResponse =
        getEntitlementAgreements(EntitlementGetEntitlementAgreementsParams.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementGetEntitlementAgreementsParams =
            EntitlementGetEntitlementAgreementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGetEntitlementAgreementsResponse

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementGetEntitlementAgreementsParams =
            EntitlementGetEntitlementAgreementsParams.none()
    ): EntitlementGetEntitlementAgreementsResponse =
        getEntitlementAgreements(params, RequestOptions.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        requestOptions: RequestOptions
    ): EntitlementGetEntitlementAgreementsResponse =
        getEntitlementAgreements(EntitlementGetEntitlementAgreementsParams.none(), requestOptions)

    /**
     * Whether each entitlement is enabled, per account. Accounts with no recorded choice are
     * enabled by default. Without `account_id`, covers every account the caller can access.
     */
    fun getEntitlementStatus(): EntitlementGetEntitlementStatusResponse =
        getEntitlementStatus(EntitlementGetEntitlementStatusParams.none())

    /** @see getEntitlementStatus */
    fun getEntitlementStatus(
        params: EntitlementGetEntitlementStatusParams =
            EntitlementGetEntitlementStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGetEntitlementStatusResponse

    /** @see getEntitlementStatus */
    fun getEntitlementStatus(
        params: EntitlementGetEntitlementStatusParams = EntitlementGetEntitlementStatusParams.none()
    ): EntitlementGetEntitlementStatusResponse = getEntitlementStatus(params, RequestOptions.none())

    /** @see getEntitlementStatus */
    fun getEntitlementStatus(
        requestOptions: RequestOptions
    ): EntitlementGetEntitlementStatusResponse =
        getEntitlementStatus(EntitlementGetEntitlementStatusParams.none(), requestOptions)

    /**
     * List caller's active entitlement grants.
     *
     * Deprecated -- use `GET /omni-ai/entitlement-status`; this lists explicit grants only and
     * omits accounts that are enabled by default.
     */
    @Deprecated("deprecated")
    fun getEntitlements(): EntitlementGetEntitlementsResponse =
        getEntitlements(EntitlementGetEntitlementsParams.none())

    /** @see getEntitlements */
    @Deprecated("deprecated")
    fun getEntitlements(
        params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGetEntitlementsResponse

    /** @see getEntitlements */
    @Deprecated("deprecated")
    fun getEntitlements(
        params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none()
    ): EntitlementGetEntitlementsResponse = getEntitlements(params, RequestOptions.none())

    /** @see getEntitlements */
    @Deprecated("deprecated")
    fun getEntitlements(requestOptions: RequestOptions): EntitlementGetEntitlementsResponse =
        getEntitlements(EntitlementGetEntitlementsParams.none(), requestOptions)

    /**
     * Turn off one-or-more entitlements for the given accounts. Idempotent: accounts that are
     * already opted out are left as they are. To turn an entitlement back on, sign the agreement
     * with `POST /omni-ai/entitlements`.
     */
    fun optOutEntitlements(
        params: EntitlementOptOutEntitlementsParams
    ): EntitlementOptOutEntitlementsResponse = optOutEntitlements(params, RequestOptions.none())

    /** @see optOutEntitlements */
    fun optOutEntitlements(
        params: EntitlementOptOutEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementOptOutEntitlementsResponse

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
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteEntitlement(
            entitlementId: String
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(entitlementId, EntitlementDeleteEntitlementParams.none())

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteEntitlement(
            entitlementId: String,
            params: EntitlementDeleteEntitlementParams = EntitlementDeleteEntitlementParams.none(),
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(entitlementId, params, RequestOptions.none())

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse>

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> =
            deleteEntitlement(params, RequestOptions.none())

        /** @see deleteEntitlement */
        @Deprecated("deprecated")
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
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlement-agreements`, but is
         * otherwise the same as [EntitlementService.getEntitlementAgreements].
         */
        @MustBeClosed
        fun getEntitlementAgreements():
            HttpResponseFor<EntitlementGetEntitlementAgreementsResponse> =
            getEntitlementAgreements(EntitlementGetEntitlementAgreementsParams.none())

        /** @see getEntitlementAgreements */
        @MustBeClosed
        fun getEntitlementAgreements(
            params: EntitlementGetEntitlementAgreementsParams =
                EntitlementGetEntitlementAgreementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGetEntitlementAgreementsResponse>

        /** @see getEntitlementAgreements */
        @MustBeClosed
        fun getEntitlementAgreements(
            params: EntitlementGetEntitlementAgreementsParams =
                EntitlementGetEntitlementAgreementsParams.none()
        ): HttpResponseFor<EntitlementGetEntitlementAgreementsResponse> =
            getEntitlementAgreements(params, RequestOptions.none())

        /** @see getEntitlementAgreements */
        @MustBeClosed
        fun getEntitlementAgreements(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntitlementGetEntitlementAgreementsResponse> =
            getEntitlementAgreements(
                EntitlementGetEntitlementAgreementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlement-status`, but is otherwise
         * the same as [EntitlementService.getEntitlementStatus].
         */
        @MustBeClosed
        fun getEntitlementStatus(): HttpResponseFor<EntitlementGetEntitlementStatusResponse> =
            getEntitlementStatus(EntitlementGetEntitlementStatusParams.none())

        /** @see getEntitlementStatus */
        @MustBeClosed
        fun getEntitlementStatus(
            params: EntitlementGetEntitlementStatusParams =
                EntitlementGetEntitlementStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGetEntitlementStatusResponse>

        /** @see getEntitlementStatus */
        @MustBeClosed
        fun getEntitlementStatus(
            params: EntitlementGetEntitlementStatusParams =
                EntitlementGetEntitlementStatusParams.none()
        ): HttpResponseFor<EntitlementGetEntitlementStatusResponse> =
            getEntitlementStatus(params, RequestOptions.none())

        /** @see getEntitlementStatus */
        @MustBeClosed
        fun getEntitlementStatus(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntitlementGetEntitlementStatusResponse> =
            getEntitlementStatus(EntitlementGetEntitlementStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlements`, but is otherwise the same
         * as [EntitlementService.getEntitlements].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getEntitlements(): HttpResponseFor<EntitlementGetEntitlementsResponse> =
            getEntitlements(EntitlementGetEntitlementsParams.none())

        /** @see getEntitlements */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getEntitlements(
            params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGetEntitlementsResponse>

        /** @see getEntitlements */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getEntitlements(
            params: EntitlementGetEntitlementsParams = EntitlementGetEntitlementsParams.none()
        ): HttpResponseFor<EntitlementGetEntitlementsResponse> =
            getEntitlements(params, RequestOptions.none())

        /** @see getEntitlements */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getEntitlements(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntitlementGetEntitlementsResponse> =
            getEntitlements(EntitlementGetEntitlementsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/entitlements/opt-out`, but is otherwise
         * the same as [EntitlementService.optOutEntitlements].
         */
        @MustBeClosed
        fun optOutEntitlements(
            params: EntitlementOptOutEntitlementsParams
        ): HttpResponseFor<EntitlementOptOutEntitlementsResponse> =
            optOutEntitlements(params, RequestOptions.none())

        /** @see optOutEntitlements */
        @MustBeClosed
        fun optOutEntitlements(
            params: EntitlementOptOutEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementOptOutEntitlementsResponse>
    }
}
