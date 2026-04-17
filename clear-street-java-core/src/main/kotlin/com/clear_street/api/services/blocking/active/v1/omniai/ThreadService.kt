// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadCreateThreadResponse
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadResponse
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsResponse
import com.clear_street.api.services.blocking.active.v1.omniai.threads.MessageService
import com.clear_street.api.services.blocking.active.v1.omniai.threads.ResponseService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Every endpoint requires an explicit account_id.
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
     * thread history. Every endpoint requires an explicit account_id.
     */
    fun messages(): MessageService

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Every endpoint requires an explicit account_id.
     */
    fun response(): ResponseService

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
    fun getThread(threadId: String, params: ThreadGetThreadParams): ThreadGetThreadResponse =
        getThread(threadId, params, RequestOptions.none())

    /** @see getThread */
    fun getThread(
        threadId: String,
        params: ThreadGetThreadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadResponse =
        getThread(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThread */
    fun getThread(params: ThreadGetThreadParams): ThreadGetThreadResponse =
        getThread(params, RequestOptions.none())

    /** @see getThread */
    fun getThread(
        params: ThreadGetThreadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadResponse

    /**
     * List conversation threads.
     *
     * Returns thread metadata ordered by most recently created first. Use `page_size` and
     * `page_token` for pagination. Thread objects contain only metadata (title, timestamps) — use
     * the messages endpoint for conversation history.
     */
    fun listThreads(params: ThreadListThreadsParams): ThreadListThreadsResponse =
        listThreads(params, RequestOptions.none())

    /** @see listThreads */
    fun listThreads(
        params: ThreadListThreadsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadListThreadsResponse

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
         * from thread history. Every endpoint requires an explicit account_id.
         */
        fun messages(): MessageService.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Every endpoint requires an explicit account_id.
         */
        fun response(): ResponseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/omni-ai/threads`, but is otherwise the
         * same as [ThreadService.createThread].
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
         * Returns a raw HTTP response for `get /active/v1/omni-ai/threads/{thread_id}`, but is
         * otherwise the same as [ThreadService.getThread].
         */
        @MustBeClosed
        fun getThread(
            threadId: String,
            params: ThreadGetThreadParams,
        ): HttpResponseFor<ThreadGetThreadResponse> =
            getThread(threadId, params, RequestOptions.none())

        /** @see getThread */
        @MustBeClosed
        fun getThread(
            threadId: String,
            params: ThreadGetThreadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadResponse> =
            getThread(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThread */
        @MustBeClosed
        fun getThread(params: ThreadGetThreadParams): HttpResponseFor<ThreadGetThreadResponse> =
            getThread(params, RequestOptions.none())

        /** @see getThread */
        @MustBeClosed
        fun getThread(
            params: ThreadGetThreadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadResponse>

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/threads`, but is otherwise the
         * same as [ThreadService.listThreads].
         */
        @MustBeClosed
        fun listThreads(
            params: ThreadListThreadsParams
        ): HttpResponseFor<ThreadListThreadsResponse> = listThreads(params, RequestOptions.none())

        /** @see listThreads */
        @MustBeClosed
        fun listThreads(
            params: ThreadListThreadsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadListThreadsResponse>
    }
}
