// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.options.OptionContractsParams
import com.clear_street.api.models.active.v1.instruments.options.OptionContractsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface OptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionService

    /**
     * List options contracts.
     *
     * Returns options contracts for a given underlier with options-specific metadata. Exactly one
     * underlier identifier must be provided.
     */
    fun contracts(): OptionContractsResponse = contracts(OptionContractsParams.none())

    /** @see contracts */
    fun contracts(
        params: OptionContractsParams = OptionContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OptionContractsResponse

    /** @see contracts */
    fun contracts(
        params: OptionContractsParams = OptionContractsParams.none()
    ): OptionContractsResponse = contracts(params, RequestOptions.none())

    /** @see contracts */
    fun contracts(requestOptions: RequestOptions): OptionContractsResponse =
        contracts(OptionContractsParams.none(), requestOptions)

    /** A view of [OptionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments/options/contracts`, but is
         * otherwise the same as [OptionService.contracts].
         */
        @MustBeClosed
        fun contracts(): HttpResponseFor<OptionContractsResponse> =
            contracts(OptionContractsParams.none())

        /** @see contracts */
        @MustBeClosed
        fun contracts(
            params: OptionContractsParams = OptionContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OptionContractsResponse>

        /** @see contracts */
        @MustBeClosed
        fun contracts(
            params: OptionContractsParams = OptionContractsParams.none()
        ): HttpResponseFor<OptionContractsResponse> = contracts(params, RequestOptions.none())

        /** @see contracts */
        @MustBeClosed
        fun contracts(requestOptions: RequestOptions): HttpResponseFor<OptionContractsResponse> =
            contracts(OptionContractsParams.none(), requestOptions)
    }
}
