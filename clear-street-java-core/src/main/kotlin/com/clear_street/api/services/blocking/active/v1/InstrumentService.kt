// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.services.blocking.active.v1.instruments.AnalystReportingService
import com.clear_street.api.services.blocking.active.v1.instruments.EventService
import com.clear_street.api.services.blocking.active.v1.instruments.OptionService
import com.clear_street.api.services.blocking.active.v1.instruments.ReportingService
import com.clear_street.api.services.blocking.active.v1.instruments.VenueService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface InstrumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentService

    /** Retrieve details and lists of tradable instruments. */
    fun analystReporting(): AnalystReportingService

    /** Retrieve details and lists of tradable instruments. */
    fun events(): EventService

    fun options(): OptionService

    /** Retrieve details and lists of tradable instruments. */
    fun reporting(): ReportingService

    /** Retrieve details and lists of tradable instruments. */
    fun venues(): VenueService

    /** Retrieves detailed information for a specific instrument. */
    fun getInstrumentById(
        securityId: String,
        params: InstrumentGetInstrumentByIdParams,
    ): InstrumentGetInstrumentByIdResponse =
        getInstrumentById(securityId, params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        securityId: String,
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentGetInstrumentByIdResponse =
        getInstrumentById(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams
    ): InstrumentGetInstrumentByIdResponse = getInstrumentById(params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentGetInstrumentByIdResponse

    /** Retrieves a list of tradeable instruments. */
    fun getInstruments(): InstrumentGetInstrumentsResponse =
        getInstruments(InstrumentGetInstrumentsParams.none())

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentGetInstrumentsResponse

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
    ): InstrumentGetInstrumentsResponse = getInstruments(params, RequestOptions.none())

    /** @see getInstruments */
    fun getInstruments(requestOptions: RequestOptions): InstrumentGetInstrumentsResponse =
        getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)

    /** A view of [InstrumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun analystReporting(): AnalystReportingService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun events(): EventService.WithRawResponse

        fun options(): OptionService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun reporting(): ReportingService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun venues(): VenueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}`, but is otherwise the same as
         * [InstrumentService.getInstrumentById].
         */
        @MustBeClosed
        fun getInstrumentById(
            securityId: String,
            params: InstrumentGetInstrumentByIdParams,
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(securityId, params, RequestOptions.none())

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            securityId: String,
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(params.toBuilder().securityId(securityId).build(), requestOptions)

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(params, RequestOptions.none())

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse>

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments`, but is otherwise the same
         * as [InstrumentService.getInstruments].
         */
        @MustBeClosed
        fun getInstruments(): HttpResponseFor<InstrumentGetInstrumentsResponse> =
            getInstruments(InstrumentGetInstrumentsParams.none())

        /** @see getInstruments */
        @MustBeClosed
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentGetInstrumentsResponse>

        /** @see getInstruments */
        @MustBeClosed
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
        ): HttpResponseFor<InstrumentGetInstrumentsResponse> =
            getInstruments(params, RequestOptions.none())

        /** @see getInstruments */
        @MustBeClosed
        fun getInstruments(
            requestOptions: RequestOptions
        ): HttpResponseFor<InstrumentGetInstrumentsResponse> =
            getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)
    }
}
