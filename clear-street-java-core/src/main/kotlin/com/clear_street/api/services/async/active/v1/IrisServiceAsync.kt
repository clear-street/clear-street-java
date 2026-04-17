// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.iris.FeedbackServiceAsync
import com.clear_street.api.services.async.active.v1.iris.RunServiceAsync
import com.clear_street.api.services.async.active.v1.iris.ThreadServiceAsync
import java.util.function.Consumer

interface IrisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrisServiceAsync

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun feedback(): FeedbackServiceAsync

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun runs(): RunServiceAsync

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun threads(): ThreadServiceAsync

    /** A view of [IrisServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrisServiceAsync.WithRawResponse

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun feedback(): FeedbackServiceAsync.WithRawResponse

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun runs(): RunServiceAsync.WithRawResponse

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun threads(): ThreadServiceAsync.WithRawResponse
    }
}
