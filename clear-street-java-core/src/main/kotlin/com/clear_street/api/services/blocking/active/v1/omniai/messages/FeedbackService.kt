// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai.messages

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.messages.feedback.FeedbackCreateFeedbackParams
import com.clear_street.api.models.active.v1.omniai.messages.feedback.FeedbackCreateFeedbackResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Every endpoint requires an explicit account_id.
 */
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

    /**
     * Attaches a score and optional comment to a finalized assistant message. Feedback is only
     * valid for messages with role `ASSISTANT` that have reached a terminal outcome.
     */
    fun createFeedback(
        messageId: String,
        params: FeedbackCreateFeedbackParams,
    ): FeedbackCreateFeedbackResponse = createFeedback(messageId, params, RequestOptions.none())

    /** @see createFeedback */
    fun createFeedback(
        messageId: String,
        params: FeedbackCreateFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackCreateFeedbackResponse =
        createFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see createFeedback */
    fun createFeedback(params: FeedbackCreateFeedbackParams): FeedbackCreateFeedbackResponse =
        createFeedback(params, RequestOptions.none())

    /** @see createFeedback */
    fun createFeedback(
        params: FeedbackCreateFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackCreateFeedbackResponse

    /** A view of [FeedbackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/omni-ai/messages/{message_id}/feedback`,
         * but is otherwise the same as [FeedbackService.createFeedback].
         */
        @MustBeClosed
        fun createFeedback(
            messageId: String,
            params: FeedbackCreateFeedbackParams,
        ): HttpResponseFor<FeedbackCreateFeedbackResponse> =
            createFeedback(messageId, params, RequestOptions.none())

        /** @see createFeedback */
        @MustBeClosed
        fun createFeedback(
            messageId: String,
            params: FeedbackCreateFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackCreateFeedbackResponse> =
            createFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see createFeedback */
        @MustBeClosed
        fun createFeedback(
            params: FeedbackCreateFeedbackParams
        ): HttpResponseFor<FeedbackCreateFeedbackResponse> =
            createFeedback(params, RequestOptions.none())

        /** @see createFeedback */
        @MustBeClosed
        fun createFeedback(
            params: FeedbackCreateFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackCreateFeedbackResponse>
    }
}
