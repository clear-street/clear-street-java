// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.reporting.ReportingGetInstrumentReportingParams
import com.clear_street.api.models.active.v1.instruments.reporting.ReportingGetInstrumentReportingResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface ReportingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingService

    /** Retrieves fundamental and financial reporting data for an instrument. */
    fun getInstrumentReporting(
        securityId: String,
        params: ReportingGetInstrumentReportingParams,
    ): ReportingGetInstrumentReportingResponse =
        getInstrumentReporting(securityId, params, RequestOptions.none())

    /** @see getInstrumentReporting */
    fun getInstrumentReporting(
        securityId: String,
        params: ReportingGetInstrumentReportingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportingGetInstrumentReportingResponse =
        getInstrumentReporting(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see getInstrumentReporting */
    fun getInstrumentReporting(
        params: ReportingGetInstrumentReportingParams
    ): ReportingGetInstrumentReportingResponse =
        getInstrumentReporting(params, RequestOptions.none())

    /** @see getInstrumentReporting */
    fun getInstrumentReporting(
        params: ReportingGetInstrumentReportingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportingGetInstrumentReportingResponse

    /** A view of [ReportingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/reporting`, but is otherwise
         * the same as [ReportingService.getInstrumentReporting].
         */
        @MustBeClosed
        fun getInstrumentReporting(
            securityId: String,
            params: ReportingGetInstrumentReportingParams,
        ): HttpResponseFor<ReportingGetInstrumentReportingResponse> =
            getInstrumentReporting(securityId, params, RequestOptions.none())

        /** @see getInstrumentReporting */
        @MustBeClosed
        fun getInstrumentReporting(
            securityId: String,
            params: ReportingGetInstrumentReportingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportingGetInstrumentReportingResponse> =
            getInstrumentReporting(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentReporting */
        @MustBeClosed
        fun getInstrumentReporting(
            params: ReportingGetInstrumentReportingParams
        ): HttpResponseFor<ReportingGetInstrumentReportingResponse> =
            getInstrumentReporting(params, RequestOptions.none())

        /** @see getInstrumentReporting */
        @MustBeClosed
        fun getInstrumentReporting(
            params: ReportingGetInstrumentReportingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportingGetInstrumentReportingResponse>
    }
}
