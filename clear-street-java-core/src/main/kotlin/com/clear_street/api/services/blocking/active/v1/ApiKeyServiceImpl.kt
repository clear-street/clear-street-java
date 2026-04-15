// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.handlers.jsonHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.core.http.json
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.apikeys.ApiKeyCreateParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyCreateResponse
import com.clear_street.api.models.active.v1.apikeys.ApiKeyListParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyListResponse
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeAllParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeAllResponse
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeParams
import com.clear_street.api.models.active.v1.apikeys.ApiKeyRevokeResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage API keys for authentication. */
class ApiKeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiKeyService {

    private val withRawResponse: ApiKeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ApiKeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService =
        ApiKeyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions,
    ): ApiKeyCreateResponse =
        // post /active/v1/api_keys
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ApiKeyListParams,
        requestOptions: RequestOptions,
    ): ApiKeyListResponse =
        // get /active/v1/api_keys
        withRawResponse().list(params, requestOptions).parse()

    override fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions,
    ): ApiKeyRevokeResponse =
        // delete /active/v1/api_keys/{id}
        withRawResponse().revoke(params, requestOptions).parse()

    override fun revokeAll(
        params: ApiKeyRevokeAllParams,
        requestOptions: RequestOptions,
    ): ApiKeyRevokeAllResponse =
        // delete /active/v1/api_keys
        withRawResponse().revokeAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiKeyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyService.WithRawResponse =
            ApiKeyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ApiKeyCreateResponse> =
            jsonHandler<ApiKeyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "api_keys")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ApiKeyListResponse> =
            jsonHandler<ApiKeyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ApiKeyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "api_keys")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val revokeHandler: Handler<ApiKeyRevokeResponse> =
            jsonHandler<ApiKeyRevokeResponse>(clientOptions.jsonMapper)

        override fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRevokeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "api_keys", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { revokeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val revokeAllHandler: Handler<ApiKeyRevokeAllResponse> =
            jsonHandler<ApiKeyRevokeAllResponse>(clientOptions.jsonMapper)

        override fun revokeAll(
            params: ApiKeyRevokeAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRevokeAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "api_keys")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { revokeAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
