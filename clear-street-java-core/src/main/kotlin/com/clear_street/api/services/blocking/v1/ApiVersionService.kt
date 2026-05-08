// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.apiversion.ApiVersionGetVersionParams
import com.clear_street.api.models.v1.apiversion.ApiVersionGetVersionResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Endpoints for API service metadata. */
interface ApiVersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiVersionService

    /** Returns the current version string for this API endpoint. */
    fun getVersion(): ApiVersionGetVersionResponse = getVersion(ApiVersionGetVersionParams.none())

    /** @see getVersion */
    fun getVersion(
        params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiVersionGetVersionResponse

    /** @see getVersion */
    fun getVersion(
        params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none()
    ): ApiVersionGetVersionResponse = getVersion(params, RequestOptions.none())

    /** @see getVersion */
    fun getVersion(requestOptions: RequestOptions): ApiVersionGetVersionResponse =
        getVersion(ApiVersionGetVersionParams.none(), requestOptions)

    /** A view of [ApiVersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiVersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/version`, but is otherwise the same as
         * [ApiVersionService.getVersion].
         */
        @MustBeClosed
        fun getVersion(): HttpResponseFor<ApiVersionGetVersionResponse> =
            getVersion(ApiVersionGetVersionParams.none())

        /** @see getVersion */
        @MustBeClosed
        fun getVersion(
            params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiVersionGetVersionResponse>

        /** @see getVersion */
        @MustBeClosed
        fun getVersion(
            params: ApiVersionGetVersionParams = ApiVersionGetVersionParams.none()
        ): HttpResponseFor<ApiVersionGetVersionResponse> = getVersion(params, RequestOptions.none())

        /** @see getVersion */
        @MustBeClosed
        fun getVersion(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiVersionGetVersionResponse> =
            getVersion(ApiVersionGetVersionParams.none(), requestOptions)
    }
}
