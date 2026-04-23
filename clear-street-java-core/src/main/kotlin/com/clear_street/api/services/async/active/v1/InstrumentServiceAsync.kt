// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.services.async.active.v1.instruments.AnalystReportingServiceAsync
import com.clear_street.api.services.async.active.v1.instruments.EventServiceAsync
import com.clear_street.api.services.async.active.v1.instruments.OptionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface InstrumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun analystReporting(): AnalystReportingServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun events(): EventServiceAsync

    fun options(): OptionServiceAsync

    /** Retrieves detailed information for a specific instrument. */
    fun getInstrumentById(
        securityId: String,
        params: InstrumentGetInstrumentByIdParams,
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(securityId, params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        securityId: String,
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse>

    /** Retrieves a list of tradeable instruments. */
    fun getInstruments(): CompletableFuture<InstrumentGetInstrumentsResponse> =
        getInstruments(InstrumentGetInstrumentsParams.none())

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetInstrumentsResponse>

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
    ): CompletableFuture<InstrumentGetInstrumentsResponse> =
        getInstruments(params, RequestOptions.none())

    /** @see getInstruments */
    fun getInstruments(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentGetInstrumentsResponse> =
        getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)

    /**
     * A view of [InstrumentServiceAsync] that provides access to raw HTTP responses for each
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
        ): InstrumentServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun analystReporting(): AnalystReportingServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun events(): EventServiceAsync.WithRawResponse

        fun options(): OptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}`, but is otherwise the same as
         * [InstrumentServiceAsync.getInstrumentById].
         */
        fun getInstrumentById(
            securityId: String,
            params: InstrumentGetInstrumentByIdParams,
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(securityId, params, RequestOptions.none())

        /** @see getInstrumentById */
        fun getInstrumentById(
            securityId: String,
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(params.toBuilder().securityId(securityId).build(), requestOptions)

        /** @see getInstrumentById */
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(params, RequestOptions.none())

        /** @see getInstrumentById */
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments`, but is otherwise the same
         * as [InstrumentServiceAsync.getInstruments].
         */
        fun getInstruments(): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>> =
            getInstruments(InstrumentGetInstrumentsParams.none())

        /** @see getInstruments */
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>>

        /** @see getInstruments */
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>> =
            getInstruments(params, RequestOptions.none())

        /** @see getInstruments */
        fun getInstruments(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>> =
            getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)
    }
}
