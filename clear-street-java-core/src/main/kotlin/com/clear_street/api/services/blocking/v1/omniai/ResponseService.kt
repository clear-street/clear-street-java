// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.omniai.responses.ResponseCancelResponseParams
import com.clear_street.api.models.v1.omniai.responses.ResponseCancelResponseResponse
import com.clear_street.api.models.v1.omniai.responses.ResponseGetResponseByIdParams
import com.clear_street.api.models.v1.omniai.responses.ResponseGetResponseByIdResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use account_ids.
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
     * Cancel a response.
     *
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
     * Poll a response for assistant output.
     *
     * Returns the current snapshot of an in-progress or completed response. While the status is
     * `queued` or `running`, the content may be partial and may include `thinking` parts. Poll this
     * endpoint periodically until the status reaches a terminal value (`succeeded`, `failed`, or
     * `canceled`).
     *
     * Once terminal, the finalized assistant message is available in thread history via `GET
     * /omni-ai/threads/{thread_id}/messages`.
     */
    fun getResponseById(
        responseId: String,
        params: ResponseGetResponseByIdParams,
    ): ResponseGetResponseByIdResponse = getResponseById(responseId, params, RequestOptions.none())

    /** @see getResponseById */
    fun getResponseById(
        responseId: String,
        params: ResponseGetResponseByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseGetResponseByIdResponse =
        getResponseById(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see getResponseById */
    fun getResponseById(params: ResponseGetResponseByIdParams): ResponseGetResponseByIdResponse =
        getResponseById(params, RequestOptions.none())

    /** @see getResponseById */
    fun getResponseById(
        params: ResponseGetResponseByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseGetResponseByIdResponse

    /** A view of [ResponseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /v1/omni-ai/responses/{response_id}`, but is
         * otherwise the same as [ResponseService.cancelResponse].
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
         * Returns a raw HTTP response for `get /v1/omni-ai/responses/{response_id}`, but is
         * otherwise the same as [ResponseService.getResponseById].
         */
        @MustBeClosed
        fun getResponseById(
            responseId: String,
            params: ResponseGetResponseByIdParams,
        ): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(responseId, params, RequestOptions.none())

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            responseId: String,
            params: ResponseGetResponseByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            params: ResponseGetResponseByIdParams
        ): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(params, RequestOptions.none())

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            params: ResponseGetResponseByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseGetResponseByIdResponse>
    }
}
