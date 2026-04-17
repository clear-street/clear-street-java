// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.responses.ResponseCancelResponseParams
import com.clear_street.api.models.active.v1.omniai.responses.ResponseCancelResponseResponse
import com.clear_street.api.models.active.v1.omniai.responses.ResponseGetResponseParams
import com.clear_street.api.models.active.v1.omniai.responses.ResponseGetResponseResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Every endpoint requires an explicit account_id.
 */
interface ResponseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseService

    /**
     * Requests cancellation of a queued or running response. If the response has already reached a
     * terminal status, this is an idempotent success. A canceled turn still produces a final
     * assistant message with outcome `canceled` in the thread history.
     */
    fun cancelResponse(
        responseId: String,
        params: ResponseCancelResponseParams,
    ): ResponseCancelResponseResponse = cancelResponse(responseId, params, RequestOptions.none())

    /** @see cancelResponse */
    fun cancelResponse(
        responseId: String,
        params: ResponseCancelResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseCancelResponseResponse =
        cancelResponse(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see cancelResponse */
    fun cancelResponse(params: ResponseCancelResponseParams): ResponseCancelResponseResponse =
        cancelResponse(params, RequestOptions.none())

    /** @see cancelResponse */
    fun cancelResponse(
        params: ResponseCancelResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseCancelResponseResponse

    /**
     * Returns the current snapshot of an in-progress or completed response. While the status is
     * `queued` or `running`, the content may be partial and may include `thinking` parts. Poll this
     * endpoint periodically until the status reaches a terminal value (`succeeded`, `failed`, or
     * `canceled`).
     *
     * Once terminal, the finalized assistant message is available in thread history via `GET
     * /omni-ai/threads/{thread_id}/messages`.
     */
    fun getResponse(
        responseId: String,
        params: ResponseGetResponseParams,
    ): ResponseGetResponseResponse = getResponse(responseId, params, RequestOptions.none())

    /** @see getResponse */
    fun getResponse(
        responseId: String,
        params: ResponseGetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseGetResponseResponse =
        getResponse(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see getResponse */
    fun getResponse(params: ResponseGetResponseParams): ResponseGetResponseResponse =
        getResponse(params, RequestOptions.none())

    /** @see getResponse */
    fun getResponse(
        params: ResponseGetResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseGetResponseResponse

    /** A view of [ResponseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /active/v1/omni-ai/responses/{response_id}`, but
         * is otherwise the same as [ResponseService.cancelResponse].
         */
        @MustBeClosed
        fun cancelResponse(
            responseId: String,
            params: ResponseCancelResponseParams,
        ): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(responseId, params, RequestOptions.none())

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            responseId: String,
            params: ResponseCancelResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            params: ResponseCancelResponseParams
        ): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(params, RequestOptions.none())

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            params: ResponseCancelResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseCancelResponseResponse>

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/responses/{response_id}`, but is
         * otherwise the same as [ResponseService.getResponse].
         */
        @MustBeClosed
        fun getResponse(
            responseId: String,
            params: ResponseGetResponseParams,
        ): HttpResponseFor<ResponseGetResponseResponse> =
            getResponse(responseId, params, RequestOptions.none())

        /** @see getResponse */
        @MustBeClosed
        fun getResponse(
            responseId: String,
            params: ResponseGetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseGetResponseResponse> =
            getResponse(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see getResponse */
        @MustBeClosed
        fun getResponse(
            params: ResponseGetResponseParams
        ): HttpResponseFor<ResponseGetResponseResponse> = getResponse(params, RequestOptions.none())

        /** @see getResponse */
        @MustBeClosed
        fun getResponse(
            params: ResponseGetResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseGetResponseResponse>
    }
}
