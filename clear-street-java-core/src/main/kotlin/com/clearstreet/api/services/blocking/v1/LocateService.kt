// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.locates.LocateGetLocateRateByIdParams
import com.clearstreet.api.models.v1.locates.LocateGetLocateRateByIdResponse
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesParams
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Query locate requests, granted locates, and cached locate borrow rates. */
interface LocateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateService

    /**
     * > **Beta** — this endpoint may change before general availability.
     *
     * Fetch the cached locate borrow rate for one instrument. Rates refresh periodically; `404`
     * means no rate is currently cached for the instrument.
     */
    fun getLocateRateById(instrumentId: String): LocateGetLocateRateByIdResponse =
        getLocateRateById(instrumentId, LocateGetLocateRateByIdParams.none())

    /** @see getLocateRateById */
    fun getLocateRateById(
        instrumentId: String,
        params: LocateGetLocateRateByIdParams = LocateGetLocateRateByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateGetLocateRateByIdResponse =
        getLocateRateById(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

    /** @see getLocateRateById */
    fun getLocateRateById(
        instrumentId: String,
        params: LocateGetLocateRateByIdParams = LocateGetLocateRateByIdParams.none(),
    ): LocateGetLocateRateByIdResponse =
        getLocateRateById(instrumentId, params, RequestOptions.none())

    /** @see getLocateRateById */
    fun getLocateRateById(
        params: LocateGetLocateRateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateGetLocateRateByIdResponse

    /** @see getLocateRateById */
    fun getLocateRateById(params: LocateGetLocateRateByIdParams): LocateGetLocateRateByIdResponse =
        getLocateRateById(params, RequestOptions.none())

    /** @see getLocateRateById */
    fun getLocateRateById(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): LocateGetLocateRateByIdResponse =
        getLocateRateById(instrumentId, LocateGetLocateRateByIdParams.none(), requestOptions)

    /**
     * > **Beta** — this endpoint may change before general availability.
     *
     * Fetch the cached locate borrow rates for up to 1,000 instruments. The response returns one
     * row per requested instrument, in request order. Each row carries either the `rate` or an
     * `error` — a `404` when the instrument is unknown or has no cached rate. The status is `207`
     * when any row has an error, `200` when every instrument resolved to a rate.
     */
    fun getLocateRates(params: LocateGetLocateRatesParams): LocateGetLocateRatesResponse =
        getLocateRates(params, RequestOptions.none())

    /** @see getLocateRates */
    fun getLocateRates(
        params: LocateGetLocateRatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocateGetLocateRatesResponse

    /** A view of [LocateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/locates/rates/{instrument_id}`, but is otherwise
         * the same as [LocateService.getLocateRateById].
         */
        @MustBeClosed
        fun getLocateRateById(
            instrumentId: String
        ): HttpResponseFor<LocateGetLocateRateByIdResponse> =
            getLocateRateById(instrumentId, LocateGetLocateRateByIdParams.none())

        /** @see getLocateRateById */
        @MustBeClosed
        fun getLocateRateById(
            instrumentId: String,
            params: LocateGetLocateRateByIdParams = LocateGetLocateRateByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateGetLocateRateByIdResponse> =
            getLocateRateById(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

        /** @see getLocateRateById */
        @MustBeClosed
        fun getLocateRateById(
            instrumentId: String,
            params: LocateGetLocateRateByIdParams = LocateGetLocateRateByIdParams.none(),
        ): HttpResponseFor<LocateGetLocateRateByIdResponse> =
            getLocateRateById(instrumentId, params, RequestOptions.none())

        /** @see getLocateRateById */
        @MustBeClosed
        fun getLocateRateById(
            params: LocateGetLocateRateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateGetLocateRateByIdResponse>

        /** @see getLocateRateById */
        @MustBeClosed
        fun getLocateRateById(
            params: LocateGetLocateRateByIdParams
        ): HttpResponseFor<LocateGetLocateRateByIdResponse> =
            getLocateRateById(params, RequestOptions.none())

        /** @see getLocateRateById */
        @MustBeClosed
        fun getLocateRateById(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateGetLocateRateByIdResponse> =
            getLocateRateById(instrumentId, LocateGetLocateRateByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/locates/rates`, but is otherwise the same as
         * [LocateService.getLocateRates].
         */
        @MustBeClosed
        fun getLocateRates(
            params: LocateGetLocateRatesParams
        ): HttpResponseFor<LocateGetLocateRatesResponse> =
            getLocateRates(params, RequestOptions.none())

        /** @see getLocateRates */
        @MustBeClosed
        fun getLocateRates(
            params: LocateGetLocateRatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocateGetLocateRatesResponse>
    }
}
