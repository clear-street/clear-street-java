// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.feedback.FeedbackCreateFeedbackParams
import com.clear_street.api.models.active.v1.omniai.feedback.FeedbackCreateFeedbackResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** AI assistant for conversational trading interactions. */
interface FeedbackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackServiceAsync

    /**
     * Create feedback on a message.
     *
     * Submit user feedback (thumbs up/down, rating, comment) for an assistant message.
     */
    fun createFeedback(
        params: FeedbackCreateFeedbackParams
    ): CompletableFuture<FeedbackCreateFeedbackResponse> =
        createFeedback(params, RequestOptions.none())

    /** @see createFeedback */
    fun createFeedback(
        params: FeedbackCreateFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackCreateFeedbackResponse>

    /**
     * A view of [FeedbackServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/omni-ai/feedback`, but is otherwise the
         * same as [FeedbackServiceAsync.createFeedback].
         */
        fun createFeedback(
            params: FeedbackCreateFeedbackParams
        ): CompletableFuture<HttpResponseFor<FeedbackCreateFeedbackResponse>> =
            createFeedback(params, RequestOptions.none())

        /** @see createFeedback */
        fun createFeedback(
            params: FeedbackCreateFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackCreateFeedbackResponse>>
    }
}
