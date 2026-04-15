// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.version.VersionGetVersionParams
import com.clear_street.api.models.active.v1.version.VersionGetVersionResponse
import com.clear_street.api.models.active.v1.version.VersionUpdateVersionParams
import com.clear_street.api.models.active.v1.version.VersionUpdateVersionResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Endpoints for API service metadata. */
interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService

    /** Returns the current version string for this API endpoint. */
    fun getVersion(): VersionGetVersionResponse = getVersion(VersionGetVersionParams.none())

    /** @see getVersion */
    fun getVersion(
        params: VersionGetVersionParams = VersionGetVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionGetVersionResponse

    /** @see getVersion */
    fun getVersion(
        params: VersionGetVersionParams = VersionGetVersionParams.none()
    ): VersionGetVersionResponse = getVersion(params, RequestOptions.none())

    /** @see getVersion */
    fun getVersion(requestOptions: RequestOptions): VersionGetVersionResponse =
        getVersion(VersionGetVersionParams.none(), requestOptions)

    /** Allows clients to set their preferred API version. */
    fun updateVersion(): VersionUpdateVersionResponse =
        updateVersion(VersionUpdateVersionParams.none())

    /** @see updateVersion */
    fun updateVersion(
        params: VersionUpdateVersionParams = VersionUpdateVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionUpdateVersionResponse

    /** @see updateVersion */
    fun updateVersion(
        params: VersionUpdateVersionParams = VersionUpdateVersionParams.none()
    ): VersionUpdateVersionResponse = updateVersion(params, RequestOptions.none())

    /** @see updateVersion */
    fun updateVersion(requestOptions: RequestOptions): VersionUpdateVersionResponse =
        updateVersion(VersionUpdateVersionParams.none(), requestOptions)

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/version`, but is otherwise the same as
         * [VersionService.getVersion].
         */
        @MustBeClosed
        fun getVersion(): HttpResponseFor<VersionGetVersionResponse> =
            getVersion(VersionGetVersionParams.none())

        /** @see getVersion */
        @MustBeClosed
        fun getVersion(
            params: VersionGetVersionParams = VersionGetVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionGetVersionResponse>

        /** @see getVersion */
        @MustBeClosed
        fun getVersion(
            params: VersionGetVersionParams = VersionGetVersionParams.none()
        ): HttpResponseFor<VersionGetVersionResponse> = getVersion(params, RequestOptions.none())

        /** @see getVersion */
        @MustBeClosed
        fun getVersion(requestOptions: RequestOptions): HttpResponseFor<VersionGetVersionResponse> =
            getVersion(VersionGetVersionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /active/v1/version`, but is otherwise the same as
         * [VersionService.updateVersion].
         */
        @MustBeClosed
        fun updateVersion(): HttpResponseFor<VersionUpdateVersionResponse> =
            updateVersion(VersionUpdateVersionParams.none())

        /** @see updateVersion */
        @MustBeClosed
        fun updateVersion(
            params: VersionUpdateVersionParams = VersionUpdateVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionUpdateVersionResponse>

        /** @see updateVersion */
        @MustBeClosed
        fun updateVersion(
            params: VersionUpdateVersionParams = VersionUpdateVersionParams.none()
        ): HttpResponseFor<VersionUpdateVersionResponse> =
            updateVersion(params, RequestOptions.none())

        /** @see updateVersion */
        @MustBeClosed
        fun updateVersion(
            requestOptions: RequestOptions
        ): HttpResponseFor<VersionUpdateVersionResponse> =
            updateVersion(VersionUpdateVersionParams.none(), requestOptions)
    }
}
