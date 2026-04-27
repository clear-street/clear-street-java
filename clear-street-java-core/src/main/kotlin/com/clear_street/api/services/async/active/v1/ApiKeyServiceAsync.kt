// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage API keys for authentication. */
interface ApiKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyServiceAsync

    /** Create a new API key */
    fun create(): CompletableFuture<ApiKeyCreateResponse> = create(ApiKeyCreateParams.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse>

    /** @see create */
    fun create(
        params: ApiKeyCreateParams = ApiKeyCreateParams.none()
    ): CompletableFuture<ApiKeyCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ApiKeyCreateResponse> =
        create(ApiKeyCreateParams.none(), requestOptions)

    /** List API keys for the authenticated user */
    fun list(): CompletableFuture<ApiKeyListResponse> = list(ApiKeyListParams.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyListResponse>

    /** @see list */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none()
    ): CompletableFuture<ApiKeyListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ApiKeyListResponse> =
        list(ApiKeyListParams.none(), requestOptions)

    /** Revoke a specific API key */
    fun revoke(id: String): CompletableFuture<ApiKeyRevokeResponse> =
        revoke(id, ApiKeyRevokeParams.none())

    /** @see revoke */
    fun revoke(
        id: String,
        params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyRevokeResponse> =
        revoke(params.toBuilder().id(id).build(), requestOptions)

    /** @see revoke */
    fun revoke(
        id: String,
        params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
    ): CompletableFuture<ApiKeyRevokeResponse> = revoke(id, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyRevokeResponse>

    /** @see revoke */
    fun revoke(params: ApiKeyRevokeParams): CompletableFuture<ApiKeyRevokeResponse> =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyRevokeResponse> =
        revoke(id, ApiKeyRevokeParams.none(), requestOptions)

    /** Revoke all API keys for the authenticated user */
    fun revokeAll(): CompletableFuture<ApiKeyRevokeAllResponse> =
        revokeAll(ApiKeyRevokeAllParams.none())

    /** @see revokeAll */
    fun revokeAll(
        params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyRevokeAllResponse>

    /** @see revokeAll */
    fun revokeAll(
        params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none()
    ): CompletableFuture<ApiKeyRevokeAllResponse> = revokeAll(params, RequestOptions.none())

    /** @see revokeAll */
    fun revokeAll(requestOptions: RequestOptions): CompletableFuture<ApiKeyRevokeAllResponse> =
        revokeAll(ApiKeyRevokeAllParams.none(), requestOptions)

    /**
     * A view of [ApiKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/api_keys`, but is otherwise the same as
         * [ApiKeyServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(ApiKeyCreateParams.none())

        /** @see create */
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>>

        /** @see create */
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(ApiKeyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/api_keys`, but is otherwise the same as
         * [ApiKeyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(ApiKeyListParams.none())

        /** @see list */
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyListResponse>>

        /** @see list */
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /active/v1/api_keys/{id}`, but is otherwise the
         * same as [ApiKeyServiceAsync.revoke].
         */
        fun revoke(id: String): CompletableFuture<HttpResponseFor<ApiKeyRevokeResponse>> =
            revoke(id, ApiKeyRevokeParams.none())

        /** @see revoke */
        fun revoke(
            id: String,
            params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeResponse>> =
            revoke(params.toBuilder().id(id).build(), requestOptions)

        /** @see revoke */
        fun revoke(
            id: String,
            params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeResponse>> =
            revoke(id, params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeResponse>>

        /** @see revoke */
        fun revoke(
            params: ApiKeyRevokeParams
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeResponse>> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeResponse>> =
            revoke(id, ApiKeyRevokeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /active/v1/api_keys`, but is otherwise the same
         * as [ApiKeyServiceAsync.revokeAll].
         */
        fun revokeAll(): CompletableFuture<HttpResponseFor<ApiKeyRevokeAllResponse>> =
            revokeAll(ApiKeyRevokeAllParams.none())

        /** @see revokeAll */
        fun revokeAll(
            params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeAllResponse>>

        /** @see revokeAll */
        fun revokeAll(
            params: ApiKeyRevokeAllParams = ApiKeyRevokeAllParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeAllResponse>> =
            revokeAll(params, RequestOptions.none())

        /** @see revokeAll */
        fun revokeAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiKeyRevokeAllResponse>> =
            revokeAll(ApiKeyRevokeAllParams.none(), requestOptions)
    }
}
