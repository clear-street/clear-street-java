// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

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
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestResponse
import com.clear_street.api.services.async.active.v1.accounts.locates.InventoryServiceAsync
import com.clear_street.api.services.async.active.v1.accounts.locates.InventoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage locate requests for short selling. */
class LocateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LocateServiceAsync {

    private val withRawResponse: LocateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val inventory: InventoryServiceAsync by lazy {
        InventoryServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): LocateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateServiceAsync =
        LocateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage locate requests for short selling. */
    override fun inventory(): InventoryServiceAsync = inventory

    override fun createLocateRequest(
        params: LocateCreateLocateRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocateCreateLocateRequestResponse> =
        // post /active/v1/accounts/{account_id}/locates
        withRawResponse().createLocateRequest(params, requestOptions).thenApply { it.parse() }

    override fun getLocateRequests(
        params: LocateGetLocateRequestsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocateGetLocateRequestsResponse> =
        // get /active/v1/accounts/{account_id}/locates
        withRawResponse().getLocateRequests(params, requestOptions).thenApply { it.parse() }

    override fun updateLocateRequest(
        params: LocateUpdateLocateRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocateUpdateLocateRequestResponse> =
        // patch /active/v1/accounts/{account_id}/locates
        withRawResponse().updateLocateRequest(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val inventory: InventoryServiceAsync.WithRawResponse by lazy {
            InventoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocateServiceAsync.WithRawResponse =
            LocateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage locate requests for short selling. */
        override fun inventory(): InventoryServiceAsync.WithRawResponse = inventory

        private val createLocateRequestHandler: Handler<LocateCreateLocateRequestResponse> =
            jsonHandler<LocateCreateLocateRequestResponse>(clientOptions.jsonMapper)

        override fun createLocateRequest(
            params: LocateCreateLocateRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocateCreateLocateRequestResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "locates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createLocateRequestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocateRequestsHandler: Handler<LocateGetLocateRequestsResponse> =
            jsonHandler<LocateGetLocateRequestsResponse>(clientOptions.jsonMapper)

        override fun getLocateRequests(
            params: LocateGetLocateRequestsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRequestsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "locates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocateRequestsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateLocateRequestHandler: Handler<LocateUpdateLocateRequestResponse> =
            jsonHandler<LocateUpdateLocateRequestResponse>(clientOptions.jsonMapper)

        override fun updateLocateRequest(
            params: LocateUpdateLocateRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocateUpdateLocateRequestResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "locates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateLocateRequestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
