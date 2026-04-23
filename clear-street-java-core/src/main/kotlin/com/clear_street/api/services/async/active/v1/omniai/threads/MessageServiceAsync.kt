// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai.threads

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageCreateMessageParams
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageCreateMessageResponse
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageListMessagesParams
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageListMessagesResponse
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
     * Continue an existing conversation thread.
     *
     * Appends a new user message to the thread and starts an assistant response. Only one response
     * may be active per thread at a time — if the previous turn is still in progress, this endpoint
     * returns **409 Conflict**. Wait for the active response to reach a terminal status before
     * submitting the next turn.
     *
     * Poll the returned `response_id` via `GET /omni-ai/responses/{response_id}` for assistant
     * output.
     */
    fun createMessage(
        threadId: String,
        params: MessageCreateMessageParams,
    ): CompletableFuture<MessageCreateMessageResponse> =
        createMessage(threadId, params, RequestOptions.none())

    /** @see createMessage */
    fun createMessage(
        threadId: String,
        params: MessageCreateMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCreateMessageResponse> =
        createMessage(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see createMessage */
    fun createMessage(
        params: MessageCreateMessageParams
    ): CompletableFuture<MessageCreateMessageResponse> =
        createMessage(params, RequestOptions.none())

    /** @see createMessage */
    fun createMessage(
        params: MessageCreateMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCreateMessageResponse>

    /**
     * List finalized messages in a thread.
     *
     * Returns **finalized** messages in chronological order. Messages from in-progress assistant
     * turns are excluded — use `GET /omni-ai/threads/{thread_id}/response` or `GET
     * /omni-ai/responses/{response_id}` for live output.
     *
     * If the last finalized message has role `USER`, an active response likely exists and should be
     * polled separately.
     */
    fun listMessages(
        threadId: String,
        params: MessageListMessagesParams,
    ): CompletableFuture<MessageListMessagesResponse> =
        listMessages(threadId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        threadId: String,
        params: MessageListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListMessagesResponse> =
        listMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(
        params: MessageListMessagesParams
    ): CompletableFuture<MessageListMessagesResponse> = listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: MessageListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListMessagesResponse>

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
         * Returns a raw HTTP response for `post /active/v1/omni-ai/threads/{thread_id}/messages`,
         * but is otherwise the same as [MessageServiceAsync.createMessage].
         */
        fun createMessage(
            threadId: String,
            params: MessageCreateMessageParams,
        ): CompletableFuture<HttpResponseFor<MessageCreateMessageResponse>> =
            createMessage(threadId, params, RequestOptions.none())

        /** @see createMessage */
        fun createMessage(
            threadId: String,
            params: MessageCreateMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCreateMessageResponse>> =
            createMessage(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see createMessage */
        fun createMessage(
            params: MessageCreateMessageParams
        ): CompletableFuture<HttpResponseFor<MessageCreateMessageResponse>> =
            createMessage(params, RequestOptions.none())

        /** @see createMessage */
        fun createMessage(
            params: MessageCreateMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCreateMessageResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/threads/{thread_id}/messages`,
         * but is otherwise the same as [MessageServiceAsync.listMessages].
         */
        fun listMessages(
            threadId: String,
            params: MessageListMessagesParams,
        ): CompletableFuture<HttpResponseFor<MessageListMessagesResponse>> =
            listMessages(threadId, params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            threadId: String,
            params: MessageListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListMessagesResponse>> =
            listMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see listMessages */
        fun listMessages(
            params: MessageListMessagesParams
        ): CompletableFuture<HttpResponseFor<MessageListMessagesResponse>> =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            params: MessageListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListMessagesResponse>>
    }
}
