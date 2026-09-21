// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.omniai

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.omniai.messages.MessageGetMessageByIdParams
import com.clearstreet.api.models.v1.omniai.messages.MessageGetMessageByIdResponse
import com.clearstreet.api.models.v1.omniai.messages.MessageSubmitFeedbackParams
import com.clearstreet.api.models.v1.omniai.messages.MessageSubmitFeedbackResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use account_ids.
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
     * Read a finalized message using its parent thread for ownership and linked-account
     * authorization. In-progress assistant messages are not available here; use the response
     * polling endpoint instead.
     */
    fun getMessageById(messageId: String): MessageGetMessageByIdResponse =
        getMessageById(messageId, MessageGetMessageByIdParams.none())

    /** @see getMessageById */
    fun getMessageById(
        messageId: String,
        params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetMessageByIdResponse =
        getMessageById(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getMessageById */
    fun getMessageById(
        messageId: String,
        params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
    ): MessageGetMessageByIdResponse = getMessageById(messageId, params, RequestOptions.none())

    /** @see getMessageById */
    fun getMessageById(
        params: MessageGetMessageByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetMessageByIdResponse

    /** @see getMessageById */
    fun getMessageById(params: MessageGetMessageByIdParams): MessageGetMessageByIdResponse =
        getMessageById(params, RequestOptions.none())

    /** @see getMessageById */
    fun getMessageById(
        messageId: String,
        requestOptions: RequestOptions,
    ): MessageGetMessageByIdResponse =
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
    ): MessageSubmitFeedbackResponse = submitFeedback(messageId, params, RequestOptions.none())

    /** @see submitFeedback */
    fun submitFeedback(
        messageId: String,
        params: MessageSubmitFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSubmitFeedbackResponse =
        submitFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see submitFeedback */
    fun submitFeedback(params: MessageSubmitFeedbackParams): MessageSubmitFeedbackResponse =
        submitFeedback(params, RequestOptions.none())

    /** @see submitFeedback */
    fun submitFeedback(
        params: MessageSubmitFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSubmitFeedbackResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/messages/{message_id}`, but is otherwise
         * the same as [MessageService.getMessageById].
         */
        @MustBeClosed
        fun getMessageById(messageId: String): HttpResponseFor<MessageGetMessageByIdResponse> =
            getMessageById(messageId, MessageGetMessageByIdParams.none())

        /** @see getMessageById */
        @MustBeClosed
        fun getMessageById(
            messageId: String,
            params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetMessageByIdResponse> =
            getMessageById(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getMessageById */
        @MustBeClosed
        fun getMessageById(
            messageId: String,
            params: MessageGetMessageByIdParams = MessageGetMessageByIdParams.none(),
        ): HttpResponseFor<MessageGetMessageByIdResponse> =
            getMessageById(messageId, params, RequestOptions.none())

        /** @see getMessageById */
        @MustBeClosed
        fun getMessageById(
            params: MessageGetMessageByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetMessageByIdResponse>

        /** @see getMessageById */
        @MustBeClosed
        fun getMessageById(
            params: MessageGetMessageByIdParams
        ): HttpResponseFor<MessageGetMessageByIdResponse> =
            getMessageById(params, RequestOptions.none())

        /** @see getMessageById */
        @MustBeClosed
        fun getMessageById(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageGetMessageByIdResponse> =
            getMessageById(messageId, MessageGetMessageByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/messages/{message_id}/feedback`, but is
         * otherwise the same as [MessageService.submitFeedback].
         */
        @MustBeClosed
        fun submitFeedback(
            messageId: String,
            params: MessageSubmitFeedbackParams,
        ): HttpResponseFor<MessageSubmitFeedbackResponse> =
            submitFeedback(messageId, params, RequestOptions.none())

        /** @see submitFeedback */
        @MustBeClosed
        fun submitFeedback(
            messageId: String,
            params: MessageSubmitFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSubmitFeedbackResponse> =
            submitFeedback(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see submitFeedback */
        @MustBeClosed
        fun submitFeedback(
            params: MessageSubmitFeedbackParams
        ): HttpResponseFor<MessageSubmitFeedbackResponse> =
            submitFeedback(params, RequestOptions.none())

        /** @see submitFeedback */
        @MustBeClosed
        fun submitFeedback(
            params: MessageSubmitFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSubmitFeedbackResponse>
    }
}
