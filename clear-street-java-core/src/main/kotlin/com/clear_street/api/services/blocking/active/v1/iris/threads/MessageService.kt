// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris.threads

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.iris.threads.messages.MessageListMessagesDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.messages.MessageListMessagesDeprecatedResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
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

    /** **Deprecated**: Use `GET /omni-ai/threads/{thread_id}/messages` instead. */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        threadId: String,
        params: MessageListMessagesDeprecatedParams,
    ): MessageListMessagesDeprecatedResponse =
        listMessagesDeprecated(threadId, params, RequestOptions.none())

    /** @see listMessagesDeprecated */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        threadId: String,
        params: MessageListMessagesDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListMessagesDeprecatedResponse =
        listMessagesDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see listMessagesDeprecated */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        params: MessageListMessagesDeprecatedParams
    ): MessageListMessagesDeprecatedResponse = listMessagesDeprecated(params, RequestOptions.none())

    /** @see listMessagesDeprecated */
    @Deprecated("deprecated")
    fun listMessagesDeprecated(
        params: MessageListMessagesDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListMessagesDeprecatedResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/iris/threads/{thread_id}/messages`, but
         * is otherwise the same as [MessageService.listMessagesDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listMessagesDeprecated(
            threadId: String,
            params: MessageListMessagesDeprecatedParams,
        ): HttpResponseFor<MessageListMessagesDeprecatedResponse> =
            listMessagesDeprecated(threadId, params, RequestOptions.none())

        /** @see listMessagesDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listMessagesDeprecated(
            threadId: String,
            params: MessageListMessagesDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListMessagesDeprecatedResponse> =
            listMessagesDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see listMessagesDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listMessagesDeprecated(
            params: MessageListMessagesDeprecatedParams
        ): HttpResponseFor<MessageListMessagesDeprecatedResponse> =
            listMessagesDeprecated(params, RequestOptions.none())

        /** @see listMessagesDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listMessagesDeprecated(
            params: MessageListMessagesDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListMessagesDeprecatedResponse>
    }
}
