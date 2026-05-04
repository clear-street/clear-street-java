// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.messages.MessageFeedbackParams
import com.clear_street.api.models.v1.omniai.messages.MessageFeedbackResponse
import com.clear_street.api.models.v1.omniai.messages.MessageGetMessageParams
import com.clear_street.api.models.v1.omniai.messages.MessageGetMessageResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
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
     * Create feedback on a finalized assistant message.
     *
     * Attaches a score and optional comment to a finalized assistant message. Feedback is only
     * valid for messages with role `ASSISTANT` that have reached a terminal outcome.
     */
    fun feedback(messageId: String, params: MessageFeedbackParams): MessageFeedbackResponse =
        feedback(messageId, params, RequestOptions.none())

    /** @see feedback */
    fun feedback(
        messageId: String,
        params: MessageFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageFeedbackResponse =
        feedback(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see feedback */
    fun feedback(params: MessageFeedbackParams): MessageFeedbackResponse =
        feedback(params, RequestOptions.none())

    /** @see feedback */
    fun feedback(
        params: MessageFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageFeedbackResponse

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
         * Returns a raw HTTP response for `post /v1/omni-ai/messages/{message_id}/feedback`, but is
         * otherwise the same as [MessageService.feedback].
         */
        @MustBeClosed
        fun feedback(
            messageId: String,
            params: MessageFeedbackParams,
        ): HttpResponseFor<MessageFeedbackResponse> =
            feedback(messageId, params, RequestOptions.none())

        /** @see feedback */
        @MustBeClosed
        fun feedback(
            messageId: String,
            params: MessageFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageFeedbackResponse> =
            feedback(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see feedback */
        @MustBeClosed
        fun feedback(params: MessageFeedbackParams): HttpResponseFor<MessageFeedbackResponse> =
            feedback(params, RequestOptions.none())

        /** @see feedback */
        @MustBeClosed
        fun feedback(
            params: MessageFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageFeedbackResponse>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/messages/{message_id}`, but is otherwise
         * the same as [MessageService.getMessage].
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
