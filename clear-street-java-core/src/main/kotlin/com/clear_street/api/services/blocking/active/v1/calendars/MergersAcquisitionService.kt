// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarParams
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface MergersAcquisitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MergersAcquisitionService

    /** Retrieves upcoming M&A events. */
    fun getMergersAndAcquisitionsCalendar():
        MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse =
        getMergersAndAcquisitionsCalendar(
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
        )

    /** @see getMergersAndAcquisitionsCalendar */
    fun getMergersAndAcquisitionsCalendar(
        params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse

    /** @see getMergersAndAcquisitionsCalendar */
    fun getMergersAndAcquisitionsCalendar(
        params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
    ): MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse =
        getMergersAndAcquisitionsCalendar(params, RequestOptions.none())

    /** @see getMergersAndAcquisitionsCalendar */
    fun getMergersAndAcquisitionsCalendar(
        requestOptions: RequestOptions
    ): MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse =
        getMergersAndAcquisitionsCalendar(
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
            requestOptions,
        )

    /**
     * A view of [MergersAcquisitionService] that provides access to raw HTTP responses for each
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
        ): MergersAcquisitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/mergers-acquisitions`, but is
         * otherwise the same as [MergersAcquisitionService.getMergersAndAcquisitionsCalendar].
         */
        @MustBeClosed
        fun getMergersAndAcquisitionsCalendar():
            HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
            getMergersAndAcquisitionsCalendar(
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
            )

        /** @see getMergersAndAcquisitionsCalendar */
        @MustBeClosed
        fun getMergersAndAcquisitionsCalendar(
            params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>

        /** @see getMergersAndAcquisitionsCalendar */
        @MustBeClosed
        fun getMergersAndAcquisitionsCalendar(
            params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
        ): HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
            getMergersAndAcquisitionsCalendar(params, RequestOptions.none())

        /** @see getMergersAndAcquisitionsCalendar */
        @MustBeClosed
        fun getMergersAndAcquisitionsCalendar(
            requestOptions: RequestOptions
        ): HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
            getMergersAndAcquisitionsCalendar(
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
                requestOptions,
            )
    }
}
