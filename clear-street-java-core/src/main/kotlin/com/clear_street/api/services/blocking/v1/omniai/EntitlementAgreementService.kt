// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementListEntitlementAgreementsParams
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementListEntitlementAgreementsResponse
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
    fun listEntitlementAgreements(): EntitlementAgreementListEntitlementAgreementsResponse =
        listEntitlementAgreements(EntitlementAgreementListEntitlementAgreementsParams.none())

    /** @see listEntitlementAgreements */
    fun listEntitlementAgreements(
        params: EntitlementAgreementListEntitlementAgreementsParams =
            EntitlementAgreementListEntitlementAgreementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementAgreementListEntitlementAgreementsResponse

    /** @see listEntitlementAgreements */
    fun listEntitlementAgreements(
        params: EntitlementAgreementListEntitlementAgreementsParams =
            EntitlementAgreementListEntitlementAgreementsParams.none()
    ): EntitlementAgreementListEntitlementAgreementsResponse =
        listEntitlementAgreements(params, RequestOptions.none())

    /** @see listEntitlementAgreements */
    fun listEntitlementAgreements(
        requestOptions: RequestOptions
    ): EntitlementAgreementListEntitlementAgreementsResponse =
        listEntitlementAgreements(
            EntitlementAgreementListEntitlementAgreementsParams.none(),
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
         * otherwise the same as [EntitlementAgreementService.listEntitlementAgreements].
         */
        @MustBeClosed
        fun listEntitlementAgreements():
            HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse> =
            listEntitlementAgreements(EntitlementAgreementListEntitlementAgreementsParams.none())

        /** @see listEntitlementAgreements */
        @MustBeClosed
        fun listEntitlementAgreements(
            params: EntitlementAgreementListEntitlementAgreementsParams =
                EntitlementAgreementListEntitlementAgreementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse>

        /** @see listEntitlementAgreements */
        @MustBeClosed
        fun listEntitlementAgreements(
            params: EntitlementAgreementListEntitlementAgreementsParams =
                EntitlementAgreementListEntitlementAgreementsParams.none()
        ): HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse> =
            listEntitlementAgreements(params, RequestOptions.none())

        /** @see listEntitlementAgreements */
        @MustBeClosed
        fun listEntitlementAgreements(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse> =
            listEntitlementAgreements(
                EntitlementAgreementListEntitlementAgreementsParams.none(),
                requestOptions,
            )
    }
}
