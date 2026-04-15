// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.iris

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.iris.threads.ThreadGetThreadDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.ThreadGetThreadDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.threads.ThreadListThreadsDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.ThreadListThreadsDeprecatedResponse
import com.clear_street.api.services.async.active.v1.iris.threads.MessageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
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

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun messages(): MessageServiceAsync

    /** **Deprecated**: Use `GET /omni-ai/threads/{thread_id}` instead. */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        threadId: String,
        params: ThreadGetThreadDeprecatedParams,
    ): CompletableFuture<ThreadGetThreadDeprecatedResponse> =
        getThreadDeprecated(threadId, params, RequestOptions.none())

    /** @see getThreadDeprecated */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        threadId: String,
        params: ThreadGetThreadDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadDeprecatedResponse> =
        getThreadDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadDeprecated */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        params: ThreadGetThreadDeprecatedParams
    ): CompletableFuture<ThreadGetThreadDeprecatedResponse> =
        getThreadDeprecated(params, RequestOptions.none())

    /** @see getThreadDeprecated */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        params: ThreadGetThreadDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadGetThreadDeprecatedResponse>

    /** **Deprecated**: Use `GET /omni-ai/threads` instead. */
    @Deprecated("deprecated")
    fun listThreadsDeprecated(
        params: ThreadListThreadsDeprecatedParams
    ): CompletableFuture<ThreadListThreadsDeprecatedResponse> =
        listThreadsDeprecated(params, RequestOptions.none())

    /** @see listThreadsDeprecated */
    @Deprecated("deprecated")
    fun listThreadsDeprecated(
        params: ThreadListThreadsDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadListThreadsDeprecatedResponse>

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

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/iris/threads/{thread_id}`, but is
         * otherwise the same as [ThreadServiceAsync.getThreadDeprecated].
         */
        @Deprecated("deprecated")
        fun getThreadDeprecated(
            threadId: String,
            params: ThreadGetThreadDeprecatedParams,
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadDeprecatedResponse>> =
            getThreadDeprecated(threadId, params, RequestOptions.none())

        /** @see getThreadDeprecated */
        @Deprecated("deprecated")
        fun getThreadDeprecated(
            threadId: String,
            params: ThreadGetThreadDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadDeprecatedResponse>> =
            getThreadDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadDeprecated */
        @Deprecated("deprecated")
        fun getThreadDeprecated(
            params: ThreadGetThreadDeprecatedParams
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadDeprecatedResponse>> =
            getThreadDeprecated(params, RequestOptions.none())

        /** @see getThreadDeprecated */
        @Deprecated("deprecated")
        fun getThreadDeprecated(
            params: ThreadGetThreadDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadDeprecatedResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/iris/threads`, but is otherwise the same
         * as [ThreadServiceAsync.listThreadsDeprecated].
         */
        @Deprecated("deprecated")
        fun listThreadsDeprecated(
            params: ThreadListThreadsDeprecatedParams
        ): CompletableFuture<HttpResponseFor<ThreadListThreadsDeprecatedResponse>> =
            listThreadsDeprecated(params, RequestOptions.none())

        /** @see listThreadsDeprecated */
        @Deprecated("deprecated")
        fun listThreadsDeprecated(
            params: ThreadListThreadsDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListThreadsDeprecatedResponse>>
    }
}
