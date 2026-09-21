// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.omniai

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.omniai.threads.ThreadCreateMessageParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadCreateMessageResponse
import com.clearstreet.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadCreateThreadResponse
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetMessagesParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetMessagesResponse
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadByIdParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadByIdResponse
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadResponseParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadResponseResponse
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadsParams
import com.clearstreet.api.models.v1.omniai.threads.ThreadGetThreadsResponse
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
     * Append a user message to an existing thread and start an assistant response. Poll the
     * returned `response_id` via `GET /omni-ai/responses/{response_id}` for assistant output.
     *
     * Only one response may be active per thread. Wait for it to reach a terminal status before
     * submitting another turn; otherwise this endpoint returns 409.
     *
     * The first accepted selected-account message links an unlinked thread. A linked thread keeps
     * its account regardless of omission or another selection. A changed scope also returns 409
     * without accepting a turn.
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
     * Atomically create a conversation and submit its first user turn. Use `instant` with `text`
     * for a prompt, or `deep_insights` with a ticker `target` and optional `thesis` for long-form
     * research.
     *
     * Poll the returned `response_id` via `GET /omni-ai/responses/{response_id}` for assistant
     * output.
     *
     * Omit `account_id` to start without an account. The first accepted turn with a selected
     * account links that account permanently. Reuse `Idempotency-Key` only for an identical
     * request.
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
     * List finalized messages, including messages created before the account link. Return the
     * latest page by default, in chronological order within each page. Use the returned page token
     * to navigate history.
     *
     * In-progress assistant output is not included. Poll `GET /omni-ai/responses/{response_id}`
     * until the response reaches a terminal status, then read its finalized message here.
     */
    fun getMessages(threadId: String): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(threadId, ThreadGetMessagesParams.none())

    /** @see getMessages */
    fun getMessages(
        threadId: String,
        params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getMessages */
    fun getMessages(
        threadId: String,
        params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
    ): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(threadId, params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        params: ThreadGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetMessagesResponse>

    /** @see getMessages */
    fun getMessages(params: ThreadGetMessagesParams): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        threadId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadGetMessagesResponse> =
        getMessages(threadId, ThreadGetMessagesParams.none(), requestOptions)

    /**
     * Read an owned thread's metadata. Use `GET /omni-ai/threads/{thread_id}/messages` for
     * conversation history.
     *
     * Omission or another account selection does not change authorization.
     */
    fun getThreadById(threadId: String): CompletableFuture<ThreadGetThreadByIdResponse> =
        getThreadById(threadId, ThreadGetThreadByIdParams.none())

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadByIdResponse> =
        getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
    ): CompletableFuture<ThreadGetThreadByIdResponse> =
        getThreadById(threadId, params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        params: ThreadGetThreadByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadByIdResponse>

    /** @see getThreadById */
    fun getThreadById(
        params: ThreadGetThreadByIdParams
    ): CompletableFuture<ThreadGetThreadByIdResponse> = getThreadById(params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadGetThreadByIdResponse> =
        getThreadById(threadId, ThreadGetThreadByIdParams.none(), requestOptions)

    /**
     * Look up the currently active response without knowing its `response_id`. Use this endpoint
     * when reopening a thread whose assistant turn may still be in progress.
     *
     * An idle owned thread returns HTTP 200 with `data: null`.
     */
    fun getThreadResponse(threadId: String): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(threadId, ThreadGetThreadResponseParams.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
    ): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(threadId, params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ThreadGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadResponseResponse>

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ThreadGetThreadResponseParams
    ): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadGetThreadResponseResponse> =
        getThreadResponse(threadId, ThreadGetThreadResponseParams.none(), requestOptions)

    /**
     * List authorized conversation metadata, newest first. Use `page_size` and `page_token` for
     * pagination, and the messages endpoint for conversation history.
     *
     * With `account_id`, list only conversations linked to that account and require current account
     * access. Without it, list only conversations with no linked account.
     */
    fun getThreads(): CompletableFuture<ThreadGetThreadsResponse> =
        getThreads(ThreadGetThreadsParams.none())

    /** @see getThreads */
    fun getThreads(
        params: ThreadGetThreadsParams = ThreadGetThreadsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadsResponse>

    /** @see getThreads */
    fun getThreads(
        params: ThreadGetThreadsParams = ThreadGetThreadsParams.none()
    ): CompletableFuture<ThreadGetThreadsResponse> = getThreads(params, RequestOptions.none())

    /** @see getThreads */
    fun getThreads(requestOptions: RequestOptions): CompletableFuture<ThreadGetThreadsResponse> =
        getThreads(ThreadGetThreadsParams.none(), requestOptions)

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
            threadId: String
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(threadId, ThreadGetMessagesParams.none())

        /** @see getMessages */
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getMessages */
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(threadId, params, RequestOptions.none())

        /** @see getMessages */
        fun getMessages(
            params: ThreadGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>>

        /** @see getMessages */
        fun getMessages(
            params: ThreadGetMessagesParams
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(params, RequestOptions.none())

        /** @see getMessages */
        fun getMessages(
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadGetMessagesResponse>> =
            getMessages(threadId, ThreadGetMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}`, but is otherwise
         * the same as [ThreadServiceAsync.getThreadById].
         */
        fun getThreadById(
            threadId: String
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(threadId, ThreadGetThreadByIdParams.none())

        /** @see getThreadById */
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadById */
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(threadId, params, RequestOptions.none())

        /** @see getThreadById */
        fun getThreadById(
            params: ThreadGetThreadByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>>

        /** @see getThreadById */
        fun getThreadById(
            params: ThreadGetThreadByIdParams
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(params, RequestOptions.none())

        /** @see getThreadById */
        fun getThreadById(
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadByIdResponse>> =
            getThreadById(threadId, ThreadGetThreadByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}/response`, but is
         * otherwise the same as [ThreadServiceAsync.getThreadResponse].
         */
        fun getThreadResponse(
            threadId: String
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(threadId, ThreadGetThreadResponseParams.none())

        /** @see getThreadResponse */
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadResponse */
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(threadId, params, RequestOptions.none())

        /** @see getThreadResponse */
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>>

        /** @see getThreadResponse */
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(params, RequestOptions.none())

        /** @see getThreadResponse */
        fun getThreadResponse(
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadResponseResponse>> =
            getThreadResponse(threadId, ThreadGetThreadResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads`, but is otherwise the same as
         * [ThreadServiceAsync.getThreads].
         */
        fun getThreads(): CompletableFuture<HttpResponseFor<ThreadGetThreadsResponse>> =
            getThreads(ThreadGetThreadsParams.none())

        /** @see getThreads */
        fun getThreads(
            params: ThreadGetThreadsParams = ThreadGetThreadsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadsResponse>>

        /** @see getThreads */
        fun getThreads(
            params: ThreadGetThreadsParams = ThreadGetThreadsParams.none()
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadsResponse>> =
            getThreads(params, RequestOptions.none())

        /** @see getThreads */
        fun getThreads(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadsResponse>> =
            getThreads(ThreadGetThreadsParams.none(), requestOptions)
    }
}
