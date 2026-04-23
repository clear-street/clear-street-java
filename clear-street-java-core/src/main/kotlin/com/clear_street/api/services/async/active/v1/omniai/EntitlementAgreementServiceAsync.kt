// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.entitlementagreements.EntitlementAgreementListEntitlementAgreementsParams
import com.clear_street.api.models.active.v1.omniai.entitlementagreements.EntitlementAgreementListEntitlementAgreementsResponse
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
    fun listEntitlementAgreements():
        CompletableFuture<EntitlementAgreementListEntitlementAgreementsResponse> =
        listEntitlementAgreements(EntitlementAgreementListEntitlementAgreementsParams.none())

    /** @see listEntitlementAgreements */
    fun listEntitlementAgreements(
        params: EntitlementAgreementListEntitlementAgreementsParams =
            EntitlementAgreementListEntitlementAgreementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementAgreementListEntitlementAgreementsResponse>

    /** @see listEntitlementAgreements */
    fun listEntitlementAgreements(
        params: EntitlementAgreementListEntitlementAgreementsParams =
            EntitlementAgreementListEntitlementAgreementsParams.none()
    ): CompletableFuture<EntitlementAgreementListEntitlementAgreementsResponse> =
        listEntitlementAgreements(params, RequestOptions.none())

    /** @see listEntitlementAgreements */
    fun listEntitlementAgreements(
        requestOptions: RequestOptions
    ): CompletableFuture<EntitlementAgreementListEntitlementAgreementsResponse> =
        listEntitlementAgreements(
            EntitlementAgreementListEntitlementAgreementsParams.none(),
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
         * Returns a raw HTTP response for `get /active/v1/omni-ai/entitlement-agreements`, but is
         * otherwise the same as [EntitlementAgreementServiceAsync.listEntitlementAgreements].
         */
        fun listEntitlementAgreements():
            CompletableFuture<
                HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse>
            > =
            listEntitlementAgreements(EntitlementAgreementListEntitlementAgreementsParams.none())

        /** @see listEntitlementAgreements */
        fun listEntitlementAgreements(
            params: EntitlementAgreementListEntitlementAgreementsParams =
                EntitlementAgreementListEntitlementAgreementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse>>

        /** @see listEntitlementAgreements */
        fun listEntitlementAgreements(
            params: EntitlementAgreementListEntitlementAgreementsParams =
                EntitlementAgreementListEntitlementAgreementsParams.none()
        ): CompletableFuture<
            HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse>
        > = listEntitlementAgreements(params, RequestOptions.none())

        /** @see listEntitlementAgreements */
        fun listEntitlementAgreements(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse>
        > =
            listEntitlementAgreements(
                EntitlementAgreementListEntitlementAgreementsParams.none(),
                requestOptions,
            )
    }
}
