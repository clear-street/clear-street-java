// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.iris.runs.RunCancelRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunCancelRunDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.runs.RunGetRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunGetRunDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.runs.RunStartRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunStartRunDeprecatedResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /** **Deprecated**: Use `DELETE /omni-ai/runs/{run_id}` instead. */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(
        runId: String,
        params: RunCancelRunDeprecatedParams,
    ): RunCancelRunDeprecatedResponse = cancelRunDeprecated(runId, params, RequestOptions.none())

    /** @see cancelRunDeprecated */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(
        runId: String,
        params: RunCancelRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCancelRunDeprecatedResponse =
        cancelRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see cancelRunDeprecated */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(params: RunCancelRunDeprecatedParams): RunCancelRunDeprecatedResponse =
        cancelRunDeprecated(params, RequestOptions.none())

    /** @see cancelRunDeprecated */
    @Deprecated("deprecated")
    fun cancelRunDeprecated(
        params: RunCancelRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCancelRunDeprecatedResponse

    /** **Deprecated**: Use `GET /omni-ai/runs/{run_id}` instead. */
    @Deprecated("deprecated")
    fun getRunDeprecated(
        runId: String,
        params: RunGetRunDeprecatedParams,
    ): RunGetRunDeprecatedResponse = getRunDeprecated(runId, params, RequestOptions.none())

    /** @see getRunDeprecated */
    @Deprecated("deprecated")
    fun getRunDeprecated(
        runId: String,
        params: RunGetRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunGetRunDeprecatedResponse =
        getRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see getRunDeprecated */
    @Deprecated("deprecated")
    fun getRunDeprecated(params: RunGetRunDeprecatedParams): RunGetRunDeprecatedResponse =
        getRunDeprecated(params, RequestOptions.none())

    /** @see getRunDeprecated */
    @Deprecated("deprecated")
    fun getRunDeprecated(
        params: RunGetRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunGetRunDeprecatedResponse

    /** **Deprecated**: Use `POST /omni-ai/runs` instead. */
    @Deprecated("deprecated")
    fun startRunDeprecated(params: RunStartRunDeprecatedParams): RunStartRunDeprecatedResponse =
        startRunDeprecated(params, RequestOptions.none())

    /** @see startRunDeprecated */
    @Deprecated("deprecated")
    fun startRunDeprecated(
        params: RunStartRunDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunStartRunDeprecatedResponse

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /active/v1/iris/runs/{run_id}`, but is otherwise
         * the same as [RunService.cancelRunDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancelRunDeprecated(
            runId: String,
            params: RunCancelRunDeprecatedParams,
        ): HttpResponseFor<RunCancelRunDeprecatedResponse> =
            cancelRunDeprecated(runId, params, RequestOptions.none())

        /** @see cancelRunDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancelRunDeprecated(
            runId: String,
            params: RunCancelRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCancelRunDeprecatedResponse> =
            cancelRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see cancelRunDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancelRunDeprecated(
            params: RunCancelRunDeprecatedParams
        ): HttpResponseFor<RunCancelRunDeprecatedResponse> =
            cancelRunDeprecated(params, RequestOptions.none())

        /** @see cancelRunDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancelRunDeprecated(
            params: RunCancelRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCancelRunDeprecatedResponse>

        /**
         * Returns a raw HTTP response for `get /active/v1/iris/runs/{run_id}`, but is otherwise the
         * same as [RunService.getRunDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getRunDeprecated(
            runId: String,
            params: RunGetRunDeprecatedParams,
        ): HttpResponseFor<RunGetRunDeprecatedResponse> =
            getRunDeprecated(runId, params, RequestOptions.none())

        /** @see getRunDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getRunDeprecated(
            runId: String,
            params: RunGetRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunGetRunDeprecatedResponse> =
            getRunDeprecated(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see getRunDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getRunDeprecated(
            params: RunGetRunDeprecatedParams
        ): HttpResponseFor<RunGetRunDeprecatedResponse> =
            getRunDeprecated(params, RequestOptions.none())

        /** @see getRunDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getRunDeprecated(
            params: RunGetRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunGetRunDeprecatedResponse>

        /**
         * Returns a raw HTTP response for `post /active/v1/iris/runs`, but is otherwise the same as
         * [RunService.startRunDeprecated].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun startRunDeprecated(
            params: RunStartRunDeprecatedParams
        ): HttpResponseFor<RunStartRunDeprecatedResponse> =
            startRunDeprecated(params, RequestOptions.none())

        /** @see startRunDeprecated */
        @Deprecated("deprecated")
        @MustBeClosed
        fun startRunDeprecated(
            params: RunStartRunDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunStartRunDeprecatedResponse>
    }
}
