// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadResponse
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsResponse
import com.clear_street.api.services.blocking.active.v1.omniai.threads.MessageService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** AI assistant for conversational trading interactions. */
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

    /** AI assistant for conversational trading interactions. */
    fun messages(): MessageService

    /** Get a specific thread. */
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
     * Retrieves threads for the authenticated user.
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

        /** AI assistant for conversational trading interactions. */
        fun messages(): MessageService.WithRawResponse

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
