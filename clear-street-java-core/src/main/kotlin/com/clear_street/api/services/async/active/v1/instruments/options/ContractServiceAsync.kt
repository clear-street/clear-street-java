// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments.options

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.options.contracts.ContractGetOptionContractsParams
import com.clear_street.api.models.active.v1.instruments.options.contracts.ContractGetOptionContractsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface ContractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractServiceAsync

    /**
     * Returns options contracts for a given underlier with options-specific metadata. Exactly one
     * underlier identifier must be provided.
     */
    fun getOptionContracts(): CompletableFuture<ContractGetOptionContractsResponse> =
        getOptionContracts(ContractGetOptionContractsParams.none())

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractGetOptionContractsResponse>

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none()
    ): CompletableFuture<ContractGetOptionContractsResponse> =
        getOptionContracts(params, RequestOptions.none())

    /** @see getOptionContracts */
    fun getOptionContracts(
        requestOptions: RequestOptions
    ): CompletableFuture<ContractGetOptionContractsResponse> =
        getOptionContracts(ContractGetOptionContractsParams.none(), requestOptions)

    /**
     * A view of [ContractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/instruments/options/contracts`, but is
         * otherwise the same as [ContractServiceAsync.getOptionContracts].
         */
        fun getOptionContracts():
            CompletableFuture<HttpResponseFor<ContractGetOptionContractsResponse>> =
            getOptionContracts(ContractGetOptionContractsParams.none())

        /** @see getOptionContracts */
        fun getOptionContracts(
            params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractGetOptionContractsResponse>>

        /** @see getOptionContracts */
        fun getOptionContracts(
            params: ContractGetOptionContractsParams = ContractGetOptionContractsParams.none()
        ): CompletableFuture<HttpResponseFor<ContractGetOptionContractsResponse>> =
            getOptionContracts(params, RequestOptions.none())

        /** @see getOptionContracts */
        fun getOptionContracts(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContractGetOptionContractsResponse>> =
            getOptionContracts(ContractGetOptionContractsParams.none(), requestOptions)
    }
}
