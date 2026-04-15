// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.iris.FeedbackService
import com.clear_street.api.services.blocking.active.v1.iris.RunService
import com.clear_street.api.services.blocking.active.v1.iris.ThreadService
import java.util.function.Consumer

interface IrisService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrisService

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun feedback(): FeedbackService

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun runs(): RunService

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun threads(): ThreadService

    /** A view of [IrisService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrisService.WithRawResponse

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun feedback(): FeedbackService.WithRawResponse

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun runs(): RunService.WithRawResponse

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun threads(): ThreadService.WithRawResponse
    }
}
