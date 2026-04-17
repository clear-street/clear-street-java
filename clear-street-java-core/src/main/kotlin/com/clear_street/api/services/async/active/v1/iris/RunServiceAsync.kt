// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.iris

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.iris.runs.RunCancelRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunCancelRunDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.runs.RunGetRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunGetRunDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.runs.RunStartRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunStartRunDeprecatedResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
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

    /** **Deprecated**: Use `DELETE /omni-ai/runs/{run_id}` instead. */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(
        runId: String,
        params: RunCancelRunDeprecatedParams,
    ): CompletableFuture<RunCancelRunDeprecatedResponse> =
        cancelRunDeprecated(runId, params, RequestOptions.none())

    /** @see cancelRunDeprecated */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(
        runId: String,
        params: RunCancelRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelRunDeprecatedResponse> =
        cancelRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see cancelRunDeprecated */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(
        params: RunCancelRunDeprecatedParams
    ): CompletableFuture<RunCancelRunDeprecatedResponse> =
        cancelRunDeprecated(params, RequestOptions.none())

    /** @see cancelRunDeprecated */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(
        params: RunCancelRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelRunDeprecatedResponse>

    /** **Deprecated**: Use `GET /omni-ai/runs/{run_id}` instead. */
    @Deprecated("deprecated")
    fun getRunDeprecated(
        runId: String,
        params: RunGetRunDeprecatedParams,
    ): CompletableFuture<RunGetRunDeprecatedResponse> =
        getRunDeprecated(runId, params, RequestOptions.none())

    /** @see getRunDeprecated */
    @Deprecated("deprecated")
    fun getRunDeprecated(
        runId: String,
        params: RunGetRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetRunDeprecatedResponse> =
        getRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see getRunDeprecated */
    @Deprecated("deprecated")
    fun getRunDeprecated(
        params: RunGetRunDeprecatedParams
    ): CompletableFuture<RunGetRunDeprecatedResponse> =
        getRunDeprecated(params, RequestOptions.none())

    /** @see getRunDeprecated */
    @Deprecated("deprecated")
    fun getRunDeprecated(
        params: RunGetRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetRunDeprecatedResponse>

    /** **Deprecated**: Use `POST /omni-ai/runs` instead. */
    @Deprecated("deprecated")
    fun startRunDeprecated(
        params: RunStartRunDeprecatedParams
    ): CompletableFuture<RunStartRunDeprecatedResponse> =
        startRunDeprecated(params, RequestOptions.none())

    /** @see startRunDeprecated */
    @Deprecated("deprecated")
    fun startRunDeprecated(
        params: RunStartRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunStartRunDeprecatedResponse>

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /active/v1/iris/runs/{run_id}`, but is otherwise
         * the same as [RunServiceAsync.cancelRunDeprecated].
         */
        @Deprecated("deprecated")
        fun cancelRunDeprecated(
            runId: String,
            params: RunCancelRunDeprecatedParams,
        ): CompletableFuture<HttpResponseFor<RunCancelRunDeprecatedResponse>> =
            cancelRunDeprecated(runId, params, RequestOptions.none())

        /** @see cancelRunDeprecated */
        @Deprecated("deprecated")
        fun cancelRunDeprecated(
            runId: String,
            params: RunCancelRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelRunDeprecatedResponse>> =
            cancelRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see cancelRunDeprecated */
        @Deprecated("deprecated")
        fun cancelRunDeprecated(
            params: RunCancelRunDeprecatedParams
        ): CompletableFuture<HttpResponseFor<RunCancelRunDeprecatedResponse>> =
            cancelRunDeprecated(params, RequestOptions.none())

        /** @see cancelRunDeprecated */
        @Deprecated("deprecated")
        fun cancelRunDeprecated(
            params: RunCancelRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelRunDeprecatedResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/iris/runs/{run_id}`, but is otherwise the
         * same as [RunServiceAsync.getRunDeprecated].
         */
        @Deprecated("deprecated")
        fun getRunDeprecated(
            runId: String,
            params: RunGetRunDeprecatedParams,
        ): CompletableFuture<HttpResponseFor<RunGetRunDeprecatedResponse>> =
            getRunDeprecated(runId, params, RequestOptions.none())

        /** @see getRunDeprecated */
        @Deprecated("deprecated")
        fun getRunDeprecated(
            runId: String,
            params: RunGetRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetRunDeprecatedResponse>> =
            getRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see getRunDeprecated */
        @Deprecated("deprecated")
        fun getRunDeprecated(
            params: RunGetRunDeprecatedParams
        ): CompletableFuture<HttpResponseFor<RunGetRunDeprecatedResponse>> =
            getRunDeprecated(params, RequestOptions.none())

        /** @see getRunDeprecated */
        @Deprecated("deprecated")
        fun getRunDeprecated(
            params: RunGetRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetRunDeprecatedResponse>>

        /**
         * Returns a raw HTTP response for `post /active/v1/iris/runs`, but is otherwise the same as
         * [RunServiceAsync.startRunDeprecated].
         */
        @Deprecated("deprecated")
        fun startRunDeprecated(
            params: RunStartRunDeprecatedParams
        ): CompletableFuture<HttpResponseFor<RunStartRunDeprecatedResponse>> =
            startRunDeprecated(params, RequestOptions.none())

        /** @see startRunDeprecated */
        @Deprecated("deprecated")
        fun startRunDeprecated(
            params: RunStartRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunStartRunDeprecatedResponse>>
    }
}
