// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai.messages

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.messages.feedback.FeedbackCreateFeedbackParams
import com.clear_street.api.models.active.v1.omniai.messages.feedback.FeedbackCreateFeedbackResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
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
     * Create feedback on a finalized assistant message.
     *
     * Attaches a score and optional comment to a finalized assistant message. Feedback is only
     * valid for messages with role `ASSISTANT` that have reached a terminal outcome.
     */
    fun createFeedback(
        messageId: String,
        params: FeedbackCreateFeedbackParams,
    ): CompletableFuture<FeedbackCreateFeedbackResponse> =
        createFeedback(messageId, params, RequestOptions.none())

    /** @see createFeedback */
    fun createFeedback(
        messageId: String,
        params: FeedbackCreateFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackCreateFeedbackResponse> =
        createFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see createFeedback */
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
         * Returns a raw HTTP response for `post /active/v1/omni-ai/messages/{message_id}/feedback`,
         * but is otherwise the same as [FeedbackServiceAsync.createFeedback].
         */
        fun createFeedback(
            messageId: String,
            params: FeedbackCreateFeedbackParams,
        ): CompletableFuture<HttpResponseFor<FeedbackCreateFeedbackResponse>> =
            createFeedback(messageId, params, RequestOptions.none())

        /** @see createFeedback */
        fun createFeedback(
            messageId: String,
            params: FeedbackCreateFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackCreateFeedbackResponse>> =
            createFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see createFeedback */
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
