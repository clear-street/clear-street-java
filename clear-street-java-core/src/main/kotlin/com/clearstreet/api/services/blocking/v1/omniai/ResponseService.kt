// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.omniai

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.omniai.responses.ResponseCancelResponseParams
import com.clearstreet.api.models.v1.omniai.responses.ResponseCancelResponseResponse
import com.clearstreet.api.models.v1.omniai.responses.ResponseGetResponseByIdParams
import com.clearstreet.api.models.v1.omniai.responses.ResponseGetResponseByIdResponse
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
     * Cancel a queued or running response. Cancellation is idempotent after the response becomes
     * terminal. A canceled turn still produces a finalized assistant message with outcome
     * `canceled` in the thread history.
     *
     * Authorization uses the linked account before any cancellation.
     */
    fun cancelResponse(responseId: String): ResponseCancelResponseResponse =
        cancelResponse(responseId, ResponseCancelResponseParams.none())

    /** @see cancelResponse */
    fun cancelResponse(
        responseId: String,
        params: ResponseCancelResponseParams = ResponseCancelResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseCancelResponseResponse =
        cancelResponse(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see cancelResponse */
    fun cancelResponse(
        responseId: String,
        params: ResponseCancelResponseParams = ResponseCancelResponseParams.none(),
    ): ResponseCancelResponseResponse = cancelResponse(responseId, params, RequestOptions.none())

    /** @see cancelResponse */
    fun cancelResponse(
        params: ResponseCancelResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseCancelResponseResponse

    /** @see cancelResponse */
    fun cancelResponse(params: ResponseCancelResponseParams): ResponseCancelResponseResponse =
        cancelResponse(params, RequestOptions.none())

    /** @see cancelResponse */
    fun cancelResponse(
        responseId: String,
        requestOptions: RequestOptions,
    ): ResponseCancelResponseResponse =
        cancelResponse(responseId, ResponseCancelResponseParams.none(), requestOptions)

    /**
     * Poll the current snapshot of an in-progress or completed assistant response. While its status
     * is `queued` or `running`, content may be partial and include thinking parts. Continue polling
     * until it becomes `succeeded`, `failed`, or `canceled`.
     *
     * Once terminal, the finalized message is available through `GET
     * /omni-ai/threads/{thread_id}/messages`. Authorization uses the current parent thread account,
     * including for responses created before the account link.
     */
    fun getResponseById(responseId: String): ResponseGetResponseByIdResponse =
        getResponseById(responseId, ResponseGetResponseByIdParams.none())

    /** @see getResponseById */
    fun getResponseById(
        responseId: String,
        params: ResponseGetResponseByIdParams = ResponseGetResponseByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseGetResponseByIdResponse =
        getResponseById(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see getResponseById */
    fun getResponseById(
        responseId: String,
        params: ResponseGetResponseByIdParams = ResponseGetResponseByIdParams.none(),
    ): ResponseGetResponseByIdResponse = getResponseById(responseId, params, RequestOptions.none())

    /** @see getResponseById */
    fun getResponseById(
        params: ResponseGetResponseByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseGetResponseByIdResponse

    /** @see getResponseById */
    fun getResponseById(params: ResponseGetResponseByIdParams): ResponseGetResponseByIdResponse =
        getResponseById(params, RequestOptions.none())

    /** @see getResponseById */
    fun getResponseById(
        responseId: String,
        requestOptions: RequestOptions,
    ): ResponseGetResponseByIdResponse =
        getResponseById(responseId, ResponseGetResponseByIdParams.none(), requestOptions)

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
        fun cancelResponse(responseId: String): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(responseId, ResponseCancelResponseParams.none())

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            responseId: String,
            params: ResponseCancelResponseParams = ResponseCancelResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            responseId: String,
            params: ResponseCancelResponseParams = ResponseCancelResponseParams.none(),
        ): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(responseId, params, RequestOptions.none())

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            params: ResponseCancelResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseCancelResponseResponse>

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            params: ResponseCancelResponseParams
        ): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(params, RequestOptions.none())

        /** @see cancelResponse */
        @MustBeClosed
        fun cancelResponse(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseCancelResponseResponse> =
            cancelResponse(responseId, ResponseCancelResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/responses/{response_id}`, but is
         * otherwise the same as [ResponseService.getResponseById].
         */
        @MustBeClosed
        fun getResponseById(responseId: String): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(responseId, ResponseGetResponseByIdParams.none())

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            responseId: String,
            params: ResponseGetResponseByIdParams = ResponseGetResponseByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            responseId: String,
            params: ResponseGetResponseByIdParams = ResponseGetResponseByIdParams.none(),
        ): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(responseId, params, RequestOptions.none())

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            params: ResponseGetResponseByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseGetResponseByIdResponse>

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            params: ResponseGetResponseByIdParams
        ): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(params, RequestOptions.none())

        /** @see getResponseById */
        @MustBeClosed
        fun getResponseById(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseGetResponseByIdResponse> =
            getResponseById(responseId, ResponseGetResponseByIdParams.none(), requestOptions)
    }
}
