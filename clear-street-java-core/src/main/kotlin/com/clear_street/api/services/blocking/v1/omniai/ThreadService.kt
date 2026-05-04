// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadListThreadsParams
import com.clear_street.api.models.v1.omniai.threads.ThreadListThreadsResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadResponseParams
import com.clear_street.api.models.v1.omniai.threads.ThreadResponseResponse
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

    /**
     * Get the active response for a thread.
     *
     * Convenience endpoint to look up the currently active response for a thread without knowing
     * the `response_id`. Useful when reloading a thread whose last finalized message is a `USER`
     * message — this indicates an assistant turn is likely in progress.
     *
     * Returns **404** if no active response exists (the thread is idle).
     */
    fun response(threadId: String, params: ThreadResponseParams): ThreadResponseResponse =
        response(threadId, params, RequestOptions.none())

    /** @see response */
    fun response(
        threadId: String,
        params: ThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadResponseResponse =
        response(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see response */
    fun response(params: ThreadResponseParams): ThreadResponseResponse =
        response(params, RequestOptions.none())

    /** @see response */
    fun response(
        params: ThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadResponseResponse

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
         * the same as [ThreadService.getThread].
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
         * Returns a raw HTTP response for `get /v1/omni-ai/threads`, but is otherwise the same as
         * [ThreadService.listThreads].
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

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}/response`, but is
         * otherwise the same as [ThreadService.response].
         */
        @MustBeClosed
        fun response(
            threadId: String,
            params: ThreadResponseParams,
        ): HttpResponseFor<ThreadResponseResponse> =
            response(threadId, params, RequestOptions.none())

        /** @see response */
        @MustBeClosed
        fun response(
            threadId: String,
            params: ThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadResponseResponse> =
            response(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see response */
        @MustBeClosed
        fun response(params: ThreadResponseParams): HttpResponseFor<ThreadResponseResponse> =
            response(params, RequestOptions.none())

        /** @see response */
        @MustBeClosed
        fun response(
            params: ThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadResponseResponse>
    }
}
