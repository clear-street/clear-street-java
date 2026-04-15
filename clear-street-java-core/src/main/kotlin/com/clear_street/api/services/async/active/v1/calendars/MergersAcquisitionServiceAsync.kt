// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarParams
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface MergersAcquisitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MergersAcquisitionServiceAsync

    /** Retrieves upcoming M&A events. */
    fun getMergersAndAcquisitionsCalendar():
        CompletableFuture<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
        getMergersAndAcquisitionsCalendar(
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
        )

    /** @see getMergersAndAcquisitionsCalendar */
    fun getMergersAndAcquisitionsCalendar(
        params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>

    /** @see getMergersAndAcquisitionsCalendar */
    fun getMergersAndAcquisitionsCalendar(
        params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
    ): CompletableFuture<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
        getMergersAndAcquisitionsCalendar(params, RequestOptions.none())

    /** @see getMergersAndAcquisitionsCalendar */
    fun getMergersAndAcquisitionsCalendar(
        requestOptions: RequestOptions
    ): CompletableFuture<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
        getMergersAndAcquisitionsCalendar(
            MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
            requestOptions,
        )

    /**
     * A view of [MergersAcquisitionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MergersAcquisitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/mergers-acquisitions`, but is
         * otherwise the same as [MergersAcquisitionServiceAsync.getMergersAndAcquisitionsCalendar].
         */
        fun getMergersAndAcquisitionsCalendar():
            CompletableFuture<
                HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>
            > =
            getMergersAndAcquisitionsCalendar(
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
            )

        /** @see getMergersAndAcquisitionsCalendar */
        fun getMergersAndAcquisitionsCalendar(
            params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>
        >

        /** @see getMergersAndAcquisitionsCalendar */
        fun getMergersAndAcquisitionsCalendar(
            params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams =
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none()
        ): CompletableFuture<
            HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>
        > = getMergersAndAcquisitionsCalendar(params, RequestOptions.none())

        /** @see getMergersAndAcquisitionsCalendar */
        fun getMergersAndAcquisitionsCalendar(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>
        > =
            getMergersAndAcquisitionsCalendar(
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.none(),
                requestOptions,
            )
    }
}
