// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.venues.VenueGetVenuesParams
import com.clear_street.api.models.active.v1.instruments.venues.VenueGetVenuesResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface VenueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VenueService

    /** Retrieves a list of available trading venues and exchanges. */
    fun getVenues(): VenueGetVenuesResponse = getVenues(VenueGetVenuesParams.none())

    /** @see getVenues */
    fun getVenues(
        params: VenueGetVenuesParams = VenueGetVenuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VenueGetVenuesResponse

    /** @see getVenues */
    fun getVenues(
        params: VenueGetVenuesParams = VenueGetVenuesParams.none()
    ): VenueGetVenuesResponse = getVenues(params, RequestOptions.none())

    /** @see getVenues */
    fun getVenues(requestOptions: RequestOptions): VenueGetVenuesResponse =
        getVenues(VenueGetVenuesParams.none(), requestOptions)

    /** A view of [VenueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VenueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments/venues`, but is otherwise the
         * same as [VenueService.getVenues].
         */
        @MustBeClosed
        fun getVenues(): HttpResponseFor<VenueGetVenuesResponse> =
            getVenues(VenueGetVenuesParams.none())

        /** @see getVenues */
        @MustBeClosed
        fun getVenues(
            params: VenueGetVenuesParams = VenueGetVenuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VenueGetVenuesResponse>

        /** @see getVenues */
        @MustBeClosed
        fun getVenues(
            params: VenueGetVenuesParams = VenueGetVenuesParams.none()
        ): HttpResponseFor<VenueGetVenuesResponse> = getVenues(params, RequestOptions.none())

        /** @see getVenues */
        @MustBeClosed
        fun getVenues(requestOptions: RequestOptions): HttpResponseFor<VenueGetVenuesResponse> =
            getVenues(VenueGetVenuesParams.none(), requestOptions)
    }
}
