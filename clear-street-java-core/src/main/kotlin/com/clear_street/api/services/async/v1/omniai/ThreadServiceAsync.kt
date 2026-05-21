// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use account_ids.
 */
interface ThreadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync

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
    ): CompletableFuture<ThreadCreateMessageResponse> =
        createMessage(threadId, params, RequestOptions.none())

    /** @see createMessage */
    fun createMessage(
        threadId: String,
        params: ThreadCreateMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadCreateMessageResponse> =
        createMessage(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see createMessage */
    fun createMessage(
        params: ThreadCreateMessageParams
    ): CompletableFuture<ThreadCreateMessageResponse> = createMessage(params, RequestOptions.none())

    /** @see createMessage */
    fun createMessage(
        params: ThreadCreateMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadCreateMessageResponse>

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
    fun createThread(
        params: ThreadCreateThreadParams
    ): CompletableFuture<ThreadCreateThreadResponse> = createThread(params, RequestOptions.none())

    /** @see createThread */
    fun createThread(
        params: ThreadCreateThreadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadCreateThreadResponse>

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
    fun getMessages(
        threadId: String,
        params: ThreadGetMessagesParams,
    ): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(threadId, params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        threadId: String,
        params: ThreadGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getMessages */
    fun getMessages(params: ThreadGetMessagesParams): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        params: ThreadGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetMessagesResponse>

    /**
     * Get a specific thread.
     *
     * Returns metadata (title, timestamps) for a single thread. Does not include messages — use
     * `GET /omni-ai/threads/{thread_id}/messages` for conversation history.
     */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams,
    ): CompletableFuture<ThreadGetThreadByIdResponse> =
        getThreadById(threadId, params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadByIdResponse> =
        getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadById */
    fun getThreadById(
        params: ThreadGetThreadByIdParams
    ): CompletableFuture<ThreadGetThreadByIdResponse> = getThreadById(params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        params: ThreadGetThreadByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadByIdResponse>

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
    ): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(threadId, params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        params: ThreadGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ThreadGetThreadResponseParams
    ): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ThreadGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadResponseResponse>

    /**
     * List conversation threads.
     *
     * Returns thread metadata ordered by most recently created first. Use `page_size` and
     * `page_token` for pagination. Thread objects contain only metadata (title, timestamps) — use
     * the messages endpoint for conversation history.
     */
    fun getThreads(params: ThreadGetThreadsParams): CompletableFuture<ThreadGetThreadsResponse> =
        getThreads(params, RequestOptions.none())

    /** @see getThreads */
    fun getThreads(
        params: ThreadGetThreadsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadsResponse>

    /**
     * A view of [ThreadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/threads/{thread_id}/messages`, but is
         * otherwise the same as [ThreadServiceAsync.createMessage].
         */
        fun createMessage(
            threadId: String,
            params: ThreadCreateMessageParams,
        ): CompletableFuture<HttpResponseFor<ThreadCreateMessageResponse>> =
            createMessage(threadId, params, RequestOptions.none())

        /** @see createMessage */
        fun createMessage(
            threadId: String,
            params: ThreadCreateMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadCreateMessageResponse>> =
            createMessage(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see createMessage */
        fun createMessage(
            params: ThreadCreateMessageParams
        ): CompletableFuture<HttpResponseFor<ThreadCreateMessageResponse>> =
            createMessage(params, RequestOptions.none())

        /** @see createMessage */
        fun createMessage(
            params: ThreadCreateMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadCreateMessageResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/threads`, but is otherwise the same as
         * [ThreadServiceAsync.createThread].
         */
        fun createThread(
            params: ThreadCreateThreadParams
        ): CompletableFuture<HttpResponseFor<ThreadCreateThreadResponse>> =
            createThread(params, RequestOptions.none())

        /** @see createThread */
        fun createThread(
            params: ThreadCreateThreadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadCreateThreadResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}/messages`, but is
         * otherwise the same as [ThreadServiceAsync.getMessages].
         */
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams,
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(threadId, params, RequestOptions.none())

        /** @see getMessages */
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getMessages */
        fun getMessages(
            params: ThreadGetMessagesParams
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(params, RequestOptions.none())

        /** @see getMessages */
        fun getMessages(
            params: ThreadGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}`, but is otherwise
         * the same as [ThreadServiceAsync.getThreadById].
         */
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams,
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(threadId, params, RequestOptions.none())

        /** @see getThreadById */
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadById */
        fun getThreadById(
            params: ThreadGetThreadByIdParams
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(params, RequestOptions.none())

        /** @see getThreadById */
        fun getThreadById(
            params: ThreadGetThreadByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}/response`, but is
         * otherwise the same as [ThreadServiceAsync.getThreadResponse].
         */
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams,
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(threadId, params, RequestOptions.none())

        /** @see getThreadResponse */
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadResponse */
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(params, RequestOptions.none())

        /** @see getThreadResponse */
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads`, but is otherwise the same as
         * [ThreadServiceAsync.getThreads].
         */
        fun getThreads(
            params: ThreadGetThreadsParams
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadsResponse>> =
            getThreads(params, RequestOptions.none())

        /** @see getThreads */
        fun getThreads(
            params: ThreadGetThreadsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadsResponse>>
    }
}
