// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.events.EventGetAllInstrumentEventsParams
import com.clear_street.api.models.active.v1.instruments.events.EventGetAllInstrumentEventsResponse
import com.clear_street.api.models.active.v1.instruments.events.EventGetInstrumentEventsParams
import com.clear_street.api.models.active.v1.instruments.events.EventGetInstrumentEventsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /** Retrieves all instrument events grouped by date. */
    fun getAllInstrumentEvents(): EventGetAllInstrumentEventsResponse =
        getAllInstrumentEvents(EventGetAllInstrumentEventsParams.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventGetAllInstrumentEventsResponse

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none()
    ): EventGetAllInstrumentEventsResponse = getAllInstrumentEvents(params, RequestOptions.none())

    /** @see getAllInstrumentEvents */
    fun getAllInstrumentEvents(
        requestOptions: RequestOptions
    ): EventGetAllInstrumentEventsResponse =
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
    ): EventGetInstrumentEventsResponse =
        getInstrumentEvents(securityId, params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        securityId: String,
        params: EventGetInstrumentEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventGetInstrumentEventsResponse =
        getInstrumentEvents(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: EventGetInstrumentEventsParams
    ): EventGetInstrumentEventsResponse = getInstrumentEvents(params, RequestOptions.none())

    /** @see getInstrumentEvents */
    fun getInstrumentEvents(
        params: EventGetInstrumentEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventGetInstrumentEventsResponse

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments/events`, but is otherwise the
         * same as [EventService.getAllInstrumentEvents].
         */
        @MustBeClosed
        fun getAllInstrumentEvents(): HttpResponseFor<EventGetAllInstrumentEventsResponse> =
            getAllInstrumentEvents(EventGetAllInstrumentEventsParams.none())

        /** @see getAllInstrumentEvents */
        @MustBeClosed
        fun getAllInstrumentEvents(
            params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventGetAllInstrumentEventsResponse>

        /** @see getAllInstrumentEvents */
        @MustBeClosed
        fun getAllInstrumentEvents(
            params: EventGetAllInstrumentEventsParams = EventGetAllInstrumentEventsParams.none()
        ): HttpResponseFor<EventGetAllInstrumentEventsResponse> =
            getAllInstrumentEvents(params, RequestOptions.none())

        /** @see getAllInstrumentEvents */
        @MustBeClosed
        fun getAllInstrumentEvents(
            requestOptions: RequestOptions
        ): HttpResponseFor<EventGetAllInstrumentEventsResponse> =
            getAllInstrumentEvents(EventGetAllInstrumentEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/events`, but is otherwise the
         * same as [EventService.getInstrumentEvents].
         */
        @MustBeClosed
        fun getInstrumentEvents(
            securityId: String,
            params: EventGetInstrumentEventsParams,
        ): HttpResponseFor<EventGetInstrumentEventsResponse> =
            getInstrumentEvents(securityId, params, RequestOptions.none())

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            securityId: String,
            params: EventGetInstrumentEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventGetInstrumentEventsResponse> =
            getInstrumentEvents(params.toBuilder().securityId(securityId).build(), requestOptions)

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            params: EventGetInstrumentEventsParams
        ): HttpResponseFor<EventGetInstrumentEventsResponse> =
            getInstrumentEvents(params, RequestOptions.none())

        /** @see getInstrumentEvents */
        @MustBeClosed
        fun getInstrumentEvents(
            params: EventGetInstrumentEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventGetInstrumentEventsResponse>
    }
}
