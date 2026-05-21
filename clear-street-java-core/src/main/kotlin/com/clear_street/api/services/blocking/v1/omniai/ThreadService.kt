// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateMessageParams
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateMessageResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetMessagesParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetMessagesResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use account_ids.
 */
interface ThreadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService

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
        params: ThreadCreateMessageParams,
    ): ThreadCreateMessageResponse = createMessage(threadId, params, RequestOptions.none())

    /** @see createMessage */
    fun createMessage(
        threadId: String,
        params: ThreadCreateMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadCreateMessageResponse =
        createMessage(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see createMessage */
    fun createMessage(params: ThreadCreateMessageParams): ThreadCreateMessageResponse =
        createMessage(params, RequestOptions.none())

    /** @see createMessage */
    fun createMessage(
        params: ThreadCreateMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadCreateMessageResponse

    /**
     * Create a new conversation thread.
     *
     * Atomically creates a new thread and submits the first user turn. The response contains a
     * `response_id` that should be polled via `GET /omni-ai/responses/{response_id}` for assistant
     * output.
     *
     * Two creation modes are supported:
     * - **instant** — provide `text` with a natural-language prompt.
     * - **deep_insights** — provide a `target` ticker and optional `thesis` for long-form research.
     */
    fun createThread(params: ThreadCreateThreadParams): ThreadCreateThreadResponse =
        createThread(params, RequestOptions.none())

    /** @see createThread */
    fun createThread(
        params: ThreadCreateThreadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadCreateThreadResponse

    /**
     * List finalized messages in a thread.
     *
     * Returns the latest page of **finalized** messages by default, with messages within each page
     * ordered chronologically. Messages from in-progress assistant turns are excluded — use `GET
     * /omni-ai/threads/{thread_id}/response` or `GET /omni-ai/responses/{response_id}` for live
     * output.
     *
     * If the last finalized message has role `USER`, an active response likely exists and should be
     * polled separately.
     */
    fun getMessages(threadId: String, params: ThreadGetMessagesParams): ThreadGetMessagesResponse =
        getMessages(threadId, params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        threadId: String,
        params: ThreadGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetMessagesResponse =
        getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getMessages */
    fun getMessages(params: ThreadGetMessagesParams): ThreadGetMessagesResponse =
        getMessages(params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        params: ThreadGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetMessagesResponse

    /**
     * Get a specific thread.
     *
     * Returns metadata (title, timestamps) for a single thread. Does not include messages — use
     * `GET /omni-ai/threads/{thread_id}/messages` for conversation history.
     */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams,
    ): ThreadGetThreadByIdResponse = getThreadById(threadId, params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadByIdResponse =
        getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadById */
    fun getThreadById(params: ThreadGetThreadByIdParams): ThreadGetThreadByIdResponse =
        getThreadById(params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        params: ThreadGetThreadByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadByIdResponse

    /**
     * Get the active response for a thread.
     *
     * Convenience endpoint to look up the currently active response for a thread without knowing
     * the `response_id`. Useful when reloading a thread whose last finalized message is a `USER`
     * message — this indicates an assistant turn is likely in progress.
     *
     * Returns **404** if no active response exists (the thread is idle).
     */
    fun getThreadResponse(
        threadId: String,
        params: ThreadGetThreadResponseParams,
    ): ThreadGetThreadResponseResponse = getThreadResponse(threadId, params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        params: ThreadGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadResponseResponse =
        getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadResponse */
    fun getThreadResponse(params: ThreadGetThreadResponseParams): ThreadGetThreadResponseResponse =
        getThreadResponse(params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ThreadGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadResponseResponse

    /**
     * List conversation threads.
     *
     * Returns thread metadata ordered by most recently created first. Use `page_size` and
     * `page_token` for pagination. Thread objects contain only metadata (title, timestamps) — use
     * the messages endpoint for conversation history.
     */
    fun getThreads(params: ThreadGetThreadsParams): ThreadGetThreadsResponse =
        getThreads(params, RequestOptions.none())

    /** @see getThreads */
    fun getThreads(
        params: ThreadGetThreadsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadsResponse

    /** A view of [ThreadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/threads/{thread_id}/messages`, but is
         * otherwise the same as [ThreadService.createMessage].
         */
        @MustBeClosed
        fun createMessage(
            threadId: String,
            params: ThreadCreateMessageParams,
        ): HttpResponseFor<ThreadCreateMessageResponse> =
            createMessage(threadId, params, RequestOptions.none())

        /** @see createMessage */
        @MustBeClosed
        fun createMessage(
            threadId: String,
            params: ThreadCreateMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadCreateMessageResponse> =
            createMessage(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see createMessage */
        @MustBeClosed
        fun createMessage(
            params: ThreadCreateMessageParams
        ): HttpResponseFor<ThreadCreateMessageResponse> =
            createMessage(params, RequestOptions.none())

        /** @see createMessage */
        @MustBeClosed
        fun createMessage(
            params: ThreadCreateMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadCreateMessageResponse>

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/threads`, but is otherwise the same as
         * [ThreadService.createThread].
         */
        @MustBeClosed
        fun createThread(
            params: ThreadCreateThreadParams
        ): HttpResponseFor<ThreadCreateThreadResponse> = createThread(params, RequestOptions.none())

        /** @see createThread */
        @MustBeClosed
        fun createThread(
            params: ThreadCreateThreadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadCreateThreadResponse>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}/messages`, but is
         * otherwise the same as [ThreadService.getMessages].
         */
        @MustBeClosed
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams,
        ): HttpResponseFor<ThreadGetMessagesResponse> =
            getMessages(threadId, params, RequestOptions.none())

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetMessagesResponse> =
            getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            params: ThreadGetMessagesParams
        ): HttpResponseFor<ThreadGetMessagesResponse> = getMessages(params, RequestOptions.none())

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            params: ThreadGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetMessagesResponse>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}`, but is otherwise
         * the same as [ThreadService.getThreadById].
         */
        @MustBeClosed
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams,
        ): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(threadId, params, RequestOptions.none())

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            params: ThreadGetThreadByIdParams
        ): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(params, RequestOptions.none())

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            params: ThreadGetThreadByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadByIdResponse>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}/response`, but is
         * otherwise the same as [ThreadService.getThreadResponse].
         */
        @MustBeClosed
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams,
        ): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(threadId, params, RequestOptions.none())

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams
        ): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(params, RequestOptions.none())

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadResponseResponse>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads`, but is otherwise the same as
         * [ThreadService.getThreads].
         */
        @MustBeClosed
        fun getThreads(params: ThreadGetThreadsParams): HttpResponseFor<ThreadGetThreadsResponse> =
            getThreads(params, RequestOptions.none())

        /** @see getThreads */
        @MustBeClosed
        fun getThreads(
            params: ThreadGetThreadsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadsResponse>
    }
}
