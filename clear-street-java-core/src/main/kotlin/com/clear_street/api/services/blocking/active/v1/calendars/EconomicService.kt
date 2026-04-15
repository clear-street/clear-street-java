// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarParams
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface EconomicService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EconomicService

    /** Retrieves upcoming economic events and indicators. */
    fun getEconomicCalendar(): EconomicGetEconomicCalendarResponse =
        getEconomicCalendar(EconomicGetEconomicCalendarParams.none())

    /** @see getEconomicCalendar */
    fun getEconomicCalendar(
        params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EconomicGetEconomicCalendarResponse

    /** @see getEconomicCalendar */
    fun getEconomicCalendar(
        params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none()
    ): EconomicGetEconomicCalendarResponse = getEconomicCalendar(params, RequestOptions.none())

    /** @see getEconomicCalendar */
    fun getEconomicCalendar(requestOptions: RequestOptions): EconomicGetEconomicCalendarResponse =
        getEconomicCalendar(EconomicGetEconomicCalendarParams.none(), requestOptions)

    /** A view of [EconomicService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EconomicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/economic`, but is otherwise the
         * same as [EconomicService.getEconomicCalendar].
         */
        @MustBeClosed
        fun getEconomicCalendar(): HttpResponseFor<EconomicGetEconomicCalendarResponse> =
            getEconomicCalendar(EconomicGetEconomicCalendarParams.none())

        /** @see getEconomicCalendar */
        @MustBeClosed
        fun getEconomicCalendar(
            params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EconomicGetEconomicCalendarResponse>

        /** @see getEconomicCalendar */
        @MustBeClosed
        fun getEconomicCalendar(
            params: EconomicGetEconomicCalendarParams = EconomicGetEconomicCalendarParams.none()
        ): HttpResponseFor<EconomicGetEconomicCalendarResponse> =
            getEconomicCalendar(params, RequestOptions.none())

        /** @see getEconomicCalendar */
        @MustBeClosed
        fun getEconomicCalendar(
            requestOptions: RequestOptions
        ): HttpResponseFor<EconomicGetEconomicCalendarResponse> =
            getEconomicCalendar(EconomicGetEconomicCalendarParams.none(), requestOptions)
    }
}
