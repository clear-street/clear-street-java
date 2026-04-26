// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.messages.MessageFeedbackParams
import com.clear_street.api.models.active.v1.omniai.messages.MessageFeedbackResponse
import com.clear_street.api.models.active.v1.omniai.messages.MessageGetMessageParams
import com.clear_street.api.models.active.v1.omniai.messages.MessageGetMessageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    /**
     * Create feedback on a finalized assistant message.
     *
     * Attaches a score and optional comment to a finalized assistant message. Feedback is only
     * valid for messages with role `ASSISTANT` that have reached a terminal outcome.
     */
    fun feedback(
        messageId: String,
        params: MessageFeedbackParams,
    ): CompletableFuture<MessageFeedbackResponse> =
        feedback(messageId, params, RequestOptions.none())

    /** @see feedback */
    fun feedback(
        messageId: String,
        params: MessageFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageFeedbackResponse> =
        feedback(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see feedback */
    fun feedback(params: MessageFeedbackParams): CompletableFuture<MessageFeedbackResponse> =
        feedback(params, RequestOptions.none())

    /** @see feedback */
    fun feedback(
        params: MessageFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageFeedbackResponse>

    /**
     * Get a finalized message by ID.
     *
     * Returns a single finalized message. Returns **404** if the message belongs to an in-progress
     * assistant turn (use the response endpoint for live output). Once the turn completes, the
     * message becomes available here.
     */
    fun getMessage(
        messageId: String,
        params: MessageGetMessageParams,
    ): CompletableFuture<MessageGetMessageResponse> =
        getMessage(messageId, params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        messageId: String,
        params: MessageGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetMessageResponse> =
        getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getMessage */
    fun getMessage(params: MessageGetMessageParams): CompletableFuture<MessageGetMessageResponse> =
        getMessage(params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        params: MessageGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetMessageResponse>

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/omni-ai/messages/{message_id}/feedback`,
         * but is otherwise the same as [MessageServiceAsync.feedback].
         */
        fun feedback(
            messageId: String,
            params: MessageFeedbackParams,
        ): CompletableFuture<HttpResponseFor<MessageFeedbackResponse>> =
            feedback(messageId, params, RequestOptions.none())

        /** @see feedback */
        fun feedback(
            messageId: String,
            params: MessageFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageFeedbackResponse>> =
            feedback(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see feedback */
        fun feedback(
            params: MessageFeedbackParams
        ): CompletableFuture<HttpResponseFor<MessageFeedbackResponse>> =
            feedback(params, RequestOptions.none())

        /** @see feedback */
        fun feedback(
            params: MessageFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageFeedbackResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/messages/{message_id}`, but is
         * otherwise the same as [MessageServiceAsync.getMessage].
         */
        fun getMessage(
            messageId: String,
            params: MessageGetMessageParams,
        ): CompletableFuture<HttpResponseFor<MessageGetMessageResponse>> =
            getMessage(messageId, params, RequestOptions.none())

        /** @see getMessage */
        fun getMessage(
            messageId: String,
            params: MessageGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetMessageResponse>> =
            getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getMessage */
        fun getMessage(
            params: MessageGetMessageParams
        ): CompletableFuture<HttpResponseFor<MessageGetMessageResponse>> =
            getMessage(params, RequestOptions.none())

        /** @see getMessage */
        fun getMessage(
            params: MessageGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetMessageResponse>>
    }
}
