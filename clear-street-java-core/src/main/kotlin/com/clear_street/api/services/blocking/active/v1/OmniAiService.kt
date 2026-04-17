// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.omniai.FeedbackService
import com.clear_street.api.services.blocking.active.v1.omniai.RunService
import com.clear_street.api.services.blocking.active.v1.omniai.ThreadService
import java.util.function.Consumer

interface OmniAiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiService

    /** AI assistant for conversational trading interactions. */
    fun feedback(): FeedbackService

    /** AI assistant for conversational trading interactions. */
    fun runs(): RunService

    /** AI assistant for conversational trading interactions. */
    fun threads(): ThreadService

    /** A view of [OmniAiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiService.WithRawResponse

        /** AI assistant for conversational trading interactions. */
        fun feedback(): FeedbackService.WithRawResponse

        /** AI assistant for conversational trading interactions. */
        fun runs(): RunService.WithRawResponse

        /** AI assistant for conversational trading interactions. */
        fun threads(): ThreadService.WithRawResponse
    }
}
