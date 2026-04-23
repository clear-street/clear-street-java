// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai.threads

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.threads.response.ResponseGetThreadResponseParams
import com.clear_street.api.models.active.v1.omniai.threads.response.ResponseGetThreadResponseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
interface ResponseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseServiceAsync

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
        params: ResponseGetThreadResponseParams,
    ): CompletableFuture<ResponseGetThreadResponseResponse> =
        getThreadResponse(threadId, params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        threadId: String,
        params: ResponseGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseGetThreadResponseResponse> =
        getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ResponseGetThreadResponseParams
    ): CompletableFuture<ResponseGetThreadResponseResponse> =
        getThreadResponse(params, RequestOptions.none())

    /** @see getThreadResponse */
    fun getThreadResponse(
        params: ResponseGetThreadResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseGetThreadResponseResponse>

    /**
     * A view of [ResponseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResponseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/threads/{thread_id}/response`,
         * but is otherwise the same as [ResponseServiceAsync.getThreadResponse].
         */
        fun getThreadResponse(
            threadId: String,
            params: ResponseGetThreadResponseParams,
        ): CompletableFuture<HttpResponseFor<ResponseGetThreadResponseResponse>> =
            getThreadResponse(threadId, params, RequestOptions.none())

        /** @see getThreadResponse */
        fun getThreadResponse(
            threadId: String,
            params: ResponseGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseGetThreadResponseResponse>> =
            getThreadResponse(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see getThreadResponse */
        fun getThreadResponse(
            params: ResponseGetThreadResponseParams
        ): CompletableFuture<HttpResponseFor<ResponseGetThreadResponseResponse>> =
            getThreadResponse(params, RequestOptions.none())

        /** @see getThreadResponse */
        fun getThreadResponse(
            params: ResponseGetThreadResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseGetThreadResponseResponse>>
    }
}
