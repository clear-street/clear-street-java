// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.instruments.options.ContractServiceAsync
import java.util.function.Consumer

interface OptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun contracts(): ContractServiceAsync

    /**
     * A view of [OptionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptionServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun contracts(): ContractServiceAsync.WithRawResponse
    }
}
