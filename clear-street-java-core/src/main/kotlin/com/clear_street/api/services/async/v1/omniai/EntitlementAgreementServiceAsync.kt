// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementGetEntitlementAgreementsParams
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementGetEntitlementAgreementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
interface EntitlementAgreementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementAgreementServiceAsync

    /** List current signable entitlement agreements for consent UX. */
    fun getEntitlementAgreements():
        CompletableFuture<EntitlementAgreementGetEntitlementAgreementsResponse> =
        getEntitlementAgreements(EntitlementAgreementGetEntitlementAgreementsParams.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementAgreementGetEntitlementAgreementsParams =
            EntitlementAgreementGetEntitlementAgreementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementAgreementGetEntitlementAgreementsResponse>

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementAgreementGetEntitlementAgreementsParams =
            EntitlementAgreementGetEntitlementAgreementsParams.none()
    ): CompletableFuture<EntitlementAgreementGetEntitlementAgreementsResponse> =
        getEntitlementAgreements(params, RequestOptions.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        requestOptions: RequestOptions
    ): CompletableFuture<EntitlementAgreementGetEntitlementAgreementsResponse> =
        getEntitlementAgreements(
            EntitlementAgreementGetEntitlementAgreementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [EntitlementAgreementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementAgreementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlement-agreements`, but is
         * otherwise the same as [EntitlementAgreementServiceAsync.getEntitlementAgreements].
         */
        fun getEntitlementAgreements():
            CompletableFuture<
                HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse>
            > = getEntitlementAgreements(EntitlementAgreementGetEntitlementAgreementsParams.none())

        /** @see getEntitlementAgreements */
        fun getEntitlementAgreements(
            params: EntitlementAgreementGetEntitlementAgreementsParams =
                EntitlementAgreementGetEntitlementAgreementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse>>

        /** @see getEntitlementAgreements */
        fun getEntitlementAgreements(
            params: EntitlementAgreementGetEntitlementAgreementsParams =
                EntitlementAgreementGetEntitlementAgreementsParams.none()
        ): CompletableFuture<
            HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse>
        > = getEntitlementAgreements(params, RequestOptions.none())

        /** @see getEntitlementAgreements */
        fun getEntitlementAgreements(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse>
        > =
            getEntitlementAgreements(
                EntitlementAgreementGetEntitlementAgreementsParams.none(),
                requestOptions,
            )
    }
}
