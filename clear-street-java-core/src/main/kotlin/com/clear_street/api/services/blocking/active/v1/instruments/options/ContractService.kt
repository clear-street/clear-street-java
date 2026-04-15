// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments.options

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.options.contracts.ContractGetOptionContractsParams
import com.clear_street.api.models.active.v1.instruments.options.contracts.ContractGetOptionContractsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface ContractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService

    /**
     * Returns options contracts for a given underlier with options-specific metadata. Exactly one
     * underlier identifier must be provided.
     */
    fun getOptionContracts(): ContractGetOptionContractsResponse =
        getOptionContracts(ContractGetOptionContractsParams.none())

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractGetOptionContractsResponse

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none()
    ): ContractGetOptionContractsResponse = getOptionContracts(params, RequestOptions.none())

    /** @see getOptionContracts */
    fun getOptionContracts(requestOptions: RequestOptions): ContractGetOptionContractsResponse =
        getOptionContracts(ContractGetOptionContractsParams.none(), requestOptions)

    /** A view of [ContractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments/options/contracts`, but is
         * otherwise the same as [ContractService.getOptionContracts].
         */
        @MustBeClosed
        fun getOptionContracts(): HttpResponseFor<ContractGetOptionContractsResponse> =
            getOptionContracts(ContractGetOptionContractsParams.none())

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractGetOptionContractsResponse>

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none()
        ): HttpResponseFor<ContractGetOptionContractsResponse> =
            getOptionContracts(params, RequestOptions.none())

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            requestOptions: RequestOptions
        ): HttpResponseFor<ContractGetOptionContractsResponse> =
            getOptionContracts(ContractGetOptionContractsParams.none(), requestOptions)
    }
}
