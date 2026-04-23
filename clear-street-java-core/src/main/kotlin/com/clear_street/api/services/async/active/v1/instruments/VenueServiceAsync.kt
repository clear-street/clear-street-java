// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.venues.VenueGetVenuesParams
import com.clear_street.api.models.active.v1.instruments.venues.VenueGetVenuesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface VenueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VenueServiceAsync

    /** Retrieves a list of available trading venues and exchanges. */
    fun getVenues(): CompletableFuture<VenueGetVenuesResponse> =
        getVenues(VenueGetVenuesParams.none())

    /** @see getVenues */
    fun getVenues(
        params: VenueGetVenuesParams = VenueGetVenuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VenueGetVenuesResponse>

    /** @see getVenues */
    fun getVenues(
        params: VenueGetVenuesParams = VenueGetVenuesParams.none()
    ): CompletableFuture<VenueGetVenuesResponse> = getVenues(params, RequestOptions.none())

    /** @see getVenues */
    fun getVenues(requestOptions: RequestOptions): CompletableFuture<VenueGetVenuesResponse> =
        getVenues(VenueGetVenuesParams.none(), requestOptions)

    /** A view of [VenueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VenueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments/venues`, but is otherwise the
         * same as [VenueServiceAsync.getVenues].
         */
        fun getVenues(): CompletableFuture<HttpResponseFor<VenueGetVenuesResponse>> =
            getVenues(VenueGetVenuesParams.none())

        /** @see getVenues */
        fun getVenues(
            params: VenueGetVenuesParams = VenueGetVenuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VenueGetVenuesResponse>>

        /** @see getVenues */
        fun getVenues(
            params: VenueGetVenuesParams = VenueGetVenuesParams.none()
        ): CompletableFuture<HttpResponseFor<VenueGetVenuesResponse>> =
            getVenues(params, RequestOptions.none())

        /** @see getVenues */
        fun getVenues(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VenueGetVenuesResponse>> =
            getVenues(VenueGetVenuesParams.none(), requestOptions)
    }
}
