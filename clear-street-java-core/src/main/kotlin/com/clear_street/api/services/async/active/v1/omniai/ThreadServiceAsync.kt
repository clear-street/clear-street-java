// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadResponse
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsResponse
import com.clear_street.api.services.async.active.v1.omniai.threads.MessageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** AI assistant for conversational trading interactions. */
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

    /** AI assistant for conversational trading interactions. */
    fun messages(): MessageServiceAsync

    /** Get a specific thread. */
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

    /** Retrieves threads for the authenticated user. */
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

        /** AI assistant for conversational trading interactions. */
        fun messages(): MessageServiceAsync.WithRawResponse

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
