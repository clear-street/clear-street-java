// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.omniai.FeedbackServiceAsync
import com.clear_street.api.services.async.active.v1.omniai.RunServiceAsync
import com.clear_street.api.services.async.active.v1.omniai.ThreadServiceAsync
import java.util.function.Consumer

interface OmniAiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiServiceAsync

    /** AI assistant for conversational trading interactions. */
    fun feedback(): FeedbackServiceAsync

    /** AI assistant for conversational trading interactions. */
    fun runs(): RunServiceAsync

    /** AI assistant for conversational trading interactions. */
    fun threads(): ThreadServiceAsync

    /**
     * A view of [OmniAiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OmniAiServiceAsync.WithRawResponse

        /** AI assistant for conversational trading interactions. */
        fun feedback(): FeedbackServiceAsync.WithRawResponse

        /** AI assistant for conversational trading interactions. */
        fun runs(): RunServiceAsync.WithRawResponse

        /** AI assistant for conversational trading interactions. */
        fun threads(): ThreadServiceAsync.WithRawResponse
    }
}
