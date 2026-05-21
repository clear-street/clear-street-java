// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.apiversion.ApiVersionGetVersionParams
import com.clear_street.api.models.v1.apiversion.ApiVersionGetVersionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Endpoints for API service metadata. */
interface ApiVersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiVersionServiceAsync

    /** Returns the current version string for this API endpoint. */
    fun getVersion(): CompletableFuture<ApiVersionGetVersionResponse> =
        getVersion(ApiVersionGetVersionParams.none())

    /** @see getVersion */
    fun getVersion(
        params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiVersionGetVersionResponse>

    /** @see getVersion */
    fun getVersion(
        params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none()
    ): CompletableFuture<ApiVersionGetVersionResponse> = getVersion(params, RequestOptions.none())

    /** @see getVersion */
    fun getVersion(
        requestOptions: RequestOptions
    ): CompletableFuture<ApiVersionGetVersionResponse> =
        getVersion(ApiVersionGetVersionParams.none(), requestOptions)

    /**
     * A view of [ApiVersionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiVersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/version`, but is otherwise the same as
         * [ApiVersionServiceAsync.getVersion].
         */
        fun getVersion(): CompletableFuture<HttpResponseFor<ApiVersionGetVersionResponse>> =
            getVersion(ApiVersionGetVersionParams.none())

        /** @see getVersion */
        fun getVersion(
            params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiVersionGetVersionResponse>>

        /** @see getVersion */
        fun getVersion(
            params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none()
        ): CompletableFuture<HttpResponseFor<ApiVersionGetVersionResponse>> =
            getVersion(params, RequestOptions.none())

        /** @see getVersion */
        fun getVersion(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiVersionGetVersionResponse>> =
            getVersion(ApiVersionGetVersionParams.none(), requestOptions)
    }
}
