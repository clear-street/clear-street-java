// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.privatemarkets

import com.clearstreet.api.core.ClientOptions
import java.util.function.Consumer

interface IoisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IoisServiceAsync

    /** A view of [IoisServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IoisServiceAsync.WithRawResponse
    }
}
