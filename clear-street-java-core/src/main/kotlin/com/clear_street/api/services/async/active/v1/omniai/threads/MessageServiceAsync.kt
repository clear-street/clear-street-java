// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai.threads

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageListMessagesParams
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageListMessagesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** AI assistant for conversational trading interactions. */
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

    /** List messages in a thread. */
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
