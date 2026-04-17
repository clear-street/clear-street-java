// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.messages.MessageGetMessageParams
import com.clear_street.api.models.active.v1.omniai.messages.MessageGetMessageResponse
import com.clear_street.api.services.blocking.active.v1.omniai.messages.FeedbackService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Every endpoint requires an explicit account_id.
 */
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

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Every endpoint requires an explicit account_id.
     */
    fun feedback(): FeedbackService

    /**
     * Get a finalized message by ID.
     *
     * Returns a single finalized message. Returns **404** if the message belongs to an in-progress
     * assistant turn (use the response endpoint for live output). Once the turn completes, the
     * message becomes available here.
     */
    fun getMessage(messageId: String, params: MessageGetMessageParams): MessageGetMessageResponse =
        getMessage(messageId, params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        messageId: String,
        params: MessageGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetMessageResponse =
        getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getMessage */
    fun getMessage(params: MessageGetMessageParams): MessageGetMessageResponse =
        getMessage(params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        params: MessageGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetMessageResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Every endpoint requires an explicit account_id.
         */
        fun feedback(): FeedbackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/messages/{message_id}`, but is
         * otherwise the same as [MessageService.getMessage].
         */
        @MustBeClosed
        fun getMessage(
            messageId: String,
            params: MessageGetMessageParams,
        ): HttpResponseFor<MessageGetMessageResponse> =
            getMessage(messageId, params, RequestOptions.none())

        /** @see getMessage */
        @MustBeClosed
        fun getMessage(
            messageId: String,
            params: MessageGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetMessageResponse> =
            getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getMessage */
        @MustBeClosed
        fun getMessage(
            params: MessageGetMessageParams
        ): HttpResponseFor<MessageGetMessageResponse> = getMessage(params, RequestOptions.none())

        /** @see getMessage */
        @MustBeClosed
        fun getMessage(
            params: MessageGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetMessageResponse>
    }
}
