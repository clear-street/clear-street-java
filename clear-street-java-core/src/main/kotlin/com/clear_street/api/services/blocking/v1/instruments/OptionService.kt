// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.options.OptionGetOptionContractsParams
import com.clear_street.api.models.v1.instruments.options.OptionGetOptionContractsResponse
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
    fun getOptionContracts(): OptionGetOptionContractsResponse =
        getOptionContracts(OptionGetOptionContractsParams.none())

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: OptionGetOptionContractsParams = OptionGetOptionContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OptionGetOptionContractsResponse

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: OptionGetOptionContractsParams = OptionGetOptionContractsParams.none()
    ): OptionGetOptionContractsResponse = getOptionContracts(params, RequestOptions.none())

    /** @see getOptionContracts */
    fun getOptionContracts(requestOptions: RequestOptions): OptionGetOptionContractsResponse =
        getOptionContracts(OptionGetOptionContractsParams.none(), requestOptions)

    /** A view of [OptionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/options/contracts`, but is otherwise
         * the same as [OptionService.getOptionContracts].
         */
        @MustBeClosed
        fun getOptionContracts(): HttpResponseFor<OptionGetOptionContractsResponse> =
            getOptionContracts(OptionGetOptionContractsParams.none())

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            params: OptionGetOptionContractsParams = OptionGetOptionContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OptionGetOptionContractsResponse>

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            params: OptionGetOptionContractsParams = OptionGetOptionContractsParams.none()
        ): HttpResponseFor<OptionGetOptionContractsResponse> =
            getOptionContracts(params, RequestOptions.none())

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            requestOptions: RequestOptions
        ): HttpResponseFor<OptionGetOptionContractsResponse> =
            getOptionContracts(OptionGetOptionContractsParams.none(), requestOptions)
    }
}
