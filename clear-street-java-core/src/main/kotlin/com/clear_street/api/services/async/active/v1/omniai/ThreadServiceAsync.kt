// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadCreateThreadResponse
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadResponse
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsResponse
import com.clear_street.api.services.async.active.v1.omniai.threads.MessageServiceAsync
import com.clear_street.api.services.async.active.v1.omniai.threads.ResponseServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
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
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun messages(): MessageServiceAsync

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun response(): ResponseServiceAsync

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
     * Get a specific thread.
     *
     * Returns metadata (title, timestamps) for a single thread. Does not include messages — use
     * `GET /omni-ai/threads/{thread_id}/messages` for conversation history.
     */
    fun getThread(
        threadId: String,
        params: ThreadGetThreadParams,
    ): CompletableFuture<ThreadGetThreadResponse> =
        getThread(threadId, params, RequestOptions.none())

    /** @see getThread */
    fun getThread(
        threadId: String,
        params: ThreadGetThreadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadResponse> =
        getThread(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThread */
    fun getThread(params: ThreadGetThreadParams): CompletableFuture<ThreadGetThreadResponse> =
        getThread(params, RequestOptions.none())

    /** @see getThread */
    fun getThread(
        params: ThreadGetThreadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadResponse>

    /**
     * List conversation threads.
     *
     * Returns thread metadata ordered by most recently created first. Use `page_size` and
     * `page_token` for pagination. Thread objects contain only metadata (title, timestamps) — use
     * the messages endpoint for conversation history.
     */
    fun listThreads(params: ThreadListThreadsParams): CompletableFuture<ThreadListThreadsResponse> =
        listThreads(params, RequestOptions.none())

    /** @see listThreads */
    fun listThreads(
        params: ThreadListThreadsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadListThreadsResponse>

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
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun response(): ResponseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/omni-ai/threads`, but is otherwise the
         * same as [ThreadServiceAsync.createThread].
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
         * Returns a raw HTTP response for `get /active/v1/omni-ai/threads/{thread_id}`, but is
         * otherwise the same as [ThreadServiceAsync.getThread].
         */
        fun getThread(
            threadId: String,
            params: ThreadGetThreadParams,
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponse>> =
            getThread(threadId, params, RequestOptions.none())

        /** @see getThread */
        fun getThread(
            threadId: String,
            params: ThreadGetThreadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponse>> =
            getThread(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThread */
        fun getThread(
            params: ThreadGetThreadParams
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponse>> =
            getThread(params, RequestOptions.none())

        /** @see getThread */
        fun getThread(
            params: ThreadGetThreadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/threads`, but is otherwise the
         * same as [ThreadServiceAsync.listThreads].
         */
        fun listThreads(
            params: ThreadListThreadsParams
        ): CompletableFuture<HttpResponseFor<ThreadListThreadsResponse>> =
            listThreads(params, RequestOptions.none())

        /** @see listThreads */
        fun listThreads(
            params: ThreadListThreadsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListThreadsResponse>>
    }
}
