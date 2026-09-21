// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.omniai

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.omniai.messages.MessageGetMessageByIdParams
import com.clearstreet.api.models.v1.omniai.messages.MessageGetMessageByIdResponse
import com.clearstreet.api.models.v1.omniai.messages.MessageSubmitFeedbackParams
import com.clearstreet.api.models.v1.omniai.messages.MessageSubmitFeedbackResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use account_ids.
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
     * Read a finalized message using its parent thread for ownership and linked-account
     * authorization. In-progress assistant messages are not available here; use the response
     * polling endpoint instead.
     */
    fun getMessageById(messageId: String): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(messageId, MessageGetMessageByIdParams.none())

    /** @see getMessageById */
    fun getMessageById(
        messageId: String,
        params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getMessageById */
    fun getMessageById(
        messageId: String,
        params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
    ): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(messageId, params, RequestOptions.none())

    /** @see getMessageById */
    fun getMessageById(
        params: MessageGetMessageByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetMessageByIdResponse>

    /** @see getMessageById */
    fun getMessageById(
        params: MessageGetMessageByIdParams
    ): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(params, RequestOptions.none())

    /** @see getMessageById */
    fun getMessageById(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageGetMessageByIdResponse> =
        getMessageById(messageId, MessageGetMessageByIdParams.none(), requestOptions)

    /**
     * Attach a score and optional comment to a finalized assistant message. Feedback is only valid
     * for messages with role `ASSISTANT` that have reached a terminal outcome.
     *
     * The current thread account governs access even when the message predates its account link.
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
            messageId: String
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(messageId, MessageGetMessageByIdParams.none())

        /** @see getMessageById */
        fun getMessageById(
            messageId: String,
            params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getMessageById */
        fun getMessageById(
            messageId: String,
            params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(messageId, params, RequestOptions.none())

        /** @see getMessageById */
        fun getMessageById(
            params: MessageGetMessageByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>>

        /** @see getMessageById */
        fun getMessageById(
            params: MessageGetMessageByIdParams
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(params, RequestOptions.none())

        /** @see getMessageById */
        fun getMessageById(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageGetMessageByIdResponse>> =
            getMessageById(messageId, MessageGetMessageByIdParams.none(), requestOptions)

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
