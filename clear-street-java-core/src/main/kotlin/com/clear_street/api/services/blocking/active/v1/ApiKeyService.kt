// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.apikeys.ApiKeyCreateParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyCreateResponse
import com.clear_street.api.models.active.v1.apikeys.ApiKeyListParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyListResponse
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeAllParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeAllResponse
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage API keys for authentication. */
interface ApiKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService

    /** Create a new API key */
    fun create(): ApiKeyCreateResponse = create(ApiKeyCreateParams.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse

    /** @see create */
    fun create(params: ApiKeyCreateParams = ApiKeyCreateParams.none()): ApiKeyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): ApiKeyCreateResponse =
        create(ApiKeyCreateParams.none(), requestOptions)

    /** List API keys for the authenticated user */
    fun list(): ApiKeyListResponse = list(ApiKeyListParams.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyListResponse

    /** @see list */
    fun list(params: ApiKeyListParams = ApiKeyListParams.none()): ApiKeyListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ApiKeyListResponse =
        list(ApiKeyListParams.none(), requestOptions)

    /** Revoke a specific API key */
    fun revoke(id: String): ApiKeyRevokeResponse = revoke(id, ApiKeyRevokeParams.none())

    /** @see revoke */
    fun revoke(
        id: String,
        params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRevokeResponse = revoke(params.toBuilder().id(id).build(), requestOptions)

    /** @see revoke */
    fun revoke(
        id: String,
        params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
    ): ApiKeyRevokeResponse = revoke(id, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRevokeResponse

    /** @see revoke */
    fun revoke(params: ApiKeyRevokeParams): ApiKeyRevokeResponse =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(id: String, requestOptions: RequestOptions): ApiKeyRevokeResponse =
        revoke(id, ApiKeyRevokeParams.none(), requestOptions)

    /** Revoke all API keys for the authenticated user */
    fun revokeAll(): ApiKeyRevokeAllResponse = revokeAll(ApiKeyRevokeAllParams.none())

    /** @see revokeAll */
    fun revokeAll(
        params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRevokeAllResponse

    /** @see revokeAll */
    fun revokeAll(
        params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none()
    ): ApiKeyRevokeAllResponse = revokeAll(params, RequestOptions.none())

    /** @see revokeAll */
    fun revokeAll(requestOptions: RequestOptions): ApiKeyRevokeAllResponse =
        revokeAll(ApiKeyRevokeAllParams.none(), requestOptions)

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/api_keys`, but is otherwise the same as
         * [ApiKeyService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ApiKeyCreateResponse> = create(ApiKeyCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none()
        ): HttpResponseFor<ApiKeyCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ApiKeyCreateResponse> =
            create(ApiKeyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/api_keys`, but is otherwise the same as
         * [ApiKeyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ApiKeyListResponse> = list(ApiKeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none()
        ): HttpResponseFor<ApiKeyListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ApiKeyListResponse> =
            list(ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /active/v1/api_keys/{id}`, but is otherwise the
         * same as [ApiKeyService.revoke].
         */
        @MustBeClosed
        fun revoke(id: String): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(id, ApiKeyRevokeParams.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            id: String,
            params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(params.toBuilder().id(id).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            id: String,
            params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
        ): HttpResponseFor<ApiKeyRevokeResponse> = revoke(id, params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRevokeResponse>

        /** @see revoke */
        @MustBeClosed
        fun revoke(params: ApiKeyRevokeParams): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(id, ApiKeyRevokeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /active/v1/api_keys`, but is otherwise the same
         * as [ApiKeyService.revokeAll].
         */
        @MustBeClosed
        fun revokeAll(): HttpResponseFor<ApiKeyRevokeAllResponse> =
            revokeAll(ApiKeyRevokeAllParams.none())

        /** @see revokeAll */
        @MustBeClosed
        fun revokeAll(
            params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRevokeAllResponse>

        /** @see revokeAll */
        @MustBeClosed
        fun revokeAll(
            params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none()
        ): HttpResponseFor<ApiKeyRevokeAllResponse> = revokeAll(params, RequestOptions.none())

        /** @see revokeAll */
        @MustBeClosed
        fun revokeAll(requestOptions: RequestOptions): HttpResponseFor<ApiKeyRevokeAllResponse> =
            revokeAll(ApiKeyRevokeAllParams.none(), requestOptions)
    }
}
