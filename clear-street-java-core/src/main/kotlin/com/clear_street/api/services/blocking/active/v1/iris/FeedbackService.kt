// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.iris.feedback.FeedbackCreateFeedbackDeprecatedParams
import com.clear_street.api.models.active.v1.iris.feedback.FeedbackCreateFeedbackDeprecatedResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
interface FeedbackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService

    /** **Deprecated**: Use `POST /omni-ai/feedback` instead. */
    @Deprecated("deprecated")
    fun createFeedbackDeprecated(
        params: FeedbackCreateFeedbackDeprecatedParams
    ): FeedbackCreateFeedbackDeprecatedResponse =
        createFeedbackDeprecated(params, RequestOptions.none())

    /** @see createFeedbackDeprecated */
    @Deprecated("deprecated")
    fun createFeedbackDeprecated(
        params: FeedbackCreateFeedbackDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackCreateFeedbackDeprecatedResponse

    /** A view of [FeedbackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/iris/feedback`, but is otherwise the
         * same as [FeedbackService.createFeedbackDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createFeedbackDeprecated(
            params: FeedbackCreateFeedbackDeprecatedParams
        ): HttpResponseFor<FeedbackCreateFeedbackDeprecatedResponse> =
            createFeedbackDeprecated(params, RequestOptions.none())

        /** @see createFeedbackDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createFeedbackDeprecated(
            params: FeedbackCreateFeedbackDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackCreateFeedbackDeprecatedResponse>
    }
}
