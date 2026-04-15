// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.events.EventGetAllInstrumentEventsParams
import com.clear_street.api.models.active.v1.instruments.events.EventGetAllInstrumentEventsResponse
import com.clear_street.api.models.active.v1.instruments.events.EventGetInstrumentEventsParams
import com.clear_street.api.models.active.v1.instruments.events.EventGetInstrumentEventsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    /** Retrieves all instrument events grouped by date. */
    fun getAllInstrumentEvents(): CompletableFuture<EventGetAllInstrumentEventsResponse> =
        getAllInstrumentEvents(EventGetAllInstrumentEventsParams.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetAllInstrumentEventsResponse>

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none()
    ): CompletableFuture<EventGetAllInstrumentEventsResponse> =
        getAllInstrumentEvents(params, RequestOptions.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        requestOptions: RequestOptions
    ): CompletableFuture<EventGetAllInstrumentEventsResponse> =
        getAllInstrumentEvents(EventGetAllInstrumentEventsParams.none(), requestOptions)

    /**
     * Retrieves corporate events (dividends, splits, etc.) for an instrument, grouped by event
     * type.
     *
     * Date range defaults:
     * - `from_date`: today - 365 days
     * - `to_date`: today + 60 days
     */
    fun getInstrumentEvents(
        securityId: String,
        params: EventGetInstrumentEventsParams,
    ): CompletableFuture<EventGetInstrumentEventsResponse> =
        getInstrumentEvents(securityId, params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        securityId: String,
        params: EventGetInstrumentEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetInstrumentEventsResponse> =
        getInstrumentEvents(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: EventGetInstrumentEventsParams
    ): CompletableFuture<EventGetInstrumentEventsResponse> =
        getInstrumentEvents(params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: EventGetInstrumentEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetInstrumentEventsResponse>

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments/events`, but is otherwise the
         * same as [EventServiceAsync.getAllInstrumentEvents].
         */
        fun getAllInstrumentEvents():
            CompletableFuture<HttpResponseFor<EventGetAllInstrumentEventsResponse>> =
            getAllInstrumentEvents(EventGetAllInstrumentEventsParams.none())

        /** @see getAllInstrumentEvents */
        fun getAllInstrumentEvents(
            params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetAllInstrumentEventsResponse>>

        /** @see getAllInstrumentEvents */
        fun getAllInstrumentEvents(
            params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none()
        ): CompletableFuture<HttpResponseFor<EventGetAllInstrumentEventsResponse>> =
            getAllInstrumentEvents(params, RequestOptions.none())

        /** @see getAllInstrumentEvents */
        fun getAllInstrumentEvents(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventGetAllInstrumentEventsResponse>> =
            getAllInstrumentEvents(EventGetAllInstrumentEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/events`, but is otherwise the
         * same as [EventServiceAsync.getInstrumentEvents].
         */
        fun getInstrumentEvents(
            securityId: String,
            params: EventGetInstrumentEventsParams,
        ): CompletableFuture<HttpResponseFor<EventGetInstrumentEventsResponse>> =
            getInstrumentEvents(securityId, params, RequestOptions.none())

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            securityId: String,
            params: EventGetInstrumentEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetInstrumentEventsResponse>> =
            getInstrumentEvents(params.toBuilder().securityId(securityId).build(), requestOptions)

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            params: EventGetInstrumentEventsParams
        ): CompletableFuture<HttpResponseFor<EventGetInstrumentEventsResponse>> =
            getInstrumentEvents(params, RequestOptions.none())

        /** @see getInstrumentEvents */
        fun getInstrumentEvents(
            params: EventGetInstrumentEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetInstrumentEventsResponse>>
    }
}
