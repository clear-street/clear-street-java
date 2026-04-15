// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.instruments.options.ContractService
import java.util.function.Consumer

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

    /** Retrieve details and lists of tradable instruments. */
    fun contracts(): ContractService

    /** A view of [OptionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun contracts(): ContractService.WithRawResponse
    }
}
