// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.iris.threads

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.iris.threads.messages.MessageListMessagesDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.messages.MessageListMessagesDeprecatedResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
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

    /** **Deprecated**: Use `GET /omni-ai/threads/{thread_id}/messages` instead. */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        threadId: String,
        params: MessageListMessagesDeprecatedParams,
    ): CompletableFuture<MessageListMessagesDeprecatedResponse> =
        listMessagesDeprecated(threadId, params, RequestOptions.none())

    /** @see listMessagesDeprecated */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        threadId: String,
        params: MessageListMessagesDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListMessagesDeprecatedResponse> =
        listMessagesDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see listMessagesDeprecated */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        params: MessageListMessagesDeprecatedParams
    ): CompletableFuture<MessageListMessagesDeprecatedResponse> =
        listMessagesDeprecated(params, RequestOptions.none())

    /** @see listMessagesDeprecated */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        params: MessageListMessagesDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListMessagesDeprecatedResponse>

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
         * Returns a raw HTTP response for `get /active/v1/iris/threads/{thread_id}/messages`, but
         * is otherwise the same as [MessageServiceAsync.listMessagesDeprecated].
         */
        @Deprecated("deprecated")
        fun listMessagesDeprecated(
            threadId: String,
            params: MessageListMessagesDeprecatedParams,
        ): CompletableFuture<HttpResponseFor<MessageListMessagesDeprecatedResponse>> =
            listMessagesDeprecated(threadId, params, RequestOptions.none())

        /** @see listMessagesDeprecated */
        @Deprecated("deprecated")
        fun listMessagesDeprecated(
            threadId: String,
            params: MessageListMessagesDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListMessagesDeprecatedResponse>> =
            listMessagesDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see listMessagesDeprecated */
        @Deprecated("deprecated")
        fun listMessagesDeprecated(
            params: MessageListMessagesDeprecatedParams
        ): CompletableFuture<HttpResponseFor<MessageListMessagesDeprecatedResponse>> =
            listMessagesDeprecated(params, RequestOptions.none())

        /** @see listMessagesDeprecated */
        @Deprecated("deprecated")
        fun listMessagesDeprecated(
            params: MessageListMessagesDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListMessagesDeprecatedResponse>>
    }
}
