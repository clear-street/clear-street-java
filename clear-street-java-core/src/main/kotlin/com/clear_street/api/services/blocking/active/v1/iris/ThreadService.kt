// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.iris.threads.ThreadGetThreadDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.ThreadGetThreadDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.threads.ThreadListThreadsDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.ThreadListThreadsDeprecatedResponse
import com.clear_street.api.services.blocking.active.v1.iris.threads.MessageService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
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

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    fun messages(): MessageService

    /** **Deprecated**: Use `GET /omni-ai/threads/{thread_id}` instead. */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        threadId: String,
        params: ThreadGetThreadDeprecatedParams,
    ): ThreadGetThreadDeprecatedResponse =
        getThreadDeprecated(threadId, params, RequestOptions.none())

    /** @see getThreadDeprecated */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        threadId: String,
        params: ThreadGetThreadDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadDeprecatedResponse =
        getThreadDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadDeprecated */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        params: ThreadGetThreadDeprecatedParams
    ): ThreadGetThreadDeprecatedResponse = getThreadDeprecated(params, RequestOptions.none())

    /** @see getThreadDeprecated */
    @Deprecated("deprecated")
    fun getThreadDeprecated(
        params: ThreadGetThreadDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadGetThreadDeprecatedResponse

    /** **Deprecated**: Use `GET /omni-ai/threads` instead. */
    @Deprecated("deprecated")
    fun listThreadsDeprecated(
        params: ThreadListThreadsDeprecatedParams
    ): ThreadListThreadsDeprecatedResponse = listThreadsDeprecated(params, RequestOptions.none())

    /** @see listThreadsDeprecated */
    @Deprecated("deprecated")
    fun listThreadsDeprecated(
        params: ThreadListThreadsDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadListThreadsDeprecatedResponse

    /** A view of [ThreadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService.WithRawResponse

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        fun messages(): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/iris/threads/{thread_id}`, but is
         * otherwise the same as [ThreadService.getThreadDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getThreadDeprecated(
            threadId: String,
            params: ThreadGetThreadDeprecatedParams,
        ): HttpResponseFor<ThreadGetThreadDeprecatedResponse> =
            getThreadDeprecated(threadId, params, RequestOptions.none())

        /** @see getThreadDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getThreadDeprecated(
            threadId: String,
            params: ThreadGetThreadDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadDeprecatedResponse> =
            getThreadDeprecated(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getThreadDeprecated(
            params: ThreadGetThreadDeprecatedParams
        ): HttpResponseFor<ThreadGetThreadDeprecatedResponse> =
            getThreadDeprecated(params, RequestOptions.none())

        /** @see getThreadDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getThreadDeprecated(
            params: ThreadGetThreadDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadGetThreadDeprecatedResponse>

        /**
         * Returns a raw HTTP response for `get /active/v1/iris/threads`, but is otherwise the same
         * as [ThreadService.listThreadsDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listThreadsDeprecated(
            params: ThreadListThreadsDeprecatedParams
        ): HttpResponseFor<ThreadListThreadsDeprecatedResponse> =
            listThreadsDeprecated(params, RequestOptions.none())

        /** @see listThreadsDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listThreadsDeprecated(
            params: ThreadListThreadsDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadListThreadsDeprecatedResponse>
    }
}
