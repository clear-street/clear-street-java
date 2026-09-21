// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.omniai

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
    fun createThread(params: ThreadCreateThreadParams): ThreadCreateThreadResponse =
        createThread(params, RequestOptions.none())

    /** @see createThread */
    fun createThread(
        params: ThreadCreateThreadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadCreateThreadResponse

    /**
     * List finalized messages, including messages created before the account link. Return the
     * latest page by default, in chronological order within each page. Use the returned page token
     * to navigate history.
     *
     * In-progress assistant output is not included. Poll `GET /omni-ai/responses/{response_id}`
     * until the response reaches a terminal status, then read its finalized message here.
     */
    fun getMessages(threadId: String): ThreadGetMessagesResponse =
        getMessages(threadId, ThreadGetMessagesParams.none())

    /** @see getMessages */
    fun getMessages(
        threadId: String,
        params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetMessagesResponse =
        getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getMessages */
    fun getMessages(
        threadId: String,
        params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
    ): ThreadGetMessagesResponse = getMessages(threadId, params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        params: ThreadGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetMessagesResponse

    /** @see getMessages */
    fun getMessages(params: ThreadGetMessagesParams): ThreadGetMessagesResponse =
        getMessages(params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(threadId: String, requestOptions: RequestOptions): ThreadGetMessagesResponse =
        getMessages(threadId, ThreadGetMessagesParams.none(), requestOptions)

    /**
     * Read an owned thread's metadata. Use `GET /omni-ai/threads/{thread_id}/messages` for
     * conversation history.
     *
     * Omission or another account selection does not change authorization.
     */
    fun getThreadById(threadId: String): ThreadGetThreadByIdResponse =
        getThreadById(threadId, ThreadGetThreadByIdParams.none())

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadByIdResponse =
        getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
    ): ThreadGetThreadByIdResponse = getThreadById(threadId, params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        params: ThreadGetThreadByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadByIdResponse

    /** @see getThreadById */
    fun getThreadById(params: ThreadGetThreadByIdParams): ThreadGetThreadByIdResponse =
        getThreadById(params, RequestOptions.none())

    /** @see getThreadById */
    fun getThreadById(
        threadId: String,
        requestOptions: RequestOptions,
    ): ThreadGetThreadByIdResponse =
        getThreadById(threadId, ThreadGetThreadByIdParams.none(), requestOptions)

    /**
     * Look up the currently active response without knowing its `response_id`. Use this endpoint
     * when reopening a thread whose assistant turn may still be in progress.
     *
     * An idle owned thread returns HTTP 200 with `data: null`.
     */
    fun getThreadResponse(threadId: String): ThreadGetThreadResponseResponse =
        getThreadResponse(threadId, ThreadGetThreadResponseParams.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadResponseResponse =
        getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
    ): ThreadGetThreadResponseResponse = getThreadResponse(threadId, params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ThreadGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadResponseResponse

    /** @see getThreadResponse */
    fun getThreadResponse(params: ThreadGetThreadResponseParams): ThreadGetThreadResponseResponse =
        getThreadResponse(params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        requestOptions: RequestOptions,
    ): ThreadGetThreadResponseResponse =
        getThreadResponse(threadId, ThreadGetThreadResponseParams.none(), requestOptions)

    /**
     * List authorized conversation metadata, newest first. Use `page_size` and `page_token` for
     * pagination, and the messages endpoint for conversation history.
     *
     * With `account_id`, list only conversations linked to that account and require current account
     * access. Without it, list only conversations with no linked account.
     */
    fun getThreads(): ThreadGetThreadsResponse = getThreads(ThreadGetThreadsParams.none())

    /** @see getThreads */
    fun getThreads(
        params: ThreadGetThreadsParams = ThreadGetThreadsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadsResponse

    /** @see getThreads */
    fun getThreads(
        params: ThreadGetThreadsParams = ThreadGetThreadsParams.none()
    ): ThreadGetThreadsResponse = getThreads(params, RequestOptions.none())

    /** @see getThreads */
    fun getThreads(requestOptions: RequestOptions): ThreadGetThreadsResponse =
        getThreads(ThreadGetThreadsParams.none(), requestOptions)

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
        fun getMessages(threadId: String): HttpResponseFor<ThreadGetMessagesResponse> =
            getMessages(threadId, ThreadGetMessagesParams.none())

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetMessagesResponse> =
            getMessages(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            threadId: String,
            params: ThreadGetMessagesParams = ThreadGetMessagesParams.none(),
        ): HttpResponseFor<ThreadGetMessagesResponse> =
            getMessages(threadId, params, RequestOptions.none())

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            params: ThreadGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetMessagesResponse>

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            params: ThreadGetMessagesParams
        ): HttpResponseFor<ThreadGetMessagesResponse> = getMessages(params, RequestOptions.none())

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetMessagesResponse> =
            getMessages(threadId, ThreadGetMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}`, but is otherwise
         * the same as [ThreadService.getThreadById].
         */
        @MustBeClosed
        fun getThreadById(threadId: String): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(threadId, ThreadGetThreadByIdParams.none())

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            threadId: String,
            params: ThreadGetThreadByIdParams = ThreadGetThreadByIdParams.none(),
        ): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(threadId, params, RequestOptions.none())

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            params: ThreadGetThreadByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadByIdResponse>

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            params: ThreadGetThreadByIdParams
        ): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(params, RequestOptions.none())

        /** @see getThreadById */
        @MustBeClosed
        fun getThreadById(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetThreadByIdResponse> =
            getThreadById(threadId, ThreadGetThreadByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads/{thread_id}/response`, but is
         * otherwise the same as [ThreadService.getThreadResponse].
         */
        @MustBeClosed
        fun getThreadResponse(threadId: String): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(threadId, ThreadGetThreadResponseParams.none())

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            threadId: String,
            params: ThreadGetThreadResponseParams = ThreadGetThreadResponseParams.none(),
        ): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(threadId, params, RequestOptions.none())

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadResponseResponse>

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            params: ThreadGetThreadResponseParams
        ): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(params, RequestOptions.none())

        /** @see getThreadResponse */
        @MustBeClosed
        fun getThreadResponse(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetThreadResponseResponse> =
            getThreadResponse(threadId, ThreadGetThreadResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/threads`, but is otherwise the same as
         * [ThreadService.getThreads].
         */
        @MustBeClosed
        fun getThreads(): HttpResponseFor<ThreadGetThreadsResponse> =
            getThreads(ThreadGetThreadsParams.none())

        /** @see getThreads */
        @MustBeClosed
        fun getThreads(
            params: ThreadGetThreadsParams = ThreadGetThreadsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadsResponse>

        /** @see getThreads */
        @MustBeClosed
        fun getThreads(
            params: ThreadGetThreadsParams = ThreadGetThreadsParams.none()
        ): HttpResponseFor<ThreadGetThreadsResponse> = getThreads(params, RequestOptions.none())

        /** @see getThreads */
        @MustBeClosed
        fun getThreads(requestOptions: RequestOptions): HttpResponseFor<ThreadGetThreadsResponse> =
            getThreads(ThreadGetThreadsParams.none(), requestOptions)
    }
}
