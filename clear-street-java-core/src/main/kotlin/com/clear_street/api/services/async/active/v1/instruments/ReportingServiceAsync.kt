// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.reporting.ReportingGetInstrumentReportingParams
import com.clear_street.api.models.active.v1.instruments.reporting.ReportingGetInstrumentReportingResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface ReportingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingServiceAsync

    /** Retrieves fundamental and financial reporting data for an instrument. */
    fun getInstrumentReporting(
        securityId: String,
        params: ReportingGetInstrumentReportingParams,
    ): CompletableFuture<ReportingGetInstrumentReportingResponse> =
        getInstrumentReporting(securityId, params, RequestOptions.none())

    /** @see getInstrumentReporting */
    fun getInstrumentReporting(
        securityId: String,
        params: ReportingGetInstrumentReportingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportingGetInstrumentReportingResponse> =
        getInstrumentReporting(params.toBuilder().securityId(securityId).build(), requestOptions)

    /** @see getInstrumentReporting */
    fun getInstrumentReporting(
        params: ReportingGetInstrumentReportingParams
    ): CompletableFuture<ReportingGetInstrumentReportingResponse> =
        getInstrumentReporting(params, RequestOptions.none())

    /** @see getInstrumentReporting */
    fun getInstrumentReporting(
        params: ReportingGetInstrumentReportingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportingGetInstrumentReportingResponse>

    /**
     * A view of [ReportingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/reporting`, but is otherwise
         * the same as [ReportingServiceAsync.getInstrumentReporting].
         */
        fun getInstrumentReporting(
            securityId: String,
            params: ReportingGetInstrumentReportingParams,
        ): CompletableFuture<HttpResponseFor<ReportingGetInstrumentReportingResponse>> =
            getInstrumentReporting(securityId, params, RequestOptions.none())

        /** @see getInstrumentReporting */
        fun getInstrumentReporting(
            securityId: String,
            params: ReportingGetInstrumentReportingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportingGetInstrumentReportingResponse>> =
            getInstrumentReporting(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentReporting */
        fun getInstrumentReporting(
            params: ReportingGetInstrumentReportingParams
        ): CompletableFuture<HttpResponseFor<ReportingGetInstrumentReportingResponse>> =
            getInstrumentReporting(params, RequestOptions.none())

        /** @see getInstrumentReporting */
        fun getInstrumentReporting(
            params: ReportingGetInstrumentReportingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportingGetInstrumentReportingResponse>>
    }
}
