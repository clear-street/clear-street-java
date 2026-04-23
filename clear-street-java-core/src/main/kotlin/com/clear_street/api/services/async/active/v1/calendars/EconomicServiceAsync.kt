// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarParams
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface EconomicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EconomicServiceAsync

    /** Retrieves upcoming economic events and indicators. */
    fun getEconomicCalendar(): CompletableFuture<EconomicGetEconomicCalendarResponse> =
        getEconomicCalendar(EconomicGetEconomicCalendarParams.none())

    /** @see getEconomicCalendar */
    fun getEconomicCalendar(
        params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EconomicGetEconomicCalendarResponse>

    /** @see getEconomicCalendar */
    fun getEconomicCalendar(
        params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none()
    ): CompletableFuture<EconomicGetEconomicCalendarResponse> =
        getEconomicCalendar(params, RequestOptions.none())

    /** @see getEconomicCalendar */
    fun getEconomicCalendar(
        requestOptions: RequestOptions
    ): CompletableFuture<EconomicGetEconomicCalendarResponse> =
        getEconomicCalendar(EconomicGetEconomicCalendarParams.none(), requestOptions)

    /**
     * A view of [EconomicServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EconomicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/economic`, but is otherwise the
         * same as [EconomicServiceAsync.getEconomicCalendar].
         */
        fun getEconomicCalendar():
            CompletableFuture<HttpResponseFor<EconomicGetEconomicCalendarResponse>> =
            getEconomicCalendar(EconomicGetEconomicCalendarParams.none())

        /** @see getEconomicCalendar */
        fun getEconomicCalendar(
            params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EconomicGetEconomicCalendarResponse>>

        /** @see getEconomicCalendar */
        fun getEconomicCalendar(
            params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none()
        ): CompletableFuture<HttpResponseFor<EconomicGetEconomicCalendarResponse>> =
            getEconomicCalendar(params, RequestOptions.none())

        /** @see getEconomicCalendar */
        fun getEconomicCalendar(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EconomicGetEconomicCalendarResponse>> =
            getEconomicCalendar(EconomicGetEconomicCalendarParams.none(), requestOptions)
    }
}
