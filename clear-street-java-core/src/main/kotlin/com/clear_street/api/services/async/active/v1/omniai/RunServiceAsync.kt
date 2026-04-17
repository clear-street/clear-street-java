// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.omniai.runs.RunCancelRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunCancelRunResponse
import com.clear_street.api.models.active.v1.omniai.runs.RunGetRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunGetRunResponse
import com.clear_street.api.models.active.v1.omniai.runs.RunStartRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunStartRunResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** AI assistant for conversational trading interactions. */
interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /** Cancel a running assistant run. */
    fun cancelRun(
        runId: String,
        params: RunCancelRunParams,
    ): CompletableFuture<RunCancelRunResponse> = cancelRun(runId, params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        runId: String,
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelRunResponse> =
        cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see cancelRun */
    fun cancelRun(params: RunCancelRunParams): CompletableFuture<RunCancelRunResponse> =
        cancelRun(params, RequestOptions.none())

    /** @see cancelRun */
    fun cancelRun(
        params: RunCancelRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelRunResponse>

    /**
     * Get run status and events.
     *
     * Poll for the current status of a run and any new events since the last poll.
     */
    fun getRun(runId: String, params: RunGetRunParams): CompletableFuture<RunGetRunResponse> =
        getRun(runId, params, RequestOptions.none())

    /** @see getRun */
    fun getRun(
        runId: String,
        params: RunGetRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetRunResponse> =
        getRun(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see getRun */
    fun getRun(params: RunGetRunParams): CompletableFuture<RunGetRunResponse> =
        getRun(params, RequestOptions.none())

    /** @see getRun */
    fun getRun(
        params: RunGetRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetRunResponse>

    /**
     * Start a new assistant run.
     *
     * Begins an agentic conversation run. If thread_id is provided, continues an existing
     * conversation; otherwise creates a new thread.
     */
    fun startRun(params: RunStartRunParams): CompletableFuture<RunStartRunResponse> =
        startRun(params, RequestOptions.none())

    /** @see startRun */
    fun startRun(
        params: RunStartRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunStartRunResponse>

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /active/v1/omni-ai/runs/{run_id}`, but is
         * otherwise the same as [RunServiceAsync.cancelRun].
         */
        fun cancelRun(
            runId: String,
            params: RunCancelRunParams,
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>> =
            cancelRun(runId, params, RequestOptions.none())

        /** @see cancelRun */
        fun cancelRun(
            runId: String,
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>> =
            cancelRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see cancelRun */
        fun cancelRun(
            params: RunCancelRunParams
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>> =
            cancelRun(params, RequestOptions.none())

        /** @see cancelRun */
        fun cancelRun(
            params: RunCancelRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/omni-ai/runs/{run_id}`, but is otherwise
         * the same as [RunServiceAsync.getRun].
         */
        fun getRun(
            runId: String,
            params: RunGetRunParams,
        ): CompletableFuture<HttpResponseFor<RunGetRunResponse>> =
            getRun(runId, params, RequestOptions.none())

        /** @see getRun */
        fun getRun(
            runId: String,
            params: RunGetRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetRunResponse>> =
            getRun(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see getRun */
        fun getRun(params: RunGetRunParams): CompletableFuture<HttpResponseFor<RunGetRunResponse>> =
            getRun(params, RequestOptions.none())

        /** @see getRun */
        fun getRun(
            params: RunGetRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetRunResponse>>

        /**
         * Returns a raw HTTP response for `post /active/v1/omni-ai/runs`, but is otherwise the same
         * as [RunServiceAsync.startRun].
         */
        fun startRun(
            params: RunStartRunParams
        ): CompletableFuture<HttpResponseFor<RunStartRunResponse>> =
            startRun(params, RequestOptions.none())

        /** @see startRun */
        fun startRun(
            params: RunStartRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunStartRunResponse>>
    }
}
