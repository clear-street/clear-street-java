// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementGetEntitlementAgreementsParams
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementGetEntitlementAgreementsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
interface EntitlementAgreementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementAgreementService

    /** List current signable entitlement agreements for consent UX. */
    fun getEntitlementAgreements(): EntitlementAgreementGetEntitlementAgreementsResponse =
        getEntitlementAgreements(EntitlementAgreementGetEntitlementAgreementsParams.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementAgreementGetEntitlementAgreementsParams =
            EntitlementAgreementGetEntitlementAgreementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementAgreementGetEntitlementAgreementsResponse

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        params: EntitlementAgreementGetEntitlementAgreementsParams =
            EntitlementAgreementGetEntitlementAgreementsParams.none()
    ): EntitlementAgreementGetEntitlementAgreementsResponse =
        getEntitlementAgreements(params, RequestOptions.none())

    /** @see getEntitlementAgreements */
    fun getEntitlementAgreements(
        requestOptions: RequestOptions
    ): EntitlementAgreementGetEntitlementAgreementsResponse =
        getEntitlementAgreements(
            EntitlementAgreementGetEntitlementAgreementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [EntitlementAgreementService] that provides access to raw HTTP responses for each
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
        ): EntitlementAgreementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/entitlement-agreements`, but is
         * otherwise the same as [EntitlementAgreementService.getEntitlementAgreements].
         */
        @MustBeClosed
        fun getEntitlementAgreements():
            HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse> =
            getEntitlementAgreements(EntitlementAgreementGetEntitlementAgreementsParams.none())

        /** @see getEntitlementAgreements */
        @MustBeClosed
        fun getEntitlementAgreements(
            params: EntitlementAgreementGetEntitlementAgreementsParams =
                EntitlementAgreementGetEntitlementAgreementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse>

        /** @see getEntitlementAgreements */
        @MustBeClosed
        fun getEntitlementAgreements(
            params: EntitlementAgreementGetEntitlementAgreementsParams =
                EntitlementAgreementGetEntitlementAgreementsParams.none()
        ): HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse> =
            getEntitlementAgreements(params, RequestOptions.none())

        /** @see getEntitlementAgreements */
        @MustBeClosed
        fun getEntitlementAgreements(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntitlementAgreementGetEntitlementAgreementsResponse> =
            getEntitlementAgreements(
                EntitlementAgreementGetEntitlementAgreementsParams.none(),
                requestOptions,
            )
    }
}
