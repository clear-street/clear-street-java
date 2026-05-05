// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsResponse
import com.clear_street.api.services.blocking.v1.omniai.threads.MessageService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
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
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun messages(): MessageService

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
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun messages(): MessageService.WithRawResponse

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
