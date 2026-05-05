// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.messages.MessageGetMessageByIdParams
import com.clear_street.api.models.v1.omniai.messages.MessageGetMessageByIdResponse
import com.clear_street.api.models.v1.omniai.messages.MessageSubmitFeedbackParams
import com.clear_street.api.models.v1.omniai.messages.MessageSubmitFeedbackResponse
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
     * Get a finalized message by ID.
     *
     * Returns a single finalized message. Returns **404** if the message belongs to an in-progress
     * assistant turn (use the response endpoint for live output). Once the turn completes, the
     * message becomes available here.
     */
    fun getMessageById(
        messageId: String,
        params: MessageGetMessageByIdParams,
    ): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(messageId, params, RequestOptions.none())

    /** @see getMessageById */
    fun getMessageById(
        messageId: String,
        params: MessageGetMessageByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getMessageById */
    fun getMessageById(
        params: MessageGetMessageByIdParams
    ): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(params, RequestOptions.none())

    /** @see getMessageById */
    fun getMessageById(
        params: MessageGetMessageByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetMessageByIdResponse>

    /**
     * Submit feedback on a finalized assistant message.
     *
     * Attaches a score and optional comment to a finalized assistant message. Feedback is only
     * valid for messages with role `ASSISTANT` that have reached a terminal outcome.
     */
    fun submitFeedback(
        messageId: String,
        params: MessageSubmitFeedbackParams,
    ): CompletableFuture<MessageSubmitFeedbackResponse> =
        submitFeedback(messageId, params, RequestOptions.none())

    /** @see submitFeedback */
    fun submitFeedback(
        messageId: String,
        params: MessageSubmitFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSubmitFeedbackResponse> =
        submitFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see submitFeedback */
    fun submitFeedback(
        params: MessageSubmitFeedbackParams
    ): CompletableFuture<MessageSubmitFeedbackResponse> =
        submitFeedback(params, RequestOptions.none())

    /** @see submitFeedback */
    fun submitFeedback(
        params: MessageSubmitFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSubmitFeedbackResponse>

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
         * Returns a raw HTTP response for `get /v1/omni-ai/messages/{message_id}`, but is otherwise
         * the same as [MessageServiceAsync.getMessageById].
         */
        fun getMessageById(
            messageId: String,
            params: MessageGetMessageByIdParams,
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(messageId, params, RequestOptions.none())

        /** @see getMessageById */
        fun getMessageById(
            messageId: String,
            params: MessageGetMessageByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getMessageById */
        fun getMessageById(
            params: MessageGetMessageByIdParams
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(params, RequestOptions.none())

        /** @see getMessageById */
        fun getMessageById(
            params: MessageGetMessageByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/messages/{message_id}/feedback`, but is
         * otherwise the same as [MessageServiceAsync.submitFeedback].
         */
        fun submitFeedback(
            messageId: String,
            params: MessageSubmitFeedbackParams,
        ): CompletableFuture<HttpResponseFor<MessageSubmitFeedbackResponse>> =
            submitFeedback(messageId, params, RequestOptions.none())

        /** @see submitFeedback */
        fun submitFeedback(
            messageId: String,
            params: MessageSubmitFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSubmitFeedbackResponse>> =
            submitFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see submitFeedback */
        fun submitFeedback(
            params: MessageSubmitFeedbackParams
        ): CompletableFuture<HttpResponseFor<MessageSubmitFeedbackResponse>> =
            submitFeedback(params, RequestOptions.none())

        /** @see submitFeedback */
        fun submitFeedback(
            params: MessageSubmitFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSubmitFeedbackResponse>>
    }
}
