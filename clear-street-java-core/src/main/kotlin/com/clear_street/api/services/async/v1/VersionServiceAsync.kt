// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.version.VersionGetVersionParams
import com.clear_street.api.models.v1.version.VersionGetVersionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Endpoints for API service metadata. */
interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync

    /** Returns the current version string for this API endpoint. */
    fun getVersion(): CompletableFuture<VersionGetVersionResponse> =
        getVersion(VersionGetVersionParams.none())

    /** @see getVersion */
    fun getVersion(
        params: VersionGetVersionParams = VersionGetVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionGetVersionResponse>

    /** @see getVersion */
    fun getVersion(
        params: VersionGetVersionParams = VersionGetVersionParams.none()
    ): CompletableFuture<VersionGetVersionResponse> = getVersion(params, RequestOptions.none())

    /** @see getVersion */
    fun getVersion(requestOptions: RequestOptions): CompletableFuture<VersionGetVersionResponse> =
        getVersion(VersionGetVersionParams.none(), requestOptions)

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/version`, but is otherwise the same as
         * [VersionServiceAsync.getVersion].
         */
        fun getVersion(): CompletableFuture<HttpResponseFor<VersionGetVersionResponse>> =
            getVersion(VersionGetVersionParams.none())

        /** @see getVersion */
        fun getVersion(
            params: VersionGetVersionParams = VersionGetVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionGetVersionResponse>>

        /** @see getVersion */
        fun getVersion(
            params: VersionGetVersionParams = VersionGetVersionParams.none()
        ): CompletableFuture<HttpResponseFor<VersionGetVersionResponse>> =
            getVersion(params, RequestOptions.none())

        /** @see getVersion */
        fun getVersion(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VersionGetVersionResponse>> =
            getVersion(VersionGetVersionParams.none(), requestOptions)
    }
}
