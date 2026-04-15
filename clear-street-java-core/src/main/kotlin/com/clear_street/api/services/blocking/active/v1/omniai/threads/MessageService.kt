// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai.threads

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageListMessagesParams
import com.clear_street.api.models.active.v1.omniai.threads.messages.MessageListMessagesResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** AI assistant for conversational trading interactions. */
interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /** List messages in a thread. */
    fun listMessages(
        threadId: String,
        params: MessageListMessagesParams,
    ): MessageListMessagesResponse = listMessages(threadId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        threadId: String,
        params: MessageListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListMessagesResponse =
        listMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(params: MessageListMessagesParams): MessageListMessagesResponse =
        listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: MessageListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListMessagesResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/threads/{thread_id}/messages`,
         * but is otherwise the same as [MessageService.listMessages].
         */
        @MustBeClosed
        fun listMessages(
            threadId: String,
            params: MessageListMessagesParams,
        ): HttpResponseFor<MessageListMessagesResponse> =
            listMessages(threadId, params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            threadId: String,
            params: MessageListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListMessagesResponse> =
            listMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            params: MessageListMessagesParams
        ): HttpResponseFor<MessageListMessagesResponse> =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            params: MessageListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListMessagesResponse>
    }
}
