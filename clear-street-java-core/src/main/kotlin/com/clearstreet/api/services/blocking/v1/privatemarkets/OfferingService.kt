// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.privatemarkets

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingByIdParams
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingsParams
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
interface OfferingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OfferingService

    /**
     * Fetch one visible private-market offering with its documents, participants, and any attached
     * SPV. Requires the account holder to have attested. Returns `404` when the offering does not
     * exist or is not currently visible.
     */
    fun getOfferingById(
        offeringId: String,
        params: OfferingGetOfferingByIdParams,
    ): OfferingGetOfferingByIdResponse = getOfferingById(offeringId, params, RequestOptions.none())

    /** @see getOfferingById */
    fun getOfferingById(
        offeringId: String,
        params: OfferingGetOfferingByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OfferingGetOfferingByIdResponse =
        getOfferingById(params.toBuilder().offeringId(offeringId).build(), requestOptions)

    /** @see getOfferingById */
    fun getOfferingById(params: OfferingGetOfferingByIdParams): OfferingGetOfferingByIdResponse =
        getOfferingById(params, RequestOptions.none())

    /** @see getOfferingById */
    fun getOfferingById(
        params: OfferingGetOfferingByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OfferingGetOfferingByIdResponse

    /**
     * List every visible private-market offering as a card, with its derived class, company and SPV
     * identity, and indicative terms. Requires the account holder to have attested.
     */
    fun getOfferings(params: OfferingGetOfferingsParams): OfferingGetOfferingsResponse =
        getOfferings(params, RequestOptions.none())

    /** @see getOfferings */
    fun getOfferings(
        params: OfferingGetOfferingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OfferingGetOfferingsResponse

    /** A view of [OfferingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OfferingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/offerings/{offering_id}`, but is
         * otherwise the same as [OfferingService.getOfferingById].
         */
        @MustBeClosed
        fun getOfferingById(
            offeringId: String,
            params: OfferingGetOfferingByIdParams,
        ): HttpResponseFor<OfferingGetOfferingByIdResponse> =
            getOfferingById(offeringId, params, RequestOptions.none())

        /** @see getOfferingById */
        @MustBeClosed
        fun getOfferingById(
            offeringId: String,
            params: OfferingGetOfferingByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OfferingGetOfferingByIdResponse> =
            getOfferingById(params.toBuilder().offeringId(offeringId).build(), requestOptions)

        /** @see getOfferingById */
        @MustBeClosed
        fun getOfferingById(
            params: OfferingGetOfferingByIdParams
        ): HttpResponseFor<OfferingGetOfferingByIdResponse> =
            getOfferingById(params, RequestOptions.none())

        /** @see getOfferingById */
        @MustBeClosed
        fun getOfferingById(
            params: OfferingGetOfferingByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OfferingGetOfferingByIdResponse>

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/offerings`, but is otherwise the
         * same as [OfferingService.getOfferings].
         */
        @MustBeClosed
        fun getOfferings(
            params: OfferingGetOfferingsParams
        ): HttpResponseFor<OfferingGetOfferingsResponse> =
            getOfferings(params, RequestOptions.none())

        /** @see getOfferings */
        @MustBeClosed
        fun getOfferings(
            params: OfferingGetOfferingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OfferingGetOfferingsResponse>
    }
}
